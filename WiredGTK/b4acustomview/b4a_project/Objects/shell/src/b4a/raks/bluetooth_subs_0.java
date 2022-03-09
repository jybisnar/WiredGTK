package b4a.raks;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bluetooth_subs_0 {


public static RemoteObject  _addtoparent(RemoteObject __ref,RemoteObject _parent,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToParent (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("addtoparent")) { return __ref.runUserSub(false, "bluetooth","addtoparent", __ref, _parent, _left, _top, _width, _height);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 22;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="mBase.Initialize(\"mBase\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase")));
 BA.debugLineNum = 24;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
Debug.ShouldStop(8388608);
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 25;BA.debugLine="GTKForms";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.raks.bluetooth.class, "_gtkforms" /*RemoteObject*/ );
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_bluetooth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("check_bluetooth (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("check_bluetooth")) { return __ref.runUserSub(false, "bluetooth","check_bluetooth", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Sub check_bluetooth";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="If Starter.Serial1.IsEnabled = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",bluetooth._starter._serial1 /*RemoteObject*/ .runMethod(true,"IsEnabled"),bluetooth.__c.getField(true,"False"))) { 
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Please enable Bluetooth.\", \"\")";
Debug.ShouldStop(16);
bluetooth.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please enable Bluetooth.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 71;BA.debugLine="If Starter.connected_BT=False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",bluetooth._starter._connected_bt /*RemoteObject*/ ,bluetooth.__c.getField(true,"False"))) { 
 BA.debugLineNum = 72;BA.debugLine="Starter.Serial1.Listen 'listen for incoming con";
Debug.ShouldStop(128);
bluetooth._starter._serial1 /*RemoteObject*/ .runVoidMethod ("Listen",__ref.getField(false, "ba"));
 };
 };
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
bluetooth._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",bluetooth._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
bluetooth._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",bluetooth._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Panel";
bluetooth._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",bluetooth._mbase);
 //BA.debugLineNum = 13;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
bluetooth._defaultcolorconstant = BA.numberCast(int.class, -(double) (0 + 984833));__ref.setField("_defaultcolorconstant",bluetooth._defaultcolorconstant);
 //BA.debugLineNum = 14;BA.debugLine="Dim imgconnect As ImageView";
bluetooth._imgconnect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgconnect",bluetooth._imgconnect);
 //BA.debugLineNum = 15;BA.debugLine="Dim Label2 As Label";
bluetooth._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2",bluetooth._label2);
 //BA.debugLineNum = 16;BA.debugLine="Dim Timer1 As Timer";
bluetooth._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",bluetooth._timer1);
 //BA.debugLineNum = 17;BA.debugLine="Dim imgdisconnect As ImageView";
bluetooth._imgdisconnect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgdisconnect",bluetooth._imgdisconnect);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "bluetooth","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="mBase = Base";
Debug.ShouldStop(64);
__ref.setField ("_mbase" /*RemoteObject*/ ,_base);
 BA.debugLineNum = 40;BA.debugLine="GTKForms";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.raks.bluetooth.class, "_gtkforms" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "bluetooth","getbase", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Return mBase";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlist(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("GetList (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("getlist")) { return __ref.runUserSub(false, "bluetooth","getlist", __ref, _l);}
Debug.locals.put("L", _l);
 BA.debugLineNum = 61;BA.debugLine="Sub GetList(L As List)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Return InputList(L, \"Choose device\", -1) 'show li";
