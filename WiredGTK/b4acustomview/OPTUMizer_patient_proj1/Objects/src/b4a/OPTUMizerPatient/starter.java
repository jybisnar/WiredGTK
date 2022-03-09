package b4a.OPTUMizerPatient;


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
		    processBA = new BA(this, null, null, "b4a.OPTUMizerPatient", "b4a.OPTUMizerPatient.starter");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.OPTUMizerPatient.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
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
public static b4a.OPTUMizerPatient.wtaserver _wsh = null;
public static b4a.OPTUMizerPatient.clsparser _myparser = null;
public static b4a.OPTUMizerPatient.clsparser _parse1 = null;
public static b4a.OPTUMizerPatient.clsparser _volt = null;
public static b4a.OPTUMizerPatient.clsparser _amp = null;
public static b4a.OPTUMizerPatient.clsparser _powerwatt = null;
public static b4a.OPTUMizerPatient.clsparser _energy = null;
public static String _voltx = "";
public static String _ampx = "";
public static String _powerwattx = "";
public static String _energyx = "";
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static Object _plogin1 = null;
public static Object _phome1 = null;
public static Object _pprofile1 = null;
public static Object _pqr1 = null;
public static Object _pschedule1 = null;
public static Object _pappointment1 = null;
public static Object _pupdates1 = null;
public static Object _plogs1 = null;
public static Object _pmedication1 = null;
public static b4a.OPTUMizerPatient.starter._mytype _user = null;
public static String _serverurl = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public b4a.OPTUMizerPatient.b4xcollections _b4xcollections = null;
public static class _mytype{
public boolean IsInitialized;
public String Id;
public String Prefix;
public String First;
public String Last;
public String Address;
public String City;
public String State;
public String County;
public String Zip;
public String Start;
public String Stop;
public String DescriptionMed;
public String DescriptionAppoint;
public String Dispenses;
public String Percent;
public String progIncrement;
public String provider;
public String Lat;
public String Lon;
public String encounterProblem;
public String specialty;
public void Initialize() {
IsInitialized = true;
Id = "";
Prefix = "";
First = "";
Last = "";
Address = "";
City = "";
State = "";
County = "";
Zip = "";
Start = "";
Stop = "";
DescriptionMed = "";
DescriptionAppoint = "";
Dispenses = "";
Percent = "";
progIncrement = "";
provider = "";
Lat = "";
Lon = "";
encounterProblem = "";
specialty = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 230;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return false;
}
public static String  _astream_newdata(byte[] _buffer) throws Exception{
String _str = "";
int _aa = 0;
 //BA.debugLineNum = 152;BA.debugLine="Sub astream_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 153;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 154;BA.debugLine="str=BytesToString(Buffer, 0, Buffer.Length, \"UTF8";
_str = anywheresoftware.b4a.keywords.Common.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8");
 //BA.debugLineNum = 156;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static String  _conns(int _res,anywheresoftware.b4a.objects.collections.Map _paireddevices,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub conns(res As Int, PairedDevices As Map, L As L";
 //BA.debugLineNum = 124;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res)),1)";
_serial1.Connect3(processBA,BA.ObjectToString(_paireddevices.Get(_l.Get(_res))),(int) (1));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
float _lat = 0f;
float _lon = 0f;
String _speed = "";
 //BA.debugLineNum = 237;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
 //BA.debugLineNum = 238;BA.debugLine="Dim lat As Float= NumberFormat(Location1.Latitude";
_lat = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLatitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 239;BA.debugLine="Dim lon As Float= NumberFormat(Location1.Longitud";
_lon = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_location1.getLongitude(),(int) (1),(int) (6))));
 //BA.debugLineNum = 240;BA.debugLine="Dim speed As String = \"Speed = \" & Location1.Spee";
_speed = "Speed = "+BA.NumberToString(_location1.getSpeed());
 //BA.debugLineNum = 241;BA.debugLine="If wsh.connected=True Then";
