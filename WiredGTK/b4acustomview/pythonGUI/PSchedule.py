import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.Activity=forms		self.create("{'Height': '541', 'Font': '', 'Tag': '', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '643', 'ForeColor': '(1,1,1,1)', 'ParentsType': '', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '30', 'Name': 'Activity', 'Var': '', 'Left': '50', 'Text': 'Layout1'}","Layout","usercontrol","[]")		self.mBase=forms		self.create("{'Height': '465', 'Font': '', 'Tag': '', 'BackColor': '(1.00,1.00,1.00,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '424', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Layout', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '15', 'Name': 'mBase', 'Var': '', 'Left': '25', 'Text': 'Layout2'}","Layout","Activity","[]")		self.p_Updates=forms		self.create("{'Height': '50', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '140', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '460', 'Name': 'p_Updates', 'Var': '', 'Left': '215', 'Text': 'Updates'}","Button","usercontrol","[]")		self.p_Logs=forms		self.create("{'Height': '50', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '140', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '460', 'Name': 'p_Logs', 'Var': '', 'Left': '355', 'Text': 'Logs'}","Button","usercontrol","[]")		self.Button2=forms		self.create("{'Height': '50', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '140', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '460', 'Name': 'Button2', 'Var': '', 'Left': '75', 'Text': 'Home'}","Button","usercontrol","[]")		self.Frame1=forms		self.create("{'Height': '55', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '420', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Picture': '', 'Help': '', 'Visible': 'False', 'Top': '35', 'Name': 'Frame1', 'Var': '', 'Left': '75', 'Text': ''}","Frame","usercontrol","[]")		self.p_Profile=forms		self.create("{'Height': '35', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '100', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'False', 'Top': '15', 'Name': 'p_Profile', 'Var': '', 'Left': '15', 'Text': 'Back'}","Button","Frame1","[]")		self.Frame3=forms		self.create("{'Height': '70', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '420', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Layout', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '217', 'Name': 'Frame3', 'Var': '', 'Left': '0', 'Text': ''}","Frame","mBase","[]")		self.Frame4=forms		self.create("{'Height': '70', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '420', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Layout', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '282', 'Name': 'Frame4', 'Var': '', 'Left': '0', 'Text': ''}","Frame","mBase","[]")		self.Frame5=forms		self.create("{'Height': '65', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '420', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Layout', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '345', 'Name': 'Frame5', 'Var': '', 'Left': '0', 'Text': ''}","Frame","mBase","[]")		self.p_Visit2=forms		self.create("{'Height': '45', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Alignment': '', 'Events': '[[, ]]', 'Width': '260', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '20', 'Name': 'p_Visit2', 'Var': '', 'Left': '20', 'Text': 'visit2'}","Label","Frame3","[]")		self.p_Visit3=forms		self.create("{'Height': '40', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Alignment': '', 'Events': '[[, ]]', 'Width': '260', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '25', 'Name': 'p_Visit3', 'Var': '', 'Left': '20', 'Text': 'visit3'}","Label","Frame4","[]")		self.p_Visit4=forms		self.create("{'Height': '40', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Alignment': '', 'Events': '[[, ]]', 'Width': '260', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '20', 'Name': 'p_Visit4', 'Var': '', 'Left': '20', 'Text': 'visit4'}","Label","Frame5","[]")		self.p_dateTime2=forms		self.create("{'Height': '40', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Alignment': '', 'Events': '[[, ]]', 'Width': '125', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '15', 'Name': 'p_dateTime2', 'Var': '', 'Left': '282', 'Text': 'datetime2'}","Label","Frame3","[]")		self.p_dateTime3=forms		self.create("{'Height': '40', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Alignment': '', 'Events': '[[, ]]', 'Width': '125', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '15', 'Name': 'p_dateTime3', 'Var': '', 'Left': '287', 'Text': 'datetime3'}","Label","Frame4","[]")		self.p_dateTime4=forms		self.create("{'Height': '40', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Alignment': '', 'Events': '[[, ]]', 'Width': '125', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '15', 'Name': 'p_dateTime4', 'Var': '', 'Left': '287', 'Text': 'datetime4'}","Label","Frame5","[]")		self.Label1=forms		self.create("{'Height': '30', 'Font': 'Sans Bold 10', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Alignment': '', 'Events': '[[, ]]', 'Width': '100', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Frame', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '20', 'Name': 'Label1', 'Var': '', 'Left': '175', 'Text': 'Your Schedule'}","Label","Frame1","[]")		self.Calendar1=forms		self.create("{'Height': '140', 'Font': '', 'Tag': '', 'BackColor': '(1,1,1,1)', 'Enable': 'True', 'Events': '[[, ]]', 'Width': '265', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Layout', 'Picture': '', 'Help': '', 'Visible': 'True', 'Top': '60', 'Name': 'Calendar1', 'Var': '', 'Left': '80', 'Text': 'Calendar1'}","Calendar","mBase","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this formif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()