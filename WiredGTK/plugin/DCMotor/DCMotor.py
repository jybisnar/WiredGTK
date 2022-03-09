import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'MotorLeft': '18'	#WiredProperty 'MotorRight': '23'	#WiredProperty 'SensorLeft': '-1'	#WiredProperty 'SensorRight': '-1'	#WiredProperty 'Trigger': 'LOW','list':["LOW","HIGH"]	#WiredProperty 'PullUp': 'True','list':["True","False"]	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._MotorLeft=-1		self._MotorRight=-1		self._SensorLeft=-1		self._SensorRight=-1		self._Trigger=LOW		self._PullUp=True		self._SensorLeftChange=LOW		self._SensorRightChange=LOW	@property		def MotorLeft(self):		return self._MotorLeft	@MotorLeft.setter		def MotorLeft(self,value):		self._MotorLeft=int(value)	@property		def MotorRight(self):		return self._MotorRight	@MotorRight.setter		def MotorRight(self,value):		self._MotorRight=int(value)	@property		def SensorLeft(self):		return self._SensorLeft	@SensorLeft.setter		def SensorLeft(self,value):		self._SensorLeft=int(value)	@property		def SensorRight(self):		return self._SensorRight	@SensorRight.setter		def SensorRight(self,value):		self._SensorRight=int(value)	@property		def Trigger(self):		return self._Trigger	@Trigger.setter		def Trigger(self,value):		if value=='LOW':			self._Trigger=LOW 		else:			self._Trigger=HIGH	@property		def PullUp(self):		return self._PullUp	@PullUp.setter		def PullUp(self,value):		self._PullUp=TrueFalse(value)	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pinMode(self._MotorLeft,OUTPUT)		pinMode(self._MotorRight,OUTPUT)		if self.PullUp==True:			if self._SensorLeft!=-1:				pinMode(self._SensorLeft,INPUT_PULLUP)			if self._SensorRight!=-1:				pinMode(self._SensorRight,INPUT_PULLUP)		else:			if self._SensorLeft!=-1:				pinMode(self._SensorLeft,INPUT)			if self._SensorRight!=-1:				pinMode(self._SensorRight,INPUT)		if self._SensorRight!=-1:			_right=digitalRead(self._SensorRight)			if _right==LOW:				self.Label3.BackColor=(0,0,0,1)			else:				self.Label3.BackColor=(1,0,0,1)		if self._SensorLeft!=-1:			_left=digitalRead(self._SensorLeft)			if _left==LOW:				self.Label6.BackColor=(0,0,0,1)			else:				self.Label6.BackColor=(1,0,0,1)				self.Label7.Text=" %02d   %02d   %02d   %02d" %(self._SensorRight,self._MotorRight,self._MotorLeft,self._SensorLeft)		self.Label8.Text="PU=%s;Trig=%s" %(self._PullUp,self._Trigger)		pass	def  CWSensor(self):		if self._SensorRight!=-1:			return digitalRead(self._SensorRight)		else:			return -1	def  CCWSensor(self):		if self._SensorLeft!=-1:			return digitalRead(self._SensorLeft)		else:			return -1	def  CW(self):		digitalWrite(self._MotorRight,HIGH);		digitalWrite(self._MotorLeft,LOW);	def  CCW(self):		digitalWrite(self._MotorLeft,HIGH);		digitalWrite(self._MotorRight,LOW);	def Stop(self):		digitalWrite(self._MotorRight,LOW);		digitalWrite(self._MotorLeft,LOW);	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self._SensorLeft!=-1:			_left=digitalRead(self._SensorLeft)			if _left==self._Trigger:				digitalWrite(self._MotorLeft,LOW)			if self._SensorLeftChange!=_left:				if _left==LOW:					self.Label6.BackColor=(0,0,0,1)				else:					self.Label6.BackColor=(1,0,0,1)				self._SensorLeftChange=_left						if self._SensorRight!=-1:			_right=digitalRead(self._SensorRight)			if _right==self._Trigger:				digitalWrite(self._MotorRight,LOW)			if self._SensorRightChange!=_right:				if _right==LOW:					self.Label3.BackColor=(0,0,0,1)				else:					self.Label3.BackColor=(1,0,0,1)				self._SensorRightChange=_right							if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Picture': '', 'BackColor': '(0,0,1,1)', 'Top': '0', 'ForeColor': '(0,0,0,1)', 'Left': '30', 'Visible': 'True', 'Font': '', 'Width': '25', 'Enable': 'True', 'Text': '', 'Events': '[button-press-event, button-release-event]', 'Height': '25', 'Name': 'Label1', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[['button-press-event', 'self,event,e'], ['button-release-event', 'self,event,e']]")		self.create("{'Picture': '', 'BackColor': '(1,0,0,1)', 'Top': '30', 'ForeColor': '(0,0,0,1)', 'Left': '0', 'Visible': 'True', 'Font': '', 'Width': '25', 'Enable': 'True', 'Text': '', 'Events': '[]', 'Height': '25', 'Name': 'Label3', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[]")		self.create("{'Picture': '', 'BackColor': '(0,1,0,1)', 'Top': '30', 'ForeColor': '(0,0,0,1)', 'Left': '30', 'Visible': 'True', 'Font': '', 'Width': '25', 'Enable': 'True', 'Text': '', 'Events': '[button-release-event]', 'Height': '25', 'Name': 'Label4', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[['button-release-event', 'self,event,e']]")		self.create("{'Picture': '', 'BackColor': '(0,1,0,1)', 'Top': '30', 'ForeColor': '(0,0,0,1)', 'Left': '60', 'Visible': 'True', 'Font': '', 'Width': '25', 'Enable': 'True', 'Text': '', 'Events': '[button-release-event]', 'Height': '25', 'Name': 'Label5', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[['button-release-event', 'self,event,e']]")		self.create("{'Picture': '', 'BackColor': '(1,0,0,1)', 'Top': '30', 'ForeColor': '(0,0,0,1)', 'Left': '90', 'Visible': 'True', 'Font': '', 'Width': '25', 'Enable': 'True', 'Text': '', 'Events': '[]', 'Height': '25', 'Name': 'Label6', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[]")		self.create("{'Picture': '', 'BackColor': '(0,0,1,1)', 'Top': '0', 'ForeColor': '(0,0,0,1)', 'Left': '60', 'Visible': 'True', 'Font': '', 'Width': '25', 'Enable': 'True', 'Text': '', 'Events': '[button-press-event, button-release-event]', 'Height': '25', 'Name': 'Label2', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[['button-press-event', 'self,event,e'], ['button-release-event', 'self,event,e']]")		self.create("{'Picture': '', 'BackColor': '(0.48,0.77,0.98,1)', 'Top': '55', 'ForeColor': '(0,0,0,1)', 'Left': '0', 'Visible': 'True', 'Font': '', 'Width': '115', 'Enable': 'True', 'Text': 'Label7', 'Events': '[[, ]]', 'Height': '20', 'Name': 'Label7', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[]")		self.create("{'Picture': '', 'BackColor': '(0.48,0.77,0.98,1)', 'Top': '75', 'ForeColor': '(0,0,0,1)', 'Left': '0', 'Visible': 'True', 'Font': '', 'Width': '115', 'Enable': 'True', 'Text': 'Label8', 'Events': '[]', 'Height': '20', 'Name': 'Label8', 'ParentsType': '', 'Alignment': '', 'Tag': ''}","Label","usercontrol","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		if modal and self.caller!=None:			self._window.set_transient_for(self.caller._window)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def Label1_button_press_event(self,event,e):		if self._SensorRight!=-1 and digitalRead(self._SensorRight)!=self._Trigger:			self.CW()		if self._SensorRight==-1:			self.CW()		pass	def Label1_button_release_event(self,event,e):		self.Stop()		pass	def Label2_button_press_event(self,event,e):		if self._SensorLeft!=-1 and digitalRead(self._SensorLeft)!=self._Trigger:			self.CCW()		if self._SensorLeft==-1:			self.CCW()	def Label2_button_release_event(self,event,e):		self.Stop()		pass	def CWInit(self):		if self._SensorRight!=-1 and digitalRead(self._SensorRight)!=self._Trigger:			self.CW()	def Label4_button_release_event(self,event,e):		self.CWInit()	def CCWInit(self):		if self._SensorLeft!=-1 and digitalRead(self._SensorLeft)!=self._Trigger:			self.CCW()		pass	def Label5_button_release_event(self,event,e):		self.CCWInit()if __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()