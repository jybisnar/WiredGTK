#b4 running gladetopython. 
#1.under wing indention click [tabs only] click convert(wing convert /r to /n) 

import gi
import time
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk,GObject,Gdk,Pango,GLib
import subprocess
from shutil import copyfile
import sys
from wired_module import *
from dialog import *
import DataGrid
from copy import deepcopy


builder=None
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
class Handler(object):
    def __init__(self,*param):			
        initUI(self,param,w=400,h=400,title="MySQL DBBuilder",controlbox=True,startpos=(200,200),timeoutdestroy=-1)
        self.GTKForms()
        self.sch=Scheduler(500)#500 ms
        self.sch.Start()
        cdir=os.path.dirname(os.path.abspath(__file__))        
        os.chdir(cdir)        
        self.dbtype="sqllite"
    def unload(self,*args):
        destroy=True
        if destroy==True:
            GLib.source_remove(self.timeout_id)
            self._window.hide()
            del self._window
            ExitApplication() #activate this if u want to destroy this window
            return False
        else:
            self.window.Visible=False
            return True		
    def loop(self, user_data):
        if self.form_load==False:
            self.form_load=True
        if self.sch.Event():#timer routine
            #code here
            if self.timeoutdestroy!=-1:
                self.timeoutdestroy-=1
                if self.timeoutdestroy==0:
                    self.unload(None)
            self.sch.Start()#restart scheduler
        return True	#return true so that main_loop can call it again 
    def create(self,prop,control,parent,event=[]):
        createWidget(self,prop,control,parent,event)
    def GTKForms(self):
        self.create("{'Visible': 'True', 'Text': 'localhost', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,1)', 'Left': '130', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '170', 'Top': '52', 'Picture': '', 'Name': 'txthost', 'Events': '[]', 'ParentsType': ''}","Entry","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'username', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,1)', 'Left': '131', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '170', 'Top': '107', 'Picture': '', 'Name': 'txtuser', 'Events': '[]', 'ParentsType': ''}","Entry","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'wtarakster', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,1)', 'Left': '131', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '170', 'Top': '81', 'Picture': '', 'Name': 'txtdatabase', 'Events': '[]', 'ParentsType': ''}","Entry","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'password', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,1)', 'Left': '131', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '170', 'Top': '139', 'Picture': '', 'Name': 'txtpassword', 'Events': '[]', 'ParentsType': ''}","Entry","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': '3306', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,1)', 'Left': '132', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '170', 'Top': '170', 'Picture': '', 'Name': 'txtport', 'Events': '[]', 'ParentsType': ''}","Entry","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'host', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,0)', 'Left': '28', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '100', 'Top': '53', 'Picture': '', 'Name': 'Label1', 'Events': '[]', 'ParentsType': ''}","Label","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'port', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,0)', 'Left': '27', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '100', 'Top': '166', 'Picture': '', 'Name': 'Label2', 'Events': '[]', 'ParentsType': ''}","Label","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'password', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,0)', 'Left': '28', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '100', 'Top': '136', 'Picture': '', 'Name': 'Label3', 'Events': '[]', 'ParentsType': ''}","Label","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'user', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,0)', 'Left': '27', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '100', 'Top': '106', 'Picture': '', 'Name': 'Label4', 'Events': '[]', 'ParentsType': ''}","Label","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'database', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,0)', 'Left': '28', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '100', 'Top': '79', 'Picture': '', 'Name': 'Label5', 'Events': '[]', 'ParentsType': ''}","Label","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'MySQL Setting', 'Enable': 'True', 'Alignment': '', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,0)', 'Left': '98', 'ForeColor': '(0,0,0,1)', 'Height': '30', 'Width': '100', 'Top': '12', 'Picture': '', 'Name': 'Label6', 'Events': '[]', 'ParentsType': ''}","Label","usercontrol","[]")
        self.create("{'Visible': 'True', 'Text': 'Select File', 'Enable': 'True', 'Tag': '', 'Font': '', 'BackColor': '(1,1,1,1)', 'Left': '24', 'ForeColor': '(0,0,0,1)', 'Height': '50', 'Width': '100', 'Top': '215', 'Picture': '', 'Name': 'Button1', 'Events': '[]', 'ParentsType': ''}","Button","usercontrol","[['clicked', 'self,e']]")
        self.create("{'ParentsType': '', 'Name': 'Button2', 'Top': '215', 'Enable': 'True', 'Picture': '', 'Text': 'Test Connection', 'Font': '', 'Height': '50', 'Events': '[clicked]', 'Left': '172', 'BackColor': '(1,1,1,1)', 'Tag': '', 'ForeColor': '(0,0,0,1)', 'Width': '128', 'Visible': 'True'}","Button","usercontrol","[['clicked', 'self,e']]")
    def Widget(self):
        if self._usercontrol in self._mainlayout.get_children():
            self._mainlayout.remove(self._usercontrol)
        return self._usercontrol
    def Hide(self):
        self._window.hide()
    def Show(self,modal=False,x=None,y=None):
        if x!=None:
            self._window.move(x,y)
        self._window.set_modal(modal)
        self._window.show()
        Gtk.main()
        return ""#put ur return value here upon closing this form
    def Button1_clicked(self,e):
        fnameGlade=dlgFile("Select db file",types=['*.dbbuilder'])  
        if type(fnameGlade)==int:
            return
        if fnameGlade.find(".dbbuilder")==-1:
            msgbox(None, "Select '.dbbuilder' files", "Glade To Code") 
        else:	
                
            b=CreateFormsAndMysql(fnameGlade,_host=self.txthost.Text,_user=self.txtuser.Text,_db=self.txtdatabase.Text,_port=self.txtport.Text,_passwd= self.txtpassword.Text,dbtype=self.dbtype)
        
            b.Generate(self)
            msgbox(None, "Code Generation Finish, Click File Open in WiredGTK to run generated Forms", "Glade To Code")         
        pass
    def Button2_clicked(self,e):
        try:
            if self.dbtype=="sqllite":
                import sqlite3
                self.db = sqlite3.connect('database.db')
            if self.dbtype=="mysql":
                import MySQLdb
                self.db=MySQLdb.connect(host=self.txthost.Text,user=self.txtuser.Text,db=self.txtdatabase.Text,port=int(self.txtport.Text),passwd= self.txtpassword.Text)
            msgbox(None, "Connection Succeeded!", "MySQL Forms and db builder")         
        except:
            msgbox(None, "Connection Failed!", "MySQL Forms and db builder")         
        pass
    
        




