import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self._text=''		self.sch=Scheduler(500)#500 ms		self.sch.Start()	def SelectFile(self,Title="",filetypes=['*.py','*.txt'],OpenFlag=True,FolderSelect=False,path="c:/"):				parent=self._usercontrol		try:			while(1):				parent=parent.get_parent()				if type(parent)==Gtk.Window:					break		except:			pass		if FolderSelect:			dlgType=Gtk.FileChooserAction.SELECT_FOLDER			dialog = Gtk.FileChooserDialog(Title, parent,dlgType,										(Gtk.STOCK_OK, Gtk.ResponseType.OK),None)		else:			if OpenFlag==True:				dlgType=Gtk.FileChooserAction.OPEN				sel=Gtk.STOCK_OPEN			else:				dlgType=Gtk.FileChooserAction.SAVE				sel=Gtk.STOCK_SAVE			dialog = Gtk.FileChooserDialog(Title, parent,dlgType,										(Gtk.STOCK_CANCEL, Gtk.ResponseType.CANCEL,sel, Gtk.ResponseType.OK))				if FolderSelect==False:			filter_py = Gtk.FileFilter()			filter_py.set_name("Python files")			for a in filetypes:				filter_py.add_pattern(a)			dialog.add_filter(filter_py)        			dialog.set_current_folder(path)				response = dialog.run()		if response == Gtk.ResponseType.OK:			ret=dialog.get_filename()		else:			ret=response		dialog.destroy()		return ret												def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.Image1=forms		self.create("{'Enable': 'True', 'Tag': '', 'Visible': 'False', 'Picture': '', 'Text': 'Image1', 'Left': '13', 'Height': '50', 'BackColor': '(1,1,1,1)', 'Name': 'Image1', 'Font': '', 'Events': '[[, ]]', 'Width': '100', 'Help': '', 'Top': '9', 'ParentsType': '', 'Var': '', 'ForeColor': '(0,0,0,1)'}","Image","usercontrol","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this formif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()