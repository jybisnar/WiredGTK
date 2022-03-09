package b4a.raks;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class wtaserver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.raks.wtaserver");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.raks.wtaserver.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4a.raks.main _main = null;
public b4a.raks.starter _starter = null;
public b4a.raks.vb6 _vb6 = null;
public String  _sendclient(b4a.raks.wtaserver __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "sendclient", false))
	 {return ((String) Debug.delegate(ba, "sendclient", new Object[] {_s}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub SendClient(s As String)";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Try";
try {RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If wtaserverIO.IsInitialized Then";
if (__ref._wtaserverio /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .IsInitialized()) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="s=\"WTARELAY^\" & clientid & \"^\" & s & Chr(13)";
_s = "WTARELAY^"+__ref._clientid /*String*/ +"^"+_s+BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="wtaserverIO.Write(s.GetBytes(\"UTF8\"))";
__ref._wtaserverio /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(_s.getBytes("UTF8"));
 }else {
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="connected=False";
__ref._connected /*boolean*/  = __c.False;
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="InitWTAServer";
__ref._initwtaserver /*String*/ (null);
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.raks.wtaserver __ref,anywheresoftware.b4a.BA _ba,Object _pmodule,String _peventname,String _id,String _clientid_) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_pmodule,_peventname,_id,_clientid_}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub Initialize(pModule As Object, pEventNam";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="mModule    = pModule";
__ref._mmodule /*Object*/  = _pmodule;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="mEventName = pEventName";
__ref._meventname /*String*/  = _peventname;
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="myid=id";
__ref._myid /*String*/  = _id;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="clientid=clientid_";
__ref._clientid /*String*/  = _clientid_;
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="End Sub";
return "";
}
public String  _initwtaserver(b4a.raks.wtaserver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "initwtaserver", false))
	 {return ((String) Debug.delegate(ba, "initwtaserver", null));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub InitWTAServer";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Try";
try {RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="If tmrwtaserver.IsInitialized=False Then";
if (__ref._tmrwtaserver /*anywheresoftware.b4a.objects.Timer*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="tmrwtaserver.Initialize(\"tmrwtaserver\",5000)";
__ref._tmrwtaserver /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"tmrwtaserver",(long) (5000));
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="tmrwtaserver.Enabled=True";
__ref._tmrwtaserver /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="If CheckConnection  Then";
if (__ref._checkconnection /*boolean*/ (null)) { 
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="wsh.Initialize(\"wsh\")";
__ref._wsh /*anywheresoftware.b4a.objects.SocketWrapper*/ .Initialize("wsh");
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="wsh.Connect(\"107.180.92.29\",5001,30000)";
__ref._wsh /*anywheresoftware.b4a.objects.SocketWrapper*/ .Connect(ba,"107.180.92.29",(int) (5001),(int) (30000));
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="End Sub";
return "";
}
public boolean  _checkconnection(b4a.raks.wtaserver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "checkconnection", false))
	 {return ((Boolean) Debug.delegate(ba, "checkconnection", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub CheckConnection As Boolean";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="If (p.GetDataState == \"CONNECTED\") Then";
if (((_p.GetDataState()).equals("CONNECTED"))) { 
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="If (p.GetSettings (\"wifi_on\") == 1) Then";
if (((_p.GetSettings("wifi_on")).equals(BA.NumberToString(1)))) { 
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="If (p.GetDataState == \"DISCONNECTED\") Then";
if (((_p.GetDataState()).equals("DISCONNECTED"))) { 
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="If (p.GetDataState == \"SUSPENDED\") Then";
if (((_p.GetDataState()).equals("SUSPENDED"))) { 
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.raks.wtaserver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Private wsh As Socket";
_wsh = new anywheresoftware.b4a.objects.SocketWrapper();
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="Private wtaserverIO As AsyncStreams";
_wtaserverio = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Dim connected As Boolean=False";
_connected = __c.False;
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="Dim myid As String=\"456\"";
_myid = "456";
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="Dim clientid As String=\"123\"";
_clientid = "123";
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Private tmrwtaserver As Timer";
_tmrwtaserver = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="End Sub";
return "";
}
public String  _sendserver(b4a.raks.wtaserver __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "sendserver", false))
	 {return ((String) Debug.delegate(ba, "sendserver", new Object[] {_s}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub SendServer(s As String)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Try";
try {RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="s=s&Chr(13)";
_s = _s+BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="If wtaserverIO.IsInitialized Then";
if (__ref._wtaserverio /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .IsInitialized()) { 
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="wtaserverIO.Write(s.GetBytes(\"UTF8\"))";
__ref._wtaserverio /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(_s.getBytes("UTF8"));
 }else {
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="InitWTAServer";
__ref._initwtaserver /*String*/ (null);
 };
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="ToastMessageShow(\"Check Internet\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Check Internet"),__c.False);
 };
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="End Sub";
return "";
}
public String  _tmrwtaserver_tick(b4a.raks.wtaserver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "tmrwtaserver_tick", false))
	 {return ((String) Debug.delegate(ba, "tmrwtaserver_tick", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub tmrwtaserver_Tick";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="SendServer(\"x\")'prevent disconnection";
__ref._sendserver /*String*/ (null,"x");
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public String  _wsh_connected(b4a.raks.wtaserver __ref,boolean _successful) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "wsh_connected", false))
	 {return ((String) Debug.delegate(ba, "wsh_connected", new Object[] {_successful}));}
String _strs = "";
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub wsh_Connected(Successful As Boolean)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="If Successful Then";
if (_successful) { 
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="wtaserverIO.Initialize(wsh.InputStream,wsh.Outpu";
__ref._wtaserverio /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Initialize(ba,__ref._wsh /*anywheresoftware.b4a.objects.SocketWrapper*/ .getInputStream(),__ref._wsh /*anywheresoftware.b4a.objects.SocketWrapper*/ .getOutputStream(),"wsh");
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Dim strs As String=\"WTAREGISTER^\"&myid & Chr(13)";
_strs = "WTAREGISTER^"+__ref._myid /*String*/ +BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="wtaserverIO.Write(strs.GetBytes(\"UTF8\"))";
__ref._wtaserverio /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Write(_strs.getBytes("UTF8"));
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="connected=True";
__ref._connected /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="wsh.Close";
__ref._wsh /*anywheresoftware.b4a.objects.SocketWrapper*/ .Close();
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="Msgbox(\"Please Tr-y Again\",\"Error Connecting\")";
__c.Msgbox(BA.ObjectToCharSequence("Please Tr-y Again"),BA.ObjectToCharSequence("Error Connecting"),getActivityBA());
 };
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="End Sub";
return "";
}
public String  _wsh_newdata(b4a.raks.wtaserver __ref,byte[] _buffer) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "wsh_newdata", false))
	 {return ((String) Debug.delegate(ba, "wsh_newdata", new Object[] {_buffer}));}
String _mline = "";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub wsh_NewData(Buffer() As Byte)";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim mLine As String";
_mline = "";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="mLine = BytesToString(Buffer,0,Buffer.Length,\"UTF";
_mline = __c.BytesToString(_buffer,(int) (0),_buffer.length,"UTF-8");
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="If SubExists(mModule,mEventName & \"_\" & \"NewData\"";
if (__c.SubExists(ba,__ref._mmodule /*Object*/ ,__ref._meventname /*String*/ +"_"+"NewData")) { 
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="CallSub2(mModule,mEventName & \"_\" & \"NewData\",mL";
__c.CallSubNew2(ba,__ref._mmodule /*Object*/ ,__ref._meventname /*String*/ +"_"+"NewData",(Object)(_mline));
 };
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="End Sub";
return "";
}
public String  _wtaserver_error(b4a.raks.wtaserver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "wtaserver_error", false))
	 {return ((String) Debug.delegate(ba, "wtaserver_error", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub wtaserver_Error()";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="wtaserverIO.Close";
__ref._wtaserverio /*anywheresoftware.b4a.randomaccessfile.AsyncStreams*/ .Close();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="wsh.Close";
__ref._wsh /*anywheresoftware.b4a.objects.SocketWrapper*/ .Close();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="connected=False";
__ref._connected /*boolean*/  = __c.False;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="ToastMessageShow(\"wtaserver_Error\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("wtaserver_Error"),__c.False);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="End Sub";
return "";
}
public String  _wtaserver_terminated(b4a.raks.wtaserver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wtaserver";
if (Debug.shouldDelegate(ba, "wtaserver_terminated", false))
	 {return ((String) Debug.delegate(ba, "wtaserver_terminated", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub wtaserver_Terminated()";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="ToastMessageShow(\"Terminated raks\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Terminated raks"),__c.False);
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="connected=False";
__ref._connected /*boolean*/  = __c.False;
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="End Sub";
return "";
}
}