if (_wsh._connected /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 242;BA.debugLine="wsh.SendClient(\"WTAGPS\" & lat & \",\" & lon & \",\"";
_wsh._sendclient /*String*/ ("WTAGPS"+BA.NumberToString(_lat)+","+BA.NumberToString(_lon)+","+_speed+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))));
 };
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public static String  _mnuconnect_click() throws Exception{
anywheresoftware.b4a.objects.collections.Map _paireddevices = null;
anywheresoftware.b4a.objects.collections.List _l = null;
int _i = 0;
int _res = 0;
 //BA.debugLineNum = 173;BA.debugLine="Sub mnuConnect_Click";
 //BA.debugLineNum = 174;BA.debugLine="Dim PairedDevices As Map";
_paireddevices = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 175;BA.debugLine="If connected_BT=False Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 176;BA.debugLine="PairedDevices = Serial1.GetPairedDevices";
_paireddevices = _serial1.GetPairedDevices();
 //BA.debugLineNum = 177;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 178;BA.debugLine="L.Initialize";
_l.Initialize();
 //BA.debugLineNum = 179;BA.debugLine="For i = 0 To PairedDevices.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_paireddevices.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 180;BA.debugLine="L.Add(PairedDevices.GetKeyAt(i)) 'add the frien";
_l.Add(_paireddevices.GetKeyAt(_i));
 }
};
 //BA.debugLineNum = 182;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 186;BA.debugLine="If res <> DialogResponse.CANCEL Then";
if (_res!=anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
 //BA.debugLineNum = 189;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res))";
_serial1.Connect3(processBA,BA.ObjectToString(_paireddevices.Get(_l.Get(_res))),(int) (1));
 };
 };
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public static String  _mnudisconnect_click() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub mnuDisconnect_Click";
 //BA.debugLineNum = 116;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 117;BA.debugLine="astream.Close";
_astream.Close();
 //BA.debugLineNum = 118;BA.debugLine="timer1.Enabled=False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 119;BA.debugLine="Serial1.Disconnect";
_serial1.Disconnect();
 //BA.debugLineNum = 120;BA.debugLine="connected_BT=False";
_connected_bt = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public static String  _msec(int _xa) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub msec(xa As Int)";
 //BA.debugLineNum = 216;BA.debugLine="msec_ = xa";
_msec_ = _xa;
 //BA.debugLineNum = 217;BA.debugLine="Do While(msec_<>0)";
while ((_msec_!=0)) {
 //BA.debugLineNum = 218;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
 }
;
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public static String  _println(String _str) throws Exception{
String _x = "";
 //BA.debugLineNum = 207;BA.debugLine="public Sub Println(str As String)";
 //BA.debugLineNum = 208;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 209;BA.debugLine="str=str&Chr(13)";
_str = _str+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)));
 //BA.debugLineNum = 210;BA.debugLine="x=str.Length";
_x = BA.NumberToString(_str.length());
 //BA.debugLineNum = 211;BA.debugLine="If connected_BT=True Then";
if (_connected_bt==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 212;BA.debugLine="astream.Write(str.GetBytes(\"UTF8\"))";
_astream.Write(_str.getBytes("UTF8"));
 };
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
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
_wsh = new b4a.OPTUMizerPatient.wtaserver();
 //BA.debugLineNum = 26;BA.debugLine="Dim myparser As clsParser";
_myparser = new b4a.OPTUMizerPatient.clsparser();
 //BA.debugLineNum = 27;BA.debugLine="Dim parse1 As clsParser";
_parse1 = new b4a.OPTUMizerPatient.clsparser();
 //BA.debugLineNum = 28;BA.debugLine="Dim volt As clsParser";
_volt = new b4a.OPTUMizerPatient.clsparser();
 //BA.debugLineNum = 29;BA.debugLine="Dim amp As clsParser";
_amp = new b4a.OPTUMizerPatient.clsparser();
 //BA.debugLineNum = 30;BA.debugLine="Dim powerWatt As clsParser";
_powerwatt = new b4a.OPTUMizerPatient.clsparser();
 //BA.debugLineNum = 31;BA.debugLine="Dim energy As clsParser";
_energy = new b4a.OPTUMizerPatient.clsparser();
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
 //BA.debugLineNum = 40;BA.debugLine="Dim PLogin1 As Object       '1";
_plogin1 = new Object();
 //BA.debugLineNum = 41;BA.debugLine="Dim PHome1 As Object        '2";
_phome1 = new Object();
 //BA.debugLineNum = 42;BA.debugLine="Dim PProfile1 As Object       '3";
_pprofile1 = new Object();
 //BA.debugLineNum = 43;BA.debugLine="Dim PQr1 As Object       '4";
_pqr1 = new Object();
 //BA.debugLineNum = 44;BA.debugLine="Dim PSchedule1 As Object       '5";
_pschedule1 = new Object();
 //BA.debugLineNum = 45;BA.debugLine="Dim PAppointment1 As Object       '6";
_pappointment1 = new Object();
 //BA.debugLineNum = 46;BA.debugLine="Dim PUpdates1 As Object       '7";
_pupdates1 = new Object();
 //BA.debugLineNum = 47;BA.debugLine="Dim PLogs1 As Object       '8";
