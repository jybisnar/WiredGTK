import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(usercontrol):	#WiredEvent def usercontrolevent(self,value)	#add more events 	#WiredProperty 'usercontrolproperty': 'sample only'		def __init__(self,*param):					initUI(self,param,w=400,h=400,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		super().__init__(self.usercontrol)		self.sch=Scheduler(500)#500 ms		self.sch.Start()		self._text=''		self._usercontrolproperty=''	@property		def usercontrolproperty(self):		return self._usercontrolproperty	@usercontrolproperty.setter		def usercontrolproperty(self,value):		self._usercontrolproperty=value	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})	def activeXcreated(self,*args):		pass	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			#ExitApplication() #activate this if u want to destroy this window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		import WebCam		self.WebCam1=WebCam.Handler		self.create("{'camindex': '0', 'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'Var': '', 'Height': '260', 'ParentsType': '', 'Font': '', 'Events': '[frameReady]', 'BackColor': '(0, 0.4220090620706002, 0.6295039725989799, 0.5)', 'Name': 'WebCam1', 'Open': '', 'Width': '390', 'Enable': 'True', 'Left': '35', 'Text': 'WebCam1', 'Help': '', 'Top': '10', 'Tag': 'Activex', 'Picture': 'WebCam.png'}","WebCam","usercontrol","[['frameReady', 'self,frame']]")		self.Button1=forms		self.create("{'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'Var': '', 'Height': '50', 'ParentsType': '', 'Font': '', 'Events': '[clicked]', 'BackColor': '(1,1,1,1)', 'Name': 'Button1', 'Width': '100', 'Enable': 'True', 'Left': '35', 'Text': 'Start', 'Help': '', 'Top': '275', 'Tag': '', 'Picture': ''}","Button","usercontrol","[['clicked', 'self,e']]")		self.Button2=forms		self.create("{'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'Var': '', 'Height': '50', 'ParentsType': '', 'Font': '', 'Events': '[clicked]', 'BackColor': '(1,1,1,1)', 'Name': 'Button2', 'Width': '100', 'Enable': 'True', 'Left': '140', 'Text': 'Pause', 'Help': '', 'Top': '275', 'Tag': '', 'Picture': ''}","Button","usercontrol","[['clicked', 'self,e']]")		self.Button3=forms		self.create("{'ForeColor': '(0,0,0,1)', 'Visible': 'True', 'Var': '', 'Height': '50', 'ParentsType': '', 'Font': '', 'Events': '[clicked]', 'BackColor': '(1,1,1,1)', 'Name': 'Button3', 'Width': '180', 'Enable': 'True', 'Left': '245', 'Text': 'Save To image folder', 'Help': '', 'Top': '275', 'Tag': '', 'Picture': ''}","Button","usercontrol","[['clicked', 'self,e']]")		import TensorFlow		self.TensorFlow1=TensorFlow.Handler		self.create("{'ForeColor': '(0,0,0,1)', 'ModelFolder': 'mymodel', 'Visible': 'True', 'Var': '', 'Height': '30', 'ParentsType': '', 'Font': '', 'Events': '[]', 'Frozen_Inference': 'saved_model.pb', 'BackColor': '(0, 0.8406672529930819, 0.8940976234918055, 0.5)', 'Name': 'TensorFlow1', 'LabelMap': 'label_map.pbtxt', 'Width': '30', 'usercontrolproperty': 'sample only', 'Enable': 'True', 'Left': '475', 'Text': 'TensorFlow1', 'Help': '', 'Top': '120', 'Tag': 'Activex', 'Picture': 'TensorFlow.png'}","TensorFlow","usercontrol","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False,x=None,y=None):		if x!=None:			self._window.move(x,y)		if modal and self.caller!=None:			self._window.set_transient_for(self.caller._window)		self._window.set_modal(modal)		self._window.show()		Gtk.main()		return ""#put ur return value here upon closing this form	def WebCam1_frameReady(self,frame):		if self.WebCam1.Open==False:return		output_dict=None		img,output_dict=self.TensorFlow1.Detect(frame)		if output_dict !=None:			print(len(output_dict))			print(output_dict.keys())			for a in range(5):							classesindex=output_dict['detection_classes'][a]				#print first five detection				#score,class name				print(output_dict['detection_scores'][a],self.TensorFlow1.category_index[classesindex]['name'])					self.WebCam1.imshow(img)		#self.WebCam1.imshow(frame)		self.frame=frame		pass	def Button1_clicked(self,e):		self.WebCam1.Open=True		pass	def Button2_clicked(self,e):		self.WebCam1.Open=False		pass	def Button3_clicked(self,e):		import cv2		fname=app_path() + "/images/" + CreateFileName() + ".jpg"# save as datetime.jpg		cv2.imwrite(fname,self.frame)		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()