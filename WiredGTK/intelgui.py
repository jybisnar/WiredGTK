import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wired_module import *import DataGridimport DBUtilsfrom copy import deepcopy#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''		self.top=0		self.lst=[]		self.Image1Event.Left=0		self.Image1Event.Top=0		self.Image1Event.Top=0		self.lastindex=0		self.ShowIntellisense(["Donna","Michelle","Abcd","Mich"],"Dog")		self.HighlightLst=[]	@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True		def Highlight(self,lst,color=(1,0,0,1)):		self.HighlightLst=lst		index=[]		for i,a in enumerate(self.lst):			for b in lst:				if a[1]==b:					index.append(i)									for a in index:			forms(self.lst[a][0]).ForeColor=color			def ShowIntellisense(self,lsts,targetWord=None,Highlight=None):		lst=deepcopy(lsts)		lst.sort()		for a in self.lst:			parent=a[0].get_parent()			parent.remove(a[0])			del a			self.lst=[]		self.top=0		self.Layout2.Top=0				bklbl=Gtk.Label()		forms(bklbl).Text=""		forms(bklbl).Visible=True		forms(bklbl).BackColor=(0.92,0.94,0.84,1)		self.Layout2.put(bklbl,0,0)			for a,text in enumerate(lst):			lbl=Gtk.Label()			forms(lbl).Text=text			forms(lbl).Visible=True			self.Layout2.put(lbl,0,a*20)					self.lst.append((lbl,text))					if targetWord!=None:			self.ScrollTo(targetWord)		lens=len(self.lst)		adj=self.VScrollbar1.get_adjustment()		adj.set_upper(lens)			adj.set_value(self.top)		self.Layout2.Height=20*len(lst)		self.Image1Event.Top=self.Layout2.Top		self.Image1Event.Width=self.Layout2.Width		self.Image1Event.Height=self.Layout2.Height		forms(self.lst[abs(self.top)][0]).ForeColor=0,0,1,1		self.lastindex=abs(self.top)				forms(bklbl).Width=self.Layout2.Width		forms(bklbl).Height=self.Layout2.Height		if Highlight!=None:			self.Highlight(Highlight)	def clickISR(self,items):		#self.btdelete_items.show()#delete		#self.btnupdate_items.show()#update				#self.dbUtils.TableValToUserInput("Items",items)		print(items)		def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Left': '0', 'Text': 'Layout1', 'Picture': '', 'ForeColor': '(0, 0, 0, 1)', 'Visible': 'True', 'Events': '[[, ]]', 'Enable': 'True', 'Font': '', 'Tag': '', 'Width': '241', 'ParentsType': '', 'Height': '115', 'Var': '', 'Top': '1', 'Help': '', 'Name': 'Layout1', 'BackColor': '(1, 1, 1, 1)'}","Layout","usercontrol","[]")		self.create("{'Left': '232', 'Text': 'VScrollbar1', 'Picture': '', 'ForeColor': '(0, 0, 0, 1)', 'Visible': 'True', 'Events': '[change-value]', 'Enable': 'True', 'Font': '', 'Tag': '', 'Width': '30', 'ParentsType': '', 'Height': '115', 'Var': '', 'Top': '1', 'Help': '', 'Name': 'VScrollbar1', 'BackColor': '(1, 1, 1, 1)'}","VScrollbar","usercontrol","[['change-value', 'self,e']]")		self.create("{'Left': '353', 'Text': 'Image1', 'Picture': '', 'ForeColor': '(0, 0, 0, 1)', 'Visible': 'False', 'Events': '[button-press-event]', 'Enable': 'True', 'Font': '', 'Tag': '', 'Width': '66', 'ParentsType': '', 'Height': '23', 'Var': '', 'Top': '47', 'Help': '', 'Name': 'Image1', 'BackColor': '(1, 1, 1, 1)'}","Image","usercontrol","[['button-press-event', 'self,event,e']]")		self.create("{'Left': '1', 'Text': 'Layout2', 'Picture': '', 'ForeColor': '(0, 0, 0, 1)', 'Visible': 'True', 'Events': '[[, ]]', 'Enable': 'True', 'Font': '', 'Tag': '', 'Width': '235', 'ParentsType': 'Layout', 'Height': '106', 'Var': '', 'Top': '0', 'Help': '', 'Name': 'Layout2', 'BackColor': '(1, 1, 1, 1)'}","Layout","Layout1","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		if modal and self.caller!=None:			self._window.set_transient_for(self.caller._window)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def ScrollTo(self,targetWord):		found=False		for i,a in enumerate(self.lst):			if targetWord[0].lower()==a[1][0].lower():				found=True				break		if found==True:				self.top=i*-1			self.Layout2.Top=self.top*20	def ScrollDown(self):		self.top-=1		if abs(self.top)>=len(self.lst):			self.top=(len(self.lst)-1)*-1		self.Layout2.Top=self.top*20		self.ColorSelected(abs(self.top))	def ScrollUp(self):		self.top+=1		if self.top>0:self.top=0		self.Layout2.Top=self.top*20		self.ColorSelected(abs(self.top))					def Layout1_button_press_event(self,event,e):				pass	def Layout2_button_press_event(self,event,e):		pass	def Button1_button_press_event(self,event,e):		self.ScrollUp()		self.window1W.Text=self.Text		pass	def Button2_button_press_event(self,event,e):		self.ScrollDown()		self.window1W.Text=self.Text		pass	@property	def Text(self):		if abs(self.top)<len(self.lst):			return self.lst[abs(self.top)][1]		return ""	def Button3_button_press_event(self,event,e):		self.ScrollTo('mas')		pass	def VScrollbar1_change_value(self,*args):		val=self.VScrollbar1.Text		self.top=float(val)*-1		self.Layout2.Top=self.top*20		self.Image1Event.Top=self.Layout2.Top	def Image1_button_press_event(self,event,e):		self.ColorSelected(e)	def ColorSelected(self,e=None):		if type(e)!=int:			x,y=e.get_coords()			index=int(y/20)			if Gdk.EventType._2BUTTON_PRESS==e.type:				sel= self.lst[index][1]				for a in range(2):					forms(self.lst[self.lastindex][0]).ForeColor=0,1,0,1					refreshGTK()					delay(50)				if self.caller!=None:					self.caller.selected(sel)										else:				index=e				if type(e)==int or Gdk.EventType.BUTTON_PRESS==e.type:			forms(self.lst[index][0]).ForeColor=0,0,1,1			if index!=self.lastindex:				forms(self.lst[self.lastindex][0]).ForeColor=0,0,0,1				self.Highlight(self.HighlightLst)			self.lastindex=index		pass	if __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()