package b4a.raks;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frmusercontrol_subs_0 {


public static RemoteObject  _addtoparent(RemoteObject __ref,RemoteObject _parent,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToParent (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("addtoparent")) { return __ref.runUserSub(false, "frmusercontrol","addtoparent", __ref, _parent, _left, _top, _width, _height);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 28;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="mBase.Initialize(\"mBase\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase")));
 BA.debugLineNum = 30;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
Debug.ShouldStop(536870912);
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 31;BA.debugLine="GTKForms";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.raks.frmusercontrol.class, "_gtkforms" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbutton1_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckButton1_CheckedChange (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("checkbutton1_checkedchange")) { return __ref.runUserSub(false, "frmusercontrol","checkbutton1_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 111;BA.debugLine="Sub CheckButton1_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="ToastMessageShow(\"1c\",False)";
Debug.ShouldStop(32768);
frmusercontrol.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("1c")),(Object)(frmusercontrol.__c.getField(true,"False")));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbutton2_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckButton2_CheckedChange (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("checkbutton2_checkedchange")) { return __ref.runUserSub(false, "frmusercontrol","checkbutton2_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 114;BA.debugLine="Sub CheckButton2_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="ToastMessageShow(\"2c\",False)";
Debug.ShouldStop(262144);
frmusercontrol.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("2c")),(Object)(frmusercontrol.__c.getField(true,"False")));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
frmusercontrol._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",frmusercontrol._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
frmusercontrol._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",frmusercontrol._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Panel";
frmusercontrol._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",frmusercontrol._mbase);
 //BA.debugLineNum = 13;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
frmusercontrol._defaultcolorconstant = BA.numberCast(int.class, -(double) (0 + 984833));__ref.setField("_defaultcolorconstant",frmusercontrol._defaultcolorconstant);
 //BA.debugLineNum = 14;BA.debugLine="Dim Label1 As Label";
frmusercontrol._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",frmusercontrol._label1);
 //BA.debugLineNum = 15;BA.debugLine="Dim Label2 As Label";
frmusercontrol._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2",frmusercontrol._label2);
 //BA.debugLineNum = 16;BA.debugLine="Dim DatagridTreeView1 As Table";
frmusercontrol._datagridtreeview1 = RemoteObject.createNew ("b4a.raks.table");__ref.setField("_datagridtreeview1",frmusercontrol._datagridtreeview1);
 //BA.debugLineNum = 17;BA.debugLine="Dim Timer1 As Timer";
frmusercontrol._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",frmusercontrol._timer1);
 //BA.debugLineNum = 18;BA.debugLine="Dim mytimer As Timer";
frmusercontrol._mytimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_mytimer",frmusercontrol._mytimer);
 //BA.debugLineNum = 19;BA.debugLine="Dim Image1 As ImageView";
frmusercontrol._image1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_image1",frmusercontrol._image1);
 //BA.debugLineNum = 20;BA.debugLine="Dim RadioButton1 As RadioButton";
frmusercontrol._radiobutton1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");__ref.setField("_radiobutton1",frmusercontrol._radiobutton1);
 //BA.debugLineNum = 21;BA.debugLine="Dim RadioButton2 As RadioButton";
frmusercontrol._radiobutton2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");__ref.setField("_radiobutton2",frmusercontrol._radiobutton2);
 //BA.debugLineNum = 22;BA.debugLine="Dim CheckButton1 As CheckBox";
frmusercontrol._checkbutton1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_checkbutton1",frmusercontrol._checkbutton1);
 //BA.debugLineNum = 23;BA.debugLine="Dim CheckButton2 As CheckBox";
frmusercontrol._checkbutton2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");__ref.setField("_checkbutton2",frmusercontrol._checkbutton2);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _datagridtreeview1_cellclick(RemoteObject __ref,RemoteObject _col,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("DatagridTreeView1_CellClick (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("datagridtreeview1_cellclick")) { return __ref.runUserSub(false, "frmusercontrol","datagridtreeview1_cellclick", __ref, _col, _row);}
RemoteObject _val = RemoteObject.createImmutable("");
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 91;BA.debugLine="Sub DatagridTreeView1_CellClick (Col As Int, Row A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Log(\"CellClick: \" & Col & \" , \" & Row)";
Debug.ShouldStop(134217728);
frmusercontrol.__c.runVoidMethod ("LogImpl","21310721",RemoteObject.concat(RemoteObject.createImmutable("CellClick: "),_col,RemoteObject.createImmutable(" , "),_row),0);
 BA.debugLineNum = 93;BA.debugLine="Dim val As String = DatagridTreeView1.GetValue(Co";
