import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=300,h=130,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''		self.answer="OK"	@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def Display(self,title="",message="",button=["OK"],width=240):		for a in self.ScrolledWindow1.get_children():			self.ScrolledWindow1.remove(a)		self.ScrolledWindow1.Width=width		self.ScrolledWindow1.Width=width		self.window.Width=width+50		if "YES" in button:			self.Button1.Visible=True		else:			self.Button1.Visible=False		if "NO" in button:			self.Button2.Visible=True		else:			self.Button2.Visible=False		if "OK" in button:			self.Button3.Visible=True		else:			self.Button3.Visible=False		self.title=title		if type(message)!=list:			self.Label1=Gtk.TextView()		else:			self.Label1=Gtk.ComboBoxText()		self.Label1=forms(self.Label1)				if type(message)!=list:			self.Label1.Text=message		else:			self.Label1.List=message			self.Label1.ListIndex=0		self.Label1.Visible=True		self.ScrolledWindow1.add(self.Label1.obj)		self.button=button	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'ForeColor': '(0,0,0,1)', 'BackColor': '(1,1,1,1)', 'Name': 'Button1', 'Enable': 'True', 'Help': '', 'Height': '35', 'Text': 'Yes', 'Font': '', 'Tag': '', 'Var': '', 'Picture': '', 'Top': '80', 'Width': '80', 'Visible': 'True', 'ParentsType': '', 'Events': '[clicked]', 'Left': '20'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'ForeColor': '(0,0,0,1)', 'BackColor': '(1,1,1,1)', 'Name': 'Button2', 'Enable': 'True', 'Help': '', 'Height': '35', 'Text': 'No', 'Font': '', 'Tag': '', 'Var': '', 'Picture': '', 'Top': '80', 'Width': '80', 'Visible': 'True', 'ParentsType': '', 'Events': '[clicked]', 'Left': '105'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'ForeColor': '(0,0,0,1)', 'BackColor': '(1,1,1,1)', 'Name': 'Button3', 'Enable': 'True', 'Help': '', 'Height': '35', 'Text': 'OK', 'Font': '', 'Tag': '', 'Var': '', 'Picture': '', 'Top': '80', 'Width': '80', 'Visible': 'True', 'ParentsType': '', 'Events': '[clicked]', 'Left': '190'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'ForeColor': '(0,0,0,1)', 'BackColor': '(0, 0.7044562600726613, 0.6042580447175654, 0.5)', 'Name': 'ScrolledWindow1', 'Enable': 'True', 'Help': '', 'Height': '55', 'Text': 'ScrolledWindow1', 'Font': '', 'Tag': '', 'Var': '', 'Picture': '', 'Top': '5', 'Width': '240', 'Visible': 'True', 'ParentsType': '', 'Events': '[]', 'Left': '25'}","ScrolledWindow","usercontrol","[]")		self.create("{'ForeColor': '(0.04,0.16,0.89,1)', 'BackColor': '(0.93,0.93,0.93,1)', 'Name': 'Label1', 'Enable': 'True', 'Help': '', 'Height': '45', 'Text': 'TextView1', 'Font': '', 'Tag': '', 'Var': '', 'Picture': '', 'Top': '2', 'Width': '170', 'Visible': 'True', 'ParentsType': 'ScrolledWindow', 'Events': '[]', 'Left': '10'}","TextView","ScrolledWindow1","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		if modal and self.caller!=None:			self._window.set_transient_for(self.caller._window)		self._window.set_modal(modal)		self._window.show()		self.window.Text=self.title		#self.Label1.Text=self.message		Gtk.main()		return self.answer,self.Label1.Text#put ur return value here upon closing this form	def Button1_clicked(self,e):		self.answer="YES"		self.unload()		pass	def Button2_clicked(self,e):		self.answer="NO"		self.unload()		pass	def Button3_clicked(self,e):		self.answer="OK"		self.unload()		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()