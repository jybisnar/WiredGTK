import gi
import time
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk,GObject,Gdk,Pango,GLib
from wta_module import *
#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils
#	#####################www.WireThemAll.com#####################

class Handler(usercontrol):
	#WiredEvent def usercontrolevent(self,value)	#add more events 
	#WiredProperty 'usercontrolproperty': 'sample only'	
	def __init__(self,*param):			
		initUI(self,param,w=475,h=250,title="Medicine Dispenser",controlbox=True,startpos=(0,0),timeoutdestroy=-1)
		self.GTKForms()
		super().__init__(self.usercontrol)
		self.sch=Scheduler(1000*10)#500 ms
		self.sch.Start()
		self._text=''
		self._usercontrolproperty=''
	
		self.parse1=Parser("WTA",'\r',1,100)
		self.ConnectSerial()
	@property	
	def usercontrolproperty(self):
		return self._usercontrolproperty
	@usercontrolproperty.setter	
	def usercontrolproperty(self,value):
		self._usercontrolproperty=value
	def connect(self,ev,evusr):
		self.wiredevents.update({ev:evusr})
	def activeXcreated(self,*args):
		pass
	def unload(self,*args):
		destroy=True
		if destroy==True:
			GLib.source_remove(self.timeout_id)
			self._window.hide()
			del self._window
			#ExitApplication() #activate this if u want to destroy this window
			return False
		else:
			self.window.Visible=False
			return True		
	def loop(self, user_data):
		if self.form_load==False:
			self.form_load=True
		if self.sch.Event():#timer routine
			
			#code here
			if self.timeoutdestroy!=-1:
				self.timeoutdestroy-=1
				if self.timeoutdestroy==0:
					self.unload(None)
			self.sch.Start()#restart scheduler
		return True	#return true so that main_loop can call it again 	
	def create(self,prop,control,parent,event=[]):
		createWidget(self,prop,control,parent,event)
	def GTKForms(self):
		self.create("{'Name': 'SerialPort1', 'Text': 'SerialPort1', 'Top': '80', 'Left': '140', 'Width': '160', 'Height': '30', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'BackColor': '(0, 0.9679655699784422, 0.8827200630035124, 0.5)', 'ForeColor': '(0,0,0,1)', 'Picture': 'SerialPort.png', 'Events': '[CommEvent]', 'Tag': 'Activex', 'ParentsType': '', 'Var': '', 'Help': '', 'Port': 'ttyUSB0', 'Setting': '9600,n,8,1', 'Open': 'False'}","SerialPort","usercontrol","[['CommEvent', 'self,e']]")
		self.create("{'Name': 'ComboBoxText1', 'Text': 'ComboBoxText1', 'Top': '75', 'Left': '310', 'Width': '100', 'Height': '25', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Picture': '', 'Events': '[[, ]]', 'Tag': '', 'ParentsType': '', 'Var': '', 'Help': ''}","ComboBoxText","usercontrol","[]")
		self.create("{'Name': 'Button1', 'Text': 'open ports', 'Top': '125', 'Left': '135', 'Width': '100', 'Height': '50', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Picture': '', 'Events': '[clicked]', 'Tag': '', 'ParentsType': '', 'Var': '', 'Help': ''}","Button","usercontrol","[['clicked', 'self,e']]")
		self.create("{'Name': 'Timer1', 'Text': 'Timer1', 'Top': '145', 'Left': '315', 'Width': '35', 'Height': '30', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'BackColor': '(0, 0.23151533446815142, 0.06479336439450101, 0.5)', 'ForeColor': '(0,0,0,1)', 'Picture': 'Timer.png', 'Events': '[Tick]', 'Tag': 'Activex', 'ParentsType': '', 'Var': '', 'Help': '', 'Interval': '1000'}","Timer","usercontrol","[['Tick', 'self']]")
		self.create("{'Name': 'Label1', 'Text': 'Label1', 'Top': '30', 'Left': '410', 'Width': '100', 'Height': '30', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Picture': '', 'Events': '[[, ]]', 'Tag': '', 'ParentsType': '', 'Var': '', 'Help': '', 'Alignment': ''}","Label","usercontrol","[]")
		self.create("{'Name': 'Button2', 'Text': 'Button2', 'Top': '180', 'Left': '135', 'Width': '100', 'Height': '50', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Picture': '', 'Events': '[clicked]', 'Tag': '', 'ParentsType': '', 'Var': '', 'Help': ''}","Button","usercontrol","[['clicked', 'self,e']]")
	def Widget(self):
		if self._usercontrol in self._mainlayout.get_children():
			self._mainlayout.remove(self._usercontrol)
		return self._usercontrol
	def Hide(self):
		self._window.hide()
	def Show(self,modal=False,x=None,y=None):
		if x!=None:
			self._window.move(x,y)
		if modal and self.caller!=None:
			self._window.set_transient_for(self.caller._window)
		self._window.set_modal(modal)
		self._window.show()
		Gtk.main()
		return ""#put ur return value here upon closing this form
	def Button1_clicked(self,e):
		self.ConnectSerial()
	def ConnectSerial(self):
		self.SerialPort1.Port="/dev/ttyUSB0"
		try:
			self.SerialPort1.Open=False
		except:
			pass
		pass
		try:
			self.SerialPort1.Open=True
			print("Port connected")
		except:
			print("Error Port")
			pass

	def log(self,ms):
		#import pdb; pdb.set_trace();
		if FileExist("saved/log.txt")==False:
			SaveFileStr("saved/log.txt","Message,Date\n")
		s=GetFileStr("saved/log.txt")
		s+=ms+","+NowToString()+'\n'
		SaveFileStr("saved/log.txt",s)

	def SerialPort1_CommEvent(self,e):
		while(e.available()):
			c= e.read()
			c=c.decode()
			if self.parse1.available(c)==True:
				self.window.Text = self.parse1.data
				if self.caller!=None:
					if self.caller.ctlOnline1.connectFlag==True:
						s="WTA"+self.parse1.data
						self.caller.Label1.Text="Volt" + " = "  + getCSV(0,",",self.parse1.data) + " V"
						self.caller.Label2.Text="Amps" + " = "  + getCSV(1,",",self.parse1.data)+ " A"
						
						print(s)
						self.caller.ctlOnline1.ctlWebsocket21.SendClient(s)

	def Timer1_Tick(self):
		pass


if __name__ == "__main__":
	_m = Handler()
	_m._window.show()
	Gtk.main()