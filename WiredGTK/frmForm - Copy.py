import jedi
import gi
import time
gi.require_version('Gtk', '3.0')
gi.require_version('GtkSource', '3.0')
from gi.repository import Gtk,GObject,Gdk,GdkPixbuf,Pango,GLib,GtkSource
from wired_module import *
import widget
from shutil import copyfile
from copy import deepcopy
import intel
from dialog import *
import random
import shutil, errno
import tokenize
import subprocess
import myinspect
from _thread import *
import ast
def getdefOrclass(ast_data):
	ret=[]
	for i,body in enumerate(ast_data.body):
		if body.__class__ == ast.ClassDef:
			#func=getFunctionCall(body, mod_path)
			cname=x=eval('body.'+ ast.ClassDef.__dict__['_fields'][0])
			ret.append([body,cname])
		if body.__class__ == ast.FunctionDef:
			try:
				x=eval('body.'+ ast.FunctionDef.__dict__['_fields'][0])
				args=''
				for a in range(len(body.args.args)):
					args+=body.args.args[a].arg+','
				if args!='':    
					args=args[:-1]    
				x=x+"("+args+")"    
				ret.append([body,x])
			except:

				#print("AST error parsing line %r for %r" % ('12', mod_path))
				import traceback    
				traceback.print_exc()
	return ret
def getFunctionCall(ast_data,mod_path):
	ret=[]
	for i,body in enumerate(ast_data.body):
		if body.__class__ == ast.ClassDef:
			func=getFunctionCall(body, mod_path)
			cname=x=eval('body.'+ ast.ClassDef.__dict__['_fields'][0])
			ret.append([cname,func])
		if body.__class__ == ast.ImportFrom:
			cname=x=eval('body.'+ ast.ImportFrom.__dict__['_fields'][0])
			cname=GetPath(mod_path)+ '/' + cname
			if FileExist(cname+'.py'):
				ret=ASTFile(cname+'.py')       
		if body.__class__ == ast.FunctionDef:
			try:
				x=eval('body.'+ ast.FunctionDef.__dict__['_fields'][0])
				args=''
				for a in range(len(body.args.args)):
					args+=body.args.args[a].arg+','
				if args!='':    
					args=args[:-1]    
				x=x+"("+args+")"    
				ret.append(x)
			except:

				print("AST error parsing line %r for %r" % ('12', mod_path))
				import traceback    
				traceback.print_exc()

	return ret            
def ASTFile(mod_path,code=None):
	ast_data=None
	ModuleType = type(ast)
	if code==None:
		with open(mod_path, "r") as file_mod:
			data = file_mod.read()
	else:
		data=code
	try:
		if code==None:
			ast_data = ast.parse(data, filename=mod_path)
		else:
			ast_data = ast.parse(data)
	except:
		#print("Syntax error 'ast.parse' can't read %r" % mod_path)
		#import traceback
		#traceback.print_exc()
		a=0
	ret= []
	if ast_data!=None:
		ret=getFunctionCall(ast_data,mod_path)

	return ret
class myAST:
	def __init__(self):
		self.ret=[]
		pass
	def parse(self,fname,code=None):
		ret=ASTFile(fname,code)
		for a in ret:
			if type(a)==str:
				if (a in self.ret)==False:
					self.ret.append(a)
			else:
				for b in a[1]:
					heads=a[0]+'.'
					b=b.replace('self,','').replace('self','')
					c=heads+b
					if (c in self.ret)==False:
						self.ret.append(c)
	def getClass(self,classname,replace):
		ret=[]
		fnd=classname+'.'
		for a in self.ret:
			if a.find(fnd)!=-1:
				buf=getCSV(1,".",a)
				buf=getCSV(0,"(",buf)
				if (buf in ['__init__','activeXcreated','connect','Show','loop','Widget','create','Hide','unload','GTKForms'])==False:
					ret.append(a.replace(fnd,replace))
		return ret		


class SearchReplace:#for class and def searching
	def __init__(self,code):
		self.code=code
		self.x=pythonCode(None, code=self.code)
	def Search(self,x):#returns tuple of two list	
		return self.x.getRoutinCode(x)
	def Replace(self,old,new):#returns tuple of two list	
		self.code=self.code.replace(old,new)
		self.x=pythonCode(None, code=self.code)
	def ToString(self):
		return self.code
class SrcBrowser(object):
	def __init__(self,string):
		classes,funcname,funcbody=self.Parse(string)
		self.obj=[]
		for i,_ in enumerate(classes):
			var=[]
			for index,b in enumerate(funcbody[i]):
				c=self.Variable(b)
				var.append(c)
			self.obj.append([classes[i],funcname[i],var])
		a=0
	def Variable(self,strs):
		x=strs.split('\n')
		varlist=[]
		for a in x:
			posX=a.find('=')
			if posX!=-1 and len(a)>(posX+1) and a[posX+1]!='=':
				var=''
				for b in a:
					if b!=' ' and b!='\t' and b!='=':
						var+=b
					if b=='=' and (var in varlist)==False:
						varlist.append(var)
						break
		return varlist			

	def Parse(self,strs):
		SaveFileStr('buf.txt',strs)
		classes,body=self.GetClass(strs,'class')			
		funcname=[]
		funcbody=[]
		for strs in body:
			SaveFileStr('buf.txt',strs)
			x1,y1=self.GetClass(strs,'def')
			funcname.append(x1)
			funcbody.append(y1)
		return classes,	funcname,funcbody
	def GetClass(self,strs,proto):	
		classlst=[]
		funclst=[]	
		while(1):
			f=open('buf.txt', 'rb') 
			lastword=''
			found=False
			try:
				for five_tuple in tokenize.tokenize(f.readline):#f.readline):
					#print(five_tuple.type)
					#print(five_tuple.string)
					#print(five_tuple.start)
					#print(five_tuple.end)
					#print(five_tuple.line)
					w=five_tuple.string
					if lastword in [proto]:
						if w.isidentifier()==True:
							a=SearchReplace(strs)
							xline,ex=a.Search(lastword + ' ' + w)
							#print(xline)
							funclst.append(xline)
							a.Replace(xline[:-1],'')
							strs=a.ToString()
							#print(strs)
							f.close()
							SaveFileStr('buf.txt',strs)
							found=True
							param=five_tuple.line[five_tuple.end[1]:]
							end=param.find(":")
							if end!=-1:
								param=param[0:end]
							classlst.append([w,param,ex])
							break

					lastword=w
				if found==False:break
			except:
				return classlst,funclst
		return classlst,funclst	
def copyall(root_src_dir,root_dst_dir)	:
	for src_dir, dirs, files in os.walk(root_src_dir):
		dst_dir = src_dir.replace(root_src_dir, root_dst_dir, 1)
		if not os.path.exists(dst_dir):
			os.makedirs(dst_dir)
		for file_ in files:
			src_file = os.path.join(src_dir, file_)
			dst_file = os.path.join(dst_dir, file_)
			if os.path.exists(dst_file):
				os.remove(dst_file)
			shutil.copy(src_file, dst_dir)
class plugin:
	def __init__(self,path):
		self.filename=[]
		self.path=[]
		index=0
		for dirname, dirnames, filenames in os.walk(path):
			if index==0:
				for filename in filenames:
					if filename.find('.py')!=-1:
						self.filename.append( filename)
						self.path.append('plugin')			
			for subdirname in dirnames:
				subject_path = os.path.join(dirname, subdirname)
				for filename in os.listdir(subject_path):
					if filename.find('.py')!=-1:
						files = os.path.join(subject_path, filename)
						self.filename.append(filename)
						self.path.append(subject_path.replace('\\','/'))
			index+=1			
	def Exist(self,types):
		if types in self.filename:
			return True
		return False
	def Path(self,types):
		for i,a in enumerate(self.filename):
			if types==a:
				return self.path[i]
		return ''
class pythonCode(object):
	def __init__(self,fname,code=None):
		if code==None:
			code=GetFileStr(fname)
		self.code=code;
		self.startSpaceOrTab=0;
		self.bodySpaceOrTab=0;
		self.endSpaceOrTab=self.startSpaceOrTab;        
	def getRoutinCode(self,routine,startafterThisString=None):
		parse=ParserLangguage(routine)
		startAt=0
		if startafterThisString!=None:
			startAt=self.code.find(startafterThisString)
		t=parse.Parse(self.code[startAt:])
		ret=""
		if t!=None:
			ret=self.getSpaceOrTab(t[0],t[1],len(self.code[startAt:]),self.code[startAt:])                
		return ret,t  
	def getLineNumber(self,routine):
		code=self.code.split('\n')
		parse=ParserLangguage(routine)
		for i,a in enumerate(code):
			t=parse.Parse(a)
			if t!=None:
				return i
		return -1
	def getSpaceOrTab(self,st1,end1,totalchar,code):
		st=st1-1
		end=end1+1
		def GotoEnterAtTheBack(st):
			num=0
			while(st!=-1):
				if code[st]=='\r' or code[st]=='\n':
					break
				else:
					num+=1
				st-=1      
			return num,st+1
		def GotoEnterAtTheEnd(st):
			num=0
			while(st!=-1):
				if code[st]=='\r' or code[st]=='\n':
					break
				else:
					num+=1
				st+=1      
			return num     
		def GotoFirstValidchar(st1):
			num=0
			st=st1
			while(st!=totalchar):
				if code[st]=='#':
					num2=GotoEnterAtTheEnd(st)
					st=num2+st
				if code[st]!=' ' and code[st]!='\t' and code[st]!='\n' and code[st]!='\r':
					break
				else:
					if code[st]=='\n' or code[st]=='\r':
						num=0
					else:        
						num+=1
				st+=1 
			end=st1+st-st1        
			return num,end
		def GotoFirstEndRoutine(st):
			num=0
			loopcnt=0
			while(1):
				n,e=GotoFirstValidchar(st)
				if n<=self.startSpaceOrTab and loopcnt!=0:
					break
				else:
					n=GotoEnterAtTheEnd(st) 
					st=st+n+1
				loopcnt+=1        
			return num,e                        

		self.startSpaceOrTab,stx=GotoEnterAtTheBack(st)
		num=GotoEnterAtTheEnd(end)
		end=end+num+1
		self.bodySpaceOrTab,st=GotoFirstValidchar(end)
		_,end=GotoFirstEndRoutine(stx)
		return code[stx:end]
#x=pythonCode("test.py")
#y=x.getRoutinCode("def __init__(self):")
#print (y)
class header:
	def __init__(self):
		self.firstime=True
		self.head1=GetFileStr("header.py")
		self.l1=GetFileStr("loop.py")
		self.f1=GetFileStr("footer.py")
		self.f21=GetFileStr("footer2.py")

		self.head2=GetFileStr("headerUsercontrol.py")
		self.l2=GetFileStr("loopUsercontrol.py")
		self.f2=GetFileStr("footer.py")
		self.f22=GetFileStr("footer2.py")			
		pass
	def value(self,currentform):

		if currentform.activexFlag==False:	
			return 	self.head1,self.l1,self.f1,self.f21	
		else:
			return 	self.head2,self.l2,self.f2,self.f22	

