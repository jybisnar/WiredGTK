from wta_module import *
import RPi.GPIO as GPIO
import time
import threading
'''
//When the display powers up, it is configured as follows:
//
//1.Display clear
//2.Function set: 
//	DL = 1; 8-bit interface data 
//	N = 0; 1-line display 
//	F = 0; 5x8 dot character font 
//3.Display on/off control: 
//	D = 0; Display off 
//	C = 0; Cursor off 
//	B = 0; Blinking off 
//4.Entry mode set: 
//	I/D = 1; Increment by 1 
//	S = 0; No shift 
//
//Note, however, that resetting the Arduino doesn't reset the LCD, so we
//can't assume that its in that state when a sketch starts (and the
//LiquidCrystal constructor is called).
'''
LCD_CLEARDISPLAY =0x01
LCD_RETURNHOME =0x02
LCD_ENTRYMODESET =0x04
LCD_DISPLAYCONTROL =0x08
LCD_CURSORSHIFT =0x10
LCD_FUNCTIONSET =0x20
LCD_SETCGRAMADDR =0x40
LCD_SETDDRAMADDR =0x80

#flags for display entry mode
LCD_ENTRYRIGHT =0x00
LCD_ENTRYLEFT =0x02
LCD_ENTRYSHIFTINCREMENT =0x01
LCD_ENTRYSHIFTDECREMENT =0x00

#flags for display on/off control
LCD_DISPLAYON =0x04
LCD_DISPLAYOFF =0x00
LCD_CURSORON =0x02
LCD_CURSOROFF =0x00
LCD_BLINKON =0x01
LCD_BLINKOFF =0x00

#flags for display/cursor shift
LCD_DISPLAYMOVE =0x08
LCD_CURSORMOVE =0x00
LCD_MOVERIGHT =0x04
LCD_MOVELEFT =0x00

#flags for function set
LCD_8BITMODE =0x10
LCD_4BITMODE =0x00
LCD_2LINE =0x08
LCD_1LINE =0x00
LCD_5x10DOTS =0x04
LCD_5x8DOTS =0x00

