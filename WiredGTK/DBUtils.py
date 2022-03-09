import gi
import time
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk,GObject,Gdk
from wired_module import *
import DataGrid
class Initialize:
    def __init__(self,builder,db):
        self.builder=builder
        self.db=db
    def PopulateCombo(self,cboW,fields,table):
        if fields.find(",")!=-1:
            f1=getcsv(0,",",fields)
            f2=getcsv(1,",",fields)
            sep=getcsv(2,",",fields)
            sep=sep.replace("\"","")
            sep=sep.replace("'","")
            sql="select %s,%s from %s" % (f1,f2,table)
        else:	
            sql="select %s from %s" % (fields,table)
        y=[];
        x=DataGrid.getRecords(self.db, sql);
        if len(x)==0:
            return
        y.insert(0,"Select Here")
        for a in x:
            if len(a)==1:
                y.append(a[0])
            else:
                y.append(a[0]+sep+a[1])
        cboW.ComboValues=y
        cboW.ListIndex=0
    #print(self.getCount(""))
    #print(self.getCount('','0000'))
    #print(self.UpdateFiFo('','0000',2))		
    def getCount(self,lst,whereid=None):
        #self.notnull=[["items","Category"]]
        lst=self.getcount=[['PRODUCTS','Name','Stocks','Name','QTY'," order by Date desc"]]
        retlst={}
        for a in lst:
            sql1="select * from %s" % (a[0])
            ret=DataGrid.getRecords(self.db, sql1)
            fields=DataGrid.getFields(self.db, a[0])
            for i,b in enumerate(fields):
                if b==a[1]:
                    for c in ret:
                        ids=c[i]
                        sql2="select * from %s where %s='%s'" % (a[2],a[3],ids) + a[5] 
                        ret2=DataGrid.getRecords(self.db, sql2)
    
                        fields2=DataGrid.getFields(self.db, a[2])
                        for i2,b2 in enumerate(fields2):
                            if b2==a[4]:
                                total=0.0
                                for d in ret2:
                                    total+=float(d[i2])
                                retlst.update({ids:total})
    
                                if whereid!=None and whereid==ids:
                                    return str(total)
    
    
        return retlst			
    def UpdateFiFo(self,lst,whereid,qty):
        #self.notnull=[["items","Category"]]
        lst=self.getcount=[['PRODUCTS','Name','Stocks','Name','QTY'," order by Date asc","stocksconsumed"]]
        retlst={}
        for a in lst:
            sql1="select * from %s" % (a[0])
            ret=DataGrid.getRecords(self.db, sql1)
            fields=DataGrid.getFields(self.db, a[0])
            for i,b in enumerate(fields):
                if b==a[1]:
                    for c in ret:
                        ids=c[i]
    
                        sql2="select * from %s where %s='%s' and %s<>'0'" % (a[2],a[3],whereid,a[4]) + a[5] 
                        ret2=DataGrid.getRecords(self.db, sql2)
                        fields2=DataGrid.getFields(self.db, a[2])
                        for i2,b2 in enumerate(fields2):
                            if b2==a[4]:
                                total=0.0
                                for pos,d in enumerate(ret2):
                                    qtyrec=d[i2]
                                    if whereid==ids:
                                        table=a[2]
                                        wherefields1=a[3]
                                        wherefields2=a[3]
                                        updatefield=a[4]
                                        for i22,b22 in enumerate(fields2):
                                            if 'Date'==b22:
                                                datefieldspos=i22
                                                datevalue=d[datefieldspos]										
                                        if float(qty)>=float(qtyrec):
                                            sql3="UPDATE `"+a[2]+"` SET " + a[4] + "='" + str(0) +"' where " +a[3]+"='"+ids+ "' and date='" + str(datevalue) +"'"
                                            qty=float(qty)-float(qtyrec)
                                            deduct=qtyrec
                                        else:
                                            sql3="UPDATE `"+a[2]+"` SET " + a[4] + "='" + str(float(qtyrec)-float(qty)) +"' where " +a[3]+"='"+ids+ "' and date='" + str(datevalue) +"'"
                                            deduct=qty
                                            qty="0"
    
                                        fields22=DataGrid.getFields(self.db, a[6])
                                        stockhist=a[6]	
                                        sqlhistory="INSERT INTO `"  + stockhist +"` " + str(tuple(fields22)).replace("'","") + "VALUES " 
                                        val=[]
                                        for i222,b222 in enumerate(fields22):        
                                            if b222=="QTY" or b222=="Date":
                                                if b222=="QTY":
                                                    val.append(deduct)
                                                if b222=="Date":
                                                    val.append(str(datetime.datetime.now()))													
                                            else:	
                                                val.append(str(d[i222]))
                                        sqlhistory+=str(tuple(val))
    
                                        DataGrid.ExecuteNonQuerry(self.db,sqlhistory)
                                        DataGrid.ExecuteNonQuerry(self.db,sql3)
                                        if qty=="0":
                                            return True	
    
        return False
    def IsUnique(self,lst):
        #self.unique=[["items","Category"]]
        for a in lst:
            i = self.builder.get_object("txt" + a[1]+"_"+a[0])
            j =forms(i).Text			
            s=DataGrid.GetSingleRec(self.db,a[0],a[1],j,a[1]);
            if s!="":
                print(a[1]+" Exist!!!")
                return False
        return True		
    def IsNotNull(self,lst):
        #self.notnull=[["items","Category"]]
        for a in lst:
            i = self.builder.get_object("txt" + a[1]+"_"+a[0])
            j =forms(i).Text			
            if j=="":
                print(a[1]+" Cannot be null!!!")
                return False
            if j=="Type Here":
                print("Please Enter Data for " + a[1])
                return False
            if j=="Select Here":
                print("Please Select Item for " +a[1])
                return False		
        return True
    def CheckNumber(self,lst,intIsTrue=False):
        #self.notnull=[["items","Category"]]
        for a in lst:
            i = self.builder.get_object("txt" + a[1]+"_"+a[0])
            j = forms(i).Text
            if intIsTrue:
                try:
                    if j.find(".")!=-1:
                        print(a[1]+" Must be Integer!!!")
                        return False	
    
                    num=int(j)
                    return True
                except:
                    print(a[1]+" Must be Integer!!!")
                    return False
            else:
                try:
                    num=int(j)
                    return True
                except:
                    print(a[1]+" Must be Floating point!!!")
                    return False
        return True		
    def TableValToUserInput(self,itemsString,values):
        lst=DataGrid.getFields(self.db, itemsString)
        for i,a in enumerate(lst):
            obj = self.builder.get_object("txt" + a+"_"+itemsString)
            j =forms(obj)
            if type(obj)==Gtk.Entry or type(obj)==Gtk.CheckButton:
                j.Text=values[i]
            if type(obj)==Gtk.ComboBoxText:
                for i2,b in enumerate(j.ComboValues):
                    if b==values[i]:
                        j.ListIndex=i2
                        break
    
    
    def SetAutoNumber(self,lst):
        for a in lst:
            fields=a[1]
            table=a[0]
            txt=self.builder.get_object("txt" + fields+"_"+table)
            txtW=forms(txt)			
            x=DataGrid.getRecords(self.db, "select * from `AutoNumber`" );
            if len(x)==0:
                DataGrid.ExecuteNonQuerry(self.db, "INSERT INTO `AutoNumber` (ignores)VALUES('%s')"%('id'))
            x=DataGrid.getRecords(self.db, "select "+fields+"_"+table+" from `AutoNumber` where " + fields+"_"+table+ " is null" );
            if len(x):
                if x[0][0]==None:
                    x=DataGrid.ExecuteNonQuerry(self.db, "update `AutoNumber` set "+fields+"_"+table+"='0'  where ignores='id'");	
                    txtW.Text="%04d" % (0)
            else:
                x=DataGrid.getRecords(self.db, "select "+fields+"_"+table+" from `AutoNumber` where ignores='id'" );
                txtW.Text="%04d" % (int(x[0][0]))
            #self.IncAutoNumber(fields,table)	
    def IncAutoNumber(self,lst):
        for a in lst:
            fields=a[1]
            table=a[0]
            x=DataGrid.getRecords(self.db, "select "+fields+"_"+table+" from `AutoNumber` where ignores = 'id'" );
            currnum=int(x[0][0])+1
            x=DataGrid.ExecuteNonQuerry(self.db, "update `AutoNumber` set "+fields+"_"+table+"="+str(currnum)+"  where ignores='id'");
    def CboNameClick(self,*args):
        try:
            total=self.getCount(None, whereid=self.txtName_SalesW.Text)
            if total=="0":
                print ("Out of Stock " + self.txtName_SalesW.Text)
        except:
            a=0
        self.ComboGetData("Name","Products",self.txtName_SalesW.Text,"Amount",self.txtAmount_SalesW)
        self.txtQty_SalesW.Text="1"
        self.txtQty_SalesChange(None)
    def ComboGetData(self,fields,table,value,retfields,obj):
        x=DataGrid.getRecords(self.db, "select %s from %s where %s = '%s'" % (retfields,table,fields,value));
        if len(x)!=0:
            obj.Text=x[0][0]