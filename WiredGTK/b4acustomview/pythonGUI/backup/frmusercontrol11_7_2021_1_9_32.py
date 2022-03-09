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
		self.create("{'Help': '', 'Var': '', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'Events': '[[, ]]', 'Width': '643', 'ParentsType': '', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '541', 'Enable': 'True', 'Tag': '', 'Name': 'Activity', 'Text': 'Layout1', 'Top': '30', 'ForeColor': '(0,0,0,1)', 'Left': '50'}","Layout","usercontrol","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(1.00,1.00,1.00,1)', 'Events': '[[, ]]', 'Width': '424', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '465', 'Enable': 'True', 'Tag': '', 'Name': 'mBase', 'Text': 'Layout2', 'Top': '15', 'ForeColor': '(0,0,0,1)', 'Left': '25'}","Layout","Activity","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'Alignment': '', 'Events': '[[, ]]', 'Width': '100', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '30', 'Enable': 'True', 'Tag': '', 'Name': 'Label1', 'Text': 'Label1', 'Top': '20', 'ForeColor': '(0,0,0,1)', 'Left': '35'}","Label","mBase","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'Alignment': '', 'Events': '[[, ]]', 'Width': '100', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '30', 'Enable': 'True', 'Tag': '', 'Name': 'Label2', 'Text': 'Label2', 'Top': '20', 'ForeColor': '(0,0,0,1)', 'Left': '165'}","Label","mBase","[]")
		self.create("{'dbtype': 'sqllite', 'BackColor': '(0, 0.5771084281161872, 0.6437099811436825, 0.5)', 'Width': '205', 'ParentsType': 'Layout', 'Font': '', 'SELECT': '#FFAAAA', 'Help': '', 'FontStyle': 'Times New Roman', 'FontSize': '14', 'Text': 'DatagridTreeView1', 'ForeColor': '(0,0,0,1)', 'Height': '160', 'AlternateColor': 'False', 'Events': '[[, ]]', 'Var': '', 'UNSELECT': '#FFFFFF', 'Picture': 'DatagridTreeView.png', 'Visible': 'True', 'Enable': 'True', 'Tag': 'Activex', 'Name': 'DatagridTreeView1', 'Top': '90', 'Left': '35'}","DatagridTreeView","mBase","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(0, 0.3888056493649016, 0.4463967631327912, 0.5)', 'Interval': '1000', 'Events': '[[, ]]', 'Width': '30', 'ParentsType': 'Layout', 'Font': '', 'Picture': 'Timer.png', 'Visible': 'True', 'Height': '30', 'Enable': 'True', 'Tag': 'Activex', 'Name': 'Timer1', 'Text': 'Timer1', 'Top': '130', 'ForeColor': '(0,0,0,1)', 'Left': '285'}","Timer","mBase","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(0, 0.12027104030828939, 0.5728644378168872, 0.5)', 'Interval': '1000', 'Events': '[[, ]]', 'Width': '30', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '30', 'Enable': 'True', 'Tag': 'Activex', 'Name': 'mytimer', 'Text': 'Timer2', 'Top': '280', 'ForeColor': '(0,0,0,1)', 'Left': '195'}","Timer","mBase","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'Events': '[[, ]]', 'Width': '100', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '100', 'Enable': 'True', 'Tag': '', 'Name': 'Image1', 'Text': 'Image1', 'Top': '250', 'ForeColor': '(0,0,0,1)', 'Left': '275'}","Image","mBase","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'Events': '[[, ]]', 'Width': '80', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '30', 'Enable': 'True', 'Tag': '', 'Name': 'RadioButton1', 'Text': 'RadioButton1', 'Top': '75', 'ForeColor': '(0,0,0,1)', 'Left': '259'}","RadioButton","mBase","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'Events': '[[, ]]', 'Width': '80', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '30', 'Enable': 'True', 'Tag': '', 'Name': 'RadioButton2', 'Text': 'RadioButton2', 'Top': '115', 'ForeColor': '(0,0,0,1)', 'Left': '280'}","RadioButton","mBase","[]")
		self.create("{'Help': '', 'Var': '', 'BackColor': '(1,1,1,1)', 'Events': '[[, ]]', 'Width': '80', 'ParentsType': 'Layout', 'Font': '', 'Picture': '', 'Visible': 'True', 'Height': '30', 'Enable': 'True', 'Tag': '', 'Name': 'CheckButton1', 'Text': 'CheckButton1', 'Top': '260', 'ForeColor': '(0,0,0,1)', 'Left': '40'}","CheckButton","mBase","[]")
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