_plogs1 = new Object();
 //BA.debugLineNum = 48;BA.debugLine="Dim PMedication1 As Object       '9";
_pmedication1 = new Object();
 //BA.debugLineNum = 50;BA.debugLine="Type MyType (Id As String, Prefix As String, Firs";
;
 //BA.debugLineNum = 57;BA.debugLine="Dim user As MyType";
_user = new b4a.OPTUMizerPatient.starter._mytype();
 //BA.debugLineNum = 59;BA.debugLine="Dim serverURL As String=\"192.168.43.210\" 'Change";
_serverurl = "192.168.43.210";
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _serial1_connected(boolean _success) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub Serial1_Connected (Success As Boolean)";
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 66;BA.debugLine="timer1.Initialize(\"Timer1\",1000*60)'one minute";
_timer1.Initialize(processBA,"Timer1",(long) (1000*60));
 //BA.debugLineNum = 67;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 68;BA.debugLine="sms_rx.Initialize(\"sms_rx\")";
_sms_rx.Initialize("sms_rx",processBA);
 //BA.debugLineNum = 69;BA.debugLine="Serial1.Initialize(\"Serial1\")";
_serial1.Initialize("Serial1");
 //BA.debugLineNum = 70;BA.debugLine="user.Initialize()";
_user.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="user.Id=\" \" 'This will get overridden by the back";
_user.Id /*String*/  = " ";
 //BA.debugLineNum = 72;BA.debugLine="user.Prefix=\" \"";
_user.Prefix /*String*/  = " ";
 //BA.debugLineNum = 73;BA.debugLine="user.First=\" \"";
_user.First /*String*/  = " ";
 //BA.debugLineNum = 74;BA.debugLine="user.Last=\" \"";
_user.Last /*String*/  = " ";
 //BA.debugLineNum = 75;BA.debugLine="user.Address=\" \"";
_user.Address /*String*/  = " ";
 //BA.debugLineNum = 76;BA.debugLine="user.City=\" \"";
_user.City /*String*/  = " ";
 //BA.debugLineNum = 77;BA.debugLine="user.State=\" \"";
_user.State /*String*/  = " ";
 //BA.debugLineNum = 78;BA.debugLine="user.County= \" \"";
_user.County /*String*/  = " ";
 //BA.debugLineNum = 79;BA.debugLine="user.Zip = \" \"";
_user.Zip /*String*/  = " ";
 //BA.debugLineNum = 80;BA.debugLine="user.Percent = \" \"";
_user.Percent /*String*/  = " ";
 //BA.debugLineNum = 81;BA.debugLine="user.progIncrement = \" \"";
_user.progIncrement /*String*/  = " ";
 //BA.debugLineNum = 82;BA.debugLine="user.Start = \" \"";
_user.Start /*String*/  = " ";
 //BA.debugLineNum = 83;BA.debugLine="user.Stop = \" \"";
_user.Stop /*String*/  = " ";
 //BA.debugLineNum = 84;BA.debugLine="user.DescriptionMed = \" \"";
_user.DescriptionMed /*String*/  = " ";
 //BA.debugLineNum = 85;BA.debugLine="user.DescriptionAppoint= \" \"";
_user.DescriptionAppoint /*String*/  = " ";
 //BA.debugLineNum = 86;BA.debugLine="user.Dispenses = \" \"";
_user.Dispenses /*String*/  = " ";
 //BA.debugLineNum = 87;BA.debugLine="user.provider= \" \"";
_user.provider /*String*/  = " ";
 //BA.debugLineNum = 88;BA.debugLine="user.Lat= \" \"";
_user.Lat /*String*/  = " ";
 //BA.debugLineNum = 89;BA.debugLine="user.Lon= \" \"";
_user.Lon /*String*/  = " ";
 //BA.debugLineNum = 90;BA.debugLine="user.encounterProblem = \" \"";
_user.encounterProblem /*String*/  = " ";
 //BA.debugLineNum = 91;BA.debugLine="user.specialty = \" \"";
_user.specialty /*String*/  = " ";
 //BA.debugLineNum = 92;BA.debugLine="customview.Initialize";
_customview.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="myparser.Initialize(\"WTA\",Chr(13),1)";
_myparser._initialize /*String*/ (processBA,"WTA",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))),(int) (1));
 //BA.debugLineNum = 97;BA.debugLine="volt.Initialize(\"Volt RMS: \",\"A\",1)";
_volt._initialize /*String*/ (processBA,"Volt RMS: ","A",(int) (1));
 //BA.debugLineNum = 98;BA.debugLine="energy.Initialize(\"Watt-Hour: \",\"I\",1)";