headers=header()	
class generateCode(object):
	def __init__(self,filename,code,lastevent):               
		self.filename=filename
		self.lastevent=lastevent
		if FileExist(GetPath(self.filename) + '/wta_module.py')==False and GetPath(self.filename).find('plugin')==-1 and GetPath(self.filename).find('examples')==-1:
			copyfile('properties/wta_module.py', GetPath(self.filename) + '/wta_module.py')
			copyfile('icon.ico', GetPath(self.filename) + '/icon.ico')
		if GetPath(self.filename).find('plugin')!=-1 or GetPath(self.filename).find('examples')!=-1:
			msgbox(None, "Cant save to this folder, Choose another folder and save ", "WiredGTK Error")
		self.code=code

		pass 
	def RemoveDeletedEvent(self,curr,strs):
		ev=[]

		for a in curr.event:
			rot=curr.Name+"_" + a[0]
			if self.code.find(rot.replace('-','_'))==-1 and strs!=a[0]:
				ev.append(a)
		for a in ev:
			curr.event.remove(a)
	def checkActiveX(self,fname):
		#fname=self.plugin.Path(types+'.py')+'/'+types+'.py'
		x=GetFileStr(fname)
		a=SearchReplace(x)
		xline,_=a.Search("def GTKForms")
		xline=xline.replace('\n','\r')
		xline=xline.split('\r') 
		ret=[]
		def getparam(*par):
			return eval("%s,'%s'"%(par[0],par[1])) 
		for a in xline:
			if a.find('self.create(')!=-1 and a.find('self.create')!=-1:
				y=a[a.find('(')+1:-1]
				strs="getparam(%s)" % (y)
				p1,types=eval(strs)
				#print(p1['Tag'])
				if p1['Tag']=='Activex':
					ret.append(types)
		return ret
	def copyActivexDependency(self,fname,plugin):
		ret=self.checkActiveX(fname)
		for aaa in ret:
			fname=plugin.Path(aaa+'.py')+'/'+aaa+'.py'
			try:
				copyfile(fname,os.path.join(GetPath(self.filename),aaa+'.py'))
				copyfile(fname,os.path.join(GetPath(self.filename),aaa+'.png'))
			except:
				aaa=aaa		


	def Generate(self,addedobj,deleted,gtkclass,plugin,currentform=None):

		head,l,f,f2=headers.value(currentform)

		createlst=""
		self.code=self.code.replace('\n','\r')
		if self.code!="":
			a=SearchReplace(self.code)
			xline,ex=a.Search("def GTKForms")
			if len(addedobj.lst)==0:
				a.Replace(xline,"\tdef GTKForms(self):\r\t\tpass\r\t")
			else:
				a.Replace(xline,"\tdef GTKForms(self):\r\t")
			self.code=a.ToString()


		for a in addedobj.lst:
			if a.updated==False: continue
			prop={}
			if plugin.Exist(a.types+'.py')==True and FileExist(GetPath(self.filename) + '/'+a.types+'.py')==False:
				if GetPath(self.filename).find('examples')==-1:
					#copyfile(plugin.Path(a.types+'.py')+ '/'+ a.types +'.py', GetPath(self.filename) + '/'+ a.types +'.py')
					copyall(plugin.Path(a.types+'.py'), GetPath(self.filename))
					self.copyActivexDependency(plugin.Path(a.types+'.py')+ '/'+a.types+'.py',plugin)
			self.RemoveDeletedEvent(a,self.lastevent)
			a.RefreshProperty()

			propertiesX=deepcopy(properties)
			if a.types in ['Label','Entry']:
				propertiesX.append("Alignment")

			x=gtkclass.Object(a.types)
			for _a in x.properties:
				propertiesX.append(_a)   
			for b in propertiesX:
				#ifdef python3
				if hasattr(a, b):
					exec ("prop.update({'%s':'%s'})" % (b,eval("a.%s" % (b))) )
					#exec "prop.update({'%s':'%s'})" % (b,eval("a.%s" % (b))) in globals(),locals()

			name=a.Name
			gtktype=a.types
			if a.parent==None:
				parent="usercontrol"
				x,y=forms(a.widget.Widget()).Location()
			else:	
				parent=a.parent.Name	
				x,y=forms(a.widget.Widget()).Location()
				px,py=forms(a.parent.widget.Widget()).Location()
				x=x-px
				y=y-py
			text=a.Text
			enable="True"




			w,h=a.widget.Dimension

			x=pythonCode("",self.code)
			handler,_=x.getRoutinCode("def GTKForms")
			if handler=="":
				self.code=head+l+f+"\r"+f2
				x=pythonCode("",self.code)
				handler,_=x.getRoutinCode("def GTKForms")                             
			def findCode(name):
				start=-1
				end=-1
				index=self.code.find("'Name': '" + name +"'")
				if index !=-1:                          #replace existing self.create(
					end=self.code[index:].find('\r')#goto newline
					start=index
					while(self.code[start]!="\t"):
						start-=1
						if start==0:
							print ("Check self.create")
							break
					start-=1

				return start,index+end+1       
			if len(deleted):#remove self.create(....) if object in design has been deleted
				for del_name in deleted:
					del_find=del_name
					del_index,end=findCode(del_name)                                
					if del_index!=-1:
						deleteCode=self.code[del_index:end]
						self.code=self.code.replace(deleteCode,'')
				x=pythonCode("",self.code)
				handler,_=x.getRoutinCode("def GTKForms")                                                 
				deleted=[]               
			event=a.event#[["button-press-event","self,event,e"]]

			#cbuf='\t\tself.create("%s","%s","%s","%s")\r'%(prop,gtktype,parent,str(event))
			cbuf='\t\tself.create("%s","%s","%s","%s")\r'%(str(prop).replace('\"','\\\"'),gtktype,parent,str(event))
			c=""
			cfind='\t\tself.create('# + "\"{'Enable': 'True', 'Name': '" + name 
			index,end=findCode(name)
			a.updated=False
			a.gtkform=cbuf

			if index!=-1 and 1==0:
				self.code=self.code.replace(self.code[index:end],cbuf)
			else:
				y,_=x.getRoutinCode('def GTKForms')
				yy=y
				yy=yy.replace('def GTKForms(self):		pass','def GTKForms(self):')

				self.code=self.code.replace(y,yy[:-1]+cbuf+'\t')                                                                        
			#if index !=-1:                          #replace existing self.create(
				#end=self.code[index:].find('\r')#goto newline
				#start=index
				#while(self.code[start]!="\t"):
					#start-=1
					#if start==0:
						#print "Check self.create"
						#break
				#start-=1
				#self.code=self.code.replace(self.code[start:index+end+1],cbuf)

			#else:
				#y,_=x.getRoutinCode('def GTKForms')
				#self.code=self.code.replace(y,y[:-1]+cbuf+'\t')                                        
			#print (y)     
			x=pythonCode("",self.code)
			handler,_=x.getRoutinCode("class Handler") 
			for b in event:
				if b=='[' or b==']':continue

				routine="\tdef %s_%s"%(name,b[0].replace('-',"_"))
				y,_=x.getRoutinCode(routine.replace('\t',''))

				if y=="":
					routine+= "("+b[1]+"):\r\t\tpass\r"
					self.code=self.code.replace(handler,handler+routine)
		if len(addedobj.lst)==0:
			strs='\tdef GTKForms(self):\r\t\tpass\r'			
		else:        
			strs='\tdef GTKForms(self):\r'			
			for a in addedobj.lst:
				strs+=a.gtkform
		x=pythonCode("",self.code)
		handler,_=x.getRoutinCode("def GTKForms")
		if handler!="":
			self.code=self.code.replace(handler,strs+'\t')

		if self.code=="":
			self.code=head+l+f+"\r"+f2
		if self.filename.find('examples')==-1 and self.filename.find('plugin')==-1:
			SaveFileStr(self.filename,self.code)
		pass	
class GtkClassX:
	def __init__(self,name):
		self.name=name
		self.event=[]
	def Addevent(self,events,params):
		self.event=events
		self.param=params
class GtkClassLstX:
	def __init__(self):
		self.gtkclass=[]
	def AddGtkClass(self,name,events,params):
		x=GtkClass(name)
		x.Addevent(events,params)
		self.gtkclass.append(x)
	def Names(self):
		return [a.name for a in self.gtkclass]
	def Object(self,name):
		for a in self.gtkclass:
			if a.name==name:
				return a
		return None	
class GtkClass:
	def __init__(self,name):
		self.name=name
		self.events=[]
		self.params=[]
		self.properties=[]
		self.propertiesval=[]
		self.propertieslst=[]
	def Addevent(self,event,param):
		if event=="":return
		if (event in self.events) ==False: 
			self.events.append(event)
			self.params.append(param)

class GtkClassLst:
	def __init__(self):
		self.gtkclass=[]
	def AddGtkClass(self,names,events):
		for a in names:
			x=GtkClass(a)
			for b in events:
				event=b[0];param=b[1]
				x.Addevent(event,param)
			self.gtkclass.append(x)
	def AddName(self,name):                
		if self.Object(name)==None:
			x=GtkClass(name) 
			self.gtkclass.append(x)
	def AddEvent(self,name,param):
		x=self.Object(name)
		e,p=eval(param);
		if (e in x.events)==False: 
			x.events.append(e);
			x.params.append(p);
	def AddProperties(self,name,param,lst):
		x=self.Object(name)
		properties,p=eval(param);
		if properties=="":return
		if (properties in x.properties) ==False: 
			x.properties.append(properties)
			x.propertiesval.append(p)
			x.propertieslst.append(lst)
	def Names(self):
		return [a.name for a in self.gtkclass]
	def Object(self,name):
		for a in self.gtkclass:
			if a.name==name:
				return a
		return None
class object_move:
	def __init__(self):
		self.x=0
		self.y=0
		self.xrootprev=0
		self.yrootprev=0
		self.adjustwidthx=False
		self.adjustwidthy=False
		pass
	def init(self,obj):
		self.obj=obj

		self.parent=obj.widget.Widget().get_parent()
		pass	
properties=["Name","Text","Top","Left","Width","Height","Visible","Enable","Font","BackColor","ForeColor","Picture","Events","Tag","ParentsType","Var","Help"]                        
class objectType:
	def __init__(self,widget,types,parent,name,prop=None):
		self.types=types
		self.widget=widget
		self.parent=parent
		self.children=[]
		self.Name=name
		self.event=[]
		self.updated=True
		self.gtkform=''
		for i,a in enumerate(properties):
			if i !=0:
				exec("self.%s=''"%(a))
		if prop!=None:
			for a in prop:
				exec("self.%s=''"%(a))

		self.Visible="True"
		self.Enable="True"
		self.BackColor=1,1,1,1
		self.ForeColor=0,0,0,1
	def EventExist(self,event):
		found=False
		for a in self.event:
			if a[0]==event:
				found=True
				break
		return found        
	def RefreshProperty(self):
		self.Width,self.Height=forms(self.widget.Widget()).Dimension
		if self.HasParent():
			Left,Top=forms(self.widget.Widget()).Location()                
			self.Left,self.Top=forms(self.parent.widget.Widget()).Location()   
			self.Left=Left-self.Left
			self.Top=Top-self.Top

		else:                           
			self.Left,self.Top=forms(self.widget.Widget()).Location()                

	def Children(self,children):
		self.children.append(children)
	def HasChildren(self):
		if len(self.children)!=0:
			return True
		else:
			return False
	def MoveSelfAndChild(self,xorg,yorg):
		pass

	def HasParent(self):
		if self.parent!=None:
			return True
		else:
			return False
	def AllowChildToMoveBoolX(self,xorg,yorg):
		if (self.parent!=None):
			dimParent=forms(self.parent.widget.Widget()).Dimension
			locParent=forms(self.parent.widget.Widget()).Location()	
			dimSelf=forms(self.widget.Widget()).Dimension
			locSelf=forms(self.widget.Widget()).Location()	
			upperLeft=locParent[0]<=xorg and locParent[1]<=yorg
			lowerright=locParent[0]+dimParent[0]>= xorg+dimSelf[0] and  locParent[1]+dimParent[1]> yorg+dimSelf[1]
			if upperLeft and lowerright:
				return True
			else:
				return False
	def AllowChildToMoveBool(self,xorg,yorg):
		return self.AllowChildToMove(xorg,yorg)
	def AllowChildToMove(self,xorg,yorg):
		if (self.parent!=None):
			dimParent=forms(self.parent.widget.Widget()).Dimension
			locParent=forms(self.parent.widget.Widget()).Location()	
			dimSelf=forms(self.widget.Widget()).Dimension
			locSelf=forms(self.widget.Widget()).Location()	
			Left=locParent[0]<=xorg+dimSelf[0]/2 
			Right=locParent[0]+dimParent[0]>= xorg+dimSelf[0]/2
			Up= locParent[1]<=yorg+dimSelf[1]/2 
			Down=locParent[1]+dimParent[1]> yorg+dimSelf[1]/2
			if Left==False: 
				xorg=locParent[0]-dimSelf[0]/2
			if Right==False: 
				xorg=locParent[0]+dimParent[0]-dimSelf[0]/2
			if Up==False:
				yorg=locParent[1]-dimSelf[1]/2
			if Down==False:
				yorg=locParent[1]+dimParent[1]-dimSelf[1]/2                             
			return xorg,yorg                        
	def AllowChildToMoveBounderuOnly(self,xorg,yorg):
		if (self.parent!=None):
			dimParent=forms(self.parent.widget.Widget()).Dimension
			locParent=forms(self.parent.widget.Widget()).Location()	
			dimSelf=forms(self.widget.Widget()).Dimension
			locSelf=forms(self.widget.Widget()).Location()	
			Left=locParent[0]<=xorg 
			Right=locParent[0]+dimParent[0]>= xorg+dimSelf[0]
			Up= locParent[1]<=yorg 
			Down=locParent[1]+dimParent[1]> yorg+dimSelf[1]
			if Left==False: 
				xorg=locParent[0]
			if Right==False: 
				xorg=locParent[0]+dimParent[0]-dimSelf[0]                         
			if Up==False:
				yorg=locParent[1]
			if Down==False:
				yorg=locParent[1]+dimParent[1]-dimSelf[1]                                
			return xorg,yorg