def GotoRoutineEnd(src,start,contains,numtabs):
    parser=Parser(contains, '', 1)
    offset=0
    y=0
    for ptr,a in enumerate(src[start:]):
        if parser.DataReceived(a):
            break
        if a=='\r' or a=='\n':
            y=1
            continue
        if a=='\t' and y!=0:
            y+=1
            continue
        if y==numtabs+1 :
            if a!='\t':
                offset=ptr-2+start
                break
            else:
                y=0

    return offset
def appendInitOrMember(src,insert,memberName=None):     #if insert exist in src Handler just return with no src modification

   #p=ParserLangguage(sequence="self . win = [ ]")  
    #_,ctr=p.Parse(src)    
    fnd= "class Handler:"# + "\r"
    fnd_st1=src.find(fnd)
    fnd= '\t\tself.win=[]'
    fnd_st2=src.find(fnd,fnd_st1)
    len_fnd=fnd_st2-fnd_st1+len(fnd)

    ctr=src.find(fnd,fnd_st1)+len(fnd)#ctr=src.find(fnd)+len_fnd    
    if memberName==None:
        offset=GotoRoutineEnd(src, ctr, insert, 1)
        if offset!=0:                
            return src[:offset]+'\r'+insert+ src[offset:]        
        return src        
    else:    
        offset=GotoRoutineEnd(src, ctr, memberName, 0)
        if offset!=0:         
            offset+=1
            return src[:offset]+insert+ src[offset:]        
        return src
def is_number(s):
    try:
        float(s)
        return True
    except ValueError:
        return False
Usercontrol=False
IsUserControlFlag=0
def IsUserControl(name):
    global IsUserControlFlag
    if name=="window1":
        IsUserControlFlag=1
    if name=="layout1" and IsUserControlFlag==1:
        IsUserControlFlag=2
    if name=="usercontrol" and IsUserControlFlag==2:
        IsUserControlFlag=0
        return True
    return False

