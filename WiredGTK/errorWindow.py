import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wired_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=1366,h=768,title="WiredGTKV1.0 Traceback (most recent call last:) ",controlbox=True,startpos=(200,0),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''		#col=["Error IN"]		#row=[["sadfsdfsdfsdf\nasdsdfsdfffsdf"],["sadfsdfsdfsdf\nasdsdfsdfffsdf"]]		#self.datagridtreeview1.TreeViewFilterWindow(col,row)		#self.Fill()	def Fill(self,err=None):		if err!=None:			strs=err			strs=strs.split("\n")#windows "\r\n"		else:			strs=GetFileStr("error.txt")			strs=strs.split("\n\n")		row=[]		buf=''		for a in strs:			if a.find("File \"")!=-1 and buf!="":				if len(row)==0:					row.append(["Error ",buf])				else:						row.append([len(row),buf])				buf=a			else:					buf+="\r\n"+a		if len(row)>0:					row.append([len(row),buf])		else:			row.append(["Error ","Syntax Error"])			row.append([1,buf])				self.datagridtreeview1.TreeViewFilterWindow(row[0],row[1:])			@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Text': 'ctlCodeWindow', 'Visible': 'True', 'Name': 'ctlCodeWindow1', 'BackColor': '(0, 0.3288310933327816, 0.45440635289386133, 0.5)', 'ForeColor': '(0,0,0,1)', 'Left': '24', 'Font': '', 'Height': '432', 'Enable': 'True', 'Top': '27', 'ParentsType': '', 'Width': '1098', 'Events': '[]', 'Picture': '', 'Tag': 'Activex'}","ctlCodeWindow","usercontrol","[]")		self.create("{'Text': 'Close Error Window', 'Visible': 'True', 'Name': 'Button1', 'BackColor': '(1,1,1,1)', 'ForeColor': '(0,0,0,1)', 'Left': '1128', 'Font': '', 'Height': '50', 'Enable': 'True', 'Top': '28', 'ParentsType': '', 'Width': '137', 'Events': '[clicked]', 'Picture': '', 'Tag': ''}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Text': 'Label1', 'Visible': 'True', 'Name': 'Label1', 'BackColor': '(1,1,1,0)', 'ForeColor': '(0,0,0,1)', 'Left': '0', 'Font': '', 'Alignment': 'LEFT', 'Height': '25', 'Enable': 'True', 'Top': '1', 'ParentsType': '', 'Width': '1097', 'Events': '[]', 'Picture': '', 'Tag': ''}","Label","usercontrol","[]")		self.create("{'Text': 'datagridtreeview2', 'Visible': 'True', 'FontStyle': 'Times New Roman', 'Name': 'datagridtreeview1', 'FontSize': '10', 'BackColor': '(0, 0.46480079358122217, 0.25351075765224973, 0.5)', 'ForeColor': '(0,0,0,1)', 'Left': '1', 'Font': '', 'SELECT': '#FFAAAA', 'Height': '195', 'Enable': 'True', 'Top': '498', 'UNSELECT': '#FFFFFF', 'ParentsType': '', 'Width': '1121', 'Events': '[dblclick]', 'Picture': '', 'Tag': 'Activex', 'AlternateColor': 'True'}","datagridtreeview","usercontrol","[['dblclick', 'self,model,row,col']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def Button1_clicked(self,e):		self.unload()		pass	def datagridtreeview1_dblclick(self,model,row,col):		strs=model[row][col]		fname=getCSV(1,"\"",strs)		self.ctlCodeWindow1.Text=GetFileStr(fname)		refreshGTK()		index=strs.find("line ")		if index!=-1:			line=strs[index+len('line '):]						for i,a in enumerate(line):			if a.isdigit()==False:				break		if i==len(line)-1:				i+=1			line=line[0:i]			refreshGTK()		self.ctlCodeWindow1.ScrollToLine(int(line)-1)		refreshGTK()		self.ctlCodeWindow1.ScrollToLine(int(line)-1)		self.Label1.Text=fname		self.datagridtreeview1.selectthis(row,True)		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()