class objectAdded:
	def __init__(self):
		self.lst=[]#list of objectType
		pass
	def getObjectFomUserControl(self,usrcontrol):
		for a in self.lst:
			if a.widget.Widget()==usrcontrol:
				return a
		return None
	def NameExist(self,name,obj=None):
		for a in self.lst:
			if obj==None:
				if a.Name==name:
					return True
			else:        
				if a.Name==name and obj!=a:
					return True
		return False
	def NameToObjectType(self,name):
		for a in self.lst:
			if a.Name==name:
				return a
		return None        
	def GeneratedCode(self):
		for a in self.lst:
			label=a.widget.label
			loc=forms(a.widget.Widget()).Location()
			dimension=forms(a.widget.Widget()).Dimension
			#print label,loc,dimension


	def AddItem(self,item):
		self.lst.append(item)
	def ObjectExist(self,widget):
		if widget in self.item:
			return True
		else:
			return False
	def Remove(self,widget):
		for a in self.item:
			if a ==widget:
				self.Remove(a)
	def ParentProperties(self,widget):
		for a in self.item:
			if a==widget:
				self.Remove(a)			
	def DeselectAll(self):
		for a in self.lst:
			#a.widget.Selected(False)
			a.widget.Selected=False
	def Select(self,widget):
		for a in self.lst:
			if a.widget.Widget()==widget:
				#a.widget.Selected(True)
				a.widget.Selected=True
	def NumSelected(self):
		cnt=0
		for a in self.lst:
			if a.widget.Selected==True:
				cnt+=1
		return cnt
	def SelectedType(self):
		types=[]
		for a in self.lst:
			if a.widget.Selected==True:
				types.append(a.types)
		return types
	def SelectedLocation(self):
		types=[]
		for a in self.lst:
			if a.widget.Selected==True:
				types.append(a.widget.Location())
		return types
	def SelectedObject(self):
		types=[]
		for a in self.lst:
			if a.widget.Selected==True:
				types.append(a)
		return types
	def RemoveSelected(self,deleted=None):
		def DeleteSelectedRecursive(a,addedobj,rem):
			#a.obj.MoveSelfAndChild(a,a.x,a.y)
			for b in a.children:
				for c in addedobj:
					if b==c:
						if b.HasChildren()==True: 
							DeleteSelectedRecursive(b, addedobj,rem)
						rem.append(b)

		rem=[]
		for a in self.lst:
			if a.widget.Selected==True:
				rem.append(a)
				DeleteSelectedRecursive(a, self.lst,rem)
		for a in rem:
			#prop={}
			#createlst=""
			#for b in properties:
				#exec "prop.update({'%s':'%s'})" % (b,eval("a.%s" % (b))) in globals(),locals()
			#name=a.Name
			#gtktype=a.types
			#if a.parent==None:
				#parent="usercontrol"
			#else:	
				#parent=a.parent.Name	
			#event=a.event        
			#deleted.append('\t\tself.create("%s","%s","%s","%s")\r'%(prop,gtktype,parent,str(event)))
			deleted.append(a.Name)
			a.widget.Widget().hide()
			realcontrol=a.widget.realcontrol
			realcontrol.hide()
			del(realcontrol)                        
			lay=a.widget.Widget()
			del(lay)
			if a in self.lst:
				self.lst.remove(a)

class Drag:
	def __init__(self):
		self.selectedlist=[]
	def ObjectExist(self,*widget):
		if widget in self.selectedlist:
			return True
		else:
			return False
	def addObject(self,*widget):
		for a in widget:
			obj=object_move()
			obj.init(a)
			self.selectedlist.append(obj)		
	def MemorizeClick(self,event):
		adjustAllowed=10
		for a in self.selectedlist:
			a.x = a.parent.child_get_property(a.obj.widget.Widget(),"x")
			a.y = a.parent.child_get_property(a.obj.widget.Widget(),"y")
			a.xrootprev,a.yrootprev=self.snap(event.x_root,event.y_root,5)
			info=a.obj.widget.Widget().size_request();w=info.width;h=info.height;
			if abs(w-event.x)<adjustAllowed:
				a.adjustwidthx=True
			else:
				a.adjustwidthx=False
			if abs(h-event.y)<adjustAllowed:
				a.adjustwidthy=True
			else:
				a.adjustwidthy=False
	def snap(self,x_root,y_root,grid):
		x_root=x_root if x_root%grid==0 else x_root+grid-x_root%grid
		y_root=y_root if y_root%grid==0 else y_root+grid-y_root%grid
		return x_root,y_root
	def Dragging(self,event,addedobj,absx=-1,absy=-1):	
		def moveAllIncludingChild(a,addedobj):
			#a.obj.MoveSelfAndChild(a,a.x,a.y)
			for b in a.children:
				for c in addedobj.lst:
					if b==c:
						#b.widget.Widget().get_parent().move(b.widget.Widget(),a.x,a.y)
						if b.HasChildren()==True: 
							moveAllIncludingChild(b, addedobj)
						x,y=forms(b.widget.Widget()).Location()
						b.widget.Widget().get_parent().move(b.widget.Widget(),x+difx,y+dify)	
						b.widget.realcontrolW.Move((x+difx,y+dify))

		for a in self.selectedlist:
			event.x_root,event.y_root=self.snap(event.x_root,event.y_root,5)

			difx=event.x_root -a.xrootprev
			dify=event.y_root -a.yrootprev
			a.xrootprev=event.x_root 
			a.yrootprev=event.y_root
			if (a.adjustwidthx==True or a.adjustwidthy==True) and len(self.selectedlist)==1:
				w,h=forms(a.obj.widget.Widget()).Dimension
				if a.adjustwidthx==True:
					if a.obj.HasParent()==True:
						if a.obj.AllowChildToMoveBool(a.x,a.y) or difx<0:
							w=w+difx
							a.obj.widget.WidgetSetSize(w,h)
							a.obj.widget.realcontrolW.Dimension=w,h							
					else:		
						w=w+difx
						if w<20:w=20
						a.obj.widget.WidgetSetSize(w,h)
						a.obj.widget.realcontrolW.Dimension=w,h

				if a.adjustwidthy==True:
					if a.obj.HasParent()==True:
						if a.obj.AllowChildToMoveBool(a.x,a.y) or dify<0:					
							h=h+dify
							a.obj.widget.WidgetSetSize(w,h)
							a.obj.widget.realcontrolW.Dimension=w,h

					else:		
						h=h+dify
						if h<20:h=20
						a.obj.widget.WidgetSetSize(w,h)
						a.obj.widget.realcontrolW.Dimension=w,h
			else:	
				if absx!=-1 or absy!=-1:
					difx=absx-a.x
					dify=absy-a.y
					a.x=absx
					a.y=absy
				else:        
					a.x=a.x+difx
					a.y=a.y+dify
				if a.obj.HasChildren()==True: 
					if a.obj.HasParent()==True: 
						if a.obj.AllowChildToMoveBool(a.x,a.y):
							a.parent.move(a.obj.widget.Widget(), a.x, a.y)
							a.obj.widget.realcontrolW.Move((a.x,a.y))
							moveAllIncludingChild(a.obj,addedobj)
						else:
							self.selectedlist=[]
					else:	
						a.parent.move(a.obj.widget.Widget(), a.x, a.y)	
						a.obj.widget.realcontrolW.Move((a.x,a.y))
						moveAllIncludingChild(a.obj,addedobj)

				else:	
					if a.obj.HasParent()==True:
						a.x,a.y=a.obj.AllowChildToMove(a.x,a.y)
						a.parent.move(a.obj.widget.Widget(), a.x, a.y)	
						a.obj.widget.realcontrolW.Move((a.x,a.y))
					else:		
						a.parent.move(a.obj.widget.Widget(), a.x, a.y)	
						a.obj.widget.realcontrolW.Move((a.x,a.y))