_energy._initialize /*String*/ (processBA,"Watt-Hour: ","I",(int) (1));
 //BA.debugLineNum = 99;BA.debugLine="amp.Initialize(\"Amp RMS: \",\"R\",1)";
_amp._initialize /*String*/ (processBA,"Amp RMS: ","R",(int) (1));
 //BA.debugLineNum = 100;BA.debugLine="powerWatt.Initialize(\"Real Power: \",\"V\",1)";
_powerwatt._initialize /*String*/ (processBA,"Real Power: ","V",(int) (1));
 //BA.debugLineNum = 101;BA.debugLine="parse1.Initialize(\"GETVAL$\",\"#\",1)";
_parse1._initialize /*String*/ (processBA,"GETVAL$","#",(int) (1));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 234;BA.debugLine="ToastMessageShow(\"exit\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("exit"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public static boolean  _sms_rx_messagereceived(String _from,String _body) throws Exception{
String _strsend = "";
int _aa = 0;
String _z = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub sms_rx_MessageReceived(From As String, Body As";
 //BA.debugLineNum = 160;BA.debugLine="Dim strsend As String";
_strsend = "";
 //BA.debugLineNum = 161;BA.debugLine="If Body=\"Hello\" Then";
if ((_body).equals("Hello")) { 
 //BA.debugLineNum = 162;BA.debugLine="sms.Send(From,\"what the hell\")";
_sms.Send(_from,"what the hell");
 };
 //BA.debugLineNum = 164;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 165;BA.debugLine="For aa = 0 To Body.Length-1";
{
final int step6 = 1;
final int limit6 = (int) (_body.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit6 ;_aa = _aa + step6 ) {
 //BA.debugLineNum = 166;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 167;BA.debugLine="z=Body.SubString2(aa,aa+1)";
_z = _body.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 168;BA.debugLine="If myparser.available(z)=True Then";
if (_myparser._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 169;BA.debugLine="ToastMessageShow(myparser.data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_myparser._data /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return false;
}
public static String  _timer1_tick() throws Exception{
String _strs = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 197;BA.debugLine="ToastMessageShow(\"saving logs to power_log.csv\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("saving logs to power_log.csv"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 199;BA.debugLine="If File.Exists(File.DirRootExternal, \"power_log.c";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"power_log.csv")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 200;BA.debugLine="Dim strs As String=vb6.GetFileStr(\"power_log.csv";
_strs = mostCurrent._vb6._getfilestr /*String*/ (processBA,"power_log.csv");
 //BA.debugLineNum = 201;BA.debugLine="strs=strs&voltx&\",\"&ampx&\",\"&powerWattx&\",\"&ener";
_strs = _strs+_voltx+","+_ampx+","+_powerwattx+","+_energyx+","+mostCurrent._vb6._now /*String*/ (processBA)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)));
 //BA.debugLineNum = 202;BA.debugLine="vb6.SaveFileStr(\"power_log.csv\",strs)";
mostCurrent._vb6._savefilestr /*String*/ (processBA,"power_log.csv",_strs);
 }else {
 //BA.debugLineNum = 204;BA.debugLine="vb6.SaveFileStr(\"power_log.csv\",\"Volt,Current,Po";
mostCurrent._vb6._savefilestr /*String*/ (processBA,"power_log.csv","Volt,Current,Power,Energy,Time"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)))+_voltx+","+_ampx+","+_powerwattx+","+_energyx+","+mostCurrent._vb6._now /*String*/ (processBA)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13))));
 };
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_newdata(String _data) throws Exception{
int _aa = 0;
String _z = "";
 //BA.debugLineNum = 104;BA.debugLine="Sub wsh_NewData(data As String)";
 //BA.debugLineNum = 105;BA.debugLine="ToastMessageShow(data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_data),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 106;BA.debugLine="Dim aa As Int";
_aa = 0;
 //BA.debugLineNum = 107;BA.debugLine="For aa = 0 To data.Length-1";
{
final int step3 = 1;
final int limit3 = (int) (_data.length()-1);
_aa = (int) (0) ;
for (;_aa <= limit3 ;_aa = _aa + step3 ) {
 //BA.debugLineNum = 108;BA.debugLine="Dim z As String";
_z = "";
 //BA.debugLineNum = 109;BA.debugLine="z=data.SubString2(aa,aa+1)";
_z = _data.substring(_aa,(int) (_aa+1));
 //BA.debugLineNum = 110;BA.debugLine="If parse1.available(z)=True Then";
if (_parse1._available /*boolean*/ (_z)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 111;BA.debugLine="ToastMessageShow(parse1.data,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_parse1._data /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
}
