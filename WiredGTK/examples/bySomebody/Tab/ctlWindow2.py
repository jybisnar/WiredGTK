import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''	@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Left': '95', 'Top': '55', 'Tag': '', 'Font': '', 'Events': '[]', 'Text': 'Window 2', 'Alignment': '', 'ForeColor': '(0,0,0,1)', 'Var': '', 'Enable': 'True', 'Help': '', 'Width': '100', 'ParentsType': '', 'Name': 'Label1', 'Height': '30', 'Picture': '', 'BackColor': '(0.93,0.44,0.44,1)', 'Visible': 'True'}","Label","usercontrol","[]")		self.create("{'Left': '95', 'Top': '95', 'Tag': '', 'Font': '', 'Events': '[]', 'Text': 'TxtEntry', 'Alignment': '', 'ForeColor': '(0,0,0,1)', 'Var': '', 'Enable': 'True', 'Help': '', 'Width': '170', 'ParentsType': '', 'Name': 'TxtEntry', 'Height': '30', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Visible': 'True'}","Entry","usercontrol","[]")		self.create("{'Left': '95', 'Top': '140', 'Tag': '', 'Font': '', 'Events': '[clicked]', 'Text': 'Show Window 1', 'ForeColor': '(0,0,0,1)', 'Var': '', 'Enable': 'True', 'Help': '', 'Width': '135', 'ParentsType': '', 'Name': 'Button1', 'Height': '50', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Visible': 'True'}","Button","usercontrol","[['clicked', 'self,e']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		if modal and self.caller!=None:			self._window.set_transient_for(self.caller._window)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def Button1_clicked(self,e):		if self.caller!=None:			self.caller.Tab.Tab(0)		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()