class GladeXml:
    def __init__(self,fnameGlade):
        self.strs=GetFileStr(fnameGlade)
        self.xmlhead=""
        self.xmlfoot=""
        if self.strs.find('?xml version')==-1:
            msgbox(None, "Error: File not valid Glade file!!!", "GladeCode Generator")     
        else:
            self.strs=self.strs.split('\n')
            self.xml=""
            fin=0
            for a in self.strs:
                if a.find("<child>")!=-1:
                    fin+=1
                    if fin==5:#a.glade
                        break
                    
                buf=a+"\n"    
                self.xmlhead+=buf    
            #self.xmlfoot="</object>\n</child>\n</object>\n</interface>"   
            self.xmlfoot="</object>\n</child>\n</object>\n</child>\n</object>\n</child>\n</object>\n</child>\n</object>\n</interface>\n"
        pass
    def xmlhead_body_foot(self):
        return self.xmlhead+ "<child>\n" + self.xml+self.xmlfoot
    def SetxmlValue(self,prop_name,val,get=False):
        if prop_name=="id" or prop_name.find("handler")!=-1 or prop_name=="value":
            obj=Parser(prop_name, "=",1)
        else:    
            prop_name="\"" + prop_name + "\"" 
            obj=Parser(prop_name, ">",1)
        str1=""
        str2=""
        found1=False
        found2=False
        value=""
        for i,c in enumerate(self.xml):
            if obj.DataReceived(c):
                found1=True
            if found1==False:
                str1+=c
            else:
                if c=="<" or (prop_name=="id" and c==">") or (prop_name=="value" and c=="/") or (prop_name.find("handler")!=-1 and c==" "):
                    found2=True
                
                    
            if found2:
                str2+=c
            else:
                if found1:
                    value+=c
        if get:
            return value[1:]
        if found2:
            if prop_name=="id" or prop_name.find("handler")!=-1 or prop_name=="value":
                val="=\""+val+"\""
            else:
                val=">"+str(val)
            self.xml= str1+str(val)+str2
        
         
            
    def set_Value(self,prop_name,value):
        self.SetxmlValue(prop_name,value,get=False)
    def get_Value(self,prop_name):
        return self.SetxmlValue(prop_name,None,get=True)        
            
    def Object(self,obj): 
        found=False
        xmlString=""
        for a in self.strs:
            if a.find(obj)!=-1:
                found=True
            if found:
                if a.find("</child>")!=-1:
                    break
                xmlString+=a+'\n'
        if found:
            self.xml = xmlString
        else:
            self.xml = "" 
    def xml_ToString(self):
        return "<child>\n"+self.xml+"</child>\n"
    def set_properties(self,prop):#set_properties([["x",100],["y",123],["id","lblraks"]])
        for a in prop:
            self.set_Value(a[0],a[1])     
class DbStructureX:
    def init(self):
        self.fields=""
        self.fieldstype=""
        self.notnull=""
        self.unique=""
        self.retribtbl=""
        self.retribtblfields=""
        self.ranges=""        
        self.required=""
        self.autonumber=""
        self.integer=""
        self.floating=""        
    def __init__(self,table):
        self.table=table
        self.init()
class DbStructure:
    def __init__(self):
        self.table=[]
        self.structure=[]
        
   
