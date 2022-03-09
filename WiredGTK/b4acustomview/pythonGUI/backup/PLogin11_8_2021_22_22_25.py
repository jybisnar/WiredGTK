import gi
import time
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk,GObject,Gdk,Pango,GLib
from wta_module import *
#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils
#	#####################www.WireThemAll.com#####################

class Handler(object):
	def __init__(self,*param):			
		initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)
		self.GTKForms()
		self.sch=Scheduler(500)#500 ms
		self.sch.Start()

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
		self.Activity=forms
		self.create("{'Top': '30', 'Left': '50', 'Height': '800', 'Enable': 'True', 'ForeColor': '(1,1,1,1)', 'ParentsType': '', 'Width': '643', 'Var': '', 'Font': '', 'Name': 'Activity', 'Visible': 'True', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'Events': '[]', 'Help': '', 'Tag': '', 'Picture': '', 'Text': 'Layout1'}","Layout","usercontrol","[]")
		self.mBase=forms
		self.create("{'Top': '0', 'Left': '0', 'Height': '800', 'Enable': 'True', 'ForeColor': '(0,0,0,1)', 'ParentsType': 'Layout', 'Width': '420', 'Var': '', 'Font': '', 'Name': 'mBase', 'Visible': 'True', 'BackColor': '(1.00,1.00,1.00,1)', 'Events': '[]', 'Help': '', 'Tag': '', 'Picture': '', 'Text': 'Layout2'}","Layout","Activity","[]")
		self.bg=forms
		self.create("{'Top': '30', 'Left': '50', 'Height': '800', 'Enable': 'True', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Width': '420', 'Var': '', 'Font': '', 'Name': 'bg', 'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'Help': '', 'Tag': '', 'Picture': 'login.png', 'Text': ''}","Image","usercontrol","[]")
		self.txt1=forms
		self.create("{'Top': '290', 'Left': '140', 'Height': '25', 'Enable': 'True', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Width': '235', 'Var': '', 'Font': '', 'Name': 'txt1', 'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'Help': '', 'Tag': '', 'Picture': '', 'Text': 'The fastest way to treat and be treated'}","TextView","usercontrol","[]")
		self.p_Username=forms
		self.create("{'Top': '555', 'Left': '140', 'Height': '30', 'Enable': 'True', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Alignment': '', 'Width': '230', 'Var': '', 'Font': '', 'Name': 'p_Username', 'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'Help': '', 'Tag': '', 'Picture': '', 'Text': ''}","Entry","usercontrol","[]")
		self.p_Password=forms
		self.create("{'Top': '595', 'Left': '140', 'Height': '30', 'Enable': 'True', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Alignment': '', 'Width': '230', 'Var': '', 'Font': '', 'Name': 'p_Password', 'Visible': 'False', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'Help': '', 'Tag': '', 'Picture': '', 'Text': ''}","Entry","usercontrol","[]")
		self.btn_Login=forms
		self.create("{'Top': '660', 'Left': '140', 'Height': '40', 'Enable': 'True', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Width': '230', 'Var': '', 'Font': '', 'Name': 'btn_Login', 'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'Help': '', 'Tag': '', 'Picture': '', 'Text': 'Login'}","Button","usercontrol","[]")
	def Widget(self):
		if self._usercontrol in self._mainlayout.get_children():
			self._mainlayout.remove(self._usercontrol)
		return self._usercontrol
	def Hide(self):
		self._window.hide()
	def Show(self,modal=False,x=None,y=None):
		if x!=None:
			self._window.move(x,y)
		self._window.set_modal(modal)
		self._window.show()
		Gtk.main()
		return ""#put ur return value here upon closing this form
if __name__ == "__main__":
	_m = Handler()
	_m._window.show()
	Gtk.main()