class LiquidCrystal:
	def __init__(self, rs,  enable,d0, d1, d2, d3):
		self._data_pins=[0,0,0,0,0,0,0,0]
		self.initX(1, rs, 255, enable, d0, d1, d2, d3, 0, 0, 0, 0)
	def print(self,strs):
		for a in strs:
			self.write(a)
	def initX(self,fourbitmode, rs, rw, enable,d0, d1, d2, d3,d4, d5, d6, d7):
		self._rs_pin = rs;
		self._rw_pin = rw;
		self._enable_pin = enable;

		self._data_pins[0] = d0;
		self._data_pins[1] = d1;
		self._data_pins[2] = d2;
		self._data_pins[3] = d3; 
		self._data_pins[4] = d4;
		self._data_pins[5] = d5;
		self._data_pins[6] = d6;
		self._data_pins[7] = d7; 

		pinMode(self._rs_pin, OUTPUT);
		#we can save 1 pin by not using RW. Indicate by passing 255 instead of pin#
		if (self._rw_pin != 255):
			pinMode(self._rw_pin, OUTPUT);
		pinMode(self._enable_pin, OUTPUT);

		if (fourbitmode):
			self._displayfunction = LCD_4BITMODE | LCD_1LINE | LCD_5x8DOTS;
		else :
			self._displayfunction = LCD_8BITMODE | LCD_1LINE | LCD_5x8DOTS;

		self.begin(16, 1);  
	def begin(self,cols, lines, dotsize= LCD_5x8DOTS):
		if (lines > 1):
			self._displayfunction |= LCD_2LINE;

		self._numlines = lines;
		self._currline = 0;

		#for some 1 line displays you can select a 10 pixel high font
		if ((dotsize != 0) and (lines == 1)):
			self._displayfunction |= LCD_5x10DOTS;


		#SEE PAGE 45/46 FOR INITIALIZATION SPECIFICATION!
		#according to datasheet, we need at least 40ms after power rises above 2.7V
		#before sending commands. Arduino can turn on way befer 4.5V so we'll wait 50
		delayMicroseconds(50000); 
		#Now we pull both RS and R/W low to begin commands
		digitalWrite(self._rs_pin, LOW);
		digitalWrite(self._enable_pin, LOW);
		if (self._rw_pin != 255): 
			digitalWrite(self._rw_pin, LOW);
		

		#put the LCD into 4 bit or 8 bit mode
		if (self._displayfunction & LCD_8BITMODE)==0:
			#this is according to the hitachi HD44780 datasheet
			#figure 24, pg 46

			#we start in 8bit mode, try to set 4 bit mode
			self.write4bits(0x03);
			delayMicroseconds(4500); # wait min 4.1ms

			#second try
			self.write4bits(0x03);
			delayMicroseconds(4500); # wait min 4.1ms

			#third go!
			self.write4bits(0x03); 
			delayMicroseconds(150);

			#finally, set to 4-bit interface
			self.write4bits(0x02); 
		
		else:
			#this is according to the hitachi HD44780 datasheet
			#page 45 figure 23

			#Send function set command sequence
			self.command(LCD_FUNCTIONSET | self._displayfunction);
			delayMicroseconds(4500);  # wait more than 4.1ms

			#second try
			self.command(LCD_FUNCTIONSET | self._displayfunction);
			delayMicroseconds(150);

			#third go
			self.command(LCD_FUNCTIONSET | self._displayfunction);
		

		#finally, set # lines, font size, etc.
		self.command(LCD_FUNCTIONSET | self._displayfunction);  

		#turn the display on with no cursor or blinking default
		self._displaycontrol = LCD_DISPLAYON | LCD_CURSOROFF | LCD_BLINKOFF;  
		self.display();

		#clear it off
		self.clear();

		#Initialize to default text direction (for romance languages)
		self._displaymode = LCD_ENTRYLEFT | LCD_ENTRYSHIFTDECREMENT;
		#set the entry mode
		self.command(LCD_ENTRYMODESET | self._displaymode);

	'''**********high level commands, for the user! '''
	def clear(self):
		self.command(LCD_CLEARDISPLAY);  # clear display, set cursor position to zero
		delayMicroseconds(2000);  #this command takes a long time!
	
	def home(self):
		self.command(LCD_RETURNHOME);  #set cursor position to zero
		delayMicroseconds(2000);  #this command takes a long time!
	
	def setCursor(self,col, row):
		row_offsets = [ 0x00, 0x40, 0x14, 0x54 ];
		if ( row >= self._numlines ):
			row = self._numlines-1;    # we count rows starting w/0
		
		self.command(LCD_SETDDRAMADDR | (col + row_offsets[row]));
	
	#Turn the display on/off (quickly)
	def noDisplay(self):
		self.self._displaycontrol &= ~LCD_DISPLAYON;
		self.command(LCD_DISPLAYCONTROL | self._displaycontrol);

	def display(self):
		self._displaycontrol |= LCD_DISPLAYON;
		self.command(LCD_DISPLAYCONTROL | self._displaycontrol);

	#Turns the underline cursor on/off
	def noCursor(self):
		self._displaycontrol &= ~LCD_CURSORON;
		self.command(LCD_DISPLAYCONTROL | self._displaycontrol);
	def cursor(self):
		self._displaycontrol |= LCD_CURSORON;
		self.command(LCD_DISPLAYCONTROL | self._displaycontrol);

	#Turn on and off the blinking cursor
	def noBlink(self):
		self._displaycontrol &= ~LCD_BLINKON;
		self.command(LCD_DISPLAYCONTROL | self._displaycontrol);
	def blink(self):
		self._displaycontrol |= LCD_BLINKON;
		self.command(LCD_DISPLAYCONTROL | self._displaycontrol);
	#These commands scroll the display without changing the RAM
	def scrollDisplayLeft(self):
		self.command(LCD_CURSORSHIFT | LCD_DISPLAYMOVE | LCD_MOVELEFT);
	def scrollDisplayRight(self):
		self.command(LCD_CURSORSHIFT | LCD_DISPLAYMOVE | LCD_MOVERIGHT);
	#This is for text that flows Left to Right
	def leftToRight(self):
		self._displaymode |= LCD_ENTRYLEFT;
		self.command(LCD_ENTRYMODESET | self._displaymode);
	

	#This is for text that flows Right to Left
	def rightToLeft(self):
		self._displaymode &= ~LCD_ENTRYLEFT;
		self.command(LCD_ENTRYMODESET | self._displaymode);

	#This will 'right justify' text from the cursor
	def autoscroll(self):
		self._displaymode |= LCD_ENTRYSHIFTINCREMENT;
		self.command(LCD_ENTRYMODESET | self._displaymode);

	#This will 'left justify' text from the cursor
	def noAutoscroll(self):
		self._displaymode &= ~LCD_ENTRYSHIFTINCREMENT;
		self.command(LCD_ENTRYMODESET | self._displaymode);
	
	#Allows us to fill the first 8 CGRAM locations
	#with custom characters
	def createChar(self,location, charmap):
		location &= 0x7; # we only have 8 locations 0-7
		self.command(LCD_SETCGRAMADDR | (location << 3));
		for i in range(8):
			self.write(charmap[i]);
		
	'''/***********mid level commands, for sending data/cmds */'''

	def command(self,value):
		self.send(value, LOW);
	
	def write(self,value):
		self.send(value, HIGH);
		return 1; # assume sucess


	'''/************low level data pushing commands **********/'''

	#write either command or data, with automatic 4/8-bit selection
	def send(self,value, mode):
		if type(value)==str:
			value=ord(value)
		digitalWrite(self._rs_pin, mode);

		#if there is a RW pin indicated, set it low to Write
		if (self._rw_pin != 255): 
			digitalWrite(self._rw_pin, LOW);
		
		if (self._displayfunction & LCD_8BITMODE) :
			self.write8bits(value); 
		else:
			self.write4bits(value>>4);
			self.write4bits(value);
		delay(1);	
		

	def pulseEnable(self):
		digitalWrite(self._enable_pin, LOW);
		delayMicroseconds(1);    
		digitalWrite(self._enable_pin, HIGH);
		delayMicroseconds(1);    # enable pulse must be >450ns
		digitalWrite(self._enable_pin, LOW);
		delayMicroseconds(100);   # commands need > 37us to settle

	def write4bits(self,value):
		#print(self._data_pins)
		for i in range(4):
			pinMode(self._data_pins[i], OUTPUT);
			pin=self._data_pins[i];
			val= (value >> i) & 0x01
			digitalWrite(pin,val);
		self.pulseEnable();
	
	def write8bits(self,value):
		value=ord(value)
		for  i in range(8):
			pinMode(self._data_pins[i], OUTPUT);
			digitalWrite(self._data_pins[i], (value >> i) & 0x01);
		
		self.pulseEnable();
import pdb;pdb.set_trace();
liq=LiquidCrystal(13,19,26,16,20,21)

liq.begin(4,20)
liq.print("Hello World")
liq.print("Hello World")

