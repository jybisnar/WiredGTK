import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wired_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()	def SelectFile(self,Title="",filetypes=['*.py','*.txt'],OpenFlag=True):				if OpenFlag==True:			dlgType=Gtk.FileChooserAction.OPEN		else:			dlgType=Gtk.FileChooserAction.SAVE		parent=self._usercontrol.get_parent()			while type(parent)!=Gtk.Window:			parent=parent.get_parent()					dialog = Gtk.FileChooserDialog(Title, parent,dlgType,		        (Gtk.STOCK_CANCEL, Gtk.ResponseType.CANCEL,Gtk.STOCK_OPEN, Gtk.ResponseType.OK))		filter_py = Gtk.FileFilter()		filter_py.set_name("Python files")		for a in filetypes:			filter_py.add_pattern(a)		dialog.add_filter(filter_py)        		#dialog.set_current_folder(path)		response = dialog.run()		if response == Gtk.ResponseType.OK:			ret=dialog.get_filename()		else:			ret=response		dialog.destroy()		return ret												def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})		@property	def Text(self):		return ''	@Text.setter	def Text(self,value):		pass	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Width': '100', 'Visible': 'False', 'Top': '9', 'Enable': 'True', 'ParentsType': '', 'Height': '50', 'ForeColor': '(0,0,0,1)', 'Text': 'Image1', 'Tag': '', 'Picture': '', 'Left': '13', 'BackColor': '(1,1,1,1)', 'Name': 'Image1', 'Events': '[]', 'Font': ''}","Image","usercontrol","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this formif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()