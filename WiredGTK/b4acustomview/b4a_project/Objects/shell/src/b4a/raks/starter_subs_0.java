package b4a.raks;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",2,starter.processBA,starter.mostCurrent,169);
if (RapidSub.canDelegate("application_error")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 169;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _astream_newdata(RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("astream_NewData (starter) ","starter",2,starter.processBA,starter.mostCurrent,96);
if (RapidSub.canDelegate("astream_newdata")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","astream_newdata", _buffer);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _aa = RemoteObject.createImmutable(0);
RemoteObject _z = RemoteObject.createImmutable("");
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 96;BA.debugLine="Sub astream_NewData (Buffer() As Byte)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim str As String";
Debug.ShouldStop(1);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 98;BA.debugLine="str=BytesToString(Buffer, 0, Buffer.Length, \"UTF8";
Debug.ShouldStop(2);
_str = starter.mostCurrent.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("str", _str);
 BA.debugLineNum = 99;BA.debugLine="ToastMessageShow(str,False)";
Debug.ShouldStop(4);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_str)),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 100;BA.debugLine="Dim aa As Int";
Debug.ShouldStop(8);
_aa = RemoteObject.createImmutable(0);Debug.locals.put("aa", _aa);
 BA.debugLineNum = 101;BA.debugLine="For aa = 0 To str.Length-1";
Debug.ShouldStop(16);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_aa = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _aa.<Integer>get().intValue() <= limit5) || (step5 < 0 && _aa.<Integer>get().intValue() >= limit5) ;_aa = RemoteObject.createImmutable((int)(0 + _aa.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("aa", _aa);
 BA.debugLineNum = 102;BA.debugLine="Dim z As String";
Debug.ShouldStop(32);
_z = RemoteObject.createImmutable("");Debug.locals.put("z", _z);
 BA.debugLineNum = 103;BA.debugLine="z=str.SubString2(aa,aa+1)";
Debug.ShouldStop(64);
_z = _str.runMethod(true,"substring",(Object)(_aa),(Object)(RemoteObject.solve(new RemoteObject[] {_aa,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("z", _z);
 BA.debugLineNum = 104;BA.debugLine="If myparserserial.available(z)=True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",starter._myparserserial.runClassMethod (b4a.raks.clsparser.class, "_available" /*RemoteObject*/ ,(Object)(_z)),starter.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 105;BA.debugLine="ToastMessageShow(myparserserial.data,False)";
Debug.ShouldStop(256);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(starter._myparserserial.getField(true,"_data" /*RemoteObject*/ ))),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 };
 }
}Debug.locals.put("aa", _aa);
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _astream_write(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("astream_write (starter) ","starter",2,starter.processBA,starter.mostCurrent,150);
if (RapidSub.canDelegate("astream_write")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","astream_write", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 150;BA.debugLine="Sub astream_write(str As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="If connected_BT=True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",starter._connected_bt,starter.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 152;BA.debugLine="astream.Write(str.GetBytes(\"UTF8\"))";
Debug.ShouldStop(8388608);
starter._astream.runVoidMethod ("Write",(Object)(_str.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 };
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _conns(RemoteObject _res,RemoteObject _paireddevices,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("conns (starter) ","starter",2,starter.processBA,starter.mostCurrent,67);
if (RapidSub.canDelegate("conns")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","conns", _res, _paireddevices, _l);}
Debug.locals.put("res", _res);
Debug.locals.put("PairedDevices", _paireddevices);
Debug.locals.put("L", _l);
 BA.debugLineNum = 67;BA.debugLine="Sub conns(res As Int, PairedDevices As Map, L As L";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res)),1)";
Debug.ShouldStop(8);
starter._serial1.runVoidMethod ("Connect3",starter.processBA,(Object)(BA.ObjectToString(_paireddevices.runMethod(false,"Get",(Object)(_l.runMethod(false,"Get",(Object)(_res)))))),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS_LocationChanged (starter) ","starter",2,starter.processBA,starter.mostCurrent,177);
if (RapidSub.canDelegate("gps_locationchanged")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","gps_locationchanged", _location1);}
RemoteObject _lat = RemoteObject.createImmutable(0f);
RemoteObject _lon = RemoteObject.createImmutable(0f);
RemoteObject _speed = RemoteObject.createImmutable("");
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 177;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Dim lat As Float= NumberFormat(Location1.Latitude";
Debug.ShouldStop(131072);
_lat = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_location1.runMethod(true,"getLatitude")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 6))));Debug.locals.put("lat", _lat);Debug.locals.put("lat", _lat);
 BA.debugLineNum = 179;BA.debugLine="Dim lon As Float= NumberFormat(Location1.Longitud";
Debug.ShouldStop(262144);
_lon = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_location1.runMethod(true,"getLongitude")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 6))));Debug.locals.put("lon", _lon);Debug.locals.put("lon", _lon);
 BA.debugLineNum = 180;BA.debugLine="Dim speed As String = \"Speed = \" & Location1.Spee";
