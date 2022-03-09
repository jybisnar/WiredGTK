package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bluetooth extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.bluetooth");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.bluetooth.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 23;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 24;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 25;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
 //BA.debugLineNum = 14;BA.debugLine="Dim imgconnect As ImageView";
_imgconnect = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 17;BA.debugLine="Dim imgdisconnect As ImageView";
_imgdisconnect = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 39;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 40;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 98;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public String  _getlist(anywheresoftware.b4a.objects.collections.List _l) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub GetList(L As List)";
 //BA.debugLineNum = 62;BA.debugLine="Return InputList(L, \"Choose device\", -1) 'show li";
if (true) return BA.NumberToString(__c.InputList(_l,BA.ObjectToCharSequence("Choose device"),(int) (-1),ba));
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 101;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 43;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 44;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 45;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 46;BA.debugLine="mBase.AddView(imgconnect,0.08 * mBase.Width,0.18";
_mbase.AddView((android.view.View)(_imgconnect.getObject()),(int) (0.08*_mbase.getWidth()),(int) (0.18*_mbase.getHeight()),(int) (0.43*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()));
 //BA.debugLineNum = 47;BA.debugLine="imgconnect.Bitmap = LoadBitmapResize(File.DirAsse";
_imgconnect.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"pics1.png",_imgconnect.getWidth(),_imgconnect.getHeight(),__c.True).getObject()));
 //BA.debugLineNum = 48;BA.debugLine="mBase.AddView(imgdisconnect,0.61 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_imgdisconnect.getObject()),(int) (0.61*_mbase.getWidth()),(int) (0.21*_mbase.getHeight()),(int) (0.20*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 49;BA.debugLine="imgdisconnect.Bitmap = LoadBitmapResize(File.DirA";
_imgdisconnect.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"pics1.png",_imgdisconnect.getWidth(),_imgdisconnect.getHeight(),__c.True).getObject()));
 //BA.debugLineNum = 50;BA.debugLine="Label2.Color =  0x00ffffff";
_label2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 51;BA.debugLine="Label2.TextColor = 0xff000000";
_label2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 52;BA.debugLine="Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_label2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 53;BA.debugLine="Label2.Text = \"Label1\"";
_label2.setText(BA.ObjectToCharSequence("Label1"));
 //BA.debugLineNum = 54;BA.debugLine="mBase.AddView(Label2,0.26 * mBase.Width,0.05 * mB";
_mbase.AddView((android.view.View)(_label2.getObject()),(int) (0.26*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()),(int) (0.33*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _imgconnect_click() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub imgconnect_click()";
 //BA.debugLineNum = 65;BA.debugLine="CallSub(Starter,\"mnuConnect_Click\")";
__c.CallSubNew(ba,(Object)(_starter.getObject()),"mnuConnect_Click");
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _imgdisconnect_click() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub imgdisconnect_click()";
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 30;BA.debugLine="imgconnect.Initialize(\"imgconnect\")";
_imgconnect.Initialize(ba,"imgconnect");
 //BA.debugLineNum = 31;BA.debugLine="imgdisconnect.Initialize(\"imgdisconnect\")";
_imgdisconnect.Initialize(ba,"imgdisconnect");
 //BA.debugLineNum = 32;BA.debugLine="Timer1.Initialize(\"Timer1\",1000)";
_timer1.Initialize(ba,"Timer1",(long) (1000));
 //BA.debugLineNum = 33;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 34;BA.debugLine="Label2.Initialize(\"Label2\")";
_label2.Initialize(ba,"Label2");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _label2_click() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub Label2_click()";
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _serial_print(String _str) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Serial_print(str As String)";
 //BA.debugLineNum = 81;BA.debugLine="CallSub2( Starter,\"astream_write\",str)";
__c.CallSubNew2(ba,(Object)(_starter.getObject()),"astream_write",(Object)(_str));
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 107;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 104;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Timer1_Tick()";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "GETLIST"))
	return _getlist((anywheresoftware.b4a.objects.collections.List) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
