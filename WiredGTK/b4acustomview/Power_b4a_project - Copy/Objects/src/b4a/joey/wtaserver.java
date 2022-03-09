package b4a.joey;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class wtaserver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.joey.wtaserver");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.joey.wtaserver.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object _mmodule = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.SocketWrapper _wsh = null;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _wtaserverio = null;
public boolean _connected = false;
public String _myid = "";
public String _clientid = "";
public anywheresoftware.b4a.objects.Timer _tmrwtaserver = null;
public b4a.joey.main _main = null;
public b4a.joey.starter _starter = null;
public b4a.joey.vb6 _vb6 = null;
public boolean  _checkconnection() throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
 //BA.debugLineNum = 96;BA.debugLine="Sub CheckConnection As Boolean";
 //BA.debugLineNum = 97;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 99;BA.debugLine="If (p.GetDataState == \"CONNECTED\") Then";
if (((_p.GetDataState()).equals("CONNECTED"))) { 
 //BA.debugLineNum = 100;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 103;BA.debugLine="If (p.GetSettings (\"wifi_on\") == 1) Then";
if (((_p.GetSettings("wifi_on")).equals(BA.NumberToString(1)))) { 
 //BA.debugLineNum = 104;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 107;BA.debugLine="If (p.GetDataState == \"DISCONNECTED\") Then";
if (((_p.GetDataState()).equals("DISCONNECTED"))) { 
 //BA.debugLineNum = 108;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 111;BA.debugLine="If (p.GetDataState == \"SUSPENDED\") Then";
if (((_p.GetDataState()).equals("SUSPENDED"))) { 
 //BA.debugLineNum = 112;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 114;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String";
_meventname = "";
 //BA.debugLineNum = 4;BA.debugLine="Private wsh As Socket";
_wsh = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private wtaserverIO As AsyncStreams";
_wtaserverio = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 6;BA.debugLine="Dim connected As Boolean=False";
_connected = __c.False;
 //BA.debugLineNum = 7;BA.debugLine="Dim myid As String=\"456\"";
_myid = "456";
 //BA.debugLineNum = 8;BA.debugLine="Dim clientid As String=\"123\"";
_clientid = "123";
 //BA.debugLineNum = 9;BA.debugLine="Private tmrwtaserver As Timer";
_tmrwtaserver = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _pmodule,String _peventname,String _id,String _clientid_) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(pModule As Object, pEventNam";
 //BA.debugLineNum = 15;BA.debugLine="mModule    = pModule";
_mmodule = _pmodule;
 //BA.debugLineNum = 16;BA.debugLine="mEventName = pEventName";
_meventname = _peventname;
 //BA.debugLineNum = 17;BA.debugLine="myid=id";
_myid = _id;
 //BA.debugLineNum = 18;BA.debugLine="clientid=clientid_";
_clientid = _clientid_;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _initwtaserver() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub InitWTAServer";
 //BA.debugLineNum = 80;BA.debugLine="Try";
try { //BA.debugLineNum = 81;BA.debugLine="If tmrwtaserver.IsInitialized=False Then";
if (_tmrwtaserver.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 82;BA.debugLine="tmrwtaserver.Initialize(\"tmrwtaserver\",5000)";
_tmrwtaserver.Initialize(ba,"tmrwtaserver",(long) (5000));
 //BA.debugLineNum = 83;BA.debugLine="tmrwtaserver.Enabled=True";
_tmrwtaserver.setEnabled(__c.True);
 };
 //BA.debugLineNum = 85;BA.debugLine="If CheckConnection  Then";
if (_checkconnection()) { 
 //BA.debugLineNum = 86;BA.debugLine="wsh.Initialize(\"wsh\")";
_wsh.Initialize("wsh");
 //BA.debugLineNum = 87;BA.debugLine="wsh.Connect(\"107.180.92.29\",5001,30000)";
_wsh.Connect(ba,"107.180.92.29",(int) (5001),(int) (30000));
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 90;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _sendclient(String _s) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SendClient(s As String)";
 //BA.debugLineNum = 56;BA.debugLine="Try";
try { //BA.debugLineNum = 57;BA.debugLine="If wtaserverIO.IsInitialized Then";
if (_wtaserverio.IsInitialized()) { 
 //BA.debugLineNum = 58;BA.debugLine="s=\"WTARELAY^\" & clientid & \"^\" & s & Chr(13)";
_s = "WTARELAY^"+_clientid+"^"+_s+BA.ObjectToString(__c.Chr((int) (13)));
 //BA.debugLineNum = 59;BA.debugLine="wtaserverIO.Write(s.GetBytes(\"UTF8\"))";
_wtaserverio.Write(_s.getBytes("UTF8"));
 }else {
 //BA.debugLineNum = 61;BA.debugLine="connected=False";
_connected = __c.False;
 //BA.debugLineNum = 62;BA.debugLine="InitWTAServer";
_initwtaserver();
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 65;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _sendserver(String _s) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SendServer(s As String)";
 //BA.debugLineNum = 44;BA.debugLine="Try";
try { //BA.debugLineNum = 45;BA.debugLine="s=s&Chr(13)";
_s = _s+BA.ObjectToString(__c.Chr((int) (13)));
 //BA.debugLineNum = 46;BA.debugLine="If wtaserverIO.IsInitialized Then";
if (_wtaserverio.IsInitialized()) { 
 //BA.debugLineNum = 47;BA.debugLine="wtaserverIO.Write(s.GetBytes(\"UTF8\"))";
_wtaserverio.Write(_s.getBytes("UTF8"));
 }else {
 //BA.debugLineNum = 49;BA.debugLine="InitWTAServer";
_initwtaserver();
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 52;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _tmrwtaserver_tick() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub tmrwtaserver_Tick";
 //BA.debugLineNum = 94;BA.debugLine="SendServer(\"x\")'prevent disconnection";
_sendserver("x");
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _wsh_connected(boolean _successful) throws Exception{
String _strs = "";
 //BA.debugLineNum = 20;BA.debugLine="Sub wsh_Connected(Successful As Boolean)";
 //BA.debugLineNum = 21;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 23;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 25;BA.debugLine="wtaserverIO.Initialize(wsh.InputStream,wsh.Outpu";
_wtaserverio.Initialize(ba,_wsh.getInputStream(),_wsh.getOutputStream(),"wsh");
 //BA.debugLineNum = 26;BA.debugLine="Dim strs As String=\"WTAREGISTER^\"&myid & Chr(13)";
_strs = "WTAREGISTER^"+_myid+BA.ObjectToString(__c.Chr((int) (13)));
 //BA.debugLineNum = 27;BA.debugLine="wtaserverIO.Write(strs.GetBytes(\"UTF8\"))";
_wtaserverio.Write(_strs.getBytes("UTF8"));
 //BA.debugLineNum = 28;BA.debugLine="connected=True";
_connected = __c.True;
 }else {
 //BA.debugLineNum = 30;BA.debugLine="wsh.Close";
_wsh.Close();
 //BA.debugLineNum = 31;BA.debugLine="Msgbox(\"Please Tr-y Again\",\"Error Connecting\")";
__c.Msgbox(BA.ObjectToCharSequence("Please Tr-y Again"),BA.ObjectToCharSequence("Error Connecting"),getActivityBA());
 };
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _wsh_newdata(byte[] _buffer) throws Exception{
String _mline = "";
 //BA.debugLineNum = 35;BA.debugLine="Sub wsh_NewData(Buffer() As Byte)";
 //BA.debugLineNum = 36;BA.debugLine="Dim mLine As String";
_mline = "";
 //BA.debugLineNum = 37;BA.debugLine="mLine = BytesToString(Buffer,0,Buffer.Length,\"UTF";
_mline = __c.BytesToString(_buffer,(int) (0),_buffer.length,"UTF-8");
 //BA.debugLineNum = 38;BA.debugLine="If SubExists(mModule,mEventName & \"_\" & \"NewData\"";
if (__c.SubExists(ba,_mmodule,_meventname+"_"+"NewData")) { 
 //BA.debugLineNum = 39;BA.debugLine="CallSub2(mModule,mEventName & \"_\" & \"NewData\",mL";
__c.CallSubNew2(ba,_mmodule,_meventname+"_"+"NewData",(Object)(_mline));
 };
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _wtaserver_error() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub wtaserver_Error()";
 //BA.debugLineNum = 74;BA.debugLine="wtaserverIO.Close";
_wtaserverio.Close();
 //BA.debugLineNum = 75;BA.debugLine="wsh.Close";
_wsh.Close();
 //BA.debugLineNum = 76;BA.debugLine="connected=False";
_connected = __c.False;
 //BA.debugLineNum = 77;BA.debugLine="ToastMessageShow(\"wtaserver_Error\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("wtaserver_Error"),__c.False);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _wtaserver_terminated() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub wtaserver_Terminated()";
 //BA.debugLineNum = 70;BA.debugLine="ToastMessageShow(\"Terminated raks\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Terminated raks"),__c.False);
 //BA.debugLineNum = 71;BA.debugLine="connected=False";
_connected = __c.False;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