Debug.ShouldStop(268435456);
_val = __ref.getField(false,"_datagridtreeview1" /*RemoteObject*/ ).runClassMethod (b4a.raks.table.class, "_getvalue" /*RemoteObject*/ ,(Object)(_col),(Object)(_row));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 94;BA.debugLine="ToastMessageShow(val,False)";
Debug.ShouldStop(536870912);
frmusercontrol.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_val)),(Object)(frmusercontrol.__c.getField(true,"False")));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "frmusercontrol","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 54;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="mBase = Base";
Debug.ShouldStop(4194304);
__ref.setField ("_mbase" /*RemoteObject*/ ,_base);
 BA.debugLineNum = 56;BA.debugLine="GTKForms";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.raks.frmusercontrol.class, "_gtkforms" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("GetBase (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "frmusercontrol","getbase", __ref);}
 BA.debugLineNum = 119;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Return mBase";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("getvisible")) { return __ref.runUserSub(false, "frmusercontrol","getvisible", __ref);}
 BA.debugLineNum = 122;BA.debugLine="Public Sub getVisible() As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Return mBase.Visible";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("GTKForms (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("gtkforms")) { return __ref.runUserSub(false, "frmusercontrol","gtkforms", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub GTKForms";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="mBase.Color=0x000000'transparent background";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, 0x000000));
 BA.debugLineNum = 60;BA.debugLine="mBase.Width=100%x";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",frmusercontrol.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 61;BA.debugLine="mBase.height=100%y";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",frmusercontrol.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")));
 BA.debugLineNum = 62;BA.debugLine="Label1.Color =  0x00ffffff";
Debug.ShouldStop(536870912);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, 0x00ffffff));
 BA.debugLineNum = 63;BA.debugLine="Label1.TextColor = 0xff000000";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, 0xff000000));
 BA.debugLineNum = 64;BA.debugLine="Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {frmusercontrol.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),frmusercontrol.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 65;BA.debugLine="Label1.Text = \"Label1\"";
Debug.ShouldStop(1);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Label1"));
 BA.debugLineNum = 66;BA.debugLine="mBase.AddView(Label1,0.08 * mBase.Width,0.04 * mB";
Debug.ShouldStop(2);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label1" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.08),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.04),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.24),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.06),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 67;BA.debugLine="Label2.Color =  0x00ffffff";
Debug.ShouldStop(4);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, 0x00ffffff));
 BA.debugLineNum = 68;BA.debugLine="Label2.TextColor = 0xff000000";
Debug.ShouldStop(8);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, 0xff000000));
 BA.debugLineNum = 69;BA.debugLine="Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
Debug.ShouldStop(16);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {frmusercontrol.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),frmusercontrol.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 70;BA.debugLine="Label2.Text = \"Label2\"";
Debug.ShouldStop(32);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Label2"));
 BA.debugLineNum = 71;BA.debugLine="mBase.AddView(Label2,0.39 * mBase.Width,0.04 * mB";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label2" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.39),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.04),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.24),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.06),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 72;BA.debugLine="DatagridTreeView1.AddToParent(mBase,0.08 * mBase.";
Debug.ShouldStop(128);
__ref.getField(false,"_datagridtreeview1" /*RemoteObject*/ ).runClassMethod (b4a.raks.table.class, "_addtoparent" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), __ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject()),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.08),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.19),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.48),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.34),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 74;BA.debugLine="DatagridTreeView1.SetDatagrid(Array As String (\"A";
Debug.ShouldStop(512);
__ref.getField(false,"_datagridtreeview1" /*RemoteObject*/ ).runClassMethod (b4a.raks.table.class, "_setdatagrid" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("A"),BA.ObjectToString("B"),RemoteObject.createImmutable("C")})),(Object)(frmusercontrol.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("1"),BA.ObjectToString("2"),RemoteObject.createImmutable("3")})),(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("4"),BA.ObjectToString("5"),RemoteObject.createImmutable("6")}))})))));
 BA.debugLineNum = 75;BA.debugLine="mBase.AddView(Image1,0.65 * mBase.Width,0.54 * mB";
Debug.ShouldStop(1024);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_image1" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.65),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.54),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.24),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.22),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 76;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_image1" /*RemoteObject*/ ).runMethod(false,"setBitmap",(frmusercontrol.__c.runMethod(false,"LoadBitmapResize",(Object)(frmusercontrol.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("pics1.png")),(Object)(__ref.getField(false,"_image1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_image1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(frmusercontrol.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 77;BA.debugLine="mBase.AddView(RadioButton1,0.59 * mBase.Width,0.1";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_radiobutton1" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.59),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.16),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.19),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.06),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 78;BA.debugLine="mBase.AddView(RadioButton2,0.60 * mBase.Width,0.4";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_radiobutton2" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.60),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.44),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.19),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.06),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 79;BA.debugLine="mBase.AddView(CheckButton1,0.09 * mBase.Width,0.5";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_checkbutton1" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.09),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.56),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.19),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.06),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
 BA.debugLineNum = 80;BA.debugLine="mBase.AddView(CheckButton2,0.09 * mBase.Width,0.6";
