import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''	@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Enable': 'True', 'Var': '', 'ParentsType': '', 'Name': 'ProgressBar1', 'ForeColor': '(0,0,0,1)', 'Width': '260', 'Tag': '', 'Text': 'ProgressBar1', 'Visible': 'True', 'Left': '30', 'Picture': '', 'Font': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Height': '20', 'Top': '35', 'Events': '[]'}","ProgressBar","usercontrol","[]")		self.create("{'Enable': 'True', 'Var': '', 'ParentsType': '', 'Name': 'Button1', 'ForeColor': '(0,0,0,1)', 'Width': '100', 'Tag': '', 'Text': 'set_fraction', 'Visible': 'True', 'Left': '35', 'Picture': '', 'Font': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Height': '50', 'Top': '65', 'Events': '[clicked]'}","Button","usercontrol","[['clicked', 'self,e']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		if modal and self.caller!=None:			self._window.set_transient_for(self.caller._window)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def Button1_clicked(self,e):		x=self.ProgressBar1.get_fraction() +0.1		self.ProgressBar1.set_fraction(x) 		if __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()