class CreateFormsAndMysql:
    def __init__(self,filename,_host,_user,_db,_port,_passwd,dbtype="sqllite"):
        self.filename=filename
        self.dbname=_db
        self.dbtype=dbtype
        try:
            if dbtype=="sqllite":
                import sqlite3
                x=GetPath(filename) + 'database.db'
                x=x.replace("\\","/")
                self.db = sqlite3.connect(x)
            if dbtype=="mysql":
                import MySQLdb
                self.db=MySQLdb.connect(host=_host,user=_user,passwd=_passwd,db=_db,port=int(_port))        
        except:
            filename=filename
        self.table=[]
        self.tables=[]
        self.sql=""
        self.sqlinserttable=""
        self.prevCommand=""  
        self.insertcode=""
        self.mydb=DbStructureX("")
                
    def generateMySql(self):
        if self.sql!="":
            self.sql=self.sql[:-1]+")"
            if self.mydb.fields!="":
                if self.mydb.autonumber!="":
                    addcomma=""
                    if self.sqlinserttable!="":
                        addcomma=","
                    self.sqlinserttable=self.sqlinserttable+addcomma + self.mydb.autonumber
                self.tables.append(deepcopy(self.mydb))            
                self.mydb.init()
            if len(self.tables):
                self.table.append(deepcopy(self.tables))
            self.tables=[]            
            
            print (self.sql)
            try:
                if self.sqlinserttable!="":
                    try:
                        DataGrid.ExecuteNonQuerry(self.db, "CREATE TABLE IF NOT EXISTS autonumber (ignores VARCHAR(255))")
                    except:
                        pass
                    try:                                            
                        #sql="ALTER TABLE autonumber ADD COLUMN " + self.sqlinserttable + " AFTER ignores"#mysql
                        sql="ALTER TABLE autonumber ADD COLUMN " + self.sqlinserttable #sqllite
                        DataGrid.ExecuteNonQuerry(self.db, sql)
                    except:
                        pass
                    self.sqlinserttable=""
                try:    
                    self.sql=self.sql.replace('TABLE','TABLE IF NOT EXISTS ')
                    DataGrid.ExecuteNonQuerry(self.db, self.sql)
                except:
                    self.sql=self.sql
            except:
                pass
            self.strs=""        
    def generateMySqlDB(self,strs):
        strs=strs.split("%")
        if strs[0]=="TABLE":
            
            if self.mydb.fields!="":
                self.tables.append(deepcopy(self.mydb))
                self.mydb.init()          
            self.mydb=DbStructureX(strs[1])
                  
                
            
            
            self.generateMySql()
            self.sql="CREATE TABLE " + strs[1] + "("
            
        if strs[0]=="FIELDS":
            
            if self.mydb.fields!="":
                if self.mydb.fields!="":
                    if self.mydb.autonumber!="":
                        addcomma=""
                        if self.sqlinserttable!="":
                            addcomma
                        self.sqlinserttable=self.sqlinserttable+addcomma + self.mydb.autonumber                
                self.tables.append(deepcopy(self.mydb))
                self.mydb.init()
            
            self.mydb.fields=strs[1]
            self.sql+=strs[1]
            self.prefields=strs[1]
        if strs[0]=="TYPE":
            if self.prevCommand=="FIELDS":
                self.sql+=' ' + strs[1] + ","
                self.mydb.fieldstype=strs[1]
        if strs[0]=="UNIQUE":
            self.mydb.unique='unique'
        if strs[0]=="AUTONUMBER":
            self.mydb.autonumber=self.prefields + '_'+ self.mydb.table +" varchar(255)"
            
        if strs[0]=="NOTNULL":
            self.mydb.notnull='notnull'            
        if strs[0]=="REQUIRED":
            self.mydb.required='required'  
        if strs[0]=="NUMBER":
            self.mydb.integer='integer'                                    
        if strs[0]=="FLOAT":
            self.mydb.floating='float'                  
            self.sql+=' ' + strs[1] + ","
            self.mydb.fieldstype='float'
        if strs[0]=="RANGE":
            self.mydb.ranges=strs[1]
        if strs[0]=="TBLNAME":
            self.mydb.retribtbl=strs[1]
            pass
        if strs[0]=="FIELDSNAME":
            self.mydb.retribtblfields=strs[1]
            pass        
        
        self.prevCommand=strs[0]    
    def Generate(self,parent):
        def IsUnique(table,a):
            try:
                ret = (table.unique[a])
            except:return ""
            return ret        
        def RetribTable(table,a):
            try:
                ret = (table.retribtbl[a])
            except:return ""
            return ret                
        #s=GetFileStr('db.txt')
        s=GetFileStr(self.filename)
        ss=s.split('\n')
        for a in ss:
            try:
                if a[0]!='\t':
                    aa=a.replace('\t','').lower() 
                    self.generateMySqlDB( "TABLE%"+aa)
                    continue
                for i,b in enumerate(a):
                    if b!='\t':
                        aa=a[i:]
                        if i==4:
                            
                            self.generateMySqlDB( "FIELDSNAME%"+aa)
                        if i==3:
                            
                            if prevtype=="RANGE":
                                self.generateMySqlDB( "RANGE%"+aa)
                            elif prevtype=="TBLNAME":
                                self.generateMySqlDB( "TBLNAME%"+aa)                                
                            else:
                                self.generateMySqlDB( "TBLNAME%"+aa)

                        if i==2:
                            
                            if aa=="RETRIBTABLE":
                                prevtype= "RETRIBTABLE"
                            elif aa=='UNIQUE':
                                self.generateMySqlDB( "UNIQUE%"+aa)
                            elif aa=='REQUIRED':
                                self.generateMySqlDB( "REQUIRED%"+aa)                                
                            elif aa=='RANGE':
                                prevtype= "RANGE"                             
                            elif aa=='NOTNULL':
                                self.generateMySqlDB( "NOTNULL%"+aa)
                            elif aa=='NUMBER':
                                self.generateMySqlDB( "NUMBER%"+aa)                                
                            elif aa=='FLOAT':
                                self.generateMySqlDB( "FLOAT%"+aa)                                
                            elif aa=='AUTONUMBER':
                                self.generateMySqlDB( "AUTONUMBER%"+aa)                                
                            else:
                                
                                self.generateMySqlDB( "TYPE%"+aa)                                
                                prevtype=""

                        if i==1:
                            self.generateMySqlDB( "FIELDS%"+aa)

                        break
                
            except:
                a=a
        self.generateMySql()        
        
        
        x=50
        y=50
        xdist=150
        ydist=30
        
        objlist=""
        b=GladeXml("a.glade")    
        for table in self.table:
            self.insertcode="\t\tself.datagrid.ExecuteNonQuerry(self.db,\"INSERT INTO `"+ table[0].table + "` "
            self.updatecode="self.datagrid.ExecuteNonQuerry(self.db,\"UPDATE `"+ table[0].table + "` SET "
            self.deletecode="self.datagrid.ExecuteNonQuerry(self.db,\"DELETE FROM `"+ table[0].table + "` "
            self.updatecode1=""
            self.updatecode2=""
            self.insertcode1="("
            self.insertcode2="("
            self.insertcode3="("
            self.populate="\t\t"
            self.integerlist=[]
            self.floatlist=[]            
            self.uniquelist=[]
            self.autonumber=[]
            self.notnulllist=[]
            
            
            if self.dbtype=='sqllite':
                self.datagridCode='\r\t\timport sqlite3\r'
                self.datagridCode+=    "\t\tself.db = sqlite3.connect('database.db')\r"
            if self.dbtype=='mysql':
                self.datagridCode='\r\t\timport MySQLdb\r'
                self.datagridCode+=    '\t\tself.db = MySQLdb.connect(host="'+parent.txthost.Text+'",user="'+parent.txtuser.Text+'",db="'+self.dbname+'",port=3306,passwd="'+parent.txtpassword.Text+'")\r'
            self.datagridCode+=    '\t\tself.datagrid.DataSource(self.db,"select * from ' +   table[0].table + ' limit 10")\r'
            self.datagridCode+=    '\t\timport DBUtils\r'
            self.datagridCode+=    '\t\tself.dbUtils=DBUtils.Initialize(self)\r' +'\r\t\t' + "self.dbUtils.PopulateCombo(self.cboSearch,\"\",'"+ table[0].table +"',RETFIELDS=True)\r"          

            wheresql=""
            wheresql2=""
            for i,a in enumerate(table):
                b.Object("GtkLabel")
                buf=a.fields +"_"+a.table
                uniqueSymbol=''     
                if a.unique!="":
                    uniqueSymbol='*'
                if a.notnull!="":
                    uniqueSymbol='~'                    
                if a.floating!="" or a.integer!="":
                    uniqueSymbol='(number)'                
                if a.required!="":
                    b.set_properties([["x",x],["label",a.fields+uniqueSymbol],["value","#e4e426262626"],["y",y+i*ydist],["id","lbl" + buf]])        
                else:
                    b.set_properties([["x",x],["label",a.fields+uniqueSymbol],["y",y+i*ydist],["id","lbl" + buf]])        
                ss=b.xml_ToString()
                if a.unique!='':
                    self.uniquelist.append([a.table,a.fields])
                if a.integer!='':
                    self.integerlist.append([a.table,a.fields])                    
                if a.floating!='':
                    self.floatlist.append([a.table,a.fields])                              
                if a.notnull!='':
                    self.notnulllist.append([a.table,a.fields])                    
                if a.autonumber!='':
                    self.autonumber.append([a.table,a.fields])  
                if buf.find("state")!=-1:#small letter only(so we can use State as GtkEntry) could be state,Defaultstate,Showstate etc..
                    b.Object("GtkCheckButton")
                    b.set_properties([["x",x+xdist],["text","Type Here"],["y",y+i*ydist],["id","txt"+buf]])                    
                else:
                    if a.retribtbl!="":
                        b.Object("GtkComboBoxText")
                        b.set_properties([["x",x+xdist],["y",y+i*ydist],["id","txt"+buf]])
                    else:
                        b.Object("GtkEntry")
                        b.set_properties([["x",x+xdist],["text","Type Here"],["y",y+i*ydist],["id","txt"+buf]])
            
                objlist=objlist+ ss + b.xml_ToString()
                buf=a.fields+ ","
                if i==0:
                    wheresql=a.fields+"='%s'"
                    wheresql2="self.txt"+a.fields+"_" + a.table+".Text"
                    deletewhere=a.fields+"='%s'"
                    
                self.updatecode1+=a.fields+"='%s',"
                self.insertcode1+=buf
                buf= "'%s',"
                self.insertcode2+=buf   
                if a.retribtbl!="":
                    buf= 'self.txt' + a.fields+"_"+a.table+ ".Text,"
                    self.populate+='self.dbUtils.PopulateCombo(self.txt'+ a.fields +"_"+a.table+',"'+ a.retribtblfields +'","'+ a.retribtbl+'");'
                else:
                    buf= 'self.txt' + a.fields+"_"+a.table+ ".Text,"
                
                self.insertcode3+=buf   
                currTable=a.table
                
            self.updatecode=self.updatecode+self.updatecode1[:-1]+" WHERE "  + wheresql +  "\" % "+self.insertcode3[:-1]+"," + wheresql2 + "))"  +'\r\t\tself.datagrid.DataSource(self.db,"select * from ' +   table[0].table + ' limit 10")'
            self.deletecode=self.deletecode+" WHERE " + deletewhere +  "\" % " + wheresql2 +")" +'\r\t\tself.datagrid.DataSource(self.db,"select * from ' +   table[0].table + ' limit 10")'
            self.insertcode1=self.insertcode1[:-1]+")"
            self.insertcode2=self.insertcode2[:-1]+")"
            self.insertcode3=self.insertcode3[:-1]+")"
            self.insertcode=self.insertcode+ self.insertcode1+ "VALUES" +self.insertcode2+ "\"%" +self.insertcode3 + ")"
            
            #DataGrid.ExecuteNonQuerry(self.db,"INSERT INTO `wta`.`Category` (Name) VALUES ('%s')" % (self.txtName_Category.Text))
            i+=2
            b.Object("GtkButton")
            b.set_properties([["x",x],["y",y+i*ydist],["id","btnok"+"_"+currTable ],["label","Insert"],['"clicked" handler',"btnok"+ "_"+currTable+"_clicked_cb"]])
            objlist=objlist+b.xml_ToString()
            
            
            b.Object("GtkButton")
            b.set_properties([["x",x+80],["y",y+i*ydist],["id","btncancel"+"_"+currTable],["label","Cancel"],['"clicked" handler',"btncancel"+"_"+currTable+"_clicked_cb"]])
            objlist=objlist+b.xml_ToString()
    
            b.Object("GtkButton")
            b.set_properties([["x",x+80+80],["y",y+i*ydist],["id","btninsert"+"_"+currTable],["label","Insert"],['"clicked" handler',"btninsert"+"_"+currTable+"_clicked_cb"]])
            objlist=objlist+b.xml_ToString()    

            b.Object("GtkButton")
            b.set_properties([["x",x+80+80+80],["y",y+i*ydist],["id","btndelete"+"_"+currTable],["label","Delete"],['"clicked" handler',"btndelete"+"_"+currTable+"_clicked_cb"]])
            objlist=objlist+b.xml_ToString()    

            b.Object("GtkButton")
            b.set_properties([["x",x+80+80+80+80],["y",y+i*ydist],["id","btnupdate"+"_"+currTable],["label","Update"],['"clicked" handler',"btnupdate"+"_"+currTable+"_clicked_cb"]])
            objlist=objlist+b.xml_ToString()

            s=b.xmlhead + objlist + b.xmlfoot    
            fglade= GetPath(self.filename)+"ctl" + currTable +'.glade'
            SaveFileStr(fglade,s)
            
            #self.insertcode="\t\tDataGrid.ExecuteNonQuerry(self.db,\"INSERT INTO `wta`.`category` (name ) VALUES ('%s')\" % (\"raks\") )\r"
            self.integerlist="self.integer"+currTable+"="+str(self.integerlist)+";"
            self.floatlist="self.floating"+currTable+"="+str(self.floatlist)+";"            
            self.uniquelist="self.unique"+currTable+"="+str(self.uniquelist)+";"
            self.notnulllist="self.notnull"+currTable+"="+str(self.notnulllist)+";"
            self.autonumber="self.autonumber"+currTable+"="+str(self.autonumber)+";"
            self.insertcode="\t\tif self.dbUtils.IsUnique(self.unique"+currTable+") and self.dbUtils.IsNotNull(self.notnull"+currTable+") and self.dbUtils.CheckNumber(self.integer"+currTable+",True) and self.dbUtils.CheckNumber(self.floating"+currTable+") :\r\t"+self.insertcode+"\r\t\t\tprint(\"Success\")"
            self.updateGrid='\t\tself.datagrid.DataSource(self.db,"select * from ' +   table[0].table + ' limit 10")\r'
            self.autonumberCode="\t\tself.dbUtils.SetAutoNumber(self.autonumber"+currTable+");"
            self.insertcode+='\r\t'+self.updateGrid+"\r\t\t\tself.dbUtils.IncAutoNumber(self.autonumber"+currTable+")"+"\r\t"+self.autonumberCode
            
            
            a=Execute(self,False, fglade,self.insertcode,self.datagridCode+self.populate+self.uniquelist+self.notnulllist+self.autonumber+self.integerlist+self.floatlist+'\r'+self.autonumberCode,self.updatecode,self.deletecode)
            objlist=""         
