package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.OPTUMizerPhysician", "b4a.OPTUMizerPhysician.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.OPTUMizerPhysician.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.phone.PhoneEvents.SMSInterceptor _sms_rx = null;
public static anywheresoftware.b4a.phone.Phone.PhoneSms _sms = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astream = null;
public static boolean _connected_bt = false;
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static int _msec_ = 0;
public static anywheresoftware.b4a.objects.collections.List _customview = null;
public static Object _bluetoothview1 = null;
public static b4a.OPTUMizerPhysician.wtaserver _wsh = null;
public static b4a.OPTUMizerPhysician.clsparser _myparser = null;
public static b4a.OPTUMizerPhysician.clsparser _parse1 = null;
public static b4a.OPTUMizerPhysician.clsparser _volt = null;
public static b4a.OPTUMizerPhysician.clsparser _amp = null;
public static b4a.OPTUMizerPhysician.clsparser _powerwatt = null;
public static b4a.OPTUMizerPhysician.clsparser _energy = null;
public static String _voltx = "";
public static String _ampx = "";
public static String _powerwattx = "";
public static String _energyx = "";
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static Object _dlogin1 = null;
public static Object _dhome1 = null;
public static Object _dlogs1 = null;
public static Object _dschedule1 = null;
public static Object _dprofile1 = null;
public static Object _dqrreader1 = null;
public static Object _dpatientprof1 = null;
public static Object _dpatientprescription1 = null;
public static Object _dpatientmedhistory1 = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 231;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return false;
}
public static String  _conns(int _res,anywheresoftware.b4a.objects.collections.Map _paireddevices,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub conns(res As Int, PairedDevices As Map, L As L";
 //BA.debugLineNum = 92;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res)),1)";
_serial1.Connect3(processBA,BA.ObjectToString(_paireddevices.Get(_l.Get(_res))),(int) (1));
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
float _lat = 0f;
float _lon = 0f;
String _speed = "";
 //BA.debugLineNum = 238;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
 //BA.debugLineNum = 239;BA.debugLine="Dim lat As Float= NumberFormat(Location1.Latitude";
_lat = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLatitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 240;BA.debugLine="Dim lon As Float= NumberFormat(Location1.Longitud";
_lon = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLongitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 241;BA.debugLine="Dim speed As String = \"Speed = \" & Location1.Spee";
_speed = "Speed = "+BA.NumberToString(_location1.getSpeed());
 //BA.debugLineNum = 242;BA.debugLine="If wsh.connected=True Then";
if (_wsh._connected /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 243;BA.debugLine="wsh.SendClient(\"WTAGPS\" & lat & \",\" & lon & \",\"";
_wsh._sendclient /*String*/ ("WTAGPS"+BA.NumberToString(_lat)+","+BA.NumberToString(_lon)+","+_speed+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))));
 };
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _mnuconnect_click() throws Exception{
anywheresoftware.b4a.objects.collections.Map _paireddevices = null;
anywheresoftware.b4a.objects.collections.List _l = null;
int _i = 0;
int _res = 0;
b4a.OPTUMizerPhysician.bluetooth _bluetooth = null;
 //BA.debugLineNum = 174;BA.debugLine="Sub mnuConnect_Click";
 //BA.debugLineNum = 175;BA.debugLine="Dim PairedDevices As Map";
_paireddevices = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 176;BA.debugLine="If connected_BT=False Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 177;BA.debugLine="PairedDevices = Serial1.GetPairedDevices";
_paireddevices = _serial1.GetPairedDevices();
 //BA.debugLineNum = 178;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 179;BA.debugLine="L.Initialize";
_l.Initialize();
 //BA.debugLineNum = 180;BA.debugLine="For i = 0 To PairedDevices.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_paireddevices.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 181;BA.debugLine="L.Add(PairedDevices.GetKeyAt(i)) 'add the frien";
_l.Add(_paireddevices.GetKeyAt(_i));
 }
};
 //BA.debugLineNum = 183;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 184;BA.debugLine="Dim bluetooth As bluetooth=bluetoothview1";
_bluetooth = (b4a.OPTUMizerPhysician.bluetooth)(_bluetoothview1);
 //BA.debugLineNum = 185;BA.debugLine="res=CallSub2(bluetooth,\"Getlist\",L)";