Debug.ShouldStop(536870912);
if (true) return BA.NumberToString(bluetooth.__c.runMethodAndSync(true,"InputList",(Object)(_l),(Object)(BA.ObjectToCharSequence("Choose device")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),__ref.getField(false, "ba")));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("getvisible")) { return __ref.runUserSub(false, "bluetooth","getvisible", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Public Sub getVisible() As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Return mBase.Visible";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gtkforms(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GTKForms (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("gtkforms")) { return __ref.runUserSub(false, "bluetooth","gtkforms", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Public Sub GTKForms";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="mBase.Color=0x000000'transparent background";
Debug.ShouldStop(1024);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, 0x000000));
 BA.debugLineNum = 44;BA.debugLine="mBase.Width=100%x";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",bluetooth.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 45;BA.debugLine="mBase.height=100%y";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",bluetooth.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 46;BA.debugLine="mBase.AddView(imgconnect,0.08 * mBase.Width,0.18";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgconnect" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.08),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.18),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.43),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.14),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 47;BA.debugLine="imgconnect.Bitmap = LoadBitmapResize(File.DirAsse";
Debug.ShouldStop(16384);
__ref.getField(false,"_imgconnect" /*RemoteObject*/ ).runMethod(false,"setBitmap",(bluetooth.__c.runMethod(false,"LoadBitmapResize",(Object)(bluetooth.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("pics1.png")),(Object)(__ref.getField(false,"_imgconnect" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgconnect" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(bluetooth.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 48;BA.debugLine="mBase.AddView(imgdisconnect,0.61 * mBase.Width,0.";
Debug.ShouldStop(32768);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_imgdisconnect" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.61),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.21),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.20),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.07),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 49;BA.debugLine="imgdisconnect.Bitmap = LoadBitmapResize(File.DirA";
Debug.ShouldStop(65536);
__ref.getField(false,"_imgdisconnect" /*RemoteObject*/ ).runMethod(false,"setBitmap",(bluetooth.__c.runMethod(false,"LoadBitmapResize",(Object)(bluetooth.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("pics1.png")),(Object)(__ref.getField(false,"_imgdisconnect" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imgdisconnect" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(bluetooth.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 50;BA.debugLine="Label2.Color =  0x00ffffff";
Debug.ShouldStop(131072);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, 0x00ffffff));
 BA.debugLineNum = 51;BA.debugLine="Label2.TextColor = 0xff000000";
Debug.ShouldStop(262144);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, 0xff000000));
 BA.debugLineNum = 52;BA.debugLine="Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(524288);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {bluetooth.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),bluetooth.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 53;BA.debugLine="Label2.Text = \"Label1\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Label1"));
 BA.debugLineNum = 54;BA.debugLine="mBase.AddView(Label2,0.26 * mBase.Width,0.05 * mB";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label2" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.26),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.05),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.33),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.06),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
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
public static RemoteObject  _imgconnect_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgconnect_click (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("imgconnect_click")) { return __ref.runUserSub(false, "bluetooth","imgconnect_click", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Sub imgconnect_click()";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="CallSub(Starter,\"mnuConnect_Click\")";
Debug.ShouldStop(1);
bluetooth.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((bluetooth._starter.getObject())),(Object)(RemoteObject.createImmutable("mnuConnect_Click")));
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
public static RemoteObject  _imgdisconnect_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgdisconnect_click (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("imgdisconnect_click")) { return __ref.runUserSub(false, "bluetooth","imgdisconnect_click", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Sub imgdisconnect_click()";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="CallSub(Starter,\"mnuDisconnect_Click\")";
Debug.ShouldStop(524288);
bluetooth.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((bluetooth._starter.getObject())),(Object)(RemoteObject.createImmutable("mnuDisconnect_Click")));
 BA.debugLineNum = 85;BA.debugLine="Label2.Text=\"Disconnected\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Disconnected"));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bluetooth","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(134217728);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(268435456);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 30;BA.debugLine="imgconnect.Initialize(\"imgconnect\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_imgconnect" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("imgconnect")));
 BA.debugLineNum = 31;BA.debugLine="imgdisconnect.Initialize(\"imgdisconnect\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_imgdisconnect" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("imgdisconnect")));
 BA.debugLineNum = 32;BA.debugLine="Timer1.Initialize(\"Timer1\",1000)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 33;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(1);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",bluetooth.__c.getField(true,"True"));
 BA.debugLineNum = 34;BA.debugLine="Label2.Initialize(\"Label2\")";
Debug.ShouldStop(2);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Label2")));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_click (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "bluetooth","label2_click", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Sub Label2_click()";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _serial_print(RemoteObject __ref,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Serial_print (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("serial_print")) { return __ref.runUserSub(false, "bluetooth","serial_print", __ref, _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 80;BA.debugLine="Sub Serial_print(str As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="CallSub2( Starter,\"astream_write\",str)";
Debug.ShouldStop(65536);
bluetooth.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((bluetooth._starter.getObject())),(Object)(BA.ObjectToString("astream_write")),(Object)((_str)));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlayout(RemoteObject __ref,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetLayout (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setlayout")) { return __ref.runUserSub(false, "bluetooth","setlayout", __ref, _left, _top, _width, _height);}
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 102;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _flag) throws Exception{
try {
		Debug.PushSubsStack("setVisible (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "bluetooth","setvisible", __ref, _flag);}
Debug.locals.put("flag", _flag);
 BA.debugLineNum = 99;BA.debugLine="Public Sub setVisible(flag As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="mBase.Visible=flag";
Debug.ShouldStop(8);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",_flag);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (bluetooth) ","bluetooth",3,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("timer1_tick")) { return __ref.runUserSub(false, "bluetooth","timer1_tick", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Sub Timer1_Tick()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
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