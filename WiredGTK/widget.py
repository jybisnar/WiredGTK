import gi
import time
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk,GObject,Gdk,GLib
from wired_module import *
class Handler(object):
	def __init__(self,button_press_isr,button_press_release_isr,motion_notify,label,realcontrol):
		builder = Gtk.Builder()
		builder.add_from_file("widget.glade")
		builder.connect_signals(self)
		self.win=[]
		self.timeout_id = GLib.timeout_add(10, self.loop, None)#10ms 
		self.sch=Scheduler(500)#500 ms
		self.sch.Start()
		self.form_load=False
		self.window1 = builder.get_object("window1")
		self.window1W = forms(self.window1)
		self.win.append(self.window1)
		self.layout1 = builder.get_object("layout1")
		self.layout1W = forms(self.layout1)
		self.usercontrol = builder.get_object("usercontrol")
		self.usercontrolW = forms(self.usercontrol)
		self.layout2 = builder.get_object("layout2")
		self.layout2W = forms(self.layout2)
		self.eventbox1 = builder.get_object("eventbox1")
		self.eventbox1W = forms(self.eventbox1)
		self.label1 = builder.get_object("label1")
		self.label1W = forms(self.label1)
		self.layout3 = builder.get_object("layout3")
		self.layout3W = forms(self.layout3)
		self.button_pressed=button_press_isr
		self.motion_notify=motion_notify
		self.button_press_release=button_press_release_isr
		self.pressed=False		
		
		#self.lblObject = builder.get_object("lblObject")
		#self.lblObjectW = forms(self.lblObject)
		
		self.arrow1 = builder.get_object("arrow1")
		self.arrow1W = forms(self.arrow1)
		self.arrow2 = builder.get_object("arrow2")
		self.arrow2W = forms(self.arrow2)
		
		self.arrow3 = builder.get_object("arrow3")
		self.arrow3W = forms(self.arrow3)
		self.arrow4 = builder.get_object("arrow4")
		self.arrow4W = forms(self.arrow4)		
		
		#self.lblObjectW.Color=1,1,1,1
		import random
		x=random.random()
		y=random.random()
		self.arrow1.override_color(Gtk.StateFlags.NORMAL, Gdk.RGBA(0,0,255,255))
		self.arrow2.override_color(Gtk.StateFlags.NORMAL, Gdk.RGBA(0,0,255,255))	
		self.arrow3.override_color(Gtk.StateFlags.NORMAL, Gdk.RGBA(0,0,255,255))
		self.arrow4.override_color(Gtk.StateFlags.NORMAL, Gdk.RGBA(0,0,255,255))			
		if label=="Layout"or label=="DrawingArea"or label=="EventBox"or label=="ScrolledWindow":
			self.usercontrolW.BackColor=0,x,y,1
		self.selected=False
		self.label=label
		self.realcontrol=realcontrol
		self.realcontrolW=forms(realcontrol)
	@property	
	def Selected(self):
		return self.selected
	@Selected.setter
	def Selected(self,value):
		self.selected=value
		if value==False:
			self.arrow1W.Visible=False
			self.arrow2W.Visible=False
			self.arrow3W.Visible=False
			self.arrow4W.Visible=False			
		else:
			self.arrow1W.Visible=True
			self.arrow2W.Visible=True
			self.arrow3W.Visible=True
			self.arrow4W.Visible=True			
		pass
	def Location(self):
		lW=forms(self.usercontrol)
		return lW.Location()
	@property
	def Dimension(self):
		lW=forms(self.usercontrol)
		return lW.Dimension
	def eventbox1_key_release_event_cb(self,*args):
		pass
	
	def eventbox1_key_press_event_cb(self,*args):
		pass
	def isAllWinClose(self):
		for a in self.win:
			if a.get_visible()==True:
				return False
		return True
	def loop(self, user_data):
		if self.form_load==False:
			self.form_load=True
			self.parse=Parser("WTA","\r",1)
		#        Serial.begin(9600)#enable serial comm
		if self.sch.Event():#timer routine
			#code here
			self.sch.Start()
		#while Serial.available():#enable serial comm
		#        c=Serialx.read()
		#        if self.parse.DataReceived(c):
		#                print int(getCSV(0,",", self.parse.data))                        

		return True	#return true so that main_loop can call it again                        

	def window1_show(self):
		self.window1.show_all()
	def Widget(self):
		if self.usercontrol in self.layout1.get_children():
			self.layout1.remove(self.usercontrol)
		return self.usercontrol

	def WidgetSetSize(self,w,h):
		self.usercontrol.set_size_request(w,h)
		self.arrow1W.Move((w-10,h/2-10))
		self.arrow2W.Move((w/2-10,h-10))
		self.arrow3W.Move((w/2-10,-3))
		self.arrow4W.Move((-3,h/2-10))
		self.eventbox1.set_size_request(w,h)
		self.layout2.set_size_request(w,h)
		#self.lblObjectW.Move((w/3,h/3))
		#self.lblObjectW.Text=self.label
		self.realcontrolW.Dimension=w,h
	def WidgetSize(self):
		return {'width':self.usercontrol.get_size_request()[0],'height':self.usercontrol.get_size_request()[1]}

	def Hide(self):
		self.usercontrol.hide()

	def Show(self):
		self.usercontrol.show()

	#example: Add Two usercontrol to your form
	#at the very end of your class Handler: constructor(def __init__(self))
	#x=myWidget.Handler()#first instance of your usercontrol
	#y=myWidget.Handler()#second instance of your usercontrol
	#self.layout1.put(x.Widget(),0,0)#add first usercontrol to your main form
	#self.layout1.put(y.Widget(),0+x.WidgetSize()['width']+5,0)#add second usercontrol to your main form
	#self.myusercontrol1=x#add reference so we can access this control within this class
	#self.myusercontrol2=y#add reference so we can access this control within this class
	def eventbox1_motion_notify_event_cb(self,*args):
		if self.pressed==True:
			if self.motion_notify!=None:
				self.motion_notify(args[0],args[1])
		pass
	def eventbox1_button_press_event_cb(self,*args):
		self.pressed=True
		if self.button_pressed!=None:
			self.button_pressed(args[0],args[1],self.usercontrol)
		pass

	def eventbox1_button_release_event_cb(self,*args):
		self.pressed=False
		if self.button_press_release!=None:
			self.button_press_release(None)
		pass
#	Generated By Glade To Python: by Rocky Nuarin, Aug 2017 Phils
#	#####################www.WireThemAll.com#####################
if __name__ == "__main__":
	_widget = Handler(None,None,None,"",None)
	_widget.window1.show()
	Gtk.main()