_res = (int)(BA.ObjectToNumber(anywheresoftware.b4a.keywords.Common.CallSubNew2(processBA,(Object)(_bluetooth),"Getlist",(Object)(_l))));
 //BA.debugLineNum = 187;BA.debugLine="If res <> DialogResponse.CANCEL Then";
if (_res!=anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
 //BA.debugLineNum = 190;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res))";
_serial1.Connect3(processBA,BA.ObjectToString(_paireddevices.Get(_l.Get(_res))),(int) (1));
 };
 };
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public static String  _mnudisconnect_click() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub mnuDisconnect_Click";
 //BA.debugLineNum = 84;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 85;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 86;BA.debugLine="timer1.Enabled=False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 87;BA.debugLine="Serial1.Disconnect";
_serial1.Disconnect();
 //BA.debugLineNum = 88;BA.debugLine="connected_BT=False";
_connected_bt = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _msec(int _xa) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub msec(xa As Int)";
 //BA.debugLineNum = 217;BA.debugLine="msec_ = xa";
_msec_ = _xa;
 //BA.debugLineNum = 218;BA.debugLine="Do While(msec_<>0)";
while ((_msec_!=0)) {
 //BA.debugLineNum = 219;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
 }
;
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public static String  _println(String _str) throws Exception{
String _x = "";
 //BA.debugLineNum = 208;BA.debugLine="public Sub Println(str As String)";
 //BA.debugLineNum = 209;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 210;BA.debugLine="str=str&Chr(13)";
_str = _str+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)));
 //BA.debugLineNum = 211;BA.debugLine="x=str.Length";
_x = BA.NumberToString(_str.length());
 //BA.debugLineNum = 212;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 213;BA.debugLine="astream.Write(str.GetBytes(\"UTF8\"))";
_astream.Write(_str.getBytes("UTF8"));
 };
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim sms_rx As SmsInterceptor";
_sms_rx = new anywheresoftware.b4a.phone.PhoneEvents.SMSInterceptor();
 //BA.debugLineNum = 14;BA.debugLine="Dim sms As PhoneSms";
_sms = new anywheresoftware.b4a.phone.Phone.PhoneSms();
 //BA.debugLineNum = 17;BA.debugLine="Dim timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 18;BA.debugLine="Private astream As AsyncStreams";
_astream = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 19;BA.debugLine="Dim connected_BT As Boolean";
_connected_bt = false;
 //BA.debugLineNum = 20;BA.debugLine="Dim Serial1 As Serial";
_serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 21;BA.debugLine="Dim msec_ As Int'in 100 ms";
_msec_ = 0;
 //BA.debugLineNum = 22;BA.debugLine="Dim customview As List";
_customview = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 23;BA.debugLine="Dim bluetoothview1 As Object";
_bluetoothview1 = new Object();
 //BA.debugLineNum = 25;BA.debugLine="Dim wsh As WTAServer";
_wsh = new b4a.OPTUMizerPhysician.wtaserver();
 //BA.debugLineNum = 26;BA.debugLine="Dim myparser As clsParser";
_myparser = new b4a.OPTUMizerPhysician.clsparser();
 //BA.debugLineNum = 27;BA.debugLine="Dim parse1 As clsParser";
_parse1 = new b4a.OPTUMizerPhysician.clsparser();
 //BA.debugLineNum = 28;BA.debugLine="Dim volt As clsParser";
_volt = new b4a.OPTUMizerPhysician.clsparser();
 //BA.debugLineNum = 29;BA.debugLine="Dim amp As clsParser";
_amp = new b4a.OPTUMizerPhysician.clsparser();
 //BA.debugLineNum = 30;BA.debugLine="Dim powerWatt As clsParser";
_powerwatt = new b4a.OPTUMizerPhysician.clsparser();
 //BA.debugLineNum = 31;BA.debugLine="Dim energy As clsParser";
_energy = new b4a.OPTUMizerPhysician.clsparser();
 //BA.debugLineNum = 32;BA.debugLine="Dim voltx As String=\"0\"";
