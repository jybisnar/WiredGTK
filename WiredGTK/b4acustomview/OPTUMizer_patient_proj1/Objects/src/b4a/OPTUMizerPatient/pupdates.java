package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class pupdates extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.pupdates");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.pupdates.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprofile = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnlogs = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqr = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public b4a.OPTUMizerPatient.b4xcollections _b4xcollections = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 24;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 25;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 26;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
b4a.OPTUMizerPatient.phome _home = null;
 //BA.debugLineNum = 74;BA.debugLine="Sub btnHome_click()";
 //BA.debugLineNum = 75;BA.debugLine="Dim home As PHome";
_home = new b4a.OPTUMizerPatient.phome();
 //BA.debugLineNum = 76;BA.debugLine="home=Starter.PHome1";
_home = (b4a.OPTUMizerPatient.phome)(_starter._phome1 /*Object*/ );
 //BA.debugLineNum = 77;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 78;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _btnlogs_click() throws Exception{
b4a.OPTUMizerPatient.plogs _p_log = null;
 //BA.debugLineNum = 80;BA.debugLine="Sub btnLogs_click()";
 //BA.debugLineNum = 81;BA.debugLine="Dim p_Log As PLogs";
_p_log = new b4a.OPTUMizerPatient.plogs();
 //BA.debugLineNum = 82;BA.debugLine="p_Log=Starter.PLogs1";
_p_log = (b4a.OPTUMizerPatient.plogs)(_starter._plogs1 /*Object*/ );
 //BA.debugLineNum = 83;BA.debugLine="p_Log.Visible=True";
_p_log._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 84;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _btnprofile_click() throws Exception{
b4a.OPTUMizerPatient.pprofile _profile = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub btnProfile_click()";
 //BA.debugLineNum = 69;BA.debugLine="Dim profile As PProfile";
_profile = new b4a.OPTUMizerPatient.pprofile();
 //BA.debugLineNum = 70;BA.debugLine="profile=Starter.PProfile1";
_profile = (b4a.OPTUMizerPatient.pprofile)(_starter._pprofile1 /*Object*/ );
 //BA.debugLineNum = 71;BA.debugLine="profile.Visible=True";
_profile._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 72;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _btnqr_click() throws Exception{
b4a.OPTUMizerPatient.pqr _qrcode = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub btnQr_click()";
 //BA.debugLineNum = 87;BA.debugLine="Dim qrCode As PQr";
_qrcode = new b4a.OPTUMizerPatient.pqr();
 //BA.debugLineNum = 88;BA.debugLine="qrCode=Starter.PQr1";
_qrcode = (b4a.OPTUMizerPatient.pqr)(_starter._pqr1 /*Object*/ );
 //BA.debugLineNum = 89;BA.debugLine="qrCode.Visible=True";
_qrcode._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 90;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 14;BA.debugLine="Dim Image1 As ImageView";
_image1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim btnProfile As Panel";
_btnprofile = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnHome As Panel";
_btnhome = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnLogs As Panel";
_btnlogs = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btnQr As Panel";
_btnqr = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 40;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 41;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 104;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 94;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 51;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 52;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 53;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 54;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 55;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"NewsModule-9b7ab.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 56;BA.debugLine="mBase.AddView(btnProfile,0.04 * mBase.Width,0.01";
_mbase.AddView((android.view.View)(_btnprofile.getObject()),(int) (0.04*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 57;BA.debugLine="mBase.AddView(btnHome,0.00 * mBase.Width,0.92 * m";
_mbase.AddView((android.view.View)(_btnhome.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.26*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 58;BA.debugLine="mBase.AddView(btnLogs,0.73 * mBase.Width,0.92 * m";
_mbase.AddView((android.view.View)(_btnlogs.getObject()),(int) (0.73*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.26*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 59;BA.debugLine="mBase.AddView(btnQr,0.82 * mBase.Width,0.01 * mBa";
_mbase.AddView((android.view.View)(_btnqr.getObject()),(int) (0.82*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _init_pupdates() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub init_PUpdates";
 //BA.debugLineNum = 45;BA.debugLine="btnProfile.Color =  0x0000ab5b";
_btnprofile.setColor((int) (0x0000ab5b));
 //BA.debugLineNum = 46;BA.debugLine="btnHome.Color =  0x0000c96a";
_btnhome.setColor((int) (0x0000c96a));
 //BA.debugLineNum = 47;BA.debugLine="btnLogs.Color =  0x0000c96a";
_btnlogs.setColor((int) (0x0000c96a));
 //BA.debugLineNum = 48;BA.debugLine="btnQr.Color =  0x0000ab5b";
_btnqr.setColor((int) (0x0000ab5b));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 31;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 32;BA.debugLine="btnProfile.Initialize(\"btnProfile\")";
_btnprofile.Initialize(ba,"btnProfile");
 //BA.debugLineNum = 33;BA.debugLine="btnHome.Initialize(\"btnHome\")";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 34;BA.debugLine="btnLogs.Initialize(\"btnLogs\")";
_btnlogs.Initialize(ba,"btnLogs");
 //BA.debugLineNum = 35;BA.debugLine="btnQr.Initialize(\"btnQr\")";
_btnqr.Initialize(ba,"btnQr");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 100;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 97;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
