import gi
import time
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk,GObject,Gdk,Pango,GLib
from wta_module import *
#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils
#	#####################www.WireThemAll.com#####################

class Handler(usercontrol):
	#WiredEvent def usercontrolevent(self,value)	#add more events 
	#WiredProperty 'usercontrolproperty': 'sample only'	
	def __init__(self,*param):			
		initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)
		self.GTKForms()
		super().__init__(self.usercontrol)
		self.sch=Scheduler(500)#500 ms
		self.sch.Start()
		self._text=''
		self._usercontrolproperty=''
	@property	
	def usercontrolproperty(self):
		return self._usercontrolproperty
	@usercontrolproperty.setter	
	def usercontrolproperty(self,value):
		self._usercontrolproperty=value
