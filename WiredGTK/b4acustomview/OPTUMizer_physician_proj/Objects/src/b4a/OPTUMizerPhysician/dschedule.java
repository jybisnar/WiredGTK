package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dschedule extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dschedule");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dschedule.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqrreader = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitlea = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitleb = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitlec = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnlogs = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitled = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 28;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 29;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 30;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPhysician.dprofile _profile = null;
 //BA.debugLineNum = 97;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 98;BA.debugLine="Dim profile As DProfile";
_profile = new b4a.OPTUMizerPhysician.dprofile();
 //BA.debugLineNum = 99;BA.debugLine="profile=Starter.DProfile1";
_profile = (b4a.OPTUMizerPhysician.dprofile)(_starter._dprofile1 /*Object*/ );
 //BA.debugLineNum = 100;BA.debugLine="profile.Visible=True";
_profile._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 101;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
b4a.OPTUMizerPhysician.dhome _home = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub btnHome_click()";
 //BA.debugLineNum = 110;BA.debugLine="Dim home As DHome";
_home = new b4a.OPTUMizerPhysician.dhome();
 //BA.debugLineNum = 111;BA.debugLine="home=Starter.DHome1";
_home = (b4a.OPTUMizerPhysician.dhome)(_starter._dhome1 /*Object*/ );
 //BA.debugLineNum = 112;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 113;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _btnlogs_click() throws Exception{
b4a.OPTUMizerPhysician.dlogs _logs = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub btnLogs_click()";
 //BA.debugLineNum = 116;BA.debugLine="Dim logs As DLogs";
_logs = new b4a.OPTUMizerPhysician.dlogs();
 //BA.debugLineNum = 117;BA.debugLine="logs=Starter.DLogs1";
_logs = (b4a.OPTUMizerPhysician.dlogs)(_starter._dlogs1 /*Object*/ );
 //BA.debugLineNum = 118;BA.debugLine="logs.Visible=True";
