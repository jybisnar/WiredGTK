import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def on_data_recv(self,value)	#add more events 	#WiredEvent def on_error(self,value)	#add more events 	#WiredEvent def on_close(self)	#add more events 	#WiredEvent def on_connected(self,conn)	#add more events 	#WiredProperty 'url':'new.testonlineproject.com:5000'		#WiredProperty 'ID': '123'	#WiredProperty 'ClientID': '456'	def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self.ComboBoxText1.List=["WTAREGISTER^"+self.Entry1.Text+"\r","WTARELAY^"+self.Entry1.Text+"^Hello\r","WTADEVICES^\r","WTAKICK^"+self.Entry1.Text+"\r",]		self._url=""		self._ID=""		self._ClientID=""	@property	def ClientID(self):		return self._ClientID	@ClientID.setter		def ClientID(self,value):		self._ClientID=value	@property	def ID(self):		return self._ID	@ID.setter		def ID(self,value):		self._ID=value	@property		def url(self):		return self._url	@url.setter		def url(self,value):		self._url=value		self.socketclienttcp1.Address=getCSV(0,":",value)		self.socketclienttcp1.Port=int(getCSV(1,":",value))	@property	def Open(self):		return self._url	@Open.setter		def Open(self,value):		self.socketclienttcp1.reconnect()	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate 	 if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Font': '', 'Height': '30', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '28', 'Address': 'localhost', 'Port': '5000', 'BufferSize': '1024', 'Help': '', 'BackColor': '(0, 0.4305762015564615, 0.26882148398282424, 0.5)', 'Top': '82', 'Picture': 'socketClientTCP.png', 'Text': 'socketclienttcp1', 'Var': '', 'Tag': 'Activex', 'ParentsType': '', 'Events': '[CommEvent, ConnectionFrom]', 'Left': '127', 'Name': 'socketclienttcp1', 'Visible': 'True'}","socketClientTCP","usercontrol","[['CommEvent', 'self,conn,data'], ['ConnectionFrom', 'self,conn']]")		self.create("{'Font': '', 'Height': '160', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '214', 'Help': '', 'BackColor': '(1,1,1,1)', 'Top': '127', 'Picture': '', 'Text': 'TextView1', 'Var': '', 'Tag': '', 'ParentsType': '', 'Events': '[]', 'Left': '120', 'Name': 'TextView1', 'Visible': 'True'}","TextView","usercontrol","[]")		self.create("{'Font': '', 'Height': '50', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '100', 'Help': '', 'BackColor': '(1,1,1,1)', 'Top': '73', 'Picture': '', 'Text': 'Send', 'Var': '', 'Tag': '', 'ParentsType': '', 'Events': '[clicked]', 'Left': '184', 'Name': 'Button1', 'Visible': 'True'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Font': '', 'Height': '30', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '147', 'Alignment': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Top': '41', 'Picture': '', 'Text': 'socket Client TCP example', 'Var': '', 'Tag': '', 'ParentsType': '', 'Events': '[[, ]]', 'Left': '124', 'Name': 'Label1', 'Visible': 'True'}","Label","usercontrol","[]")		self.create("{'Font': '', 'Height': '30', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '30', 'Interval': '5000', 'Help': '', 'BackColor': '(0, 0.20513950224541044, 0.8222246816727782, 0.5)', 'Top': '35', 'Picture': 'Timer.png', 'Text': 'Timer1', 'Var': '', 'Tag': 'Activex', 'ParentsType': '', 'Events': '[Tick]', 'Left': '295', 'Name': 'Timer1', 'Visible': 'True'}","Timer","usercontrol","[['Tick', 'self']]")		self.create("{'Font': '', 'Height': '25', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '220', 'Help': '', 'BackColor': '(1,1,1,1)', 'Top': '95', 'Picture': '', 'Text': 'ComboBoxText1', 'Var': '', 'Tag': '', 'ParentsType': '', 'Events': '[[, ]]', 'Left': '300', 'Name': 'ComboBoxText1', 'Visible': 'True'}","ComboBoxText","usercontrol","[]")		self.create("{'Font': '', 'Height': '30', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '120', 'Alignment': '', 'Help': '', 'BackColor': '(1,1,1,1)', 'Top': '65', 'Picture': '', 'Text': '123', 'Var': '', 'Tag': '', 'ParentsType': '', 'Events': '[[, ]]', 'Left': '300', 'Name': 'Entry1', 'Visible': 'True'}","Entry","usercontrol","[]")		self.create("{'Font': '', 'Height': '50', 'ForeColor': '(0,0,0,1)', 'Enable': 'True', 'Width': '100', 'Help': '', 'BackColor': '(1,1,1,1)', 'Top': '45', 'Picture': '', 'Text': 'Update', 'Var': '', 'Tag': '', 'ParentsType': '', 'Events': '[clicked]', 'Left': '420', 'Name': 'Button2', 'Visible': 'True'}","Button","usercontrol","[['clicked', 'self,e']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def Button1_clicked(self,e):		self.socketclienttcp1.sendall((self.ComboBoxText1.Text+"\r").encode())		pass	def socketclienttcp1_CommEvent(self,conn,data):		if self.caller!=None:			if 'on_data_recv' in self.wiredevents:					self.wiredevents['on_data_recv'](data)		else:			self.TextView1.Text+=data.decode()+"\r\n"		pass	def Timer1_Tick(self):		try:			self.socketclienttcp1.sendall("1\r".encode())		except:			self.Open=True				print("socket error")		pass	def Button2_clicked(self,e):		self.ComboBoxText1.List=["WTAREGISTER^"+self.Entry1.Text+"\r","WTARELAY^"+self.Entry1.Text+"^Hello\r","WTADEVICES^\r","WTAKICK^"+self.Entry1.Text+"\r",]		pass	def Register(self):		try:			self.socketclienttcp1.sendall(("WTAREGISTER^" +self._ID + "\r").encode())		except:			if self.caller!=None:				if 'on_error' in self.wiredevents:						self.wiredevents['on_error']("connection error")	def SendClient(self,data):		try:			self.socketclienttcp1.sendall((("WTARELAY^" +self._ClientID + "^").encode() + data.encode() + "$".encode()))		except:			if self.caller!=None:				if 'on_error' in self.wiredevents:						self.wiredevents['on_error']("connection error")	def SendServer(self,data):		data+="\r"		try:			self.socketclienttcp1.sendall( data.encode())		except:			if self.caller!=None:				if 'on_error' in self.wiredevents:						self.wiredevents['on_error']("connection error")	def Devices(self):		try:			self.socketclienttcp1.sendall((("WTADEVICES^").encode()  + "\r".encode()))		except:			if self.caller!=None:				if 'on_error' in self.wiredevents:						self.wiredevents['on_error']("connection error")	def socketclienttcp1_ConnectionFrom(self,conn):		if self.caller!=None:			if 'on_connected' in self.wiredevents:					self.Register()				self.wiredevents['on_connected'](conn)		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()