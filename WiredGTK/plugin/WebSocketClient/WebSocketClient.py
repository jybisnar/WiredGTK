import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################import websockettry:	import threadexcept ImportError:	import _thread as threadclass Handler(usercontrol):	#WiredEvent def on_data_recv(self,value)	#add more events 	#WiredEvent def on_error(self,value)	#add more events 	#WiredEvent def on_close(self)	#add more events 	#WiredEvent def on_connected(self)	#add more events 	#WiredProperty 'url':'ws://localhost:9000/'		def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self.ws =None		self._url=''		self.data=[]		self._connected=False		self._error=None		self._close=False	@property		def url(self):		return self._url	@url.setter		def url(self,value):		self._url=value	def _on_message(self,message):		self.data.append(message)	def _on_error(self,ws):		self._error=ws	def _on_close(self,ws):		self._close=True	def _on_open(self):		self._connected=True		def open(self):		if self.ws==None:			self.ws = websocket.WebSocketApp(self._url)			self.ws.on_message = self._on_message			self.ws.on_open = self._on_open			self.ws.on_error =  self._on_error			self.ws.on_close = self._on_close			thread.start_new_thread(self.ws.run_forever, ())		else:			self.ws.close()			self.ws = websocket.WebSocketApp(self._url)			self.ws.on_message = self._on_message			self.ws.on_open = self._on_open			self.ws.on_error =  self._on_error			self.ws.on_close = self._on_close			thread.start_new_thread(self.ws.run_forever, ())				def Send(self,message):		if self.ws!=None:			self.ws.send(message)			def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if len(self.data)!=0:			if self.caller!=None:				if 'on_data_recv' in self.wiredevents:					self.wiredevents['on_data_recv'](self.data[0])					self.data.remove(self.data[0])			else:				self.data.remove(self.data[0])		if self._connected==True:			if self.caller!=None:				if 'on_connected' in self.wiredevents:					self.wiredevents['on_connected']()			self._connected=False				if self._error!=None:						if self.caller!=None:				if 'on_error' in self.wiredevents:					self.wiredevents['on_error'](self._error)			self._error=None		if self._close==True:			if self.caller!=None:				if 'on_close' in self.wiredevents:					self.wiredevents['on_close']()								self._close=False				if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		pass	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this formif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()