import timeimport pyaudioimport waveimport sysimport _threadclass MyAudio:	def __init__(self,fname):		self.CHUNK = 1024					self.wf = wave.open(fname, 'rb')		self.p = pyaudio.PyAudio()		self.stream = self.p.open(format=self.p.get_format_from_width(self.wf.getsampwidth()),			channels=self.wf.getnchannels(),			rate=self.wf.getframerate(),			output=True)	def Play(self):		self.wf.rewind()            		data = self.wf.readframes(self.CHUNK)		while data != '':			self.stream.write(data)			data = self.wf.readframes(self.CHUNK)	def close(self):        		self.stream.stop_stream()		self.stream.close()		self.p.terminate()   class PlayerThread:        	def __init__(self):		self.myaudio=[]	def addfiles(self,_file):    		self.myaudio.append(MyAudio(_file))	def PlayAudio(self,myaudio):		myaudio.Play()        	def play(self,index):		_thread.start_new_thread(self.PlayAudio,(self.myaudio[index],))  	def close(self):		for a in self.myaudio:			a.close()