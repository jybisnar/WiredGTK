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
		self.create("{'ParentsType': '', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '370', 'Picture': '', 'Left': '5', 'Text': 'Layout1', 'Height': '655', 'Name': 'Activity', 'Top': '5', 'Events': '[]'}","Layout","usercontrol","[]")
		self.mBase=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.9535890512821091, 0.7790916597141007, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '370', 'Picture': '', 'Left': '0', 'Text': 'Layout1', 'Height': '655', 'Name': 'mBase', 'Top': '0', 'Events': '[]'}","Layout","Activity","[]")
		self.Image1=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '370', 'Picture': 'HomeModule-71319.png', 'Left': '0', 'Text': '', 'Height': '655', 'Name': 'Image1', 'Top': '0', 'Events': '[[, ]]'}","Image","mBase","[]")
		self.btnProfile=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '55', 'Picture': '', 'Left': '10', 'Text': '', 'Height': '45', 'Name': 'btnProfile', 'Top': '5', 'Events': '[]'}","Layout","mBase","[]")
		self.btnQrReader=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '55', 'Picture': '', 'Left': '307', 'Text': '', 'Height': '45', 'Name': 'btnQrReader', 'Top': '7', 'Events': '[]'}","Layout","mBase","[]")
		self.btnOverview=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '155', 'Picture': '', 'Left': '22', 'Text': '', 'Height': '30', 'Name': 'btnOverview', 'Top': '132', 'Events': '[]'}","Layout","mBase","[]")
		self.btnSchedule=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '155', 'Picture': '', 'Left': '197', 'Text': '', 'Height': '30', 'Name': 'btnSchedule', 'Top': '132', 'Events': '[]'}","Layout","mBase","[]")
		self.btnContact=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '145', 'Picture': '', 'Left': '190', 'Text': '', 'Height': '35', 'Name': 'btnContact', 'Top': '292', 'Events': '[]'}","Layout","mBase","[]")
		self.btnLogs=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(0, 0.5070987989932315, 0.14762284075298326, 0.5)', 'ForeColor': '(0,0,0,1)', 'Width': '70', 'Picture': '', 'Left': '180', 'Text': '', 'Height': '40', 'Name': 'btnLogs', 'Top': '612', 'Events': '[]'}","Layout","mBase","[]")
		self.lblName=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '335', 'Picture': '', 'Left': '20', 'Text': '', 'Height': '60', 'Name': 'lblName', 'Top': '65', 'Events': '[]', 'Alignment': ''}","Label","mBase","[]")
		self.lblProgress=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '310', 'Picture': '', 'Left': '35', 'Text': '', 'Height': '75', 'Name': 'lblProgress', 'Top': '210', 'Events': '[]', 'Alignment': ''}","Label","mBase","[]")
		self.d_Notif1=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '260', 'Picture': '', 'Left': '85', 'Text': '', 'Height': '75', 'Name': 'd_Notif1', 'Top': '390', 'Events': '[]', 'Alignment': ''}","Label","mBase","[]")
		self.d_Notif2=forms
		self.create("{'ParentsType': 'Layout', 'Tag': '', 'Help': '', 'Visible': 'True', 'Enable': 'True', 'Font': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Width': '260', 'Picture': '', 'Left': '85', 'Text': '', 'Height': '75', 'Name': 'd_Notif2', 'Top': '485', 'Events': '[]', 'Alignment': ''}","Label","mBase","[]")
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