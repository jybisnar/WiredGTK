import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super(usercontrol).__init__(usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''		col=["Column 1","Column 2","Column 3"]		val=[['Red','Blue','Green'],['Test 1','Text 2','Text 3'],['111','222','333']]		self.datagridtreeview1.TreeViewFilterWindow(col,val)	@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Enable': 'True', 'Picture': '', 'Tag': '', 'Font': '', 'Text': 'Datagrid Values', 'Name': 'Button1', 'Height': '34', 'Left': '202', 'Events': '[clicked]', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Top': '306', 'Visible': 'True', 'BackColor': '(1,1,1,1)', 'Width': '115'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Enable': 'True', 'Picture': '', 'Tag': 'Activex', 'Font': '', 'AlternateColor': 'True', 'Text': 'datagridtreeview1', 'UNSELECT': '#FFFFFF', 'FontSize': '14', 'Name': 'datagridtreeview1', 'FontStyle': 'Times New Roman', 'Height': '103', 'Left': '202', 'Events': '[dblclick]', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Top': '186', 'Visible': 'True', 'BackColor': '(0, 0.24499645336485343, 0.9999431506275153, 0.5)', 'SELECT': '#FFAAAA', 'Width': '192'}","DatagridTreeView","usercontrol","[['dblclick', 'self,model,row,col']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def datagridtreeview1_dblclick(self,model,row,col):		print(row,col,model[row][col])		model[row][col]="wala"		if self.datagridtreeview1.selectionState(row)==True:			self.datagridtreeview1.selectthis(row,False)		else:			self.datagridtreeview1.selectthis(row,True)		pass	def Button1_clicked(self,e):		for a in self.datagridtreeview1.get_ListStore():			print(a[:])		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()