class Execute:
    global Usercontrol

    def __init__(self,class_handle,flag=True,filename="",INSERTCODE="",POPULATE="",updatecode="",deletecode=""):
        Usercontrol=False
        self.INSERTCODE=INSERTCODE
        self.populate=POPULATE
        
        
        
        fnameGlade=filename        
        if is_number(fnameGlade)==True:
            msgbox(None, "Error: File not valid Glade file!!!", "GladeCode Generator")
            return None
        #class_handle.set_path(fnameGlade)
        #SaveFileStr("log.txt",fnameGlade)
        fnameGlade=fnameGlade.replace('\\','/')
        strs=GetFileStr(fnameGlade)
        os.remove(fnameGlade)
        #if str.find('?xml version')==-1:
            #msgbox(None, "Error: File not valid Glade file!!!", "GladeCode Generator")
            #return None
        pycodeExist=False
        pythoncode=""
        fnamePy=fnameGlade.replace(".glade",".py")
        if FileExist(fnamePy)==True:
            pythoncode=GetFileStr(fnamePy)
            pythoncode.replace('\a', '')
            fnamePyBAK=fnamePy.replace(".py","BAK.py")
            SaveFileStr(fnamePyBAK, pythoncode)
            pycodeExist=True
        header=GetFileStr('header.py')
        pythoncode=header
        buf=''
        pycodeExist=False
       # appendInit(pythoncode,'self.treeviewcolumn2 = builder.get_object("treeviewcolumn2")')    
        obj = Parser("<object class=", ">", 1)
        event = Parser("<signal name=", ">", 1)
        data=[]
        objInfo=[]


       
        for c in strs:
            if obj.DataReceived(c):
                data.append(obj.data)
            if event.DataReceived(c):
                data.append(event.data)
        
        if pycodeExist==False:
            pythoncode+=buf

            loop=GetFileStr('loop.py')
            pythoncode+=loop					
            loop=GetFileStr('footer.py')
            pythoncode+=loop	
            loop=GetFileStr('footer2.py')
            pythoncode+='\r'+loop	            
            
            x=pythonCode("",pythoncode)
            handler,_=x.getRoutinCode("def GTKForms") 
            column=0
            top=0
            GTKForms="\tdef GTKForms(self):\n"
            prop=eval("{'Height': '30', 'Events': '[]', 'Name': 'Entry1', 'Visible': 'True', 'Tag': '', 'ForeColor': '(0,0,0,1)', 'Top': '111', 'Enable': 'True', 'Picture': '', 'Text': 'Entry1', 'Left': '397', 'Width': '170', 'Font': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)'}")            
            name='datagrid'
            prop['Name']=name
            prop['Top']=str(50)
            prop['Left']=str(339)
            prop['Width']=str(500)
            prop['Height']=str(130)    
            prop['Tag']='Activex'
            prop['dbtype']='sqllite'
            GTKForms+=('\t\tself.create("' + str(prop) + '","' + 'DatagridTreeView' + '","usercontrol","'+  "[['dblclick', 'self,model,row,col']]" +'")\n')
            
            prop=eval("{'Height': '30', 'Events': '[]', 'Name': 'txtSearch', 'Visible': 'True', 'Tag': '', 'ForeColor': '(0,0,0,1)', 'Top': '111', 'Enable': 'True', 'Picture': '', 'Text': 'Entry1', 'Left': '397', 'Width': '170', 'Font': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)'}")            
            name='txtSearch'
            prop['Name']=name
            prop['Top']=str(0)
            prop['Left']=str(500)
            prop['Width']=str(150)
            prop['Height']=str(40)    
            prop['Tag']=''
            eventISR=''            
            GTKForms+=('\t\tself.create("' + str(prop) + '","' + 'Entry' + '","usercontrol","'+  "[['key-release-event', 'self,e']]" +'")\n')            
            
            prop=eval("{'Height': '30', 'Events': '[]', 'Name': 'cboSearch', 'Visible': 'True', 'Tag': '', 'ForeColor': '(0,0,0,1)', 'Top': '111', 'Enable': 'True', 'Picture': '', 'Text': 'Entry1', 'Left': '397', 'Width': '170', 'Font': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)'}")            
            name='cboSearch'
            prop['Name']=name
            prop['Top']=str(5)
            prop['Left']=str(650)
            prop['Width']=str(150)
            prop['Height']=str(30)    
            prop['Tag']=''
            eventISR=''            
            GTKForms+=('\t\tself.create("' + str(prop) + '","' + 'ComboBoxText' + '","usercontrol","'+  "[]" +'")\n')
            
            
            eventISR=''            
            for a in data:
                if a.find('_')!=-1:
                    print( a)  
                    if a.find('GtkLabel')!=-1 or a.find('GtkEntry')!=-1 or a.find('GtkButton')!=-1 or a.find('GtkComboBoxText')!=-1 or a.find('GtkCheckButton')!=-1:
                                      
                        name=a[a.find('id="')+4:-1]
                        
                        prop=eval("{'Height': '30', 'Events': '[]', 'Name': 'Entry1', 'Visible': 'True', 'Tag': '', 'ForeColor': '(0,0,0,1)', 'Top': '111', 'Enable': 'True', 'Picture': '', 'Text': 'Entry1', 'Left': '397', 'Width': '170', 'Font': '', 'ParentsType': '', 'BackColor': '(1,1,1,1)'}")
                        
                        prop['Name']=name
                        prop['Text']=name[3:name.find('_')]
                        prop['Top']=str(top*30)
                        prop['Left']=str(column*170)
                        event='[]'
                        table=name[name.find('_')+1:]
                        if name.find("Active")==-1 or name.find("lbl")!=-1:
                            if a.find('GtkLabel')!=-1:
                                n=getCSV(0,'=',class_handle.notnulllist)
                                _n=class_handle.notnulllist.replace(n+"=","")
                                _nn=eval(_n.replace(";",''))
                                __n=[b[1] for b in _nn] 
                                if name[3:name.find('_')] in __n:
                                    prop['Text']+='(*)' 
                                    prop['ForeColor']='(1,0,0,1)' 
                                    
                                prop['BackColor']=str('(0.17,0.69,0.94,1)')
                                types='Label'
                                column+=1
                            if a.find('GtkEntry')!=-1:
                                prop=eval("{'BackColor': '(0, 0.563668817126555, 0.41624087056517534, 0.5)', 'Events': '[]', 'Top': '36', 'Text': 'richentry1', 'Enable': 'True', 'Width': '112', 'Tag': 'Activex', 'Visible': 'True', 'ForeColor': '(0,0,0,1)', 'Picture': 'richEntry.png', 'MaxChar': '100', 'ParentsType': '', 'Input': 'FLOAT', 'Alignment': 'LEFT', 'Left': '150', 'Height': '40', 'Font': '', 'Name': 'richentry1'}")
                                prop['Name']=name
                                prop['Text']=name[3:name.find('_')]
                                prop['Top']=str(top*30)
                                prop['Left']=str(column*170)
                                prop['Input']='STRING'                            
                                event='[]'                            
                                types='richEntry'  
                                
                                n=getCSV(0,'=',class_handle.floatlist)
                                _n=class_handle.floatlist.replace(n+"=","")
                                _nn=eval(_n.replace(";",''))
                                __n=[b[1] for b in _nn] 
                                if name[3:name.find('_')] in __n:
                                    prop['Input']='FLOAT'
                                
                                n=getCSV(0,'=',class_handle.integerlist)
                                _n=class_handle.integerlist.replace(n+"=","")
                                _nn=eval(_n.replace(";",''))
                                __n=[b[1] for b in _nn] 
                                if name[3:name.find('_')] in __n:
                                    prop['Input']='NUMBER'                            
                                
                                top+=1   
                                column=0
                            if a.find('GtkComboBoxText')!=-1:
                                types='ComboBoxText'  
                                top+=1   
                                column=0                            
                            if a.find('GtkCheckButton')!=-1:
                                types='CheckButton'  
                                top+=1   
                                column=0                             
                            if a.find('GtkButton')!=-1:
                                types='Button'               
                                column+=1
                                event="[['clicked', 'self,e']]"
                                code='\r\tdef ' + name + '_clicked(self,wid):\r\t\t'
                                if name.find('insert')!=-1:
                                    code+='self.insertcode()\r\t\t'
                                    code+='pass'
                                    eventISR+=code
                                if name.find('update')!=-1:
                                    code+=updatecode+'\r\t\t'
                                    code+='pass'
                                    eventISR+=code                               
                                if name.find('delete')!=-1:
                                    code+=deletecode+'\r\t\t'
                                    code+='pass'
                                    eventISR+=code
                        else:
                            types='Switch'
                            prop['Text']="True"
                            prop['Top']=str(top*30)
                            prop['Left']=str(column*170)
                            prop['Input']='STRING'                            
                            event='[]'                            
                            top+=1   
                            column=0                                                          
                        GTKForms+=('\t\tself.create("' + str(prop) + '","' + types + '","usercontrol","'+ event +'")\n')
        pythoncode=pythoncode.replace(handler, GTKForms+'\t')
        tableClickCode=	'\tdef datagrid_dblclick(self,model,row,col):\r'
        tableClickCode+='\t\trowdata=self.datagrid.get_ListStore()[row][:]\r'
        tableClickCode+='\t\tself.dbUtils.TableValToUserInput("'+ table +'",rowdata)\r'
        tableClickCode+='\t\tpass\r'
        txtSearch_key_release_eventCode='\tdef txtSearch_key_release_event(self,event,e):\r'
        txtSearch_key_release_eventCode+="\t\tself.datagrid.DataSource(self.db,\"select * from " + table +" where %s like '%s\" % (self.cboSearch.Text,self.txtSearch.Text) +\"%'\" )\r"
        txtSearch_key_release_eventCode+='\t\tpass\r'        
        x=pythonCode("",pythoncode)
        handler,_=x.getRoutinCode("def __init__")
        handlerninsert=handler[:-1]+self.populate+'\r\tdef insertcode(self):\r'+self.INSERTCODE+eventISR+'\r'+tableClickCode+'\r'+txtSearch_key_release_eventCode+'\r\t'
        pythoncode=pythoncode.replace(handler,handlerninsert)
        SaveFileStr (fnamePy,pythoncode)
        if FileExist(GetPath(fnamePy) + '/wta_module.py')==False:
            copyfile('../properties/wta_module.py', GetPath(fnamePy) + '/wta_module.py')
            copyfile('../properties/DBUtils.py', GetPath(fnamePy) + '/DBUtils.py')
            copyfile('../icon.ico', GetPath(fnamePy) + '/icon.ico')
            #copyfile('DataGrid.glade', GetPath(fnamePy) + '\\DataGrid.glade')
            
        #if class_handle.chkshow.get_active():
            #subprocess.Popen('explorer /select,' + fnamePy) 
        #else:	
            #msgbox(None, "Code Generation Finish", "Glade To Code") 	
import os  
def Start():
    cls=Handler(None)
    cls.Show(modal=True)



