import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.Activity=forms		self.create("{'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '425', 'Left': '5', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '5', 'Text': 'Layout1', 'ParentsType': '', 'Name': 'Activity', 'Var': '', 'Events': '[[, ]]', 'Height': '675', 'Picture': '', 'Font': ''}","Layout","usercontrol","[]")		self.mBase=forms		self.create("{'BackColor': '(0, 0.9535890512821091, 0.7790916597141007, 0.5)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '425', 'Left': '0', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '0', 'Text': 'Layout1', 'ParentsType': 'Layout', 'Name': 'mBase', 'Var': '', 'Events': '[[, ]]', 'Height': '675', 'Picture': '', 'Font': ''}","Layout","Activity","[]")		self.Image1=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '405', 'Left': '0', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '0', 'Text': '', 'ParentsType': 'Layout', 'Name': 'Image1', 'Var': '', 'Events': '[[, ]]', 'Height': '655', 'Picture': 'HomeModule-5ae79.png', 'Font': ''}","Image","mBase","[]")		self.btnProfile=forms		self.create("{'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '55', 'Left': '20', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '5', 'Text': '', 'ParentsType': 'Layout', 'Name': 'btnProfile', 'Var': '', 'Events': '[[, ]]', 'Height': '45', 'Picture': '', 'Font': ''}","Layout","mBase","[]")		self.btnQrReader=forms		self.create("{'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '55', 'Left': '332', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '7', 'Text': '', 'ParentsType': 'Layout', 'Name': 'btnQrReader', 'Var': '', 'Events': '[[, ]]', 'Height': '45', 'Picture': '', 'Font': ''}","Layout","mBase","[]")		self.btnSchedule=forms		self.create("{'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '160', 'Left': '217', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '142', 'Text': '', 'ParentsType': 'Layout', 'Name': 'btnSchedule', 'Var': '', 'Events': '[[, ]]', 'Height': '35', 'Picture': '', 'Font': ''}","Layout","mBase","[]")		self.btnContact=forms		self.create("{'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '150', 'Left': '220', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '292', 'Text': '', 'ParentsType': 'Layout', 'Name': 'btnContact', 'Var': '', 'Events': '[[, ]]', 'Height': '35', 'Picture': '', 'Font': ''}","Layout","mBase","[]")		self.btnLogs=forms		self.create("{'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '70', 'Left': '200', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '607', 'Text': '', 'ParentsType': 'Layout', 'Name': 'btnLogs', 'Var': '', 'Events': '[[, ]]', 'Height': '45', 'Picture': '', 'Font': ''}","Layout","mBase","[]")		self.lblName=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '355', 'Left': '20', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '70', 'Text': '', 'ParentsType': 'Layout', 'Name': 'lblName', 'Var': '', 'Events': '[[, ]]', 'Height': '65', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")		self.lblProgress=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '335', 'Left': '35', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '215', 'Text': '', 'ParentsType': 'Layout', 'Name': 'lblProgress', 'Var': '', 'Events': '[[, ]]', 'Height': '75', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")		self.d_Notif1=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '260', 'Left': '100', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '385', 'Text': '', 'ParentsType': 'Layout', 'Name': 'd_Notif1', 'Var': '', 'Events': '[[, ]]', 'Height': '30', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")		self.id1=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '260', 'Left': '100', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '415', 'Text': '', 'ParentsType': 'Layout', 'Name': 'id1', 'Var': '', 'Events': '[]', 'Height': '30', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")		self.desc1=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '260', 'Left': '100', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '445', 'Text': '', 'ParentsType': 'Layout', 'Name': 'desc1', 'Var': '', 'Events': '[]', 'Height': '30', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")		self.name2=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '260', 'Left': '100', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '485', 'Text': '', 'ParentsType': 'Layout', 'Name': 'name2', 'Var': '', 'Events': '[]', 'Height': '30', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")		self.id2=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '260', 'Left': '100', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '515', 'Text': '', 'ParentsType': 'Layout', 'Name': 'id2', 'Var': '', 'Events': '[]', 'Height': '30', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")		self.desc2=forms		self.create("{'BackColor': '(1,1,1,1)', 'Tag': '', 'Enable': 'True', 'Help': '', 'Width': '260', 'Left': '100', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Top': '545', 'Text': '', 'ParentsType': 'Layout', 'Name': 'desc2', 'Var': '', 'Events': '[]', 'Height': '30', 'Picture': '', 'Font': '', 'Alignment': ''}","Label","mBase","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this formif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()