class Handler:
	def __init__(self,gtkwta,filename):
		self.plugin=plugin('plugin')
		builder = Gtk.Builder()
		builder.add_from_file("frmForm.glade")
		builder.connect_signals(self)
		self.pasteDetect=False
		self.gtkcodeflag=True
		self.win=[]
		self.tmrRefreshTab=False
		self.unloadNow=False
		self.timeout_id = GLib.timeout_add(10, self.loop, None)#10ms 
		self.sch=Scheduler(2000)#500 ms

		self.form_load=False
		self.window1 = builder.get_object("window1")
		self.window1W = forms(self.window1)
		self.win.append(self.window1)
		self.fixed1 = builder.get_object("fixed1")
		self.fixed1W = forms(self.fixed1)
		self.fixed2 = builder.get_object("fixed2")
		self.fixed2W = forms(self.fixed2)		
		self.scrolledwindow3=builder.get_object("scrolledwindow3")
		self.scrolledwindow3W=forms(self.scrolledwindow3)

		self.eventbox1 = builder.get_object("eventbox1")
		self.eventbox1W = forms(self.eventbox1)                
		self.layoutCode = builder.get_object("layoutCode")
		self.layoutCodeW = forms(self.layoutCode)
		self.textview1 = builder.get_object("textview1")
		self.textview1W = forms(self.textview1)
		self.layout2 = builder.get_object("layout2")
		self.layout2W = forms(self.layout2)                
		#self.textview1.modify_font(PangoFontDescription("Courier New 16")); 

		self.tago= self.textview1.get_buffer().create_tag("orange_bg", background="orange")
		self.tagy= self.textview1.get_buffer().create_tag("yellow_bg", background="yellow")
		self.tagnormal= self.textview1.get_buffer().create_tag("black_bg", background="white")

		self.tagblue= self.textview1.get_buffer().create_tag("blue_fg",foreground ="blue")
		self.tagorange= self.textview1.get_buffer().create_tag("orange_fg",foreground ="orange")
		self.taggreen= self.textview1.get_buffer().create_tag("green_fg",foreground ="green")

		self.reservelst={"if":self.tagblue,"else":self.tagblue,"elif":self.tagblue,"for":self.tagblue,"while":self.tagblue,
		                 "continue":self.tagblue,"break":self.tagblue,"in":self.tagblue,"def":self.tagblue,"return":self.tagblue,
		                 "True":self.tagorange,"False":self.tagblue,"class":self.tagblue,"print":self.tagblue,
		                 "exec":self.tagblue,"eval":self.tagblue,"__name__":self.tagorange,"except":self.tagblue,"pass":self.tagblue,
		                 "import":self.tagblue,"from":self.tagblue,"@property":self.tagorange,"try":self.tagblue}                


		self.scrolledwindow1 = builder.get_object("scrolledwindow1")
		self.scrolledwindow1W = forms(self.scrolledwindow1)                
		self.mycontrol=Drag()

		##self.mycontrol.addObject(self.button1,self.button2)
		#self.mycontrol.addObject(self.button1)
		#self.mycontrol.addObject(self.button2)

		self.button3 = builder.get_object("button3")
		self.button = builder.get_object("button")
		self.button3W = forms(self.button3)
		self.button3W.Text="ASD"
		self.multiple_select=False
		self.addedobj=objectAdded()

		self.button32 = builder.get_object("button32")
		self.button32W = forms(self.button32)

		self.layout1 = builder.get_object("layout1")
		self.layout1W = forms(self.layout1)
		self.cmdCount=1


		strs=GetFileStr("properties/common.txt")
		str1=strs.split('\n')

		lastwidget=""
		commonwidgetflag=False
		commonwidgetlst=[]
		commonwidgeteventflag=False
		commonwidgetevent=[]
		self.paste=False
		self.gtkClass=GtkClassLst()
		for a in range(len(str1)):
			if str1[a]=="":
				continue
			if str1[a].find('#Common Widget')!=-1:
				commonwidgetflag=True
				continue
			if str1[a].find('#Common Event')!=-1:
				commonwidgeteventflag=True
				commonwidgetflag=False
				continue               
			if str1[a].find('#Widget ')!=-1:
				lastwidget=getCSV(1," ",str1[a])
				self.gtkClass.AddName(lastwidget)
				continue
			if str1[a].find('#Event')!=-1:
				continue
			if lastwidget!="":
				self.gtkClass.AddEvent(lastwidget,str1[a])
				continue
			if commonwidgetflag==True:
				commonwidgetlst.append(str1[a])
			if commonwidgeteventflag==True:
				commonwidgetevent.append(str1[a])                                

		for a in commonwidgetlst:
			self.gtkClass.AddName(a)
			for b in commonwidgetevent:
				self.gtkClass.AddEvent(a,b)
		for a in self.gtkClass.Names():
			self.createControl(a)
		self.addplugin()
		self.prop=gtkwta
		self.copy=None
		self.code=""

		self.filename=filename
		if FileExist(self.filename):                        
			statinfo = os.stat(self.filename)
			self.lastmodified=statinfo.st_mtime                         
		else:
			self.lastmodified=0                         
		if self.filename!="":  
			self.window1W.Text="GTKWired - " + self.filename
			if self.filename.find("UnTitled")==-1:
				self.CreateControl("Property","")
		else:
			self.window1W.Text="GTKWired - " + self.filename
		import ctlCodeEditor
		self.editor=ctlCodeEditor.Handler()
		self.editor=self.editor.CreateActiveX(self,1200,500,0,30,self.fixed1)
		self.layoutCodeW.Visible=False
		self.hasFilename=False 
		self.sourceVisible(False)        
		self.xxx=1
		self.tag_sel_lst=[]
		self.sel_string=""
		self.intel=None
		self.intel=intel.Handler(self)
		self.intel.WidgetSetSize(300, 300)
		self.fixed1.put(self.intel.Widget(),400,100)
		self.intel.usercontrol.Visible=False
		self.lastselected=None
		self.lastselectedflag=False
		self.lastevent=None
		self.deleted=[]
		self.hassavedWiredGTK=False 
		self.hassavedWiredGTKctr=0               
		self.sch.Start()
		font='Dejavu Sans Mono 10'
		self.textview1.modify_font( Pango.FontDescription(font))
		self.activexFlag=False

		self.lstpreloaded=[]

		b=myinspect.StringMethod().AvailableMethod()
		for c in b:
			self.lstpreloaded.append("str."+c[0]+c[1])
		b=myinspect.BuiltinMethod().AvailableMethod()
		for c in b:
			self.lstpreloaded.append(c[0]+c[1])			
		self.lstpreloadedcv2=[]
		b=myinspect.InspectModulesitepackage('cv2').AvailableMethod()
		for c in b:
			self.lstpreloadedcv2.append("cv2."+c[0]+c[1])	

		self.parsekey=Poll(chr(37)+chr(65))
		self.parsekeyWin=Poll(chr(17)+chr(32))
		self.parsefind=Poll(chr(37)+chr(41))
		self.parsefindWin=Poll(chr(17)+chr(70))
		self.findagainRasp=[114,65472]
		self.findagainWin=[69,65472]
		self._findagain=[self.findagainRasp,self.findagainWin]
		self._parsekey=[self.parsekey,self.parsekeyWin]
		self._parsefind=[self.parsefind,self.parsefindWin]
		self.findtriggered=False
		self.helptriggered=False
		self.currlineposprev=-1
	def CheckWing(self):
		#subprocess.Popen(['C:\\Program Files\\Wing IDE 5.1\\bin\\wing.exe', app_path()+ '\\we46.py'])
		fname=['C:\\Program Files\\Wing IDE 5.1\\bin\\wing.exe','C:\\Program Files (x86)\\Wing IDE 5.1\\bin\\wing.exe',
		       'C:\\Program Files\\Wing IDE 6.1\\bin\\wing.exe','C:\\Program Files (x86)\\Wing IDE 6.1\\bin\\wing.exe']
		for a in fname:
			if FileExist(a)==True:
				self.prop.wingide.append(a)
		try:		
			fname=GetFileStr('properties/wingpath.txt')
			if FileExist(fname)==True and (fname in self.prop.wingide)==False :
				self.prop.wingide.append(fname)		
		except:
			a=0	
	def PrepareWingIDE(self):
		self.showWINGIDE("UnTitled.py",0)
	def showWINGIDE(self,fname,line):
		fname=fname+':'+str(line+1) 
		if self.prop.wingidepath!='':
			subprocess.Popen([self.prop.wingidepath, fname])		
	def addgtkclassFromFile(self,_file):
		ret=self.getEvent(_file)
		ret2=self.getProperty(_file)
		_file=GetFilename(_file)
		wid=_file.replace('.py','')
		wid=wid.replace('plugin/','')
		if (wid in self.gtkClass.Names())==False:
			self.createControl(wid)                
		self.gtkClass.AddName(wid)  
		for n,e in ret: 
			self.gtkClass.AddEvent(wid,'\"'+n+'\",'+'\"'+e+'\"')
		for a in ret2: 
			if a[0]!="Text":
				n=a[0];e=a[1];lst=a[2]
				self.gtkClass.AddProperties(wid,'\"'+n+'\",'+'\"'+e+'\"',lst) 


	def addplugin(self):       

		for i,a in enumerate(self.plugin.filename):
			try:
				if a[0]!="_":
					self.addgtkclassFromFile(self.plugin.path[i]+'/'+a)
			except:
				print("Can't load ", a)
	def getEvent(self,_file):
		x=GetFileStr(_file)
		xx=pythonCode("",x)
		x,_=xx.getRoutinCode("class Handler")                 
		if len(x.split('\n'))==1:
			x=x.split('\r')
		else:
			x=x.split('\n')
		ret=[]
		for a in x:
			fnd='#WiredEvent def '
			le=len(fnd)
			i=a.find(fnd)
			if i!=-1:
				s=a.find('(')
				e=a.find(')')
				ret.append([a[i+le:s],a[s+1:e]])
		return ret
	def getProperty(self,_file):
		import json
		x=GetFileStr(_file)
		xx=pythonCode("",x)
		x,_=xx.getRoutinCode("class Handler")                 
		if len(x.split('\n'))==1:
			x=x.split('\r')
		else:
			x=x.split('\n')
		ret=[]
		for a in x:
			fnd='#WiredProperty '
			le=len(fnd)
			i=a.find(fnd)
			if i!=-1:
				try:
					a=a.replace("'",'"')
					_json=json.loads('{'+a[le:]+'}')
					indexproperty=None
					indexlst=None
					for i,a in enumerate(_json):
						if type(_json[a])!=list:
							indexproperty=a
						else:
							indexlst=a

					if indexlst==None:
						ret.append([indexproperty,_json[indexproperty],[]])
					else:
						ret.append([indexproperty,_json[indexproperty],_json[indexlst]])
				except:
					a=a
		return ret	


	def createControl(self,types):
		for a in self.layout2.get_children():
			if forms(a).Text==types:
				return
		but=Gtk.Button()

		im_path=app_path()+"/images/" 
		im_path=im_path.replace("\\","/")
		if FileExist(im_path+types + '.png')==True:
			butimg=Gtk.Image.new_from_file (os.path.join(im_path,types + '.png'))
		else:
			if FileExist(self.plugin.Path(types+'.py')+'/'+types+'.png'):
				butimg=Gtk.Image.new_from_file (os.path.join(self.plugin.Path(types+'.py'),types+'.png'))
			else:
				im_path=app_path()+"/images"
				im_path=im_path.replace("\\","/")
				butimg=Gtk.Image.new_from_file (os.path.join(im_path,'default.png'))
		but.set_image(butimg)        
		but.set_tooltip_text(types)

		w,h=40,40
		x,y=10,30
		butW=forms(but)
		butimgW=forms(butimg)
		#butW.Text=types
		butW.Dimension=w,h

		but.connect('button-release-event',self.button3_clicked_cb)
		height=(self.cmdCount+1)/2
		dist=50
		if self.cmdCount%2==0:
			self.layout2.put(but,x+dist,y+(height-1)*50)
		else:
			self.layout2.put(but,x,y+height*50-25)
		but.show()
		self.cmdCount+=1  
		forms(self.layout2).Height=self.cmdCount*50
		if types=="ActiveX":
			self.ActiveXW=butW
			self.ActiveXW.Enable=False
	def selectedFunc(self,val=None):
		if self.gtkcodeflag==False:
			self.prop.currentform.sourceVisible(True)					
			return
		if val==None:
			strs=self.intel.Text
		else:
			strs=val
		self.intel.usercontrol.Visible=False
		if self.editor[1].usercontrol.Visible==True:#if self.layoutCodeW.Visible==True:
			buffers=self.editor[1].get_buffer()#self.textview1.get_buffer()
			pos=buffers.get_property('cursor-position')
			#buffers.get_iter_at_offset(pos)
			self.textview_current_str_ptr[1]
			if len(self.textview_current_str_ptr[0])==1 and self.textview_current_str_ptr[0].isalpha()==False:
				a=0#dont delete
			else:        
				buffers.delete(buffers.get_iter_at_offset( self.textview_current_str_ptr[1]),buffers.get_iter_at_offset( self.textview_current_str_ptr[2]))
			buffers=self.editor[1].get_buffer()	
			buffers.insert_at_cursor(strs)
			#buffers.place_cursor(buffers.get_iter_at_offset(10))  
		else:
			self.lastevent=strs
			if self.lastselected.EventExist(strs):
				a=0
			else:   
				for i,b in enumerate(self.gtkClass.Object(self.lastselected.types).events):
					if b==strs:
						ev=[strs,(self.gtkClass.Object(self.lastselected.types).params[i])]
						self.lastselected.event.append(ev) 

			self.ShowEventSelected(self.lastselected,strs)  
			statinfo = os.stat(self.filename)
			self.lastmodified=statinfo.st_mtime

			pass
	def selected(self,val):
		if self.filename.find('UnTitled')!=-1:
			msgbox(self.window1, "Plase Save Project", 'WiredGTK')
			return
		self.selectedFunc(val)
		pass

	def Currentline(self):
		return self.editor[1].Currentline()
	def checkPythonScript(self):
		s=self.editor[1].Text#self.textview1W.Text
		flag=False
		line=0
		lines=[]
		offsets=[]
		strs=''
		cnt=0
		for i,a in enumerate(s):

			if a == '\n':
				flag=True
				line+=1
				cnt=0

			if flag==True and a==' ':
				if s[:-1]=='\n':
					strs+=a
				cnt+=1
				lines.append(i)
				#buffers=self.textview1.get_buffer()
				#buffers.delete(buffers.get_iter_at_offset(i),buffers.get_iter_at_offset(i+1))
				#buffers.insert_at_cursor('\t')
				if cnt==4:
					cnt=0
					strs+='\t'
			else:
				strs+=a
			if a.isidentifier():
				flag=False

		if len(lines)!=0:
			self.editor[1].Text=strs#self.textview1W.Text=strs
			buffers=self.editor[1].get_buffer()#self.textview1.get_buffer()
			buffers.place_cursor(buffers.get_iter_at_offset(lines[0]+1))
			#buffers=self.textview1.get_buffer()
			#self.colorize();self.colorComment() 
			#print (lines)
		return lines		
	def textview1_key_release_event_cb(self,*args):
		#print ("R",args[1].get_keycode(),args[1].get_keyval())
		#srcbrowser=SrcBrowser(self.editor[1].Text) #srcBrowser(self.textview1W.Text)
		def getavailableWord(src,target):
			ret=[]
			for a in src:
				try:
					if a[0:len(target):].lower()==target.lower():
						ret.append(a)
				except:
					a=a
			return ret		
		if args[1].get_keycode()[1]==13 or args[1].get_keycode()[1]==ord(' '):
			self.tmrRefreshTab=True

		if args[1].get_keycode()[1]==27:
			self.intel.usercontrol.Visible=False
		def findline(x):
			#print(x)
			linecnt=self.Currentline()
			f=0
			for i,a in enumerate(self.code):
				if a=="\n":
					f+=1
					if f==linecnt:
						break
			p=pythonCode("",self.code[i:])

			lineno=p.getLineNumber(x)

			#self.showWINGIDE(self.filename,lineno)		
			refreshGTK()
			refreshGTK()
			self.editor[1].SetFocus()
			for a in range(5):
				refreshGTK()
				delay(100)
				if lineno!=-1:
					self.scrollto(lineno+linecnt-1)
		def findpos(x):
			#print(x)
			buffers=self.editor[1].get_buffer()#self.textview1.get_buffer()
			cursor=buffers.get_property('cursor-position')
			f=0
			self.code=self.editor[1].Text
			pos=self.code[cursor+1:].find(x)
			#print(pos)	
			refreshGTK()
			refreshGTK()
			self.editor[1].SetFocus()
			if pos==-1:
				self.MsgBox=MsgBox.Handler(None)
				ret=self.MsgBox.Display("Find","'" + self.findstring + "' Not Found!!!" ,button=["OK"])
				return
			for a in range(5):
				refreshGTK()
				delay(100)
				if pos!=-1:
					self.scrolltopos(cursor+pos+1)					
		for a in self._findagain:
			if (args[1].get_keycode()[1]==a[0] and args[1].get_keyval()[1]==a[1]):
				try:
					findpos(self.findstring)	
				except:
					a=0
				break	
		def targetobject(s):
			'''
			example 
			s="self.rocky.donna" 
			return ("self.rocky","donna")
		
			s="self_rocky_donna"
			return ("")
			'''
			ret=[]	
			for i,a in enumerate(s[::-1]):
				if a==".":
					ret=[s[0:len(s)-i-1],s[len(s)-i:]]
					break
			return ret
		def dirobject(fnd,___s):
			ret=[]
			try:
				import numpy as np
				t=eval(___s)
			except:
				return [] 
			for a in dir(t):
				if len(a)>=len(fnd) and a.lower()[0:len(fnd)]==fnd.lower()[0:len(fnd)]:
					ret.append(___s+"."+a)
			return ret			
		if self.findtriggered:
			import MsgBox
			try:
				s=self.findstring
			except:
				self.findstring=""
			self.MsgBox=MsgBox.Handler(None)
			ret=self.MsgBox.Display("Find",self.findstring ,button=["OK"])
			findpos(ret[1])
			self.findstring=ret[1]
			self.findtriggered=False
		if self.helptriggered:   
			#self.helptriggered=False     
			self.fixed1.remove(self.intel._usercontrol)
			self.fixed1.put(self.intel._usercontrol,0,0)
			xy=self.editor[1].cursorTopLeft()
			self.intel.usercontrol.Top=xy[1]+10
			self.intel.usercontrol.Left=xy[0]
			self.intel.usercontrol.Visible=True
			self.textview_current_str_ptr= self.ShowTypedWord(True)
			#lst=srcbrowser.GetMember(self.textview_current_str_ptr[1])#srcbrowser.getVarOrRotOrClass( self.textview_current_str_ptr[1])
			if len(self.lstprev)==0:
				lst=[]
				for a in self.lstpreloaded:
					lst.append(a)

				wta_module=self.filename
				#_myAST=myAST()
				#_myAST.parse(wta_module,code=self.editor[1].Text)
				if FileExist(wta_module):
					ret=ASTFile(wta_module,code=self.editor[1].Text)
					for a in ret:
						if type(a)==str:
							lst.append(a)

						else:
							for b in a[1]:
								if a[0]=='Handler':
									heads='self.'
								else:
									heads=a[0]+'.'
								b=b.replace('self,','').replace('self','')
								lst.append(heads+b)
								#self.editor[1].populate2(a[1])

					#lst.extend(ret)
				if self.textview_current_str_ptr[0]!='.':
					x=self.editor[1].Object().TextView1.obj.get_buffer()
					pos=x.get_property('cursor-position')
					y=x.get_iter_at_offset( pos).get_line()+1
					z=x.get_iter_at_offset( pos)
					x=z.get_line_offset()	
					script=jedi.Script(self.editor[1].Text)
					suggest=script.complete(y, x)
					for sug in suggest:
						lst.append(sug.name)
					lst.extend(['usercontrol','self.window.Text','Text','self','window','str','int','float','type','print','if','else','return',"while",'while','for','elif','break','continue','def','class','exec','eval','__init__','except',
					            'pass','try','except','True','False'])
				#else:
					#lst=[]


				for a in self.addedobj.lst:
					if a.Tag=='Activex' and self.textview_current_str_ptr[0].find('self.' + a.Name+".")!=-1:
						fname=GetPath(self.filename)+'/'+ a.types+'.py'
						if FileExist(fname):
							_myAST=myAST()
							_myAST.parse(fname)
							b=_myAST.getClass('Handler',"")
							#srcbrowser=SrcBrowser(GetFileStr(fname)) #srcBrowser(self.textview1W.Text)
							#for b in srcbrowser.obj:
								#if b[0][0]=='Handler':
									#for c in b[1]:
										##print(c[0])
										#if (c[0] in ['unload','loop','create','connect','__init__','Text','Widget','activeXcreated','Hide','Show','GTKForms'])==False:
											#lst.append('self.' + a.Name+"."+c[0]+c[1].replace('self,','').replace('self',''))
							#b=myinspect.InspectModuleUser(fname).AvailableMethod()
							#for c in b:
							#	lst.append('self.' + a.Name+"."+c[0]+c[1].replace('self,','').replace('self',''))
							for c in b:
								lst.append('self.' + a.Name+"."+c)						
					if self.textview_current_str_ptr[0].find('self.')!=-1:
						lst.append('self.'+"_"+a.Name)
						lst.append('self.'+a.Name)
					if self.textview_current_str_ptr[0].find('self.' + a.Name+".")!=-1 and (a.types in ["Button","Label","Entry","TextView","SourceView","Calendar","ComboBoxText","Image","SpinButton"
					                                                                                    ,"CheckButton","HScrollbar","VScrollbar","Switch","Layout","Frame","Viewport","DrawingArea","EventBox"
					                                                                                ,"TreeView","ScrolledWindow"]):
						b=dir(forms)
						for c in b:
							if c[0]!="_":
								lst.append('self.' + a.Name+"."+c)      

				nword=self.textview_current_str_ptr[0]
				print(nword)
				target=targetobject(nword)
				if len(target)==2:
					lst=lst+dirobject(target[1], target[0])
				if nword.find('cv2.')!=-1:
					lst=lst+self.lstpreloadedcv2
				self.lstprev=deepcopy(lst) 
			else:
				lst=deepcopy(self.lstprev)
			nword=self.textview_current_str_ptr[0]	
			lst=getavailableWord(lst,nword)	
			if len(lst)==0:
				self.helptriggered=False
			if len(lst)!=0:
				self.intel.ShowIntellisense(lst)                
			else:
				self.intel.usercontrol.Visible=False
		self.prop.keyDebug(args[0],args[1])
		

	def textview1_paste_clipboard_cb(self,*args):
		self.pasteDetect=True
	def textview1_key_press_event_cb(self,*args):

		buffers=self.editor[1].get_buffer()#self.textview1.get_buffer()
		self.prevcursor=buffers.get_property('cursor-position')
		self.currlinepos=buffers.get_iter_at_offset( self.prevcursor).get_line()
		if self.currlinepos!=self.currlineposprev:
			self.helptriggered=False
		self.currlineposprev=self.currlinepos
		#print(self.prevcursor,"hhh")
		#buffers.place_cursor(buffers.get_iter_at_offset(10))  
		#print ("P",args[1].get_keycode(),args[1].get_keyval())  
		for a in self._parsekey:
			if a.Poll(chr(args[1].get_keycode()[1])):
				self.helptriggered=True   
				self.lstprev=[] 				
				break
		for a in self._parsefind:
			if a.Poll(chr(args[1].get_keycode()[1])):
				self.findtriggered=True 	
				break
		#if self.parsefind.Poll(chr(args[1].get_keycode()[1])) or self.parsefindWin.Poll(chr(args[1].get_keycode()[1])):
		#	self.findtriggered=True 
		#if self.parsekey.Poll(chr(args[1].get_keycode()[1])) or self.parsekeyWin.Poll(chr(args[1].get_keycode()[1])):
		#	self.helptriggered=True   
		#	self.lstprev=[] 	 
		pass
	def RemoveDeletedInAddedObj(self):
		buf=[]
		for a in self.deleted:
			if self.addedobj.NameExist(a)==True:
				buf.append(a)
		for b in buf:
			self.deleted.remove(b)
	def SortAddedObjByParentFirst(self):
		parent=[]
		child=[]
		buf=[]
		for a in self.addedobj.lst:
			if a.HasParent()==False:
				parent.append(a)
			else:
				child.append(a)
		self.addedobj.lst=[]                
		for a in parent:
			self.addedobj.lst.append(a)
		for a in child:
			self.addedobj.lst.append(a)                        
	def textview1_move_cursor_cb(self,*args):
		#print("x")
		pass

	def ShowTypedWord(self,allchar=False):
		def GetWord(offset,stopAt,forward=False):
			self_code=self.editor[1].Text#self.textview1W.Text
			if forward==False:
				while(offset!=-1):
					if self_code[offset] in stopAt:
						break
					offset-=1
				return offset+1
			else:
				ends=len(self_code)
				while(offset!=ends):
					if self_code[offset] in stopAt:
						break
					offset+=1
				return offset    

		buffers=self.editor[1].get_buffer()#self.textview1.get_buffer()
		offset = buffers.props.cursor_position-1
		#print (offset)
		if offset==0:
			buffers.place_cursor(buffers.get_iter_at_offset(10))
		ST=' \t\r\n`~!@#$%^&*()-=+[]{}|\'\";:/.,?><'
		if allchar:
			ST=ST.replace('.','')
		startAt=GetWord(offset, stopAt=ST,forward=False)
		endAt=GetWord(offset, stopAt=ST,forward=True)
		strs=buffers.get_text(buffers.get_iter_at_offset(startAt),buffers.get_iter_at_offset(endAt),False)
		return strs,startAt,endAt       
	def removeAllTag(self):
		a=self.editor[1].Object()
		if a==None:return		
		buffers=self.editor[1].get_buffer()#self.textview1.get_buffer()

		self.tagnormal=a.tagnormal
		self.tagy=a.tagy

		if self.tag_sel_lst:
			for a in self.tag_sel_lst:
				buffers.remove_tag(self.tagnormal,a[0],a[1])
				buffers=self.editor[1].get_buffer()
				buffers.remove_tag(self.tagy,a[0],a[1])
				buffers=self.editor[1].get_buffer()
				buffers.apply_tag(self.tagnormal,a[0],a[1])
				buffers=self.editor[1].get_buffer()
			self.tag_sel_lst=[]      
	def textview1_button_release_event_cb(self,*args):
		self.textview1_button_press_event_cb(None)
		pass			
	def textview1_button_press_event_cb(self,*args):
		self.intel.usercontrol.Visible=False
		buffers=self.editor[1].get_buffer()#self.textview1.get_buffer()
		sel=buffers.get_selection_bounds()
		self.removeAllTag()
		if len(sel)!=0 :
			buffers=self.editor[1].get_buffer()#update buffer
			sel_string=buffers.get_text(sel[0],sel[1],False)
			#sel_string2,_,_=self.ShowTypedWord(True)
			#if sel_string2[0].isidentifier():
			#	sel_string=sel_string2

			if self.sel_string!=sel_string:# and sel_string!=' ':
				self.colorizeSelection([sel_string])
				self.findstring=sel_string
				#print(sel_string)
				#self.sel_string=sel_string
		#else:                
			#self.sel_string=""        
	def isAllWinClose(self):
		for a in self.win:
			if a.get_visible()==True:
				return False
		return True
	def unload(self):
		self.unloadNow=True
		GLib.source_remove(self.timeout_id)
		self.window1.hide()
		del self.window1

	def loop(self, user_data):
		if self.form_load==False:
			self.form_load=True
			self.parse=Parser("WTA","\r",1)
		#        Serial.begin(9600)#enable serial comm
		if self.sch.Event():#timer routine
			if FileExist(self.filename):
				statinfo = os.stat(self.filename)
				if self.lastmodified!=statinfo.st_mtime:
					self.lastmodified=statinfo.st_mtime 
					if self.hassavedWiredGTK==False:
						self.code=GetFileStr(self.filename)
						self.editor[1].Text=self.code #self.textview1W.Text=self.code
						self.prop.CloseSource()

				if self.hassavedWiredGTK==True:
					self.hassavedWiredGTK=False

			if self.tmrRefreshTab==True:
				refreshGTK()
				#self.editor[1].Colorize()
				self.tmrRefreshTab=False
			if self.pasteDetect==True:
				refreshGTK()
				self.checkPythonScript()
				self.editor[1].Colorize()
				self.pasteDetect=False				
			self.sch.Start()
		return True	#return true so that main_loop can call it again                        

	def window1_show(self):
		self.window1.show_all()
	def button1_motion_notify_event_cb(self,*args):
		event=args[1]
		#print event.get_button()[1]
		if self.mycontrol!=None and event.get_button()[1] == 0:
			self.mycontrol.Dragging(event,self.addedobj)
	def TopLeft(self,obj):#get top and left with parent position
		top=0;left=0
		breakifnoparent=obj
		while(1):
			if breakifnoparent is not None:
				top+=int(breakifnoparent.Top)
				left+=int(breakifnoparent.Left)
			if breakifnoparent is None:
				break
			breakifnoparent=breakifnoparent.parent       
		return top,left        
	def button1_button_press_event_cb(self,*args):
		self.prop.showcutpaste(True)

		if args[1].button != 1:
			return
		if self.multiple_select==False or self.mycontrol==None:	
			#self.DeselectAll()
			self.addedobj.DeselectAll()
			self.mycontrol=Drag()
		obj=self.addedobj.getObjectFomUserControl(args[2])
		self.mycontrol.addObject(obj)
		obj.updated=True
		if args[1].button == 1:
			#for a in self.obj:
			#	if a.Widget()==args[2]:
			#		a.Selected(True)
			self.addedobj.Select(args[2])
			self.mycontrol.MemorizeClick(args[1])
			self.intel.usercontrol.Visible=False
			#import pdb;pdb.set_trace()

		else:
			return                                  #right click  



		if Gdk.EventType._2BUTTON_PRESS==args[1].type:
			#self.popover = Gtk.Popover()
			#vbox = Gtk.Box(orientation=Gtk.Orientation.VERTICAL)
			#vbox.pack_start(Gtk.ModelButton("Item 1"), False, True, 10)
			#vbox.pack_start(Gtk.Label("Item 2"), False, True, 10)
			#self.popover.add(vbox)
			#self.popover.set_position(Gtk.PositionType.BOTTOM)                        
			#self.popover.set_relative_to(widget)
			#self.popover.show_all()
			#self.popover.popup()
			self.lastselected=obj
			breakifnoparent=self.lastselected
			parents=None
			while(1):
				if breakifnoparent is not None:
					lastselected=breakifnoparent
				if breakifnoparent is None:
					break
				breakifnoparent=breakifnoparent.parent
			lastselected=self.lastselected                         #right click  
			self.fixed1.remove(self.intel._usercontrol)
			self.fixed1.put(self.intel._usercontrol,0,0)

			xx=self.scrolledwindow3.get_vadjustment()
			top=self.TopLeft(self.lastselected)[0]-xx.get_property('value')
			#self.intel.usercontrol.Top=top
			self.intel.usercontrol.Top=top+args[1].get_coords()[1]

			yy=self.scrolledwindow3.get_hadjustment()
			Left=self.TopLeft(self.lastselected)[1]-yy.get_property('value')
			self.intel.usercontrol.Left=Left			
			#print(yy.get_property('value'),xx.get_property('value'),args[1].get_coords())
			#self.intel.usercontrol.Left=Left+float(lastselected.Width)
			self.intel.usercontrol.Left=Left+args[1].get_coords()[0]
			self.intel.usercontrol.Visible=True
			gtkclass=self.gtkClass.Object(lastselected.types)
			if self.multiple_select==False:
				self.button3.grab_focus()                        
			if len(gtkclass.events)==0:#Zero events exit now
				self.intel.usercontrol.Visible=False
				return
			lastselectedEventLst=[a[0] for a in self.lastselected.event]
			self.intel.ShowIntellisense(gtkclass.events,None,lastselectedEventLst)
			self.prop.showcutpaste(False)
			#self.ShowEventSelected(args[0],obj)
		if Gdk.EventType.BUTTON_PRESS==args[1].type:
			self.prop.cboObject_disable_event=True
			self.prop.cboObject.Text=obj.Name
			self.prop.cboObject_disable_event=False
			self.updateProperties(obj.types)
			self.prop.OnTop(True)
			self.prop.SetCurrentForm(self)
			self.lastselectedflag=True
			#self.prop.cboObject.Text=obj.Name#covid19 days

	def RefreshDatagrid(self,nameofobject,blink=False):
		addedobj=None
		for i,a in enumerate(self.addedobj.lst):
			if nameofobject==a.Name:
				addedobj=self.addedobj.lst[i]
		if addedobj==None:return        
		propertiesX=deepcopy(properties)
		activexProperty=self.gtkClass.Object(addedobj.types)

		self.addedobj.DeselectAll()
		self.mycontrol=Drag()

		#if self.multiple_select==False:
		#        self.mycontrol.addObject(addedobj)       
		#        self.addedobj.Select(addedobj)

		for a in activexProperty.properties:
			propertiesX.append(a)                
		self.prop.Property=addedobj,self.addedobj,self.gtkClass.Object(addedobj.types),propertiesX
		self.prop.OnTop(True)
		self.prop.SetCurrentForm(self)
		self.lastselectedflag=True

		#if blink:
		#        addedobj.widget.Selected=True
		#if blink:
			#for a in range(3):
				#addedobj.widget.realcontrolW.Visible=False
				#forms(addedobj.widget.Widget()).Visible=False
				#delay(100)
				#refreshGTK()
				#addedobj.widget.realcontrolW.Visible=True
				#forms(addedobj.widget.Widget()).Visible=True
				#delay(100)
				#refreshGTK()

	def showLineInCode(self,lineno):
		try:
			lineno=int(lineno)
			if lineno>0:lineno-=1
			self.sourceVisible(True)
			refreshGTK()
			refreshGTK()
			refreshGTK()
			if lineno!=-1:
				self.scrollto(lineno)


			self.mycontrol=None
		except:
			self.sourceVisible(False)
			lineno=lineno
	def scrollto(self,lineno):
		x=self.editor[1].get_buffer()
		l=x.get_iter_at_line(lineno)
		x.place_cursor(l)
		refreshGTK()		
		self.editor[1].SetFocus()

		#mark=x.create_mark(None,l,True)
		tv=self.editor[1].get_textview()
		#tv.scroll_mark_onscreen(mark)
		tv.scroll_to_iter(x.get_iter_at_line(lineno),0, True, 0, 0)
		#x.delete_mark(mark)
	def scrolltopos(self,pos):
		x=self.editor[1].get_buffer()
		l=x.get_iter_at_offset(pos)
		x.place_cursor(l)
		refreshGTK()		
		self.editor[1].SetFocus()

		#mark=x.create_mark(None,l,True)
		tv=self.editor[1].get_textview()
		#tv.scroll_mark_onscreen(mark)
		tv.scroll_to_iter(x.get_iter_at_offset(pos),0, True, 0, 0)
		#x.delete_mark(mark)
	def ShowEventSelected(self,obj,event):
		if self.code=="":
			if self.filename.find('UnTitled')==-1:
				self.code=GetFileStr(self.filename)

			#print "save code first"
			self.prop.btnSaveAs_clicked(None)


		if self.filename.find('UnTitled')!=-1:
			return
		self.sourceVisible(True)
		#refreshGTK()
		self.SortAddedObjByParentFirst()
		self.RemoveDeletedInAddedObj()
		g=generateCode(self.filename,self.code,self.lastevent)
		g.Generate(self.addedobj,self.deleted,self.gtkClass,self.plugin,self) 
		self.hassavedWiredGTK=True
		self.lastevent=''
		self.deleted=[]
		strs=GetFileStr(self.filename)
		self.code=strs
		x=pythonCode("",self.code)
		if obj!=None:
			findthis="def " + obj.Name + "_"  + event.replace('-',"_")
		else:
			findthis="class " + event




		y,t=x.getRoutinCode(findthis)
		#self.textview1W.Text=strs
		self.editor[1].OpenTab(self.filename)
		
		self.editor[1].ScrolledWindowCode().Height=(self.prop.Entry1.Top-self.editor[1].ScrolledWindowCode().Top)-140
		forms(self.editor[1].ScrolledWindowCode().get_parent()).Height=self.editor[1].ScrolledWindowCode().Height+70
		forms(self.editor[1].ScrolledWindowCode().get_parent().get_parent()).Height=self.editor[1].ScrolledWindowCode().Height+70
		self.editor[1].Text=strs
		
		self.checkPythonScript()
		#self.colorize();self.colorComment() 
		self.prop.OnTop(False)
		p=pythonCode("",strs)

		lineno=p.getLineNumber(findthis)

		#self.showWINGIDE(self.filename,lineno)		
		refreshGTK()
		refreshGTK()
		self.editor[1].SetFocus()
		for a in range(5):
			refreshGTK()
			delay(100)
			if lineno!=-1:
				self.scrollto(lineno)




		self.mycontrol=None#prevent draging of control when hiding the code editor   
		
		refreshGTK()
		a=0                        
	def colorizeSelection(self,reservelst):
		self.tag_sel_lst=[]
		for reserved in reservelst:
			stprev=0
			st=0          
			x=self.editor[1].get_buffer()#self.textview1.get_buffer()
			self.code=self.editor[1].Text
			while(1):
				t0=self.code[st:].find(reserved)
				t1=t0+len(reserved)
				if t0!=-1:
					st=t1+stprev+1
				else:
					break
				siter=x.get_iter_at_offset(t0+stprev)
				eiter= x.get_iter_at_offset(t1+stprev)
				x.remove_tag(self.tagnormal,siter,eiter)
				x.apply_tag(self.tagy,siter ,eiter)
				self.tag_sel_lst.append([ siter, eiter])
				stprev=st   
	def btnShowWingIDE(self,lineno):
		self.showWINGIDE(self.filename,lineno)
	def DeselectAll(self):
		for a in self.obj:
			a.Selected(False)		
	def button32_clicked_cb(self,*args):
		self.CreateControl("TextBox")	
	def button3_clicked_cb(self,*args):
		#if self.hasFilename==False:
		#	self.btncode_clicked_cb(None)
		if self.gtkcodeflag==False:
			self.ShowAddedWidget(False)
			return
		self.btncode_clicked_cb(None)
		if self.hasFilename==False:return
		widg=args[0]
		#print("asdasd:",forms(widg).Text)
		if forms(widg).Text=='Multi Selection':
			self.multiple_select=True
			return 
		types=widg.get_tooltip_text()
		self.CreateControl(types)    

		#if type(widg)==Gtk.EventBox:
			#types=widg.get_tooltip_text()
			#self.CreateControl(types)
		#else:
			#widgW=forms(widg)
			#self.CreateControl(widgW.Text)
		#self.SetOntop(self.layout1)
	def ActiveXEnable(self,value):
		self.ActiveXW.Enable=value
		pass
	def LoadusercontrolActivex(self):
		fnameGlade=dlgFile("Select python file",False,parent=self.window1,types=['*.py'])
		if type(fnameGlade)==int:
			return
		fnameGlade=fnameGlade.replace("\\","/")
		if self.filename==fnameGlade:
			msgbox(self.window1,"Same Name detected","WiredGTK")
			return
		err=True        
		if GetPath(self.filename)==GetPath(fnameGlade):
			name=GetFilenameNoEXT(fnameGlade)
			if len(name)>3:
				if name[:3]=="ctl":
					self.addgtkclassFromFile(fnameGlade)
					err=False



			#event='[]'
			#self.addGtkClass(name, event)
		if  err==True:
			msgbox(self.window1,"Usercontrol name must be prefix with 'ctl","WiredGTK")
			msgbox(self.window1,"Usercontrol directory must be inside main python code","WiredGTK")
		pass
	def addGtkClass(self,name,event):
		if name in self.gtkClass.Names():
			return
		else:
			x=GtkClass(name)
			x.Addevent('', '')
			self.gtkClass.gtkclass.append(x)
			self.createControl(name)
	#def checkActiveX(self,fname):
		##fname=self.plugin.Path(types+'.py')+'/'+types+'.py'
		#x=GetFileStr(fname)
		#a=SearchReplace(x)
		#xline,_=a.Search("def GTKForms")
		#xline=xline.replace('\n','\r')
		#xline=xline.split('\r') 
		#ret=[]
		#def getparam(*par):
			#return eval("%s,'%s'"%(par[0],par[1])) 
		#for a in xline:
			#if a.find('self.create')!=-1:
				#y=a[a.find('(')+1:-1]
				#strs="getparam(%s)" % (y)
				#p1,types=eval(strs)
				##print(p1['Tag'])
				#if p1['Tag']=='Activex':
					#ret.append(types)
		#return ret
	#def copyActivexDependency(self,fname):
		#ret=self.checkActiveX(fname)
		#for aaa in ret:
			#fname=self.plugin.Path(aaa+'.py')+'/'+aaa+'.py'
			#try:
				#copyfile(fname,os.path.join(GetPath(self.filename),aaa+'.py'))
				#copyfile(fname,os.path.join(GetPath(self.filename),aaa+'.png'))
			#except:
				#aaa=aaa	
				
	def CreateControl(self,types,_parent=None,_x=300,_y=50,_w=-1,_h=-1,_name="",event=None,controltype="",picture="",backcolor="(1,1,1,1)",forecolor="(0,0,0,1)",font='',enable='True',visible='True',text="",p1=None):

		x=_x;y=_y;
		if types=='Activex':
			self.addGtkClass(controltype,event)
			types=controltype
		if types=="Property":
			#x=GetFileStr('output/test.py')
			x=GetFileStr(self.filename)
			self.code=x
			def getparam(*par):
				p1=eval("%s"%(par[0]))
				_y=float(p1["Top"])
				_x=float(p1["Left"])
				_w=float(p1["Width"])
				_h=float(p1["Height"])
				p2=par[1]
				_name=p1["Name"]
				_event=par[3]
				if _event!='[]':
					_event=eval(_event)
				else:
					event=None
				if par[2]=='usercontrol':
					_parent=None
				else:
					_parent=self.addedobj.NameToObjectType(par[2])
					#_x=_x-_parent.Left
					#_y=_y-_parent.Top
				tag=p1['Tag']        
				p4=eval("%s"%(par[3]))
				self.addedobj.DeselectAll()
				pic=p1['Picture']   
				bkcolor=p1['BackColor']
				frcolor=p1['ForeColor']
				font=p1['Font']
				enable=p1['Enable']
				visible=p1['Visible']
				text=p1['Text']
				self.CreateControl(p2, _parent, _x, _y, _w, _h,_name,_event,tag,pic,bkcolor,frcolor,font,enable,visible,text,p1)
				self.fixed2_key_release_event_cb(None)

			xline=x
			xline=xline.replace('\n','\r')
			xline=xline.split('\r')        
			for a in xline:
				if a.find('self.create(')!=-1 and a.find('self.create')!=-1 :
					a=a.strip()
					y=a[a.find('(')+1:-1]            
					strs="getparam(%s)" % (y)
					eval(strs)                          

			return
		if types=="Generate":
			#self.addedobj.GeneratedCode()
			print("Code Generation Started")
			self.SortAddedObjByParentFirst()
			self.RemoveDeletedInAddedObj()
			g=generateCode(self.filename,self.code,self.lastevent)
			g.Generate(self.addedobj,self.deleted,self.gtkClass,self.plugin,self)
			self.lastevent=''
			self.deleted=[]
			print("Finish")
			return
		
		if types=="Button":
			butn=Gtk.Button()
			w,h=100,50
		if types=="ProgressBar":
			butn=Gtk.ProgressBar()
			w,h=100,30
		if types=="De-SelectWidget":
			self.fixed2_key_release_event_cb(None)
			return
		if types=="Calendar":
			#butn=Gtk.ComboBoxText()			
			butn=Gtk.Calendar()
			w,h=180,140
		if types=="TreeView":
			#butn=Gtk.ComboBoxText()			
			butn=Gtk.TreeView()
			w,h=180,140			
		if types=="ComboBoxText":
			butn=Gtk.ComboBoxText()			
			w,h=100,25			
		if types=="SpinButton":
			butn=Gtk.SpinButton()			
			w,h=130,30			
		if types=="CheckButton":
			butn=Gtk.CheckButton()			
			w,h=80,30
		if types=="RadioButton":
			butn=Gtk.RadioButton(None,text)			
			w,h=80,30			
		if types=="Image":
			butn=Gtk.Image()			
			w,h=100,50				
		if types=="RadioButton":
			butn=Gtk.RadioButton()			
			w,h=80,30			
		if types=="Label":
			butn=Gtk.Label()			
			w,h=100,30	
		if types=="LinkButton":
			butn=Gtk.LinkButton()			
			w,h=100,30				
		if types=="HScrollbar":
			butn=Gtk.HScrollbar()			
			w,h=150,20
		if types=="VScrollbar":
			butn=Gtk.VScrollbar()
			w,h=20,150
		if types=="Entry":
			butn=Gtk.Entry()
			butn.set_width_chars(1)
			w,h=170,30	
		if types=="TextView":
			butn=Gtk.TextView()
			w,h=170,100	
		if types=="SourceView":
			butn=GtkSource.View() 
			w,h=170,100                        
		if types=="Switch":
			butn=Gtk.Switch()
			w,h=100,30	
		if types=="Layout":
			butn=Gtk.Image()#butn=Gtk.Layout()
			w,h=300,300	
		if types=="Viewport":
			butn=Gtk.Viewport()
			w,h=300,300	                        
		if types=="ScrolledWindow":
			butn=Gtk.Image()#butn=Gtk.ScrolledWindow()
			w,h=300,300	
		if types=="DrawingArea":
			butn=Gtk.Image()#butn=Gtk.DrawingArea()
			w,h=300,300
		if types=="EventBox":
			butn=Gtk.Image()
			w,h=30,30  
		if types=="Frame":
			butn=Gtk.Frame()
			w,h=300,300
		if types=="ListBox":
			butn=Gtk.Frame()
			w,h=300,300                        
		if types=="Notebook":
			butn=Gtk.Notebook()
			box = Gtk.VBox(False, 5)
			valign = Gtk.Alignment()
			box.pack_start(valign,0.5,0.25, 0)
			butn.append_page(box)
			butn.set_tab_label_text(box, "Name")			
			w,h=300,300			
		self.Tag=""   
		if types=="ActiveX":
			self.LoadusercontrolActivex()
			#exit after selection of usercontrol
			return              
		samefile=(types+".py")==GetFilename(self.filename)
		inexamples=self.filename.find('examples')!=-1 
		inplugin=self.filename.find('plugin')!=-1
		if FileExist(GetPath(self.filename)+"/"+types+".py")==True and inexamples==True:#covid19 march 27 2020
			inexamples=False
		if self.plugin.Exist(types+'.py')==True and inexamples==True: 
			inexamples=False
		#inexamples=False
		if (FileExist(GetPath(self.filename)+"/"+types+".py")==True or self.plugin.Exist(types+'.py')==True) and inexamples==False and inplugin==False:
			#import sys,inspect
			#cmd_folder = os.path.realpath(os.path.abspath(os.path.split(inspect.getfile( inspect.currentframe() ))[0]))
			#if cmd_folder not in sys.path:
				#sys.path.insert(0, cmd_folder)                        
			#if GetPath(self.filename) not in sys.path:
				#sys.path.insert(0, GetPath(self.filename))    
			#exec 'import '+types in globals(), locals()
			#activeX=eval(types+".Handler()")
			#butn=activeX.Widget()
			butn=Gtk.Image()#butn=Gtk.Layout()
			w,h=30,30	
			self.Tag='Activex'
			types=types
			forms(butn).BackColor=.5,.5,.0,1
			if FileExist(GetPath(self.filename)+"/"+types+".py")==True:
				self.addgtkclassFromFile(GetPath(self.filename)+"/"+types+".py")
				butn.set_from_file(os.path.join('images/' , 'default.png')) 
			if self.plugin.Exist(types+'.py')==True:        
				self.addgtkclassFromFile(self.plugin.Path(types+'.py')+'/'+types+'.py')
				if FileExist(os.path.join(GetPath(self.filename),types+'.py'))==False: #FileExist(os.path.join(GetPath(self.filename),types+'.png'))==False:
					fname=self.plugin.Path(types+'.py')+'/'+types+'.py'
					if GetPath(self.filename).find('examples')==-1:
						copyfile(fname,os.path.join(GetPath(self.filename),types+'.png'))
						#copy all activex inside this activex
						#self.copyActivexDependency(fname)
						#copy all activex inside this activex	
						picture= types+'.png'
						#fo = open(os.path.join(GetPath(self.filename),types+'.png'), "rb")
						#fo.close()				
		butnW=forms(butn)
		if types!="Calendar" and types!="VScrollbar" and types!="HScrollbar":
			butnW.Text=types
		#butnW.Dimension=x,y
		if _parent!=None or _w!=-1:
			w=_w;h=_h;                
		#but.set_sensitive(False)
		self.fixed2.put(butn,100,100)
		butn.show()
		forms(butn).Enable=False
		label=types

		but=widget.Handler(self.button1_button_press_event_cb,self.button1_button_release_event_cb,self.button1_motion_notify_event_cb,label,butn)
		#self.obj.append(but)

		parent=None
		if (self.addedobj.NumSelected()!=0 or _parent!=None):

			if _parent!=None:
				ret=[_parent]
			else:        
				ret=self.addedobj.SelectedType()
				ret=self.addedobj.SelectedLocation()

				ret=self.addedobj.SelectedObject()
				#if ret[0].HasParent():
					#x=ret[0].parent
					#ret=[]
					#ret.append(x)
			if  ret[0].types=="Layout" or ret[0].types=="ScrolledWindow" or ret[0].types=="Viewport"or ret[0].types=="Frame":
				parent=ret[0]	
				if _parent==None:
					ret=self.addedobj.SelectedLocation()
					if _name=="":
						x,y=ret[0] 
					else:
						x,y=_x,_y

				else:
					x,y=forms(parent.widget.Widget()).Location()
					x+=_x
					y+=_y
				ret=parent.widget.Dimension
				w1=ret[0];h1=ret[1];
				if ret[0]<=w:
					w1=w+20
				if ret[1]<=h:
					h1=h+20
				parent.widget.WidgetSetSize(w1,h1)

		obj=objectType(but,label,parent,"",p1)
		obj.Tag=self.Tag
		obj.Picture=picture

		dir_path = os.path.dirname(os.path.realpath(__file__))
		dir_proj=GetPath(self.filename)
		os.chdir(dir_proj)
		obj.widget.realcontrolW.Width=_w;obj.widget.realcontrolW.Height=_h;
		obj.widget.realcontrolW.LoadPicture=picture#(GetPath(self.filename) + '/' +  picture).replace('\\','/')
		os.chdir(dir_path)

		obj.ForeColor=forecolor
		obj.BackColor=backcolor
		#print (type(butn))
		if backcolor=='(1,1,1,1)' and type(butn)==gi.repository.Gtk.Image:
			xl=random.random()
			yl=random.random()
			if types!='Image':
				obj.BackColor=0,xl,yl,0.5			
				forms(butn).BackColor=obj.BackColor
		if types=='Button' and picture!='':
			obj.widget.realcontrol.set_always_show_image (True)
			obj.widget.realcontrolW.Text=""
			dir_path = os.path.dirname(os.path.realpath(__file__))
			dir_proj=GetPath(self.filename)
			os.chdir(dir_proj)
			butimg=Gtk.Image.new_from_file (picture)	
			os.chdir(dir_path)
			obj.widget.realcontrol.set_image(butimg)

		if p1!=None and 'Alignment' in p1:
			obj.Alignment=p1['Alignment']
			obj.widget.realcontrolW.Alignment=p1['Alignment']
		if p1!=None and 'Var' in p1:
			obj.Var=p1['Var']
			obj.widget.realcontrolW.Var=p1['Var']
		if p1!=None and 'Active' in p1:
			obj.Active=p1['Active']
			#obj.widget.realcontrolW.Var=p1['Active']
			
		obj.Font=font
		obj.Enable=enable
		obj.Visible=visible
		obj.Text=text
		if event!=None:
			ev=[a[0] for a in event]
			obj.Events=str(ev).replace("'",'')

		#assign Name
		
		existName=self.addedobj.NameExist(_name, None)
		#if existName==False and existName==None and _name!="":
		if existName==False and _name!="":
			obj.Name=_name
		else:
			for nameIndex in range(1,1000):
				tagetname=types+str(nameIndex)
				
				existName=self.addedobj.NameExist(tagetname, None)
				if existName==False or existName==None:
					#print(tagetname)
					obj.Name=tagetname
					break
		
		if obj.Tag=='Activex':
			if p1!=None:#from file not from widget click
				for a in self.gtkClass.Object(types).properties:
					if a in p1:
						#ifdef python3
						exec ("obj.%s='%s'" % (a,p1[a]))
						#exec "obj.%s='%s'" % (a,p1[a]) in globals(),locals()
			else:
				for a,aa in zip(self.gtkClass.Object(types).properties,self.gtkClass.Object(types).propertiesval):
					#ifdef python3
					exec ("obj.%s='%s'" % (a,aa))
					#exec "obj.%s='%s'" % (a,aa)in globals(),locals()
			obj.Tag=obj.Tag#code here for properties                        
		if parent!=None:
			parent.Children(obj)
		self.addedobj.AddItem(obj)
		but.WidgetSetSize(w,h)
		self.fixed2.put(but.Widget(),x,y)
		butnW.Move((x,y))
		if types!='VScrollbar' and types!='HScrollbar':
			forms(butn).Text=obj.Name
			forms(butn).Font=obj.Font
		if obj.Text=="" and p1==None:
			obj.Text=obj.Name
		if event!=None:
			for a in event:
				obj.event.append(a)
		obj.RefreshProperty()
		obj.widget.selected=True
		propertiesX=deepcopy(properties)                
		activexProperty=self.gtkClass.Object(obj.types)
		for a in activexProperty.properties:
			propertiesX.append(a)                
		self.prop.Property=obj,self.addedobj,self.gtkClass.Object(obj.types),propertiesX
		self.prop.grid.clickISR("")

		if self.paste==False:
			self.prop.PopulateObjectAdded()
			self.prop.cboObject.set_active(len(self.addedobj.lst)-1)

		#if len(self.addedobj.lst)==1:                        
		#        self.prop.Properties_button_press_event_cb(None)
		return obj
	def Paste(self):
		try:
			if len(self.prop.copy)==0:return
		except:
			return
		self.paste=True
		def getminxminy(self_copy):

			for i,a in enumerate(self_copy):
				x,y=forms(a.widget.Widget()).Location()
				if i==0:
					offsetx=x;offsety=y;
				else:
					if offsetx>=x :
						offsetx=x;
					if offsety>=y :
						offsety=y;
			return offsetx,offsety 
		if self.prop.copy==None:
			return                        
		offsetx,offsety =getminxminy(self.prop.copy)
		for a in self.prop.copy:
			x,y=forms(a.widget.Widget()).Location()
			w,h=forms(a.widget.Widget()).Dimension
			parent=self.CreateControl(a.types,None,x-offsetx,y-offsety,w,h,a.Name,None,a.Tag,a.Picture,a.BackColor,a.ForeColor,a.Font,a.Enable,a.Visible,a.Text)  
			if a.HasChildren():
				num=len(a.children)
				for bb in range(num):
					b=a.children[bb]
					xc,yc=b.widget.Location()

					w,h=forms(b.widget.Widget()).Dimension
					#offsetx,offsety =getminxminy(a.children[0:num])
					offsetx=x;offsety=y;
					self.CreateControl(b.types,parent,xc-offsetx,yc-offsety,w,h)    
		self.prop.PopulateObjectAdded()			
		self.paste=False
	def fixed2_button_press_event_cb(self,*args):
		if args[1].button != 1:
			return                
		if self.lastselectedflag==False:
			self.multiple_select=False
			self.addedobj.DeselectAll()  
			self.prop.showcutpaste(True)

			#print ("xaaxaxaxaxaxaxa")
			#self.intel.usercontrol.Visible=False

		self.lastselectedflag=False
		if self.multiple_select==False:
			self.button3.grab_focus()    
		if Gdk.EventType._2BUTTON_PRESS==args[1].type:
			if self.intel.usercontrol.Visible==False and self.editor[1].usercontrol.Visible==False:#self.layoutCodeW.Visible==False:#intelisense and code window are not visible
				#if len(self.addedobj.lst)!=0:
					#self.ShowEventSelected(None, "Handler")
					#self.prop.currentform.sourceVisible(True)
				if self.gtkcodeflag==False:
					self.prop.currentform.sourceVisible(True)					
					return
				self.ShowEventSelected(None, "Handler")
				self.prop.currentform.sourceVisible(True)
		if Gdk.EventType.BUTTON_PRESS==args[1].type and self.intel.usercontrol.Visible==True:
			self.intel.usercontrol.Visible=False                
		#if Gdk.EventType.BUTTON_PRESS==args[1].type:			
			#if self.intel.usercontrolW.Visible==True:
				#self.intel.usercontrolW.Visible=False					
	def fixed2_key_press_event_cb(self,*args):
		#print args[1].get_keyval(),args[1].get_keycode()
		CTRL=17
		DELETE=46
		COPY=67
		PASTE=86
		CUT=88#x

		if (args[1].get_keyval()[1]==120 or args[1].get_keyval()[1]==CUT) and args[1].get_keycode()[1]==CUT:
			self.prop.copy=self.addedobj.SelectedObject()
			self.addedobj.RemoveSelected(deleted=self.deleted)
		if args[1].get_keyval()[1]==65535 and args[1].get_keycode()[1]==DELETE:
			self.addedobj.RemoveSelected(deleted=self.deleted)
		if (args[1].get_keyval()[1]==99 or args[1].get_keyval()[1]==COPY) and args[1].get_keycode()[1]==COPY:
			#print("COPY")
			self.prop.copy=self.addedobj.SelectedObject()
		if (args[1].get_keyval()[1]==118 or args[1].get_keyval()[1]==PASTE) and args[1].get_keycode()[1]==PASTE:
			self.Paste()  

			print("PASTE")
		UP=38
		DOWN=40
		ENTER=13
		if self.intel.usercontrol.Visible ==True:
			if args[1].get_keycode()[1]==UP:
				self.intel.ScrollUp()
			if args[1].get_keycode()[1]==DOWN:
				self.intel.ScrollDown()                                
			if args[1].get_keycode()[1]==ENTER:
				self.selectedFunc()
		if args[1].get_keycode()[1]==DELETE:
			self.addedobj.RemoveSelected(deleted=self.deleted)                        
		if args[1].get_keycode()[1]==CTRL:
			self.multiple_select=True
		if args[1].get_keycode()[1]==27:        
			self.intel.usercontrol.Visible=False

		self.prop.PopulateObjectAdded()
		self.prop.cboObject.set_active(len(self.addedobj.lst)-1)                        
		pass
	def SetOntop(self,widget):
		wid=forms(widget)
		xx=wid.Left
		yy=wid.Top
		parent=widget.get_parent()
		parent.remove(widget)
		parent.put(widget,xx,yy)                
	def toolbarVisible(self,x):
		self.layout1W.Visible=x
		self.SetOntop(self.layout1)
	def fixed2_key_release_event_cb(self,*args):
		#self.multiple_select=False
		#self.addedobj.DeselectAll()
		pass
	def updateProperties(self,obj_types):
		propertiesX=deepcopy(properties)
		if obj_types in ['Label','Entry']:
			propertiesX.append("Alignment")
		activexProperty=self.gtkClass.Object(obj_types)
		for a in activexProperty.properties:
			propertiesX.append(a)  
		propertiesX.sort()
		propertiesX.remove('Name')
		propertiesX.insert(0,'Name')
		self.prop.Property=self.addedobj.SelectedObject()[0],self.addedobj,self.gtkClass.Object(self.addedobj.SelectedObject()[0].types),propertiesX		
	def button1_button_release_event_cb(self,*args):
		self.prop.Update("")
		if self.multiple_select==False:
			self.mycontrol=None	
			if len(self.addedobj.SelectedObject())!=0:
				c=self.addedobj.SelectedObject()
				obj_types=c[0].types
				self.updateProperties(obj_types)
	def Widget(self):
		if self.fixed1 in self.window1.get_children():
			self.window1.remove(self.fixed1)
		return self.fixed1

	def WidgetSetSize(self,width,height):
		self.fixed1.set_size_request(width,height)
	def sourceVisible(self,sourceview):
		#if self.prop.helphasshown==False:
			#msgbox(self.window1, "Please use Wing IDE for code editor together with WiredGTK, \rdont forget frequently save projects in Wing before running your \rproject in WiredGTK", 'WiredGTK')
			#self.prop.helphasshown==True
		#self.layoutCodeW.Visible=sourceview
		self.editor[1].usercontrol.Visible=sourceview
		if sourceview:
			self.prop.clearbreak.Visible=True
		else:
			self.prop.clearbreak.Visible=False
		if self.hasFilename:
			self.editor[1].Activate(self.filename)
			self.editor[1].click(None)
		if sourceview==True:
			self.ShowAddedWidget(False)

		else:
			self.ShowAddedWidget(True)
			self.removeAllTag()
	def btnsaveas_cb(self):
		self.prop.btnSaveAs_clickedX(None)  
		if self.filename.find('UnTitled')!=-1:
			return
		if app_path()==GetPath(self.filename):
			return
		self.btncode_clicked_cb(None)
		#self.hasFilename=True
		#g=generateCode(self.filename,self.code,self.lastevent)
		#g.Generate(self.addedobj,self.deleted,self.gtkClass,self.plugin)
		#self.lastevent=''
		#self.deleted=[]
		#self.code=GetFileStr(self.filename)                        
	def btncode_clicked_cb(self,*args):
		self.filename=self.filename.replace('\\','/')
		if self.gtkcodeflag==False:
			self.editor[1].usercontrol.Visible=True
			self.code=self.editor[1].Text
			SaveFileStr(self.filename, self.code)
			return
		self.sourceVisible(False)
		if self.editor[1].Text: #if self.textview1W.Text!="":
			if self.filename.find('examples')==-1 and self.filename.find('plugin')==-1:
				SaveFileStr(self.filename, self.editor[1].Text)#(self.filename,self.textview1W.Text)
				self.code=GetFileStr(self.filename)
		if self.code=="":
			if self.filename.find('UnTitled')==-1:
				self.code=GetFileStr(self.filename)

			#print "save code first"
			self.prop.btnSaveAs_clickedX(None)  
		if self.filename.find('UnTitled')!=-1:
			return
		g=generateCode(self.filename,self.code,self.lastevent)
		g.Generate(self.addedobj,self.deleted,self.gtkClass,self.plugin,self)
		self.lastevent=''
		self.deleted=[]
		self.code=GetFileStr(self.filename)
		statinfo = os.stat(self.filename)
		self.lastmodified=statinfo.st_mtime                    
		self.hasFilename=True
		#x=self.textview1.get_buffer()
		#x.place_cursor(x.get_iter_at_line(100))
		#y=self.scrolledwindow1.get_property('vadjustment')
		#self.xxx+=1
		#y.set_value(self.xxx)
	def ShowAddedWidget(self,x):
		if len(self.addedobj.lst)!=0:
			for a in self.addedobj.lst:
				a.widget.realcontrolW.Visible=x
				forms(a.widget.Widget()).Visible=x
			self.layout1W.Enable=x   
			#self.prop.usercontrolW.Enable=x 
			self.prop.btnhighlight.Enable=x
			self.prop.cboObject.Enable=x
			self.prop.scrolledwindow1.Enable=x
if __name__ == "__main__":
	_mmm = Handler()
	_mmm.window1.show()
	Gtk.main()
