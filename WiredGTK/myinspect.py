import inspect
import copy
import os
import sys
from wired_module import *
class InspectModuleUser(object):#imported file not present in site-package
    def __init__(self,module):
        dir_proj=GetPath(module)
        sys.path.append(dir_proj)
        module=GetFilenameNoEXT(module)
        try:
            exec("import " + module)
        except:
            self.methods=[]
        
        self.module=module
        method=[]
        param=[]
        self.methods=[]

        if hasattr(eval(module), 'Handler'):
            for a in vars(eval(module+ '.Handler')):
                if a.find("__")==-1 and (a in ['activeXcreated','connect','Show','loop','Widget','create','Hide','unload','GTKForms'])==False:
                    method.append(a)
                    try:
                        param.append(inspect.signature(eval(module+".Handler."+a)).__str__())
                    except:
                        param.append("")                
        for a in range(len(method)):
            self.methods.append([method[a],param[a].__str__()])
        self.methods=sorted(self.methods)    
    def AvailableMethod(self):
        return self.methods
    def Print(self):
        for a in self.methods:
            print(a)   
        print('---------------------------------------------------------------------')    
class InspectModulesitepackage(object):#imported file within present in site-package
    def __init__(self,module):
        self.module=module
        try:
            exec("import " + module)
        except:
            self.methods=[]
        method=[]
        param=[]
        self.methods=[]
        for a in vars(eval(module)):
            if a.find("__")==-1:
                method.append(a)
                try:
                    b=eval(self.module+"."+a+'.__doc__')
                    if b!=None and b.find('(') !=-1:
                        b=getCSV(1, "(", b)
                        b=getCSV(0, ")", b)
                        param.append('('+b.replace('[','').replace(']','')+')')
                    else:
                        param.append('')
                except:
                    param.append('')
                    
        for a in range(len(method)):
            self.methods.append([method[a],param[a].__str__()])           
        self.methods=sorted(self.methods)     
    def AvailableMethod(self):
        return self.methods
    def Print(self):
        for a in self.methods:
            print(a)   
        print('---------------------------------------------------------------------')          
class InspectModule(object):#imported file within present in site-package
    def __init__(self,module):
        self.module=module
        try:
            exec("import " + module)
        except:
            self.methods=[]
        method=[]
        param=[]
        self.methods=[]
        for a in vars(eval(module)):
            if a.find("__")==-1:
                method.append(a)
                try:
                    param.append(inspect.signature(eval(self.module+"."+a)))
                except:
                    param.append("")
                    
        for a in range(len(method)):
            self.methods.append([method[a],param[a].__str__()])           
        self.methods=sorted(self.methods)     
    def AvailableMethod(self):
        return self.methods
    def Print(self):
        for a in self.methods:
            print(a)   
        print('---------------------------------------------------------------------')         
class StringMethod:
    def __init__(self):
        method=[]
        param=[]
        self.methods=[]
        for a in "".__dir__():
            if a.find("__")==-1 :
                method.append(a)
                #param.append(eval('"".' + a+ '.__doc__'))
                b=(eval('"".' + a+ '.__doc__'))
                if b.find("(")!=-1:
                    b=getCSV(1, "(", b)
                    b=getCSV(0, ")", b)
                else:
                    b=""    
                param.append('('+b+')')
                
        for a in range(len(method)):
            self.methods.append([method[a],param[a]])            
        self.methods=sorted(self.methods)     
    def AvailableMethod(self):
        return self.methods
    def Print(self):
        for a in self.methods:
            print(a)       
        print('---------------------------------------------------------------------')
          
class BuiltinMethod:#me problem pag call ng ibang py prog, asar..
    def __init__(self):
        import builtins
          
        method=[]
        param=[]
        self.methods=[]
        for a in dir(builtins):
            if a.find("__")==-1 :
                method.append(a)
                #param.append(eval('"".' + a+ '.__doc__'))
                try:
                    b=(eval('builtins.'+ a + '.__doc__'))
                    if b!=None and b.find('(') !=-1:
                        b=getCSV(1, "(", b)
                        b=getCSV(0, ")", b)
                        param.append('('+b+')')
                    else:
                        param.append('')
                except:
                    param.append('')
                #param.append('')
        for a in range(len(method)):
            self.methods.append([method[a],param[a]])            
        self.methods=sorted(self.methods)     
    def AvailableMethod(self):
        return self.methods
    def Print(self):
        for a in self.methods:
            print(a)       
        print('---------------------------------------------------------------------')        
if __name__ == "__main__":
    x=StringMethod()
    y=x.AvailableMethod()
    x.Print() 
    
    x=InspectModuleUser('C:\\Users\\samsung\\WiredGTK\\12_25_2018_0_56_7\\oscilloscopewta.py')
    y=x.AvailableMethod()
    x.Print()
    
    x=InspectModule("WiredGTK")
    y=x.AvailableMethod()
    x.Print()

    x=InspectModuleUser("WiredGTK")
    y=x.AvailableMethod()
    x.Print()
    
    x=InspectModulesitepackage("cv2")
    y=x.AvailableMethod()
    x.Print()
    
    x=StringMethod()
    y=x.AvailableMethod()
    x.Print()    
    
    x=BuiltinMethod()
    y=x.AvailableMethod()
    x.Print()        