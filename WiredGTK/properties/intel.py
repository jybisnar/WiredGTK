import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdkfrom wta_module import *import DataGridimport DBUtilsfrom copy import deepcopy#	Generated By Glade To Python: by Rocky Nuarin, Aug 2017 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	#WiredEvent def usercontrolEvent1(self,e)	#add more events 	#WiredEvent def usercontrolEvent2(self,e)	#add more events 	def __init__(self,*param):		self.caller=None		self.param=None		self.wiredevents={}		if len(param)!=0:			self.caller=param[0]			if len(param)>1:				self.param=param[1]				#import MySQLdb		#self.db = MySQLdb.connect(host="localhost",user="root",db="wta",port=3306)				dir_path = os.path.dirname(os.path.realpath(__file__))		os.chdir(dir_path)				self._window1 = Gtk.Window();self._window1.connect("destroy", self.unload);self.window1=forms(self._window1)		self._mainlayout=Gtk.Layout();self.layout=forms(self._mainlayout);self._mainlayout.show();self.layout.Dimension=1366,768;self._window1.add(self._mainlayout);		self._usercontrol=Gtk.Layout();self.usercontrol=forms(self._usercontrol);self._usercontrol.show();self.usercontrol.Dimension=1366,768;self._mainlayout.put(self._usercontrol,0,0);			self.timeout_id = GObject.timeout_add(10, self.loop, None)#10ms 		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self.form_load=False		self.window1.Text="GTKWired"		self.GTKForms()		self.top=0		self.lst=[]		self.Image1EventW.Left=0		self.Image1EventW.Top=0		self.Image1EventW.Top=0		self.lastindex=0		self.ShowIntellisense(["Donna","Michelle","Abcd","Mich"],"Dog")		#place this crap somewhere		#if self.caller!=None:			#if 'usercontrolEvent' in self.wiredevents:					#self.wiredevents['usercontrolEvent1']("usrData1")			#if 'usercontrolEvent' in self.wiredevents:					#self.wiredevents['usercontrolEvent2']("usrData2")	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):				self.create("{'Picture': '', 'Enable': 'True', 'Name': 'Layout1', 'Visible': 'True', 'Text': 'Layout1', 'Top': '1', 'Height': '115', 'ParentsType': '', 'Width': '121', 'ForeColor': '(0, 0, 0, 1)', 'Tag': '', 'BackColor': '(1, 1, 1, 1)', 'Events': '', 'Left': '0'}","Layout","usercontrol","[['button-press-event', 'self,event,e']]")		self.create("{'Picture': '', 'Enable': 'True', 'Name': 'Layout2', 'Visible': 'True', 'Text': 'Layout2', 'Top': '0', 'Height': '106', 'ParentsType': 'Layout', 'Width': '115', 'ForeColor': '(0, 0, 0, 1)', 'Tag': '', 'BackColor': '(1, 1, 1, 1)', 'Events': '', 'Left': '1'}","Layout","Layout1","[['button-press-event', 'self,event,e'], ['clicked', 'self,e']]")		self.create("{'Picture': '', 'Enable': 'True', 'Name': 'VScrollbar1', 'Visible': 'True', 'Text': 'VScrollbar1', 'Top': '1', 'Height': '115', 'ParentsType': '', 'Width': '30', 'ForeColor': '(0, 0, 0, 1)', 'Tag': '', 'BackColor': '(1, 1, 1, 1)', 'Events': '', 'Left': '112'}","VScrollbar","usercontrol","[['change-value', 'self,e']]")	def ShowIntellisense(self,lsts,targetWord=None):		lst=deepcopy(lsts)		lst.sort()		for a in self.lst:			parent=a[0].get_parent()			parent.remove(a[0])			del a			self.lst=[]		self.top=0		self.Layout2W.Top=0		for a,text in enumerate(lst):			lbl=Gtk.Label()			forms(lbl).Text=text			forms(lbl).Visible=True			self.Layout2.put(lbl,0,a*20)					self.lst.append((lbl,text))					if targetWord!=None:			self.ScrollTo(targetWord)		lens=len(self.lst)		adj=self.VScrollbar1.get_adjustment()		adj.set_upper(lens)			adj.set_value(self.top)		self.Layout2W.Height=20*len(lst)		self.Image1EventW.Top=self.Layout2W.Top		self.Image1EventW.Width=self.Layout2W.Width		self.Image1EventW.Height=self.Layout2W.Height		forms(self.lst[abs(self.top)][0]).ForeColor=1,1,0,1		self.lastindex=abs(self.top)			def loop(self, user_data):		if self.form_load==False:			self.form_load=True			self.parse=Parser("WTA","\r",1)		#        Serial.begin(9600)#enable serial comm		if self.sch.Event():#timer routine			#code here			self.sch.Start()		#while Serial.available():#enable serial comm		#        c=Serialx.read()		#        if self.parse.DataReceived(c):		#                print int(getCSV(0,",", self.parse.data))                        		return True	#return true so that main_loop can call it again                        	def clickISR(self,items):		#self.btdelete_items.show()#delete		#self.btnupdate_items.show()#update				#self.dbUtils.TableValToUserInput("Items",items)		print(items)	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def WidgetSetSize(self,width,height):		self.usercontrol.set_size_request(width,height)	def WidgetSize(self):		return {'width':self.usercontrol.get_size_request()[0],'height':self.usercontrol.get_size_request()[1]}	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window1.hide()	def Show(self,modal=False):		self._window1.set_modal(modal)		self._window1.show()		Gtk.main()	#example: Add Two usercontrol to your form	#at the very end of your class Handler: constructor(def __init__(self))	#x=myWidget.Handler()#first instance of your usercontrol	#y=myWidget.Handler()#second instance of your usercontrol	#self.mainlayout.put(x.Widget(),0,0)#add first usercontrol to your main form	#self.mainlayout.put(y.Widget(),0+x.WidgetSize()['width']+5,0)#add second usercontrol to your main form	#self.myusercontrol1=x#add reference so we can access this control within this class	#self.myusercontrol2=y#add reference so we can access this control within this class	def ScrollTo(self,targetWord):		found=False		for i,a in enumerate(self.lst):			if targetWord[0].lower()==a[1][0].lower():				found=True				break		if found==True:				self.top=i*-1			self.Layout2W.Top=self.top*20	def ScrollDown(self):		self.top-=1		if abs(self.top)>=len(self.lst):			self.top=(len(self.lst)-1)*-1		self.Layout2W.Top=self.top*20		self.ColorSelected(abs(self.top))	def ScrollUp(self):		self.top+=1		if self.top>0:self.top=0		self.Layout2W.Top=self.top*20		self.ColorSelected(abs(self.top))					def Layout1_button_press_event(self,event,e):				pass	def Layout2_button_press_event(self,event,e):		pass	def Button1_button_press_event(self,event,e):		self.ScrollUp()		self.window1W.Text=self.Text		pass	def Button2_button_press_event(self,event,e):		self.ScrollDown()		self.window1W.Text=self.Text		pass	@property	def Text(self):		if abs(self.top)<len(self.lst):			return self.lst[abs(self.top)][1]		return ""	def Button3_button_press_event(self,event,e):		self.ScrollTo('mas')		pass	def VScrollbar1_change_value(self,*args):		val=self.VScrollbar1W.Text		self.top=float(val)*-1		self.Layout2W.Top=self.top*20		self.Image1EventW.Top=self.Layout2W.Top	def Image1_button_press_event(self,event,e):		self.ColorSelected(e)	def ColorSelected(self,e=None):		if type(e)!=int:			x,y=e.get_coords()			index=int(y/20)			if Gdk.EventType._2BUTTON_PRESS==e.type:				sel= self.lst[index][1]						#place this crap somewhere				#if self.caller!=None:					#if 'usercontrolEvent' in self.wiredevents:							#self.wiredevents['usercontrolEvent1']("usrData1")					else:				index=e				if type(e)==int or Gdk.EventType.BUTTON_PRESS==e.type:			forms(self.lst[index][0]).ForeColor=1,1,0,1			if index!=self.lastindex:				forms(self.lst[self.lastindex][0]).ForeColor=0,0,0,1			self.lastindex=index		pass		def Layout2_clicked(self,e):		passif __name__ == "__main__":	_m = Handler()	_m.window1.show()	Gtk.main()