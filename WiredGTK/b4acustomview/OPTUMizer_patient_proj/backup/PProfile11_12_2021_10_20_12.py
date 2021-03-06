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
		self.create("{'Visible': 'True', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '5', 'Picture': '', 'Tag': '', 'Width': '470', 'Enable': 'True', 'Font': '', 'Text': 'Layout1', 'Help': '', 'Height': '685', 'Top': '5', 'Var': '', 'Name': 'Activity', 'ParentsType': ''}","Layout","usercontrol","[]")
		self.mBase=forms
		self.create("{'Visible': 'True', 'BackColor': '(0, 0.9535890512821091, 0.7790916597141007, 0.5)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '10', 'Picture': '', 'Tag': '', 'Width': '370', 'Enable': 'True', 'Font': '', 'Text': 'Layout1', 'Help': '', 'Height': '650', 'Top': '5', 'Var': '', 'Name': 'mBase', 'ParentsType': 'Layout'}","Layout","Activity","[]")
		self.Image1=forms
		self.create("{'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '0', 'Picture': 'ProfileSubModule-783e7.png', 'Tag': '', 'Width': '370', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '655', 'Top': '0', 'Var': '', 'Name': 'Image1', 'ParentsType': 'Layout'}","Image","mBase","[]")
		self.btnLogout=forms
		self.create("{'Visible': 'True', 'BackColor': '(0, 0.7406073418126649, 0.09054132530882697, 0.5)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '125', 'Picture': '', 'Tag': '', 'Width': '120', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '40', 'Top': '605', 'Var': '', 'Name': 'btnLogout', 'ParentsType': 'Layout'}","Layout","mBase","[]")
		self.btnQr=forms
		self.create("{'Visible': 'True', 'BackColor': '(0, 0.09798044860069444, 0.1712494341186408, 0.5)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '305', 'Picture': '', 'Tag': '', 'Width': '45', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '40', 'Top': '10', 'Var': '', 'Name': 'btnQr', 'ParentsType': 'Layout'}","Layout","mBase","[]")
		self.btnBack=forms
		self.create("{'Visible': 'True', 'BackColor': '(0, 0.5700095957594278, 0.8007551983979785, 0.5)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '15', 'Picture': '', 'Tag': '', 'Width': '45', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '40', 'Top': '10', 'Var': '', 'Name': 'btnBack', 'ParentsType': 'Layout'}","Layout","mBase","[]")
		self.lblName=forms
		self.create("{'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '30', 'Picture': '', 'Tag': '', 'Width': '310', 'Alignment': 'CENTER', 'Enable': 'False', 'Font': '', 'Text': '', 'Help': '', 'Height': '55', 'Top': '235', 'Var': '', 'Name': 'lblName', 'ParentsType': 'Layout'}","Label","mBase","[]")
		self.lbl_ID=forms
		self.create("{'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '25', 'Picture': '', 'Tag': '', 'Width': '320', 'Alignment': 'CENTER', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '25', 'Top': '385', 'Var': '', 'Name': 'lbl_ID', 'ParentsType': 'Layout'}","Label","mBase","[]")
		self.lblAddress=forms
		self.create("{'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '25', 'Picture': '', 'Tag': '', 'Width': '320', 'Alignment': '', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '30', 'Top': '440', 'Var': '', 'Name': 'lblAddress', 'ParentsType': 'Layout'}","Label","mBase","[]")
		self.lblCounty=forms
		self.create("{'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '25', 'Picture': '', 'Tag': '', 'Width': '135', 'Alignment': '', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '30', 'Top': '495', 'Var': '', 'Name': 'lblCounty', 'ParentsType': 'Layout'}","Label","mBase","[]")
		self.lblZip=forms
		self.create("{'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '195', 'Picture': '', 'Tag': '', 'Width': '150', 'Alignment': '', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '30', 'Top': '495', 'Var': '', 'Name': 'lblZip', 'ParentsType': 'Layout'}","Label","mBase","[]")
		self.lblState=forms
		self.create("{'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Events': '[]', 'ForeColor': '(0,0,0,1)', 'Left': '25', 'Picture': '', 'Tag': '', 'Width': '320', 'Alignment': 'CENTER', 'Enable': 'True', 'Font': '', 'Text': '', 'Help': '', 'Height': '30', 'Top': '550', 'Var': '', 'Name': 'lblState', 'ParentsType': 'Layout'}","Label","mBase","[]")
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