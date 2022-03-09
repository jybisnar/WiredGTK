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
		self.create("{'ParentsType': '', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '405', 'Picture': '', 'Left': '-10', 'Text': 'Layout1', 'Height': '645', 'Name': 'Activity', 'Top': '-5', 'Events': '[[, ]]'}","Layout","usercontrol","[]")
		self.mBase=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.9535890512821091, 0.7790916597141007, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '405', 'Picture': '', 'Left': '0', 'Text': 'Layout1', 'Height': '645', 'Name': 'mBase', 'Top': '0', 'Events': '[[, ]]'}","Layout","Activity","[]")
		self.Image1=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'False', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '405', 'Picture': 'LoginModule-bf106.png', 'Left': '0', 'Text': '', 'Height': '645', 'Name': 'Image1', 'Top': '0', 'Events': '[[, ]]'}","Image","mBase","[]")
		self.btnLogIn=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.12157566880294246, 0.34919659131927605, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '305', 'Picture': '', 'Left': '50', 'Text': '', 'Height': '35', 'Name': 'btnLogIn', 'Top': '515', 'Events': '[[, ]]'}","Layout","mBase","[]")
		self.txtID=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '300', 'Picture': '', 'Left': '50', 'Text': '', 'Height': '35', 'Name': 'txtID', 'Top': '395', 'Events': '[[, ]]', 'Alignment': ''}","Entry","mBase","[]")
		self.txtPassword=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '300', 'Picture': '', 'Left': '50', 'Text': '', 'Height': '25', 'Name': 'txtPassword', 'Top': '455', 'Events': '[[, ]]', 'Alignment': ''}","Entry","mBase","[]")
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