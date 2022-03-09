import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pangofrom wta_module import *try:	import serialexcept:	print ('serial not found, pip install pyserial!!!')	import sys 	sys.exit(-1)#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class HardwareSerial:	def __init__(self,dev_tty,_parity=serial.PARITY_NONE,_stop=serial.STOPBITS_ONE,_bytesize=serial.EIGHTBITS,port=None):		self.dev_tty=dev_tty		self.ser=None		self.parity=_parity		self.stop=_stop		self.bytesize=_bytesize	def begin(self,_baud):		self.ser = serial.Serial(				port=self.dev_tty,				baudrate = _baud,				parity=self.parity,				stopbits=self.stop,				bytesize=self.bytesize,				timeout=5				)	def print(self,_data):		if type(_data)!=bytes:			_data=str(_data).encode()		self.ser.write(_data)	def println(self,_data):		if type(_data)!=bytes:			_data=str(_data).encode()				self.ser.write(_data)		self.ser.write("\r\n".encode())	def write(self,_data):		if type(_data)!=bytes:			_data=str(_data).encode()				self.ser.write(_data)	def read(self):		w=self.ser.inWaiting()		if w!=0:			return self.ser.read(1)		else:			return ""	def available(self):		return self.ser.inWaiting()	def close(self):		return self.ser.close()	def Initialize(self):		if self.ser==None:			return False		else:			return Trueclass Handler(usercontrol):	#WiredEvent def CommEvent(self,e)	#add more events 	#WiredProperty 'Port': 'COM1'	#WiredProperty 'Setting': '9600,n,8,1'	#WiredProperty 'Port':'COM1'	#WiredProperty 'Open': 'False'	#WiredProperty 'Text': ''	def __init__(self,*param):			initUI(self,param)		self.GTKForms()		super().__init__(self.usercontrol)		self._text=''				self.setting='9600,n,8,1'		self.Serial=HardwareSerial('')		def PortsAvailable(self):		import sys		import glob		import serial		"""Lists serial port names			by Thomas			:raises EnvironmentError:				On unsupported or unknown platforms			:returns:				A list of the serial ports available on the system		"""		if sys.platform.startswith('win'):			ports = ['COM%s' % (i + 1) for i in range(256)]		elif sys.platform.startswith('linux') or sys.platform.startswith('cygwin'):			#this excludes your current terminal "/dev/tty"			ports = glob.glob('/dev/tty[A-Za-z]*')		elif sys.platform.startswith('darwin'):			ports = glob.glob('/dev/tty.*')		else:			raise EnvironmentError('Unsupported platform')		result = []		for port in ports:			try:				s = serial.Serial(port)				s.close()				result.append(port)			except (OSError, serial.SerialException):				pass		return result	def activeXcreated(self):		pass	def unload(self,*args):		self._window=None		Gtk.main_quit()		def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.Serial.Initialize()==True and self.Serial.ser.is_open and self.Serial.available():			if self.caller!=None:				if 'CommEvent' in self.wiredevents:						self.wiredevents['CommEvent'](self.Serial)				else:					while(self.Serial.available()):						self.Serial.read()#remove data if no userevent isr		return True	#return true so that main_loop can call it again 	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})		def println(self,x):		self.Serial.println(x)	def print(self,x):		self.Serial.print(x)			def write(self,x):		self.Serial.write(x)	def read(self):		return  self.Serial.read()	def available(self):		return  self.Serial.available()	@property	def Port(self):		return self.setting	@Port.setter			def Port(self,value):		self.port=value			@property	def Setting(self):		return self.setting	@Setting.setter	def Setting(self,value):		self.setting=value		self.baud=getCSV(0,',',value)		parity=getCSV(1,',',value)		self.bytesize=int(getCSV(2,',',value))		stop=getCSV(3,',',value)		if parity=='n':			self.parity=serial.PARITY_NONE		else:			self.parity=serial.PARITY_EVEN		if stop=='1':			self.stop=serial.STOPBITS_ONE		if stop=='2':			self.parity=serial.STOPBITS_TWO				pass	@property	def Open(self):		return ''	@Open.setter	def Open(self,value):		if value==True:			self.Serial=HardwareSerial(self.port,self.parity,self.stop,self.bytesize)#Serial=HardwareSerial('/dev/ttyUSB0')			self.Serial.begin(self.baud)					if value==False:			self.Serial.close()		pass	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Top': '9', 'ForeColor': '(0,0,0,1)', 'Font': '', 'Help': '', 'Events': '[clicked]', 'Visible': 'True', 'Tag': '', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Text': 'Image1', 'ParentsType': '', 'Left': '6', 'Height': '30', 'Name': 'Image1', 'Var': '', 'Enable': 'True', 'Width': '43'}","Image","usercontrol","[['clicked', 'self,e']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False):		self._window.set_modal(modal)		self._window.show()		Gtk.main()	def Image1_clicked(self,e):		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()