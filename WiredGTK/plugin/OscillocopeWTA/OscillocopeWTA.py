import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pangofrom wta_module import *import math#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def framecomplete(self,value)	#add more events 		#WiredProperty 'LineColor': '(0.17,0.96,0.14,1)'	#WiredProperty 'LineThickness': '1'	#WiredProperty 'BG_Color': '(0,0,0,1)'	#WiredProperty 'VPP': '5'	def __init__(self,*param):					self.line=[]			initUI(self,param,w=600,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super(usercontrol).__init__(usercontrol)		self._text=''		self.sch=Scheduler(500)#500 ms		self.sch.Start()			self.x=0		self.px=0		self.py=0		self.color=0		self.LineThickness=0		self.scale=1		self.amplitude=self.DrawingArea1.Height		self.framePerSec(10)		self.linecolor='(1,1,1,1)'		self.thickness='1'		self.bg_color='(0,0,0,1)'		self.div=4		self.vpp=5*self.div		self.timer1.Enable=True		self.buffer=[]			def activeXcreated(self,*args):		self.Layout1.Width=self.usercontrol.Width		self.Layout1.Height=self.usercontrol.Height		self.DrawingArea1Event.Width=self.usercontrol.Width		self.DrawingArea1Event.Height=self.usercontrol.Height		self.DrawingArea1.Width=self.usercontrol.Width		self.DrawingArea1.Height=self.usercontrol.Height		self.SetAmplitude(0)		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True	def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})		def SetAmplitude(self,amp=0):				self.ampbuf=amp		amp+=self.vpp/2		amp=Map(amp,0,self.vpp,0,100)		self.amplitude=self.DrawingArea1.Height-Map(amp,0,100,1,self.DrawingArea1.Height)			@property	def LineColor(self):		return self.linecolor	@LineColor.setter	def LineColor(self,value):		self.linecolor=value		pass	@property	def LineThickness(self):		return self.thickness	@LineThickness.setter	def LineThickness(self,value):		self.thickness=value		pass	@property	def BG_Color(self):		return self.bg_color	@BG_Color.setter	def BG_Color(self,value):		self.bg_color=value		l=eval(value)		#self.Layout1.BackColor=l		self.DrawingArea1.BackColor=l		pass	@property	def VPP(self):		return self.vpp/self.div	@VPP.setter	def VPP(self,value):		self.vpp=float(value)*self.div		pass	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Top': '21', 'Height': '30', 'Name': 'timer1', 'Width': '30', 'Text': 'timer1', 'BackColor': '(0, 0.016896482095423715, 0.8263087384440081, 0.5)', 'Tag': 'Activex', 'ForeColor': '(0,0,0,1)', 'Events': '[Tick]', 'Visible': 'True', 'Interval': '10', 'Picture': '', 'ParentsType': '', 'Font': '', 'Enable': 'True', 'Left': '281'}","Timer","usercontrol","[['Tick', 'self']]")		self.create("{'Top': '0', 'Height': '300', 'Name': 'Layout1', 'Width': '300', 'Text': 'Layout1', 'BackColor': '(0, 0.9795812107436608, 0.29350875745517935, 0.5)', 'Tag': '', 'ForeColor': '(0,0,0,1)', 'Events': '[[, ]]', 'Visible': 'True', 'Picture': '', 'ParentsType': '', 'Font': '', 'Enable': 'True', 'Left': '0'}","Layout","usercontrol","[]")		self.create("{'Top': '1', 'Height': '201', 'Name': 'DrawingArea1', 'Width': '257', 'Text': 'DrawingArea1', 'BackColor': '(0, 0.4147935673388351, 0.5810285864515893, 0.5)', 'Tag': '', 'ForeColor': '(0,0,0,1)', 'Events': '[draw]', 'Visible': 'True', 'Picture': '', 'ParentsType': 'Layout', 'Font': '', 'Enable': 'True', 'Left': '0'}","DrawingArea","Layout1","[['draw', 'self,wid, cr']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False):		self._window.set_modal(modal)		self._window.show()		Gtk.main()	def DrawLine(self,x1,y1,x2,y2,color=(1,1,1,1),strokeWidth=0):		self.line.append([x1,y1,x2,y2,color,strokeWidth])		self._DrawingArea1.queue_draw()	def DrawingArea1_draw(self, wid, cr):		a=0			cr.set_line_width(float(self.thickness))		l=eval(self.linecolor)		cr.set_source_rgb(float(l[0]),float(l[1]),float(l[2]))		for a in self.line:			cr.move_to(a[0],a[1])			cr.line_to(a[2],a[3]) 			cr.stroke()		pass	def Pause(self):		self.timer1.Enable=False	def Run(self):		self.timer1.Enable=True			def framePerSec(self,value):		self.scale=(1000/self.timer1.Interval)/(value*self.timer1.Interval)		return self.scale	def Save(self,filename,type='png'):		window = self.DrawingArea1.get_window()		pixbuf = Gdk.pixbuf_get_from_window(window, 0, 0,self.DrawingArea1.Width,self.DrawingArea1.Height)		pixbuf.savev(filename, type, [], [])	def timer1_Tick(self):		self.buffer.append(self.ampbuf)		self.x=int(self.x+self.scale)		self.DrawLine(self.px,self.py,self.x,self.amplitude,self.color,self.LineThickness)		self.px=self.x		self.py=self.amplitude		if self.x>=self.DrawingArea1.Width:			if self.caller!=None:				if 'framecomplete' in self.wiredevents:						self.wiredevents['framecomplete'](self.buffer)			self.x=0			self.px=0			self.line=[]			self.buffer=[]			self._DrawingArea1.queue_draw()			#drawBoarder		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()