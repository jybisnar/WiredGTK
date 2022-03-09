package b4a.raks;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmusercontrol extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.raks.frmusercontrol");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.raks.frmusercontrol.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public b4a.raks.table _datagridtreeview1 = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.Timer _mytimer = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radiobutton1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _radiobutton2 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbutton1 = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbutton2 = null;
public b4a.raks.main _main = null;
public b4a.raks.starter _starter = null;
public b4a.raks.vb6 _vb6 = null;
public String  _setlayout(b4a.raks.frmusercontrol __ref,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "setlayout", false))
	 {return ((String) Debug.delegate(ba, "setlayout", new Object[] {_left,_top,_width,_height}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout(_left,_top,_width,_height);
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.raks.frmusercontrol __ref,boolean _flag) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_flag}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub setVisible(flag As Boolean)";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="mBase.Visible=flag";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(_flag);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
public String  _addtoparent(b4a.raks.frmusercontrol __ref,anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "addtoparent", false))
	 {return ((String) Debug.delegate(ba, "addtoparent", new Object[] {_parent,_left,_top,_width,_height}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="mBase.Initialize(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBase");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_left,_top,_width,_height);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="GTKForms";
__ref._gtkforms /*String*/ (null);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="End Sub";
return "";
}
public String  _gtkforms(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "gtkforms", false))
	 {return ((String) Debug.delegate(ba, "gtkforms", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub GTKForms";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="mBase.Color=0x000000'transparent background";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor((int) (0x000000));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="mBase.Width=100%x";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__c.PerXToCurrent((float) (100),ba));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="mBase.height=100%y";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Label1.Color =  0x00ffffff";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor((int) (0x00ffffff));
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Label1.TextColor = 0xff000000";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor((int) (0xff000000));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Label1.Text = \"Label1\"";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Label1"));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="mBase.AddView(Label1,0.08 * mBase.Width,0.04 * mB";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0.08*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.04*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.24*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.06*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Label2.Color =  0x00ffffff";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor((int) (0x00ffffff));
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Label2.TextColor = 0xff000000";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor((int) (0xff000000));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="Label2.Text = \"Label2\"";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Label2"));
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="mBase.AddView(Label2,0.39 * mBase.Width,0.04 * mB";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0.39*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.04*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.24*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.06*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="DatagridTreeView1.AddToParent(mBase,0.08 * mBase.";
__ref._datagridtreeview1 /*b4a.raks.table*/ ._addtoparent /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject())),(int) (0.08*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.19*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.48*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.34*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="DatagridTreeView1.SetDatagrid(Array As String (\"A";
__ref._datagridtreeview1 /*b4a.raks.table*/ ._setdatagrid /*String*/ (null,new String[]{"A","B","C"},anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(new String[]{"1","2","3"}),(Object)(new String[]{"4","5","6"})}));
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="mBase.AddView(Image1,0.65 * mBase.Width,0.54 * mB";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._image1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (0.65*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.54*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.24*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.22*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
__ref._image1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"pics1.png",__ref._image1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._image1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight(),__c.True).getObject()));
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="mBase.AddView(RadioButton1,0.59 * mBase.Width,0.1";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._radiobutton1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper*/ .getObject()),(int) (0.59*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.16*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.19*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.06*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="mBase.AddView(RadioButton2,0.60 * mBase.Width,0.4";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._radiobutton2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper*/ .getObject()),(int) (0.60*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.44*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.19*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.06*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="mBase.AddView(CheckButton1,0.09 * mBase.Width,0.5";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._checkbutton1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getObject()),(int) (0.09*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.56*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.19*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.06*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="mBase.AddView(CheckButton2,0.09 * mBase.Width,0.6";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._checkbutton2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .getObject()),(int) (0.09*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.63*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.19*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.06*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="End Sub";
return "";
}
public String  _checkbutton1_checkedchange(b4a.raks.frmusercontrol __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "checkbutton1_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "checkbutton1_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub CheckButton1_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="ToastMessageShow(\"1c\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("1c"),__c.False);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _checkbutton2_checkedchange(b4a.raks.frmusercontrol __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "checkbutton2_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "checkbutton2_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub CheckButton2_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="ToastMessageShow(\"2c\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("2c"),__c.False);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Dim DatagridTreeView1 As Table";
_datagridtreeview1 = new b4a.raks.table();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Dim mytimer As Timer";
_mytimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Dim Image1 As ImageView";
_image1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Dim RadioButton1 As RadioButton";
_radiobutton1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Dim RadioButton2 As RadioButton";
_radiobutton2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim CheckButton1 As CheckBox";
_checkbutton1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Dim CheckButton2 As CheckBox";
_checkbutton2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="End Sub";
return "";
}
public String  _datagridtreeview1_cellclick(b4a.raks.frmusercontrol __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "datagridtreeview1_cellclick", false))
	 {return ((String) Debug.delegate(ba, "datagridtreeview1_cellclick", new Object[] {_col,_row}));}
