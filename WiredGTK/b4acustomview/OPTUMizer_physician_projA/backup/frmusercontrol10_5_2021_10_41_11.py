import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.Activity=forms		self.create("{'Visible': 'True', 'Name': 'Activity', 'Picture': '', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '643', 'Left': '50', 'ParentsType': '', 'Enable': 'True', 'Help': '', 'Top': '30', 'Height': '541', 'Var': '', 'Text': 'Layout1'}","Layout","usercontrol","[]")		self.mBase=forms		self.create("{'Visible': 'True', 'Name': 'mBase', 'Picture': '', 'BackColor': '(1.00,1.00,1.00,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '444', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '35', 'Height': '520', 'Var': '', 'Text': 'Layout2'}","Layout","Activity","[]")		import Timer		self.Timer1=Timer.Handler		self.create("{'Visible': 'True', 'Name': 'Timer1', 'Picture': 'Timer.png', 'BackColor': '(0, 0.3888056493649016, 0.4463967631327912, 0.5)', 'Tag': 'Activex', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '30', 'Left': '320', 'ParentsType': 'Layout', 'Interval': '1000', 'Enable': 'True', 'Help': '', 'Top': '335', 'Height': '30', 'Var': '', 'Text': 'Timer1'}","Timer","mBase","[]")		import Timer		self.mytimer=Timer.Handler		self.create("{'Visible': 'True', 'Name': 'mytimer', 'Picture': 'Timer.png', 'BackColor': '(0, 0.12027104030828939, 0.5728644378168872, 0.5)', 'Tag': 'Activex', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '30', 'Left': '275', 'ParentsType': 'Layout', 'Interval': '1000', 'Enable': 'True', 'Help': '', 'Top': '335', 'Height': '30', 'Var': '', 'Text': 'Timer2'}","Timer","mBase","[]")		self.Image1=forms		self.create("{'Visible': 'True', 'Name': 'Image1', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '85', 'Left': '315', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '280', 'Height': '50', 'Var': '', 'Text': 'Image1'}","Image","mBase","[]")		self.Button1=forms		self.create("{'Visible': 'True', 'Name': 'Button1', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '100', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '300', 'Height': '50', 'Var': '', 'Text': 'Button1'}","Button","mBase","[]")		self.Button2=forms		self.create("{'Visible': 'True', 'Name': 'Button2', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '100', 'Left': '170', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '300', 'Height': '50', 'Var': '', 'Text': 'Connect BT'}","Button","mBase","[]")		self.Label1=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label1', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '345', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '30', 'Height': '70', 'Var': '', 'Text': 'Power Logger App'}","Label","mBase","[]")		self.Label2=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label2', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '220', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '125', 'Height': '30', 'Var': '', 'Text': 'V'}","Label","mBase","[]")		self.Label3=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label3', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '220', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '165', 'Height': '30', 'Var': '', 'Text': 'A'}","Label","mBase","[]")		self.Label4=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label4', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '220', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '200', 'Height': '30', 'Var': '', 'Text': 'W'}","Label","mBase","[]")		self.Label5=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label5', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '220', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '240', 'Height': '30', 'Var': '', 'Text': 'WH'}","Label","mBase","[]")		self.Button3=forms		self.create("{'Visible': 'True', 'Name': 'Button3', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '80', 'Left': '55', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '360', 'Height': '35', 'Var': '', 'Text': 'Button3'}","Button","mBase","[]")		self.Layout1=forms		self.create("{'Visible': 'True', 'Name': 'Layout1', 'Picture': '', 'BackColor': '(0, 0.4361869060461, 0.42905835405256687, 0.5)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '75', 'Left': '115', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '405', 'Height': '40', 'Var': '', 'Text': 'Layout1'}","Layout","mBase","[]")		self.Label6=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label6', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '20', 'Left': '25', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '5', 'Height': '25', 'Var': '', 'Text': '^'}","Label","Layout1","[]")		self.Layout2=forms		self.create("{'Visible': 'True', 'Name': 'Layout2', 'Picture': '', 'BackColor': '(0, 0.4361869060461, 0.42905835405256687, 0.5)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '75', 'Left': '115', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '455', 'Height': '40', 'Var': '', 'Text': 'v'}","Layout","mBase","[]")		self.Label7=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label7', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '20', 'Left': '25', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '5', 'Height': '25', 'Var': '', 'Text': 'v'}","Label","Layout2","[]")		self.Layout3=forms		self.create("{'Visible': 'True', 'Name': 'Layout3', 'Picture': '', 'BackColor': '(0, 0.4361869060461, 0.42905835405256687, 0.5)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '60', 'Left': '40', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '430', 'Height': '40', 'Var': '', 'Text': 'Layout1'}","Layout","mBase","[]")		self.Label8=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label8', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '15', 'Left': '25', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '5', 'Height': '25', 'Var': '', 'Text': '<'}","Label","Layout3","[]")		self.Layout4=forms		self.create("{'Visible': 'True', 'Name': 'Layout4', 'Picture': '', 'BackColor': '(0, 0.4361869060461, 0.42905835405256687, 0.5)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '70', 'Left': '205', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '430', 'Height': '40', 'Var': '', 'Text': 'Layout1'}","Layout","mBase","[]")		self.Label9=forms		self.create("{'Visible': 'True', 'Alignment': '', 'Name': 'Label9', 'Picture': '', 'BackColor': '(1,1,1,1)', 'Tag': '', 'Font': '', 'Events': '[[, ]]', 'ForeColor': '(0,0,0,1)', 'Width': '25', 'Left': '20', 'ParentsType': 'Layout', 'Enable': 'True', 'Help': '', 'Top': '5', 'Height': '25', 'Var': '', 'Text': '>'}","Label","Layout4","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this formif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()