_voltx = "0";
 //BA.debugLineNum = 33;BA.debugLine="Dim ampx As String=\"0\"";
_ampx = "0";
 //BA.debugLineNum = 34;BA.debugLine="Dim powerWattx As String=\"0\"";
_powerwattx = "0";
 //BA.debugLineNum = 35;BA.debugLine="Dim energyx As String=\"0\"";
_energyx = "0";
 //BA.debugLineNum = 36;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 40;BA.debugLine="Dim Dlogin1 As Object";
_dlogin1 = new Object();
 //BA.debugLineNum = 41;BA.debugLine="Dim DHome1 As Object";
_dhome1 = new Object();
 //BA.debugLineNum = 42;BA.debugLine="Dim DLogs1 As Object";
_dlogs1 = new Object();
 //BA.debugLineNum = 43;BA.debugLine="Dim DSchedule1 As Object";
_dschedule1 = new Object();
 //BA.debugLineNum = 44;BA.debugLine="Dim DProfile1 As Object";
_dprofile1 = new Object();
 //BA.debugLineNum = 45;BA.debugLine="Dim DQrReader1 As Object";
_dqrreader1 = new Object();
 //BA.debugLineNum = 46;BA.debugLine="Dim DPatientProf1 As Object";
_dpatientprof1 = new Object();
 //BA.debugLineNum = 47;BA.debugLine="Dim DPatientPrescription1 As Object";
_dpatientprescription1 = new Object();
 //BA.debugLineNum = 48;BA.debugLine="Dim DPatientMedHistory1 As Object";
_dpatientmedhistory1 = new Object();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _serial1_connected(boolean _success) throws Exception{
b4a.OPTUMizerPhysician.bluetooth _bluetooth = null;
 //BA.debugLineNum = 95;BA.debugLine="Sub Serial1_Connected (Success As Boolean)";
 //BA.debugLineNum = 96;BA.debugLine="Dim bluetooth As bluetooth=bluetoothview1";
_bluetooth = (b4a.OPTUMizerPhysician.bluetooth)(_bluetoothview1);
 //BA.debugLineNum = 97;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 98;BA.debugLine="ToastMessageShow(\"Connected successfully\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Connected successfully"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 103;BA.debugLine="astream.Initialize(Serial1.InputStream, Serial1.";
_astream.Initialize(processBA,_serial1.getInputStream(),_serial1.getOutputStream(),"astream");
 //BA.debugLineNum = 104;BA.debugLine="connected_BT = True";
_connected_bt = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 107;BA.debugLine="bluetooth.Label2.Text=\"Connected\"";
_bluetooth._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Connected"));
 }else {
 //BA.debugLineNum = 110;BA.debugLine="connected_BT = False";
_connected_bt = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 111;BA.debugLine="ToastMessageShow(\"Check BT connection\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Check BT connection"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 113;BA.debugLine="bluetooth.Label2.Text=\"DisConnected\"";
_bluetooth._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("DisConnected"));
 };
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 55;BA.debugLine="timer1.Initialize(\"Timer1\",1000*60)'one minute";
_timer1.Initialize(processBA,"Timer1",(long) (1000*60));
 //BA.debugLineNum = 56;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 57;BA.debugLine="sms_rx.Initialize(\"sms_rx\")";
_sms_rx.Initialize("sms_rx",processBA);
 //BA.debugLineNum = 58;BA.debugLine="Serial1.Initialize(\"Serial1\")";
_serial1.Initialize("Serial1");
 //BA.debugLineNum = 60;BA.debugLine="customview.Initialize";
