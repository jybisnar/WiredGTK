package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dhome extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dhome");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dhome.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _btnqrreader = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnschedule = null;
public anywheresoftware.b4a.objects.PanelWrapper _btncontact = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnlogs = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprogress = null;
public anywheresoftware.b4a.objects.LabelWrapper _d_notif1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _d_notif2 = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 29;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 30;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 31;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _btncontact_click() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub btnContact_click()";
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _btnlogs_click() throws Exception{
b4a.OPTUMizerPhysician.dlogs _logs = null;
 //BA.debugLineNum = 122;BA.debugLine="Sub btnLogs_click()";
 //BA.debugLineNum = 123;BA.debugLine="Dim logs As DLogs";
_logs = new b4a.OPTUMizerPhysician.dlogs();
 //BA.debugLineNum = 124;BA.debugLine="logs=Starter.DLogs1";
_logs = (b4a.OPTUMizerPhysician.dlogs)(_starter._dlogs1 /*Object*/ );
 //BA.debugLineNum = 125;BA.debugLine="logs.Visible=True";
_logs._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 126;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _btnprofile_click() throws Exception{
b4a.OPTUMizerPhysician.dprofile _profile = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub btnProfile_click()";
 //BA.debugLineNum = 102;BA.debugLine="Dim profile As DProfile";
_profile = new b4a.OPTUMizerPhysician.dprofile();
 //BA.debugLineNum = 103;BA.debugLine="profile=Starter.DProfile1";
_profile = (b4a.OPTUMizerPhysician.dprofile)(_starter._dprofile1 /*Object*/ );
 //BA.debugLineNum = 104;BA.debugLine="profile.Visible=True";
_profile._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 105;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _btnqrreader_click() throws Exception{
b4a.OPTUMizerPhysician.dqrreader _qrreader = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub btnQrReader_click()";
 //BA.debugLineNum = 108;BA.debugLine="Dim qrReader As DQrReader";
_qrreader = new b4a.OPTUMizerPhysician.dqrreader();
 //BA.debugLineNum = 109;BA.debugLine="qrReader=Starter.DQrReader1";
_qrreader = (b4a.OPTUMizerPhysician.dqrreader)(_starter._dqrreader1 /*Object*/ );
 //BA.debugLineNum = 110;BA.debugLine="qrReader.Visible=True";
_qrreader._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 111;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _btnschedule_click() throws Exception{
b4a.OPTUMizerPhysician.dschedule _schedule = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub btnSchedule_click()";
 //BA.debugLineNum = 114;BA.debugLine="Dim schedule As DSchedule";
_schedule = new b4a.OPTUMizerPhysician.dschedule();
 //BA.debugLineNum = 115;BA.debugLine="schedule=Starter.DSchedule1";
_schedule = (b4a.OPTUMizerPhysician.dschedule)(_starter._dschedule1 /*Object*/ );
 //BA.debugLineNum = 116;BA.debugLine="schedule.Visible=True";
_schedule._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 117;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim btnQrReader As Panel";
_btnqrreader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnSchedule As Panel";
_btnschedule = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btnContact As Panel";
_btncontact = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim btnLogs As Panel";
_btnlogs = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lblProgress As Label";
_lblprogress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim d_Notif1 As Label";
_d_notif1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim d_Notif2 As Label";
_d_notif2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _d_notif1_click() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub d_Notif1_click()";
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _d_notif2_click() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub d_Notif2_click()";
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 50;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 51;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 148;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 138;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 78;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 79;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 80;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 81;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 82;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"HomeModule-5ae79.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 83;BA.debugLine="mBase.AddView(btnProfile,0.05 * mBase.Width,0.01";
_mbase.AddView((android.view.View)(_btnprofile.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 84;BA.debugLine="mBase.AddView(btnQrReader,0.82 * mBase.Width,0.01";
_mbase.AddView((android.view.View)(_btnqrreader.getObject()),(int) (0.82*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 85;BA.debugLine="mBase.AddView(btnSchedule,0.54 * mBase.Width,0.22";
_mbase.AddView((android.view.View)(_btnschedule.getObject()),(int) (0.54*_mbase.getWidth()),(int) (0.22*_mbase.getHeight()),(int) (0.40*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 86;BA.debugLine="mBase.AddView(btnContact,0.54 * mBase.Width,0.45";
_mbase.AddView((android.view.View)(_btncontact.getObject()),(int) (0.54*_mbase.getWidth()),(int) (0.45*_mbase.getHeight()),(int) (0.37*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 87;BA.debugLine="mBase.AddView(btnLogs,0.49 * mBase.Width,0.93 * m";
_mbase.AddView((android.view.View)(_btnlogs.getObject()),(int) (0.49*_mbase.getWidth()),(int) (0.93*_mbase.getHeight()),(int) (0.17*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 88;BA.debugLine="mBase.AddView(lblName,0.05 * mBase.Width,0.11 * m";
_mbase.AddView((android.view.View)(_lblname.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()));
 //BA.debugLineNum = 89;BA.debugLine="mBase.AddView(lblProgress,0.09 * mBase.Width,0.33";
_mbase.AddView((android.view.View)(_lblprogress.getObject()),(int) (0.09*_mbase.getWidth()),(int) (0.33*_mbase.getHeight()),(int) (0.83*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 90;BA.debugLine="mBase.AddView(d_Notif1,0.25 * mBase.Width,0.60 *";
_mbase.AddView((android.view.View)(_d_notif1.getObject()),(int) (0.25*_mbase.getWidth()),(int) (0.60*_mbase.getHeight()),(int) (0.64*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 91;BA.debugLine="mBase.AddView(d_Notif2,0.25 * mBase.Width,0.74 *";
_mbase.AddView((android.view.View)(_d_notif2.getObject()),(int) (0.25*_mbase.getWidth()),(int) (0.74*_mbase.getHeight()),(int) (0.64*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 93;BA.debugLine="initDHome";
_initdhome();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _initdhome() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub initDHome";
 //BA.debugLineNum = 55;BA.debugLine="btnProfile.Color =  0x00008125";
_btnprofile.setColor((int) (0x00008125));
 //BA.debugLineNum = 56;BA.debugLine="btnQrReader.Color =  0x00008125";
_btnqrreader.setColor((int) (0x00008125));
 //BA.debugLineNum = 57;BA.debugLine="btnSchedule.Color =  0x00008125";
_btnschedule.setColor((int) (0x00008125));
 //BA.debugLineNum = 58;BA.debugLine="btnContact.Color =  0x00008125";
_btncontact.setColor((int) (0x00008125));
 //BA.debugLineNum = 59;BA.debugLine="btnLogs.Color =  0x00008125";
_btnlogs.setColor((int) (0x00008125));
 //BA.debugLineNum = 60;BA.debugLine="lblName.Color =  0x00ffffff";
_lblname.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 61;BA.debugLine="lblName.TextColor = 0xff000000";
_lblname.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 62;BA.debugLine="lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravi";
_lblname.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 63;BA.debugLine="lblName.Text = \"\"";
_lblname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 64;BA.debugLine="lblProgress.Color =  0x00ffffff";
_lblprogress.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 65;BA.debugLine="lblProgress.TextColor = 0xff000000";
_lblprogress.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 66;BA.debugLine="lblProgress.Gravity = Gravity.CENTER_HORIZONTAL+G";
_lblprogress.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 67;BA.debugLine="lblProgress.Text = \"\"";
_lblprogress.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 68;BA.debugLine="d_Notif1.Color =  0x00ffffff";
_d_notif1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 69;BA.debugLine="d_Notif1.TextColor = 0xff000000";
_d_notif1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 70;BA.debugLine="d_Notif1.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_d_notif1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 71;BA.debugLine="d_Notif1.Text = \"\"";
_d_notif1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 72;BA.debugLine="d_Notif2.Color =  0x00ffffff";
_d_notif2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 73;BA.debugLine="d_Notif2.TextColor = 0xff000000";
_d_notif2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 74;BA.debugLine="d_Notif2.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_d_notif2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 75;BA.debugLine="d_Notif2.Text = \"\"";
_d_notif2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 36;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 37;BA.debugLine="btnProfile.Initialize(\"btnProfile\")";
_btnprofile.Initialize(ba,"btnProfile");
 //BA.debugLineNum = 38;BA.debugLine="btnQrReader.Initialize(\"btnQrReader\")";
_btnqrreader.Initialize(ba,"btnQrReader");
 //BA.debugLineNum = 39;BA.debugLine="btnSchedule.Initialize(\"btnSchedule\")";
_btnschedule.Initialize(ba,"btnSchedule");
 //BA.debugLineNum = 40;BA.debugLine="btnContact.Initialize(\"btnContact\")";
_btncontact.Initialize(ba,"btnContact");
 //BA.debugLineNum = 41;BA.debugLine="btnLogs.Initialize(\"btnLogs\")";
_btnlogs.Initialize(ba,"btnLogs");
 //BA.debugLineNum = 42;BA.debugLine="lblName.Initialize(\"lblName\")";
_lblname.Initialize(ba,"lblName");
 //BA.debugLineNum = 43;BA.debugLine="lblProgress.Initialize(\"lblProgress\")";
_lblprogress.Initialize(ba,"lblProgress");
 //BA.debugLineNum = 44;BA.debugLine="d_Notif1.Initialize(\"d_Notif1\")";
_d_notif1.Initialize(ba,"d_Notif1");
 //BA.debugLineNum = 45;BA.debugLine="d_Notif2.Initialize(\"d_Notif2\")";
_d_notif2.Initialize(ba,"d_Notif2");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _lblname_click() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub lblName_click()";
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _lblprogress_click() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub lblProgress_click()";
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 144;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 141;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
