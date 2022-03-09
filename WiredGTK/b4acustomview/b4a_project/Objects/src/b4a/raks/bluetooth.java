package b4a.raks;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bluetooth extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.raks.bluetooth");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.raks.bluetooth.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ImageViewWrapper _imgconnect = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgdisconnect = null;
public b4a.raks.main _main = null;
public b4a.raks.starter _starter = null;
public b4a.raks.vb6 _vb6 = null;
public String  _setlayout(b4a.raks.bluetooth __ref,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "setlayout", false))
	 {return ((String) Debug.delegate(ba, "setlayout", new Object[] {_left,_top,_width,_height}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout(_left,_top,_width,_height);
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.raks.bluetooth __ref,boolean _flag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_flag}));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub setVisible(flag As Boolean)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="mBase.Visible=flag";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(_flag);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _check_bluetooth(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "check_bluetooth", false))
	 {return ((String) Debug.delegate(ba, "check_bluetooth", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub check_bluetooth";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If Starter.Serial1.IsEnabled = False Then";
if (_starter._serial1 /*anywheresoftware.b4a.objects.Serial*/ .IsEnabled()==__c.False) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Msgbox(\"Please enable Bluetooth.\", \"\")";
__c.Msgbox(BA.ObjectToCharSequence("Please enable Bluetooth."),BA.ObjectToCharSequence(""),ba);
 }else {
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="If Starter.connected_BT=False Then";
if (_starter._connected_bt /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Starter.Serial1.Listen 'listen for incoming con";
_starter._serial1 /*anywheresoftware.b4a.objects.Serial*/ .Listen(ba);
 };
 };
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="End Sub";
return "";
}
public String  _getlist(b4a.raks.bluetooth __ref,anywheresoftware.b4a.objects.collections.List _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "getlist", false))
	 {return ((String) Debug.delegate(ba, "getlist", new Object[] {_l}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub GetList(L As List)";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Return InputList(L, \"Choose device\", -1) 'show li";
if (true) return BA.NumberToString(__c.InputList(_l,BA.ObjectToCharSequence("Choose device"),(int) (-1),ba));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public String  _addtoparent(b4a.raks.bluetooth __ref,anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "addtoparent", false))
	 {return ((String) Debug.delegate(ba, "addtoparent", new Object[] {_parent,_left,_top,_width,_height}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="mBase.Initialize(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBase");
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_left,_top,_width,_height);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="GTKForms";
__ref._gtkforms /*String*/ (null);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return "";
}
public String  _gtkforms(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "gtkforms", false))
	 {return ((String) Debug.delegate(ba, "gtkforms", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub GTKForms";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="mBase.Color=0x000000'transparent background";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor((int) (0x000000));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="mBase.Width=100%x";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__c.PerXToCurrent((float) (100),ba));
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="mBase.height=100%y";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="mBase.AddView(imgconnect,0.08 * mBase.Width,0.18";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imgconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (0.08*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.18*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.43*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.14*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="imgconnect.Bitmap = LoadBitmapResize(File.DirAsse";
__ref._imgconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"pics1.png",__ref._imgconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._imgconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight(),__c.True).getObject()));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="mBase.AddView(imgdisconnect,0.61 * mBase.Width,0.";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._imgdisconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (0.61*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.21*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.20*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.07*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="imgdisconnect.Bitmap = LoadBitmapResize(File.DirA";
__ref._imgdisconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"pics1.png",__ref._imgdisconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._imgdisconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight(),__c.True).getObject()));
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Label2.Color =  0x00ffffff";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor((int) (0x00ffffff));
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Label2.TextColor = 0xff000000";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor((int) (0xff000000));
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Label2.Text = \"Label1\"";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Label1"));
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="mBase.AddView(Label2,0.26 * mBase.Width,0.05 * mB";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0.26*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.05*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()),(int) (0.33*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()),(int) (0.06*__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Dim imgconnect As ImageView";
_imgconnect = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim imgdisconnect As ImageView";
_imgdisconnect = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.raks.bluetooth __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="GTKForms";
__ref._gtkforms /*String*/ (null);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "getvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub getVisible() As Boolean";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return false;
}
public String  _imgconnect_click(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "imgconnect_click", false))
	 {return ((String) Debug.delegate(ba, "imgconnect_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub imgconnect_click()";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="CallSub(Starter,\"mnuConnect_Click\")";
__c.CallSubDebug(ba,(Object)(_starter.getObject()),"mnuConnect_Click");
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public String  _imgdisconnect_click(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "imgdisconnect_click", false))
	 {return ((String) Debug.delegate(ba, "imgdisconnect_click", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub imgdisconnect_click()";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="CallSub(Starter,\"mnuDisconnect_Click\")";
__c.CallSubDebug(ba,(Object)(_starter.getObject()),"mnuDisconnect_Click");
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Label2.Text=\"Disconnected\"";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Disconnected"));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.raks.bluetooth __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="imgconnect.Initialize(\"imgconnect\")";
__ref._imgconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"imgconnect");
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="imgdisconnect.Initialize(\"imgdisconnect\")";
__ref._imgdisconnect /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"imgdisconnect");
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Timer1.Initialize(\"Timer1\",1000)";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"Timer1",(long) (1000));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Timer1.Enabled = True";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Label2.Initialize(\"Label2\")";
__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"Label2");
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Label2_click()";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="End Sub";
return "";
}
public String  _serial_print(b4a.raks.bluetooth __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "serial_print", false))
	 {return ((String) Debug.delegate(ba, "serial_print", new Object[] {_str}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Serial_print(str As String)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="CallSub2( Starter,\"astream_write\",str)";
__c.CallSubDebug2(ba,(Object)(_starter.getObject()),"astream_write",(Object)(_str));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick(b4a.raks.bluetooth __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bluetooth";
if (Debug.shouldDelegate(ba, "timer1_tick", false))
	 {return ((String) Debug.delegate(ba, "timer1_tick", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Timer1_Tick()";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="End Sub";
return "";
}
}