import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################class Handler(object):	def __init__(self,*param):					initUI(self,param,w=800,h=500,title="WiredGTKV1.0 OpenCV")		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			Gtk.main_quit()				else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'Visible': 'True', 'Height': '145', 'Name': 'Image1', 'Width': '190', 'Text': 'Image1', 'Top': '52', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[[, ]]', 'Picture': '', 'Font': '', 'Left': '5', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Image","usercontrol","[]")		self.create("{'Visible': 'True', 'Height': '50', 'Name': 'Button1', 'Width': '168', 'Text': 'Load \\image\\j.png', 'Top': '204', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[clicked]', 'Picture': '', 'Font': '', 'Left': '17', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Visible': 'True', 'Height': '145', 'Name': 'Image2', 'Width': '190', 'Text': 'Image2', 'Top': '51', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[[, ]]', 'Picture': '', 'Font': '', 'Left': '207', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Image","usercontrol","[]")		self.create("{'Visible': 'True', 'Height': '50', 'Name': 'Button2', 'Width': '83', 'Text': 'cv2.erode', 'Top': '203', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[clicked]', 'Picture': '', 'Font': '', 'Left': '206', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Visible': 'True', 'Height': '50', 'Name': 'Button3', 'Width': '83', 'Text': 'cv2.dilate', 'Top': '203', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[clicked]', 'Picture': '', 'Font': '', 'Left': '295', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Visible': 'True', 'Height': '145', 'Name': 'Image3', 'Width': '190', 'Text': 'Image3', 'Top': '51', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[[, ]]', 'Picture': '', 'Font': '', 'Left': '434', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Image","usercontrol","[]")		self.create("{'Visible': 'True', 'Height': '50', 'Name': 'Button4', 'Width': '168', 'Text': 'Load \\image\\opening.png', 'Top': '203', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[clicked]', 'Picture': '', 'Font': '', 'Left': '446', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Visible': 'True', 'Height': '145', 'Name': 'Image4', 'Width': '190', 'Text': 'Image4', 'Top': '50', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[[, ]]', 'Picture': '', 'Font': '', 'Left': '636', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Image","usercontrol","[]")		self.create("{'Visible': 'True', 'Height': '50', 'Name': 'Button5', 'Width': '136', 'Text': 'cv2.morphologyEx', 'Top': '201', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[clicked]', 'Picture': '', 'Font': '', 'Left': '637', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Visible': 'True', 'Height': '145', 'Name': 'Image5', 'Width': '190', 'Text': 'Image5', 'Top': '270', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[[, ]]', 'Picture': '', 'Font': '', 'Left': '3', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Image","usercontrol","[]")		self.create("{'Visible': 'True', 'Height': '50', 'Name': 'Button6', 'Width': '168', 'Text': 'Load \\image\\closing.png', 'Top': '422', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[clicked]', 'Picture': '', 'Font': '', 'Left': '15', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'Visible': 'True', 'Height': '145', 'Name': 'Image6', 'Width': '190', 'Text': 'Image6', 'Top': '269', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[[, ]]', 'Picture': '', 'Font': '', 'Left': '205', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Image","usercontrol","[]")		self.create("{'Visible': 'True', 'Height': '50', 'Name': 'Button7', 'Width': '136', 'Text': 'cv2.morphologyEx', 'Top': '420', 'ForeColor': '(0,0,0,1)', 'ParentsType': '', 'Enable': 'True', 'Events': '[[, ]]', 'Picture': '', 'Font': '', 'Left': '206', 'Tag': '', 'BackColor': '(1,1,1,1)'}","Button","usercontrol","[['clicked', 'self,e']]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False):		self._window.set_modal(modal)		self._window.show()		Gtk.main()	def Button1_clicked(self,e):		self.Image1.LoadPicture='image/j.png'		pass	def Button2_clicked(self,e):		import numpy as np		img = cv2.imread('image/j.png',0)		kernel = np.ones((5,5),np.uint8)		erosion = cv2.erode(img,kernel,iterations = 1)		self.Image2.LoadPictureOCV=erosion		pass	def Button3_clicked(self,e):		import numpy as np		img = cv2.imread('image/j.png',0)		kernel = np.ones((5,5),np.uint8)		dilation = cv2.dilate(img,kernel,iterations = 1)		self.Image2.LoadPictureOCV=dilation		pass	def Button4_clicked(self,e):		self.Image3.LoadPicture='image/opening.png'	pass	def Button5_clicked(self,e):		import numpy as np		img = cv2.imread('image/opening.png',0)		kernel = np.ones((5,5),np.uint8)		opening = cv2.morphologyEx(img, cv2.MORPH_OPEN, kernel)		self.Image4.LoadPictureOCV=opening		pass	def Button6_clicked(self,e):		self.Image5.LoadPicture='image/closing.png'		pass	def Button7_clicked(self,e):		import numpy as np		img = cv2.imread('image/closing.png',0)		kernel = np.ones((5,5),np.uint8)		closing = cv2.morphologyEx(img, cv2.MORPH_CLOSE, kernel)		self.Image6.LoadPictureOCV=closing		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()