Debug.ShouldStop(32768);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_checkbutton2" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.09),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.63),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.19),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.06),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))));
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
public static RemoteObject  _image1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Image1_click (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("image1_click")) { return __ref.runUserSub(false, "frmusercontrol","image1_click", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Sub Image1_click()";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="If SubExists(mCallBack,mEventName & \"_\" & \"Exampl";
Debug.ShouldStop(16);
if (frmusercontrol.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_"),RemoteObject.createImmutable("ExampleEvent")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 102;BA.debugLine="CallSub2(mCallBack,mEventName & \"_\" & \"ExampleEv";
Debug.ShouldStop(32);
frmusercontrol.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_"),RemoteObject.createImmutable("ExampleEvent"))),(Object)(RemoteObject.createImmutable((123))));
 };
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "frmusercontrol","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(2);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(4);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 36;BA.debugLine="Label1.Initialize(\"Label1\")";
Debug.ShouldStop(8);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Label1")));
 BA.debugLineNum = 37;BA.debugLine="Label2.Initialize(\"Label2\")";
Debug.ShouldStop(16);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Label2")));
 BA.debugLineNum = 38;BA.debugLine="DatagridTreeView1.Initialize(Me,\"DatagridTreeView";
Debug.ShouldStop(32);
__ref.getField(false,"_datagridtreeview1" /*RemoteObject*/ ).runClassMethod (b4a.raks.table.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("DatagridTreeView1")),(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 41;BA.debugLine="Timer1.Initialize(\"Timer1\",1000)";
Debug.ShouldStop(256);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 42;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(512);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",frmusercontrol.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="mytimer.Initialize(\"mytimer\",1000)";
Debug.ShouldStop(1024);
__ref.getField(false,"_mytimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("mytimer")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 44;BA.debugLine="mytimer.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_mytimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",frmusercontrol.__c.getField(true,"True"));
 BA.debugLineNum = 45;BA.debugLine="Image1.Initialize(\"Image1\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_image1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Image1")));
 BA.debugLineNum = 46;BA.debugLine="RadioButton1.Initialize(\"RadioButton1\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_radiobutton1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("RadioButton1")));
 BA.debugLineNum = 47;BA.debugLine="RadioButton2.Initialize(\"RadioButton2\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_radiobutton2" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("RadioButton2")));
 BA.debugLineNum = 48;BA.debugLine="CheckButton1.Initialize(\"CheckButton1\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_checkbutton1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CheckButton1")));
 BA.debugLineNum = 49;BA.debugLine="CheckButton2.Initialize(\"CheckButton2\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_checkbutton2" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CheckButton2")));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1_click (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "frmusercontrol","label1_click", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Sub Label1_click()";
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
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_click (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "frmusercontrol","label2_click", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Sub Label2_click()";
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
public static RemoteObject  _mytimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mytimer_Tick (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("mytimer_tick")) { return __ref.runUserSub(false, "frmusercontrol","mytimer_tick", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Sub mytimer_Tick()";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radiobutton1_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RadioButton1_CheckedChange (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("radiobutton1_checkedchange")) { return __ref.runUserSub(false, "frmusercontrol","radiobutton1_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 105;BA.debugLine="Sub RadioButton1_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="ToastMessageShow(\"1r\",False)";
Debug.ShouldStop(512);
frmusercontrol.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("1r")),(Object)(frmusercontrol.__c.getField(true,"False")));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _radiobutton2_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("RadioButton2_CheckedChange (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("radiobutton2_checkedchange")) { return __ref.runUserSub(false, "frmusercontrol","radiobutton2_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 108;BA.debugLine="Sub RadioButton2_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="ToastMessageShow(\"2r\",False)";
Debug.ShouldStop(4096);
frmusercontrol.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("2r")),(Object)(frmusercontrol.__c.getField(true,"False")));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("SetLayout (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setlayout")) { return __ref.runUserSub(false, "frmusercontrol","setlayout", __ref, _left, _top, _width, _height);}
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 128;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
Debug.ShouldStop(1);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayout",(Object)(_left),(Object)(_top),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("setVisible (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "frmusercontrol","setvisible", __ref, _flag);}
Debug.locals.put("flag", _flag);
 BA.debugLineNum = 125;BA.debugLine="Public Sub setVisible(flag As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="mBase.Visible=flag";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",_flag);
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Timer1_Tick (frmusercontrol) ","frmusercontrol",1,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("timer1_tick")) { return __ref.runUserSub(false, "frmusercontrol","timer1_tick", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Sub Timer1_Tick()";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}