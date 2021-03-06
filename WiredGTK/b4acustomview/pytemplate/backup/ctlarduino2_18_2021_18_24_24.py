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
		self.ComboBoxText1.List=self.SerialPort1.PortsAvailable()
		self.parse1x=Parser("WTAOFF1",'\r',1,100)
		self.parse2x=Parser("WTAOFF2",'\r',1,100)
		self.parse3x=Parser("WTAOFF3",'\r',1,100)
		self.parse4x=Parser("WTAOFF4",'\r',1,100)
		self.parse1=Parser("WTAON1",'\r',1,100)
		self.parse2=Parser("WTAON2",'\r',1,100)
		self.parse3=Parser("WTAON3",'\r',1,100)
		self.parse4=Parser("WTAON4",'\r',1,100)
		self.med=[0,0,0,0]
		self.medON=False
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
		self.create("{'Open': 'False', 'Name': 'SerialPort1', 'Left': '140', 'Port': 'ttyUSB0', 'Var': '', 'Tag': 'Activex', 'ParentsType': '', 'BackColor': '(0, 0.9679655699784422, 0.8827200630035124, 0.5)', 'Top': '80', 'Picture': 'SerialPort.png', 'Events': '[CommEvent]', 'ForeColor': '(0,0,0,1)', 'Help': '', 'Font': '', 'Visible': 'True', 'Text': 'SerialPort1', 'Setting': '9600,n,8,1', 'Width': '160', 'Height': '30', 'Enable': 'True'}","SerialPort","usercontrol","[['CommEvent', 'self,e']]")
		self.create("{'Name': 'ComboBoxText1', 'Left': '310', 'Var': '', 'Tag': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)', 'Top': '75', 'Picture': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Help': '', 'Font': '', 'Visible': 'True', 'Text': 'ComboBoxText1', 'Width': '100', 'Height': '25', 'Enable': 'True'}","ComboBoxText","usercontrol","[]")
		self.create("{'Name': 'Button1', 'Left': '135', 'Var': '', 'Tag': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)', 'Top': '125', 'Picture': '', 'Events': '[clicked]', 'ForeColor': '(0,0,0,1)', 'Help': '', 'Font': '', 'Visible': 'True', 'Text': 'open ports', 'Width': '100', 'Height': '50', 'Enable': 'True'}","Button","usercontrol","[['clicked', 'self,e']]")
		self.create("{'Name': 'Timer1', 'Left': '315', 'Var': '', 'Tag': 'Activex', 'ParentsType': '', 'BackColor': '(0, 0.23151533446815142, 0.06479336439450101, 0.5)', 'Top': '145', 'Picture': 'Timer.png', 'Interval': '1000', 'Events': '[Tick]', 'ForeColor': '(0,0,0,1)', 'Help': '', 'Font': '', 'Visible': 'True', 'Text': 'Timer1', 'Width': '35', 'Height': '30', 'Enable': 'True'}","Timer","usercontrol","[['Tick', 'self']]")
		self.create("{'Name': 'Label1', 'Left': '410', 'Var': '', 'Tag': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)', 'Top': '30', 'Picture': '', 'Alignment': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Help': '', 'Font': '', 'Visible': 'True', 'Text': 'Label1', 'Width': '100', 'Height': '30', 'Enable': 'True'}","Label","usercontrol","[]")
		self.create("{'Name': 'Button2', 'Left': '300', 'Var': '', 'Tag': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)', 'Top': '50', 'Picture': '', 'Events': '[clicked]', 'ForeColor': '(0,0,0,1)', 'Help': '', 'Font': '', 'Visible': 'True', 'Text': 'Button2', 'Width': '100', 'Height': '50', 'Enable': 'True'}","Button","usercontrol","[['clicked', 'self,e']]")
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
			try:
				c=e.read().decode()
			except:
				continue

			parsex=[self.parse1x,self.parse2x,self.parse3x,self.parse4x]		
			for a in range(4):# medicine kinuha
				if parsex[a].available(c):
					if self.caller!=None and self.caller.ctlLogin1.medflag[a]==True:
						#import pdb; pdb.set_trace();
						print("med kuha")
						self.log("Med " + str(a+1)+" Taken")
						self.caller.ctlLogin1.medflag[a]=False
						self.caller.ctlLogin1.sendSMS.append('SMS,09360832754,Med ' + str(a+1) + " Taken")
						self.caller.ctlLogin1.checkmed[a].timeout=0
						
					self.med[a]=2

			parse=[self.parse1,self.parse2,self.parse3,self.parse4]		
			for a in range(4):#me medicine bumagsak
				if parse[a].available(c):
					self.med[a]=1

		pass

	
		

	def Timer1_Tick(self):
		pass

			
					


	
	def Button2_clicked(self,e):
		self.SerialPort1.println("MED1FOR")
		pass
if __name__ == "__main__":
	_m = Handler()
	_m._window.show()
	Gtk.main()