String _val = "";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub DatagridTreeView1_CellClick (Col As Int, Row A";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Log(\"CellClick: \" & Col & \" , \" & Row)";
__c.LogImpl("21310721","CellClick: "+BA.NumberToString(_col)+" , "+BA.NumberToString(_row),0);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim val As String = DatagridTreeView1.GetValue(Co";
_val = __ref._datagridtreeview1 /*b4a.raks.table*/ ._getvalue /*String*/ (null,_col,_row);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="ToastMessageShow(val,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_val),__c.False);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.raks.frmusercontrol __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="GTKForms";
__ref._gtkforms /*String*/ (null);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "getvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub getVisible() As Boolean";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return false;
}
public String  _image1_click(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "image1_click", false))
	 {return ((String) Debug.delegate(ba, "image1_click", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Image1_click()";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If SubExists(mCallBack,mEventName & \"_\" & \"Exampl";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_"+"ExampleEvent")) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="CallSub2(mCallBack,mEventName & \"_\" & \"ExampleEv";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_"+"ExampleEvent",(Object)(123));
 };
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.raks.frmusercontrol __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Label1.Initialize(\"Label1\")";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"Label1");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Label2.Initialize(\"Label2\")";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"Label2");
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="DatagridTreeView1.Initialize(Me,\"DatagridTreeView";
__ref._datagridtreeview1 /*b4a.raks.table*/ ._initialize /*String*/ (null,ba,this,"DatagridTreeView1",(int) (4));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Timer1.Initialize(\"Timer1\",1000)";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"Timer1",(long) (1000));
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Timer1.Enabled = True";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="mytimer.Initialize(\"mytimer\",1000)";
__ref._mytimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"mytimer",(long) (1000));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="mytimer.Enabled = True";
__ref._mytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Image1.Initialize(\"Image1\")";
__ref._image1 /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"Image1");
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="RadioButton1.Initialize(\"RadioButton1\")";
__ref._radiobutton1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper*/ .Initialize(ba,"RadioButton1");
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="RadioButton2.Initialize(\"RadioButton2\")";
__ref._radiobutton2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper*/ .Initialize(ba,"RadioButton2");
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="CheckButton1.Initialize(\"CheckButton1\")";
__ref._checkbutton1 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .Initialize(ba,"CheckButton1");
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="CheckButton2.Initialize(\"CheckButton2\")";
__ref._checkbutton2 /*anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper*/ .Initialize(ba,"CheckButton2");
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Label1_click()";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Label2_click()";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="End Sub";
return "";
}
public String  _mytimer_tick(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "mytimer_tick", false))
	 {return ((String) Debug.delegate(ba, "mytimer_tick", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub mytimer_Tick()";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="End Sub";
return "";
}
public String  _radiobutton1_checkedchange(b4a.raks.frmusercontrol __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "radiobutton1_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "radiobutton1_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub RadioButton1_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="ToastMessageShow(\"1r\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("1r"),__c.False);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _radiobutton2_checkedchange(b4a.raks.frmusercontrol __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "radiobutton2_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "radiobutton2_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub RadioButton2_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="ToastMessageShow(\"2r\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("2r"),__c.False);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick(b4a.raks.frmusercontrol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmusercontrol";
if (Debug.shouldDelegate(ba, "timer1_tick", false))
	 {return ((String) Debug.delegate(ba, "timer1_tick", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Timer1_Tick()";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="End Sub";
return "";
}
}