Debug.ShouldStop(524288);
_speed = RemoteObject.concat(RemoteObject.createImmutable("Speed = "),_location1.runMethod(true,"getSpeed"));Debug.locals.put("speed", _speed);Debug.locals.put("speed", _speed);
 BA.debugLineNum = 181;BA.debugLine="If wsh.connected=True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",starter._wsh.getField(true,"_connected" /*RemoteObject*/ ),starter.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 182;BA.debugLine="wsh.SendClient(\"WTAGPS\" & lat & \",\" & lon & \",\"";
Debug.ShouldStop(2097152);
starter._wsh.runClassMethod (b4a.raks.wtaserver.class, "_sendclient" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("WTAGPS"),_lat,RemoteObject.createImmutable(","),_lon,RemoteObject.createImmutable(","),_speed,starter.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))))));
 };
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mnuconnect_click() throws Exception{
try {
		Debug.PushSubsStack("mnuConnect_Click (starter) ","starter",2,starter.processBA,starter.mostCurrent,124);
if (RapidSub.canDelegate("mnuconnect_click")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","mnuconnect_click");}
RemoteObject _paireddevices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _bluetooth = RemoteObject.declareNull("b4a.raks.bluetooth");
 BA.debugLineNum = 124;BA.debugLine="Sub mnuConnect_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Dim PairedDevices As Map";
Debug.ShouldStop(268435456);
_paireddevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("PairedDevices", _paireddevices);
 BA.debugLineNum = 126;BA.debugLine="If connected_BT=False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",starter._connected_bt,starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 127;BA.debugLine="PairedDevices = Serial1.GetPairedDevices";
Debug.ShouldStop(1073741824);
_paireddevices = starter._serial1.runMethod(false,"GetPairedDevices");Debug.locals.put("PairedDevices", _paireddevices);
 BA.debugLineNum = 128;BA.debugLine="Dim L As List";
Debug.ShouldStop(-2147483648);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("L", _l);
 BA.debugLineNum = 129;BA.debugLine="L.Initialize";
Debug.ShouldStop(1);
_l.runVoidMethod ("Initialize");
 BA.debugLineNum = 130;BA.debugLine="For i = 0 To PairedDevices.Size - 1";
Debug.ShouldStop(2);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_paireddevices.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 131;BA.debugLine="L.Add(PairedDevices.GetKeyAt(i)) 'add the frien";
Debug.ShouldStop(4);
_l.runVoidMethod ("Add",(Object)(_paireddevices.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 133;BA.debugLine="Dim res As Int";
Debug.ShouldStop(16);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 134;BA.debugLine="Dim bluetooth As bluetooth=bluetoothview";
Debug.ShouldStop(32);
_bluetooth = (starter._bluetoothview);Debug.locals.put("bluetooth", _bluetooth);Debug.locals.put("bluetooth", _bluetooth);
 BA.debugLineNum = 135;BA.debugLine="res=CallSub2(bluetooth,\"Getlist\",L)";
Debug.ShouldStop(64);
_res = BA.numberCast(int.class, starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",starter.processBA,(Object)((_bluetooth)),(Object)(BA.ObjectToString("Getlist")),(Object)((_l))));Debug.locals.put("res", _res);
 BA.debugLineNum = 137;BA.debugLine="If res <> DialogResponse.CANCEL Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_res,BA.numberCast(double.class, starter.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
 BA.debugLineNum = 140;BA.debugLine="Serial1.Connect3(PairedDevices.Get(L.Get(res))";
Debug.ShouldStop(2048);
starter._serial1.runVoidMethod ("Connect3",starter.processBA,(Object)(BA.ObjectToString(_paireddevices.runMethod(false,"Get",(Object)(_l.runMethod(false,"Get",(Object)(_res)))))),(Object)(BA.numberCast(int.class, 1)));
 };
 };
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mnudisconnect_click() throws Exception{
try {
		Debug.PushSubsStack("mnuDisconnect_Click (starter) ","starter",2,starter.processBA,starter.mostCurrent,59);
if (RapidSub.canDelegate("mnudisconnect_click")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","mnudisconnect_click");}
 BA.debugLineNum = 59;BA.debugLine="Sub mnuDisconnect_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="If connected_BT=True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",starter._connected_bt,starter.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 61;BA.debugLine="astream.Close";
Debug.ShouldStop(268435456);
starter._astream.runVoidMethod ("Close");
 BA.debugLineNum = 62;BA.debugLine="timer1.Enabled=False";
Debug.ShouldStop(536870912);
starter._timer1.runMethod(true,"setEnabled",starter.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 63;BA.debugLine="Serial1.Disconnect";
Debug.ShouldStop(1073741824);
starter._serial1.runVoidMethod ("Disconnect");
 BA.debugLineNum = 64;BA.debugLine="connected_BT=False";
Debug.ShouldStop(-2147483648);
starter._connected_bt = starter.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msec(RemoteObject _xa) throws Exception{
try {
		Debug.PushSubsStack("msec (starter) ","starter",2,starter.processBA,starter.mostCurrent,155);
if (RapidSub.canDelegate("msec")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","msec", _xa);}
Debug.locals.put("xa", _xa);
 BA.debugLineNum = 155;BA.debugLine="Sub msec(xa As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="msec_ = xa";
Debug.ShouldStop(134217728);
starter._msec_ = _xa;
 BA.debugLineNum = 157;BA.debugLine="Do While(msec_<>0)";
Debug.ShouldStop(268435456);
while ((RemoteObject.solveBoolean("!",starter._msec_,BA.numberCast(double.class, 0)))) {
 BA.debugLineNum = 158;BA.debugLine="DoEvents";
Debug.ShouldStop(536870912);
starter.mostCurrent.__c.runVoidMethodAndSync ("DoEvents");
 }
;
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim sms_rx As SmsInterceptor";
starter._sms_rx = RemoteObject.createNew ("anywheresoftware.b4a.phone.PhoneEvents.SMSInterceptor");
 //BA.debugLineNum = 14;BA.debugLine="Dim sms As PhoneSms";
starter._sms = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneSms");
 //BA.debugLineNum = 17;BA.debugLine="Dim timer1 As Timer";
starter._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 18;BA.debugLine="Private astream As AsyncStreams";
starter._astream = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 19;BA.debugLine="Dim connected_BT As Boolean";
starter._connected_bt = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 20;BA.debugLine="Dim Serial1 As Serial";
starter._serial1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial");
 //BA.debugLineNum = 21;BA.debugLine="Dim msec_ As Int'in 100 ms";
starter._msec_ = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Dim customview As List";
starter._customview = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Dim bluetoothview As Object";
starter._bluetoothview = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 24;BA.debugLine="Dim wsh As WTAServer";
starter._wsh = RemoteObject.createNew ("b4a.raks.wtaserver");
 //BA.debugLineNum = 25;BA.debugLine="Dim myparser As clsParser";
starter._myparser = RemoteObject.createNew ("b4a.raks.clsparser");
 //BA.debugLineNum = 26;BA.debugLine="Dim parse1 As clsParser";
starter._parse1 = RemoteObject.createNew ("b4a.raks.clsparser");
 //BA.debugLineNum = 27;BA.debugLine="Dim myparserserial As clsParser";
starter._myparserserial = RemoteObject.createNew ("b4a.raks.clsparser");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _serial1_connected(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Serial1_Connected (starter) ","starter",2,starter.processBA,starter.mostCurrent,71);
if (RapidSub.canDelegate("serial1_connected")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","serial1_connected", _success);}
RemoteObject _bluetooth = RemoteObject.declareNull("b4a.raks.bluetooth");
Debug.locals.put("Success", _success);
 BA.debugLineNum = 71;BA.debugLine="Sub Serial1_Connected (Success As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Dim bluetooth As bluetooth=bluetoothview";
Debug.ShouldStop(128);
_bluetooth = (starter._bluetoothview);Debug.locals.put("bluetooth", _bluetooth);Debug.locals.put("bluetooth", _bluetooth);
 BA.debugLineNum = 73;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 74;BA.debugLine="ToastMessageShow(\"Connected successfully\", False";
Debug.ShouldStop(512);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Connected successfully")),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 79;BA.debugLine="astream.Initialize(Serial1.InputStream, Serial1.";
Debug.ShouldStop(16384);
starter._astream.runVoidMethod ("Initialize",starter.processBA,(Object)(starter._serial1.runMethod(false,"getInputStream")),(Object)(starter._serial1.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("astream")));
 BA.debugLineNum = 80;BA.debugLine="connected_BT = True";
Debug.ShouldStop(32768);
starter._connected_bt = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 83;BA.debugLine="bluetooth.Label2.Text=\"Connected\"";
Debug.ShouldStop(262144);
_bluetooth.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Connected"));
 }else {
 BA.debugLineNum = 86;BA.debugLine="connected_BT = False";
Debug.ShouldStop(2097152);
starter._connected_bt = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 87;BA.debugLine="ToastMessageShow(\"Check BT connection\", False)";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Check BT connection")),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 89;BA.debugLine="bluetooth.Label2.Text=\"DisConnected\"";
Debug.ShouldStop(16777216);
_bluetooth.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("DisConnected"));
 };
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",2,starter.processBA,starter.mostCurrent,31);
if (RapidSub.canDelegate("service_create")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 31;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 37;BA.debugLine="sms_rx.Initialize(\"sms_rx\")";
Debug.ShouldStop(16);
starter._sms_rx.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("sms_rx")),starter.processBA);
 BA.debugLineNum = 38;BA.debugLine="Serial1.Initialize(\"Serial1\")";
Debug.ShouldStop(32);
starter._serial1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Serial1")));
 BA.debugLineNum = 40;BA.debugLine="customview.Initialize";
Debug.ShouldStop(128);
starter._customview.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="wsh.Initialize(Me,\"wsh\",\"myandroid\",\"raspOrPC\")";
Debug.ShouldStop(256);
starter._wsh.runClassMethod (b4a.raks.wtaserver.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(starter.getObject()),(Object)(BA.ObjectToString("wsh")),(Object)(BA.ObjectToString("myandroid")),(Object)(RemoteObject.createImmutable("raspOrPC")));
 BA.debugLineNum = 42;BA.debugLine="wsh.InitWTAServer()";
Debug.ShouldStop(512);
starter._wsh.runClassMethod (b4a.raks.wtaserver.class, "_initwtaserver" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="myparser.Initialize(\"WTA$\",Chr(13),1)";
Debug.ShouldStop(2048);
starter._myparser.runClassMethod (b4a.raks.clsparser.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("WTA$")),(Object)(BA.ObjectToString(starter.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))))),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 45;BA.debugLine="myparserserial.Initialize(\"WTA2$\",Chr(13),1)";
Debug.ShouldStop(4096);
starter._myparserserial.runClassMethod (b4a.raks.clsparser.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("WTA2$")),(Object)(BA.ObjectToString(starter.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))))),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 46;BA.debugLine="parse1.Initialize(\"GETVAL$\",\"#\",1)";
Debug.ShouldStop(8192);
starter._parse1.runClassMethod (b4a.raks.clsparser.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("GETVAL$")),(Object)(BA.ObjectToString("#")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",2,starter.processBA,starter.mostCurrent,173);
if (RapidSub.canDelegate("service_destroy")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 173;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="ToastMessageShow(\"exit\",True)";
Debug.ShouldStop(8192);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("exit")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",2,starter.processBA,starter.mostCurrent,161);
if (RapidSub.canDelegate("service_start")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 161;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",2,starter.processBA,starter.mostCurrent,164);
if (RapidSub.canDelegate("service_taskremoved")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 164;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(8);
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sms_rx_messagereceived(RemoteObject _from,RemoteObject _body) throws Exception{
try {
		Debug.PushSubsStack("sms_rx_MessageReceived (starter) ","starter",2,starter.processBA,starter.mostCurrent,110);
if (RapidSub.canDelegate("sms_rx_messagereceived")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","sms_rx_messagereceived", _from, _body);}
RemoteObject _strsend = RemoteObject.createImmutable("");
RemoteObject _aa = RemoteObject.createImmutable(0);
RemoteObject _z = RemoteObject.createImmutable("");
Debug.locals.put("From", _from);
Debug.locals.put("Body", _body);
 BA.debugLineNum = 110;BA.debugLine="Sub sms_rx_MessageReceived(From As String, Body As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Dim strsend As String";
Debug.ShouldStop(16384);
_strsend = RemoteObject.createImmutable("");Debug.locals.put("strsend", _strsend);
 BA.debugLineNum = 112;BA.debugLine="If Body=\"Hello\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_body,BA.ObjectToString("Hello"))) { 
 BA.debugLineNum = 113;BA.debugLine="sms.Send(From,\"what the hell\")";
Debug.ShouldStop(65536);
starter._sms.runVoidMethod ("Send",(Object)(_from),(Object)(RemoteObject.createImmutable("what the hell")));
 };
 BA.debugLineNum = 115;BA.debugLine="Dim aa As Int";
Debug.ShouldStop(262144);
_aa = RemoteObject.createImmutable(0);Debug.locals.put("aa", _aa);
 BA.debugLineNum = 116;BA.debugLine="For aa = 0 To Body.Length-1";
Debug.ShouldStop(524288);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_body.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_aa = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _aa.<Integer>get().intValue() <= limit6) || (step6 < 0 && _aa.<Integer>get().intValue() >= limit6) ;_aa = RemoteObject.createImmutable((int)(0 + _aa.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("aa", _aa);
 BA.debugLineNum = 117;BA.debugLine="Dim z As String";
Debug.ShouldStop(1048576);
_z = RemoteObject.createImmutable("");Debug.locals.put("z", _z);
 BA.debugLineNum = 118;BA.debugLine="z=Body.SubString2(aa,aa+1)";
Debug.ShouldStop(2097152);
_z = _body.runMethod(true,"substring",(Object)(_aa),(Object)(RemoteObject.solve(new RemoteObject[] {_aa,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("z", _z);
 BA.debugLineNum = 119;BA.debugLine="If myparser.available(z)=True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",starter._myparser.runClassMethod (b4a.raks.clsparser.class, "_available" /*RemoteObject*/ ,(Object)(_z)),starter.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 120;BA.debugLine="ToastMessageShow(myparser.data,False)";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(starter._myparser.getField(true,"_data" /*RemoteObject*/ ))),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 };
 }
}Debug.locals.put("aa", _aa);
;
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (starter) ","starter",2,starter.processBA,starter.mostCurrent,147);
if (RapidSub.canDelegate("timer1_tick")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","timer1_tick");}
 BA.debugLineNum = 147;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _wsh_newdata(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("wsh_NewData (starter) ","starter",2,starter.processBA,starter.mostCurrent,48);
if (RapidSub.canDelegate("wsh_newdata")) { return b4a.raks.starter.remoteMe.runUserSub(false, "starter","wsh_newdata", _data);}
RemoteObject _aa = RemoteObject.createImmutable(0);
RemoteObject _z = RemoteObject.createImmutable("");
Debug.locals.put("data", _data);
 BA.debugLineNum = 48;BA.debugLine="Sub wsh_NewData(data As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="ToastMessageShow(data,False)";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_data)),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 50;BA.debugLine="Dim aa As Int";
Debug.ShouldStop(131072);
_aa = RemoteObject.createImmutable(0);Debug.locals.put("aa", _aa);
 BA.debugLineNum = 51;BA.debugLine="For aa = 0 To data.Length-1";
Debug.ShouldStop(262144);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_aa = BA.numberCast(int.class, 0) ;
for (;(step3 > 0 && _aa.<Integer>get().intValue() <= limit3) || (step3 < 0 && _aa.<Integer>get().intValue() >= limit3) ;_aa = RemoteObject.createImmutable((int)(0 + _aa.<Integer>get().intValue() + step3))  ) {
Debug.locals.put("aa", _aa);
 BA.debugLineNum = 52;BA.debugLine="Dim z As String";
Debug.ShouldStop(524288);
_z = RemoteObject.createImmutable("");Debug.locals.put("z", _z);
 BA.debugLineNum = 53;BA.debugLine="z=data.SubString2(aa,aa+1)";
Debug.ShouldStop(1048576);
_z = _data.runMethod(true,"substring",(Object)(_aa),(Object)(RemoteObject.solve(new RemoteObject[] {_aa,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("z", _z);
 BA.debugLineNum = 54;BA.debugLine="If parse1.available(z)=True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",starter._parse1.runClassMethod (b4a.raks.clsparser.class, "_available" /*RemoteObject*/ ,(Object)(_z)),starter.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 55;BA.debugLine="ToastMessageShow(parse1.data,False)";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(starter._parse1.getField(true,"_data" /*RemoteObject*/ ))),(Object)(starter.mostCurrent.__c.getField(true,"False")));
 };
 }
}Debug.locals.put("aa", _aa);
;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}