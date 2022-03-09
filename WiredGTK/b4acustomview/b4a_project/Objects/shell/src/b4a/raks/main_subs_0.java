package b4a.raks;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return b4a.raks.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="If FirstTime=True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_firsttime,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"Layout1\")";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="bluetooth1.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(268435456);
main.mostCurrent._bluetooth1.runClassMethod (b4a.raks.bluetooth.class, "_setlayout" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 30;BA.debugLine="frmusercontrol1.SetLayout(0,0,100%x,100%y)";
Debug.ShouldStop(536870912);
main.mostCurrent._frmusercontrol1.runClassMethod (b4a.raks.frmusercontrol.class, "_setlayout" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 31;BA.debugLine="bluetooth1.Visible=False";
Debug.ShouldStop(1073741824);
main.mostCurrent._bluetooth1.runClassMethod (b4a.raks.bluetooth.class, "_setvisible" /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="frmusercontrol1.Visible=True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._frmusercontrol1.runClassMethod (b4a.raks.frmusercontrol.class, "_setvisible" /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,46);
if (RapidSub.canDelegate("activity_pause")) { return b4a.raks.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="ToastMessageShow(\"pause : \" & UserClosed,False)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("pause : "),_userclosed))),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 48;BA.debugLine="If UserClosed=True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_userclosed,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 49;BA.debugLine="ExitApplication";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) { return b4a.raks.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="ToastMessageShow(\"resume\",False)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("resume")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 40;BA.debugLine="bluetooth1.check_bluetooth'warn user to turn on b";
Debug.ShouldStop(128);
main.mostCurrent._bluetooth1.runClassMethod (b4a.raks.bluetooth.class, "_check_bluetooth" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="If Starter.customview.Size=0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",main.mostCurrent._starter._customview /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 42;BA.debugLine="Starter.bluetoothview=bluetooth1";
Debug.ShouldStop(512);
main.mostCurrent._starter._bluetoothview /*RemoteObject*/  = (main.mostCurrent._bluetooth1);
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frmdev1_exampleevent(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("frmdev1_ExampleEvent (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("frmdev1_exampleevent")) { return b4a.raks.main.remoteMe.runUserSub(false, "main","frmdev1_exampleevent", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 59;BA.debugLine="Sub frmdev1_ExampleEvent (Value As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="bluetooth1.Visible=True";
Debug.ShouldStop(134217728);
main.mostCurrent._bluetooth1.runClassMethod (b4a.raks.bluetooth.class, "_setvisible" /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frmusercontrol1_exampleevent(RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("frmusercontrol1_ExampleEvent (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("frmusercontrol1_exampleevent")) { return b4a.raks.main.remoteMe.runUserSub(false, "main","frmusercontrol1_exampleevent", _x);}
Debug.locals.put("x", _x);
 BA.debugLineNum = 52;BA.debugLine="Sub frmusercontrol1_ExampleEvent(x As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="frmusercontrol1.Visible=False";
Debug.ShouldStop(2097152);
main.mostCurrent._frmusercontrol1.runClassMethod (b4a.raks.frmusercontrol.class, "_setvisible" /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 55;BA.debugLine="bluetooth1.Visible=True";
Debug.ShouldStop(4194304);
main.mostCurrent._bluetooth1.runClassMethod (b4a.raks.bluetooth.class, "_setvisible" /*RemoteObject*/ ,main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private bluetooth1 As bluetooth";
main.mostCurrent._bluetooth1 = RemoteObject.createNew ("b4a.raks.bluetooth");
 //BA.debugLineNum = 20;BA.debugLine="Private frmusercontrol1 As frmusercontrol";
main.mostCurrent._frmusercontrol1 = RemoteObject.createNew ("b4a.raks.frmusercontrol");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("listview1_itemclick")) { return b4a.raks.main.remoteMe.runUserSub(false, "main","listview1_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 63;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
vb6_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.raks.main");
frmusercontrol.myClass = BA.getDeviceClass ("b4a.raks.frmusercontrol");
starter.myClass = BA.getDeviceClass ("b4a.raks.starter");
bluetooth.myClass = BA.getDeviceClass ("b4a.raks.bluetooth");
wtaserver.myClass = BA.getDeviceClass ("b4a.raks.wtaserver");
clsparser.myClass = BA.getDeviceClass ("b4a.raks.clsparser");
table.myClass = BA.getDeviceClass ("b4a.raks.table");
vb6.myClass = BA.getDeviceClass ("b4a.raks.vb6");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}