_customview.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="myparser.Initialize(\"WTA\",Chr(13),1)";
_myparser._initialize /*String*/ (processBA,"WTA",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 65;BA.debugLine="volt.Initialize(\"Volt RMS: \",\"A\",1)";
_volt._initialize /*String*/ (processBA,"Volt RMS: ","A",(int) (1));
 //BA.debugLineNum = 66;BA.debugLine="energy.Initialize(\"Watt-Hour: \",\"I\",1)";
_energy._initialize /*String*/ (processBA,"Watt-Hour: ","I",(int) (1));
 //BA.debugLineNum = 67;BA.debugLine="amp.Initialize(\"Amp RMS: \",\"R\",1)";
_amp._initialize /*String*/ (processBA,"Amp RMS: ","R",(int) (1));
 //BA.debugLineNum = 68;BA.debugLine="powerWatt.Initialize(\"Real Power: \",\"V\",1)";
_powerwatt._initialize /*String*/ (processBA,"Real Power: ","V",(int) (1));
 //BA.debugLineNum = 69;BA.debugLine="parse1.Initialize(\"GETVAL$\",\"#\",1)";
_parse1._initialize /*String*/ (processBA,"GETVAL$","#",(int) (1));
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 235;BA.debugLine="ToastMessageShow(\"exit\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("exit"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public static boolean  _sms_rx_messagereceived(String _from,String _body) throws Exception{
String _strsend = "";
int _aa = 0;
String _z = "";
 //BA.debugLineNum = 160;BA.debugLine="Sub sms_rx_MessageReceived(From As String, Body As";
 //BA.debugLineNum = 161;BA.debugLine="Dim strsend As String";
_strsend = "";
 //BA.debugLineNum = 162;BA.debugLine="If Body=\"Hello\" Then";
if ((_body).equals("Hello")) { 
 //BA.debugLineNum = 163;BA.debugLine="sms.Send(From,\"what the hell\")";
_sms.Send(_from,"what the hell");
 };
 //BA.debugLineNum = 165;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 166;BA.debugLine="For aa = 0 To Body.Length-1";
{
final int step6 = 1;
final int limit6 = (int) (_body.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit6 ;_aa = _aa + step6 ) {
 //BA.debugLineNum = 167;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 168;BA.debugLine="z=Body.SubString2(aa,aa+1)";
_z = _body.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 169;BA.debugLine="If myparser.available(z)=True Then";
if (_myparser._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 170;BA.debugLine="ToastMessageShow(myparser.data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_myparser._data /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return false;
}
public static String  _timer1_tick() throws Exception{
String _strs = "";
 //BA.debugLineNum = 197;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 198;BA.debugLine="ToastMessageShow(\"saving logs to power_log.csv\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("saving logs to power_log.csv"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 200;BA.debugLine="If File.Exists(File.DirRootExternal, \"power_log.c";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"power_log.csv")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 201;BA.debugLine="Dim strs As String=vb6.GetFileStr(\"power_log.csv";
_strs = mostCurrent._vb6._getfilestr /*String*/ (processBA,"power_log.csv");
 //BA.debugLineNum = 202;BA.debugLine="strs=strs&voltx&\",\"&ampx&\",\"&powerWattx&\",\"&ener";
_strs = _strs+_voltx+","+_ampx+","+_powerwattx+","+_energyx+","+mostCurrent._vb6._now /*String*/ (processBA)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)));
 //BA.debugLineNum = 203;BA.debugLine="vb6.SaveFileStr(\"power_log.csv\",strs)";
mostCurrent._vb6._savefilestr /*String*/ (processBA,"power_log.csv",_strs);
 }else {
 //BA.debugLineNum = 205;BA.debugLine="vb6.SaveFileStr(\"power_log.csv\",\"Volt,Current,Po";
mostCurrent._vb6._savefilestr /*String*/ (processBA,"power_log.csv","Volt,Current,Power,Energy,Time"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)))+_voltx+","+_ampx+","+_powerwattx+","+_energyx+","+mostCurrent._vb6._now /*String*/ (processBA)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))));
 };
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_newdata(String _data) throws Exception{
int _aa = 0;
String _z = "";
 //BA.debugLineNum = 72;BA.debugLine="Sub wsh_NewData(data As String)";
 //BA.debugLineNum = 73;BA.debugLine="ToastMessageShow(data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_data),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 74;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 75;BA.debugLine="For aa = 0 To data.Length-1";
{
final int step3 = 1;
final int limit3 = (int) (_data.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit3 ;_aa = _aa + step3 ) {
 //BA.debugLineNum = 76;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 77;BA.debugLine="z=data.SubString2(aa,aa+1)";
_z = _data.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 78;BA.debugLine="If parse1.available(z)=True Then";
if (_parse1._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 79;BA.debugLine="ToastMessageShow(parse1.data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_parse1._data /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
}
