import gi	import timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *import selectimport socketimport sysimport osfrom _thread import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def CommEvent(self,conn,data)	#add more events 	#WiredEvent def ConnectionFrom(self,conn)	#add more events 	#WiredProperty 'Port': '5000'	#WiredProperty 'BufferSize': '1024'	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''		self._BufferSize=1024		self.port=5000		HOST = ''   # Symbolic name meaning all available interfaces		self.waiting=False		self.clients=[]		self.data=None		self.conn=None		#self.activeXcreated()	def clientthread(self,conn):		self.clients.append(conn)		self.waiting=False		if self.caller!=None:			if 'ConnectionFrom' in self.wiredevents:					self.wiredevents['ConnectionFrom'](conn)		while True:			#Receiving from client			try:				ready = select.select([conn], [], [], 1)				if ready[0]:					data = conn.recv(self._BufferSize)				#reply = 'OK...' + str(num) + ' ' + data 					if not data: 						break					else:						self.conn=conn					while self.data!=None:						a=0					self.data=data			except:				break			try:				conn.sendall("".encode())  			except:				break		#came out of loop		print ("Client close")		conn.close()		self.clients.remove(conn)	def _accept(self):		conn, addr = self.s.accept()		print ('Connected with ' + addr[0] + ':' + str(addr[1]))		#start new thread takes 1st argument as a function name to be run, second is the tuple of arguments to the function.		start_new_thread(self.clientthread ,(conn,))			@property		def Port(self):		return self.port	@Port.setter		def Port(self,value):		self.port=int(value)	@property		def BufferSize(self):		return self._BufferSize	@BufferSize.setter		def BufferSize(self,value):		self._BufferSize=int(value)	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		self.s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)		self.s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)		self.s.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)		print ('Socket created')		HOST=''		#Bind socket to local host and port		try:			self.s.bind((HOST, self.port))		except (socket.error , msg):			print ('Bind failed. Error Code : ' + str(msg[0]) + ' Message ' + msg[1])			sys.exit()		print ('Socket bind complete')		#Start listening on socket		self.s.listen(10)		print ('Socket now listening')	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			self.s.close()			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.data!=None:			if self.caller!=None:				if 'CommEvent' in self.wiredevents:						self.wiredevents['CommEvent'](self.conn,self.data)				self.data=None		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'BackColor': '(1,1,1,1)', 'Height': '50', 'Picture': '', 'Width': '100', 'Text': 'Button1', 'Tag': '', 'Events': '[[, ]]', 'Font': '', 'Visible': 'True', 'Top': '113', 'Name': 'Button1', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Left': '64', 'ParentsType': ''}","Button","usercontrol","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def accept(self):		if self.waiting==False:			self.waiting=True			start_new_thread(self._accept ,())		pass	def close(self):		for a in self.clients:			a.close()		self.s.closeif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()