import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wired_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	def __init__(self,*param):					initUI(self,param,w=100,h=50,title="WiredGTKV1.0",controlbox=False,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self.click=0		self.ComboBoxText1.List=["Select","True","False"]		self.ComboBoxText1.ListIndex=0	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			ExitApplication()			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			if self.Label1.Visible:					self.Label1.Visible=False			else:				self.Label1.Visible=True				self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})		@property	def Text(self):		return ''	@Text.setter	def Text(self,value):		pass	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Tag': '', 'ForeColor': '(0.13,0.30,0.83,1)', 'Text': 'ComboBoxText1', 'Top': '9', 'Height': '25', 'ParentsType': '', 'Name': 'ComboBoxText1', 'Picture': '', 'Left': '8', 'BackColor': '(1,1,1,1)', 'Visible': 'True', 'Events': '[changed]', 'Enable': 'True', 'Width': '100', 'Font': ''}","ComboBoxText","usercontrol","[['changed', 'self,e']]")		self.create("{'Tag': '', 'ForeColor': '(0.88,0.06,0.61,1)', 'Text': '__________', 'Top': '7', 'Height': '41', 'ParentsType': '', 'Name': 'Label1', 'Picture': '', 'Left': '9', 'BackColor': '(1,1,1,0)', 'Visible': 'True', 'Events': '[[, ]]', 'Enable': 'True', 'Width': '100', 'Font': 'Sans 18'}","Label","usercontrol","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return self.ComboBoxText1.Text	def ComboBoxText1_changed(self,e):		if self.ComboBoxText1.Text!="Select" and self.click!=0:			self.unload()		self.click=1		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()