import giimport timegi.require_version('Gtk', '3.0')from gi.repository import Gtk,GObject,Gdk,Pango,GLibfrom wta_module import *#	Generated By WiredGTK for Python: by Rocky Nuarin, 2018 Phils#	#####################www.WireThemAll.com#####################from imutils.object_detection import non_max_suppressionimport numpy as npimport cv2class Handler(object):	def __init__(self,*param):					initUI(self,param,w=800,h=600,title="WiredGTKV1.0",controlbox=True,startpos=(200,200),timeoutdestroy=-1)		self.GTKForms()		self.sch=Scheduler(500)#500 ms		self.sch.Start()				self.Image1.LoadPicture=self.Entry1.Text	def unload(self,*args):		destroy=True		if destroy==True:			GLib.source_remove(self.timeout_id)			self._window.hide()			del self._window			return False		else:			self.window.Visible=False			return True			def loop(self, user_data):		if self.form_load==False:			self.form_load=True		if self.sch.Event():#timer routine			#code here			if self.timeoutdestroy!=-1:				self.timeoutdestroy-=1				if self.timeoutdestroy==0:					self.unload(None)			self.sch.Start()#restart scheduler		return True	#return true so that main_loop can call it again 	def connect(self,ev,evusr):		self.wiredevents.update({ev:evusr})		def create(self,prop,control,parent,event=[]):		createWidget(self,prop,control,parent,event)	def GTKForms(self):		self.create("{'BackColor': '(1,1,1,1)', 'Width': '293', 'Tag': '', 'ParentsType': '', 'ForeColor': '(0,0,0,1)', 'Name': 'Image1', 'Left': '3', 'Enable': 'True', 'Top': '1', 'Text': 'Image1', 'Font': '', 'Events': '[[, ]]', 'Height': '281', 'Visible': 'True', 'Picture': ''}","Image","usercontrol","[]")		self.create("{'BackColor': '(1,1,1,1)', 'Width': '100', 'Tag': '', 'ParentsType': '', 'ForeColor': '(0,0,0,1)', 'Name': 'Button1', 'Left': '9', 'Enable': 'True', 'Top': '501', 'Text': 'Detect', 'Font': '', 'Events': '[clicked]', 'Height': '50', 'Visible': 'True', 'Picture': ''}","Button","usercontrol","[['clicked', 'self,e']]")		self.create("{'BackColor': '(1,1,1,1)', 'Width': '170', 'Tag': '', 'ParentsType': '', 'ForeColor': '(0,0,0,1)', 'Name': 'Entry1', 'Left': '9', 'Enable': 'True', 'Top': '468', 'Text': 'image.jpg', 'Font': '', 'Events': '[[, ]]', 'Height': '30', 'Visible': 'True', 'Picture': ''}","Entry","usercontrol","[]")		self.create("{'BackColor': '(1,1,1,1)', 'Width': '293', 'Tag': '', 'ParentsType': '', 'ForeColor': '(0,0,0,1)', 'Name': 'Image2', 'Left': '657', 'Enable': 'True', 'Top': '0', 'Text': 'Image2', 'Font': '', 'Events': '[[, ]]', 'Height': '281', 'Visible': 'True', 'Picture': ''}","Image","usercontrol","[]")		self.create("{'BackColor': '(1,1,1,1)', 'Width': '170', 'Tag': '', 'ParentsType': '', 'ForeColor': '(0,0,0,1)', 'Name': 'Entry2', 'Left': '200', 'Enable': 'True', 'Top': '467', 'Text': 'Entry2', 'Font': '', 'Events': '[]', 'Height': '30', 'Visible': 'True', 'Picture': ''}","Entry","usercontrol","[]")	def Widget(self):		if self._usercontrol in self._mainlayout.get_children():			self._mainlayout.remove(self._usercontrol)		return self._usercontrol	def Hide(self):		self._window.hide()	def Show(self,modal=False):		self._window.set_modal(modal)		self._window.show()		Gtk.main()	def Button1_clicked(self,e):		hog = cv2.HOGDescriptor()		hog.setSVMDetector(cv2.HOGDescriptor_getDefaultPeopleDetector())		image = cv2.imread(self.Entry1.Text)		orig = image.copy()		#	detect people in the image		(rects, weights) = hog.detectMultiScale(image, winStride=(4, 4),padding=(8, 8), scale=1.05)		#	draw the original bounding boxes		for (x, y, w, h) in rects:			cv2.rectangle(orig, (x, y), (x + w, y + h), (0, 0, 255), 2)		#	apply non-maxima suppression to the bounding boxes using a		#	fairly large overlap threshold to try to maintain overlapping		#	boxes that are still people		rects = np.array([[x, y, x + w, y + h] for (x, y, w, h) in rects])		pick = non_max_suppression(rects, probs=None, overlapThresh=0.65)		#	draw the final bounding boxes		for (xA, yA, xB, yB) in pick:			cv2.rectangle(image, (xA, yA), (xB, yB), (0, 255, 0), 2)			#	show some information on the number of bounding boxes		#filename = imagePath[imagePath.rfind("/") + 1:]		self.Image1.LoadPictureOCV=orig		self.Image2.LoadPictureOCV=image		self.Entry2.Text='People : ' + str(len(pick))		passif __name__ == "__main__":	_m = Handler()	_m._window.show()	Gtk.main()