import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''	@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Enable': 'True', 'Var': '', 'ParentsType': '', 'Name': 'Button1', 'ForeColor': '(0,0,0,1)', 'Width': '135', 'Tag': '', 'Text': 'Set Combo List', 'Visible': 'True', 'Left': '70', 'Picture': '', 'Font': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Height': '50', 'Top': '140', 'Events': '[clicked]'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Enable': 'True', 'Var': '', 'ParentsType': '', 'Name': 'ComboBoxText1', 'ForeColor': '(0,0,0,1)', 'Width': '135', 'Tag': '', 'Text': 'ComboBoxText1', 'Visible': 'True', 'Left': '70', 'Picture': '', 'Font': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Height': '25', 'Top': '95', 'Events': '[]'}","ComboBoxText","usercontrol","[['changed', 'self,e']]")		self.create("{'Enable': 'True', 'Var': '', 'ParentsType': '', 'Name': 'Button2', 'ForeColor': '(0,0,0,1)', 'Width': '135', 'Tag': '', 'Text': 'Set Index', 'Visible': 'True', 'Left': '70', 'Picture': '', 'Font': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Height': '35', 'Top': '260', 'Events': '[clicked]'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Enable': 'True', 'Var': '', 'ParentsType': '', 'Name': 'Button3', 'ForeColor': '(0,0,0,1)', 'Width': '135', 'Tag': '', 'Text': 'Set Display', 'Visible': 'True', 'Left': '70', 'Picture': '', 'Font': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Height': '50', 'Top': '200', 'Events': '[clicked]'}","Button","usercontrol","[['clicked', 'self,e']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		if modal and self.caller!=None:			self._window.set_transient_for(self.caller._window)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def Switch1_state_set(self,*args):		x=self.Switch1.Active		self.Label1.Text=str(x)		pass	def Button1_clicked(self,e):		self.ComboBoxText1.List=["Wired","GTK","GNOME"]		pass	def Button2_clicked(self,e):		self.ComboBoxText1.ListIndex=2		pass	def ComboBoxText1_changed(self,e):		print(self.ComboBoxText1.Text)		pass	def Button3_clicked(self,e):		self.ComboBoxText1.Text="Wired"		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()