_logs._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 119;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _btnqrreader_click() throws Exception{
b4a.OPTUMizerPhysician.dqrreader _qrreader = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub btnQrReader_click()";
 //BA.debugLineNum = 104;BA.debugLine="Dim qrReader As DQrReader";
_qrreader = new b4a.OPTUMizerPhysician.dqrreader();
 //BA.debugLineNum = 105;BA.debugLine="qrReader=Starter.DQrReader1";
_qrreader = (b4a.OPTUMizerPhysician.dqrreader)(_starter._dqrreader1 /*Object*/ );
 //BA.debugLineNum = 106;BA.debugLine="qrReader.Visible=True";
_qrreader._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 107;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnBack As Panel";
_btnback = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnQrReader As Panel";
_btnqrreader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim lblTitlea As Label";
_lbltitlea = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim lblTitleb As Label";
_lbltitleb = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblTitlec As Label";
_lbltitlec = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim btnHome As Panel";
_btnhome = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim btnLogs As Panel";
_btnlogs = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lblTitled As Label";
_lbltitled = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 48;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 49;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 141;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 131;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 75;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 76;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 77;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 78;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 79;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"CalendarModule-3ab08.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 80;BA.debugLine="mBase.AddView(btnBack,0.04 * mBase.Width,0.01 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.04*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 81;BA.debugLine="mBase.AddView(btnQrReader,0.80 * mBase.Width,0.01";
_mbase.AddView((android.view.View)(_btnqrreader.getObject()),(int) (0.80*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 82;BA.debugLine="mBase.AddView(lblTitlea,0.21 * mBase.Width,0.14 *";
_mbase.AddView((android.view.View)(_lbltitlea.getObject()),(int) (0.21*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()),(int) (0.72*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()));
 //BA.debugLineNum = 83;BA.debugLine="mBase.AddView(lblTitleb,0.21 * mBase.Width,0.33 *";
_mbase.AddView((android.view.View)(_lbltitleb.getObject()),(int) (0.21*_mbase.getWidth()),(int) (0.33*_mbase.getHeight()),(int) (0.72*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()));
 //BA.debugLineNum = 84;BA.debugLine="mBase.AddView(lblTitlec,0.21 * mBase.Width,0.52 *";
_mbase.AddView((android.view.View)(_lbltitlec.getObject()),(int) (0.21*_mbase.getWidth()),(int) (0.52*_mbase.getHeight()),(int) (0.72*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()));
 //BA.debugLineNum = 85;BA.debugLine="mBase.AddView(btnHome,0.31 * mBase.Width,0.92 * m";
_mbase.AddView((android.view.View)(_btnhome.getObject()),(int) (0.31*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.17*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 86;BA.debugLine="mBase.AddView(btnLogs,0.51 * mBase.Width,0.92 * m";
_mbase.AddView((android.view.View)(_btnlogs.getObject()),(int) (0.51*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.17*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 87;BA.debugLine="mBase.AddView(lblTitled,0.21 * mBase.Width,0.71 *";
_mbase.AddView((android.view.View)(_lbltitled.getObject()),(int) (0.21*_mbase.getWidth()),(int) (0.71*_mbase.getHeight()),(int) (0.72*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()));
 //BA.debugLineNum = 89;BA.debugLine="initDSchedule";
_initdschedule();
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _initdschedule() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub initDSchedule";
 //BA.debugLineNum = 53;BA.debugLine="btnBack.Color =  0x0000e6ed";
_btnback.setColor((int) (0x0000e6ed));
 //BA.debugLineNum = 54;BA.debugLine="btnQrReader.Color =  0x0000e6ed";
_btnqrreader.setColor((int) (0x0000e6ed));
 //BA.debugLineNum = 55;BA.debugLine="btnHome.Color =  0x00006224";
_btnhome.setColor((int) (0x00006224));
 //BA.debugLineNum = 56;BA.debugLine="btnLogs.Color =  0x00006224";
_btnlogs.setColor((int) (0x00006224));
 //BA.debugLineNum = 57;BA.debugLine="lblTitlea.Color =  0x00ffffff";
_lbltitlea.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 58;BA.debugLine="lblTitlea.TextColor = 0xff000000";
_lbltitlea.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 59;BA.debugLine="lblTitlea.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitlea.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 60;BA.debugLine="lblTitlea.Text = \"\"";
_lbltitlea.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 61;BA.debugLine="lblTitleb.Color =  0x00ffffff";
_lbltitleb.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 62;BA.debugLine="lblTitleb.TextColor = 0xff000000";
_lbltitleb.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 63;BA.debugLine="lblTitleb.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitleb.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 64;BA.debugLine="lblTitleb.Text = \"\"";
_lbltitleb.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 65;BA.debugLine="lblTitlec.Color =  0x00ffffff";
_lbltitlec.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 66;BA.debugLine="lblTitlec.TextColor = 0xff000000";
_lbltitlec.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 67;BA.debugLine="lblTitlec.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitlec.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 68;BA.debugLine="lblTitlec.Text = \"\"";
_lbltitlec.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 69;BA.debugLine="lblTitled.Color =  0x00ffffff";
_lbltitled.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 70;BA.debugLine="lblTitled.TextColor = 0xff000000";
_lbltitled.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 71;BA.debugLine="lblTitled.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitled.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 72;BA.debugLine="lblTitled.Text = \"\"";
_lbltitled.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 35;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 36;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 37;BA.debugLine="btnQrReader.Initialize(\"btnQrReader\")";
_btnqrreader.Initialize(ba,"btnQrReader");
 //BA.debugLineNum = 38;BA.debugLine="lblTitlea.Initialize(\"lblTitlea\")";
_lbltitlea.Initialize(ba,"lblTitlea");
 //BA.debugLineNum = 39;BA.debugLine="lblTitleb.Initialize(\"lblTitleb\")";
_lbltitleb.Initialize(ba,"lblTitleb");
 //BA.debugLineNum = 40;BA.debugLine="lblTitlec.Initialize(\"lblTitlec\")";
_lbltitlec.Initialize(ba,"lblTitlec");
 //BA.debugLineNum = 41;BA.debugLine="btnHome.Initialize(\"btnHome\")";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 42;BA.debugLine="btnLogs.Initialize(\"btnLogs\")";
_btnlogs.Initialize(ba,"btnLogs");
 //BA.debugLineNum = 43;BA.debugLine="lblTitled.Initialize(\"lblTitled\")";
_lbltitled.Initialize(ba,"lblTitled");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _lbltitlea_click() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub lblTitlea_click()";
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _lbltitleb_click() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub lblTitleb_click()";
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _lbltitlec_click() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub lblTitlec_click()";
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _lbltitled_click() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub lblTitled_click()";
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 137;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 134;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
