import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.Activity=forms		self.create("{'Var': '', 'Text': 'Layout1', 'ParentsType': '', 'Height': '655', 'Left': '15', 'Tag': '', 'BackColor': '(0, 0.15818675032557372, 0.9408383013784336, 0.5)', 'ForeColor': '(0,0,0,1)', 'Name': 'Activity', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Width': '405', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '30'}","Layout","usercontrol","[]")		self.mBase=forms		self.create("{'Var': '', 'Text': 'Layout1', 'ParentsType': 'Layout', 'Height': '655', 'Left': '0', 'Tag': '', 'BackColor': '(0, 0.9535890512821091, 0.7790916597141007, 0.5)', 'ForeColor': '(0,0,0,1)', 'Name': 'mBase', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Width': '405', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '0'}","Layout","Activity","[]")		self.Image1=forms		self.create("{'Var': '', 'Text': '', 'ParentsType': 'Layout', 'Height': '655', 'Left': '0', 'Tag': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Name': 'Image1', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': 'MedicalHistory-4cd35.png', 'Width': '405', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '0'}","Image","mBase","[]")		self.btnSetAppointment=forms		self.create("{'Var': '', 'Text': '', 'ParentsType': 'Layout', 'Height': '35', 'Left': '200', 'Tag': '', 'BackColor': '(0, 0.5947705885149066, 0.6256477024706841, 0.5)', 'ForeColor': '(0,0,0,1)', 'Name': 'btnSetAppointment', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Width': '185', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '220'}","Layout","mBase","[]")		self.btnBack=forms		self.create("{'Var': '', 'Text': '', 'ParentsType': 'Layout', 'Height': '40', 'Left': '25', 'Tag': '', 'BackColor': '(0, 0.5485275470322745, 0.40684617506831855, 0.5)', 'ForeColor': '(0,0,0,1)', 'Name': 'btnBack', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Width': '55', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '10'}","Layout","mBase","[]")		self.btnQrReader=forms		self.create("{'Var': '', 'Text': '', 'ParentsType': 'Layout', 'Height': '40', 'Left': '330', 'Tag': '', 'BackColor': '(0, 0.5485275470322745, 0.40684617506831855, 0.5)', 'ForeColor': '(0,0,0,1)', 'Name': 'btnQrReader', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Width': '55', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '10'}","Layout","mBase","[]")		self.lblName=forms		self.create("{'Var': '', 'Text': '', 'ParentsType': 'Layout', 'Height': '40', 'Left': '160', 'Tag': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Name': 'lblName', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Alignment': '', 'Width': '225', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '80'}","Label","mBase","[]")		self.lblDesc=forms		self.create("{'Var': '', 'Text': '', 'ParentsType': 'Layout', 'Height': '360', 'Left': '25', 'Tag': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Name': 'lblDesc', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Alignment': '', 'Width': '355', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '270'}","Label","mBase","[]")		self.lblID=forms		self.create("{'Var': '', 'Text': '', 'ParentsType': 'Layout', 'Height': '35', 'Left': '160', 'Tag': '', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Name': 'lblID', 'Events': '[[, ]]', 'Enable': 'True', 'Picture': '', 'Alignment': '', 'Width': '225', 'Help': '', 'Visible': 'True', 'Font': '', 'Top': '130'}","Label","mBase","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this formif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()