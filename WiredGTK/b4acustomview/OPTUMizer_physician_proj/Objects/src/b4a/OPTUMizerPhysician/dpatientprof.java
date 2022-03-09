package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dpatientprof extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dpatientprof");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dpatientprof.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprescription = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqrreader = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpatientname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladherence = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpatientid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblencounter = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnmedhistory = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnlogs = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 31;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 32;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 33;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPhysician.dlogs _logs = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 119;BA.debugLine="Dim logs As DLogs";
_logs = new b4a.OPTUMizerPhysician.dlogs();
 //BA.debugLineNum = 120;BA.debugLine="logs=Starter.DLogs1";
_logs = (b4a.OPTUMizerPhysician.dlogs)(_starter._dlogs1 /*Object*/ );
 //BA.debugLineNum = 121;BA.debugLine="logs.Visible=True";
_logs._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 122;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
b4a.OPTUMizerPhysician.dhome _home = null;
 //BA.debugLineNum = 136;BA.debugLine="Sub btnHome_click()";
 //BA.debugLineNum = 137;BA.debugLine="Dim home As DHome";
_home = new b4a.OPTUMizerPhysician.dhome();
 //BA.debugLineNum = 138;BA.debugLine="home=Starter.DHome1";
_home = (b4a.OPTUMizerPhysician.dhome)(_starter._dhome1 /*Object*/ );
 //BA.debugLineNum = 139;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 140;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _btnlogs_click() throws Exception{
b4a.OPTUMizerPhysician.dlogs _logs = null;
 //BA.debugLineNum = 142;BA.debugLine="Sub btnLogs_click()";
 //BA.debugLineNum = 143;BA.debugLine="Dim logs As DLogs";
_logs = new b4a.OPTUMizerPhysician.dlogs();
 //BA.debugLineNum = 144;BA.debugLine="logs=Starter.DLogs1";
_logs = (b4a.OPTUMizerPhysician.dlogs)(_starter._dlogs1 /*Object*/ );
 //BA.debugLineNum = 145;BA.debugLine="logs.Visible=True";
_logs._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 146;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _btnmedhistory_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientmedhistory _medhis = null;
 //BA.debugLineNum = 130;BA.debugLine="Sub btnMedHistory_click()";
 //BA.debugLineNum = 131;BA.debugLine="Dim medHis As DPatientMedHistory";
_medhis = new b4a.OPTUMizerPhysician.dpatientmedhistory();
 //BA.debugLineNum = 132;BA.debugLine="medHis=Starter.DPatientMedHistory1";
_medhis = (b4a.OPTUMizerPhysician.dpatientmedhistory)(_starter._dpatientmedhistory1 /*Object*/ );
 //BA.debugLineNum = 133;BA.debugLine="medHis.Visible=True";
_medhis._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 134;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _btnprescription_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientprescription _gamot = null;
 //BA.debugLineNum = 112;BA.debugLine="Sub btnPrescription_click()";
 //BA.debugLineNum = 113;BA.debugLine="Dim gamot As DPatientPrescription";
_gamot = new b4a.OPTUMizerPhysician.dpatientprescription();
 //BA.debugLineNum = 114;BA.debugLine="gamot=Starter.DPatientPrescription1";
_gamot = (b4a.OPTUMizerPhysician.dpatientprescription)(_starter._dpatientprescription1 /*Object*/ );
 //BA.debugLineNum = 115;BA.debugLine="gamot.Visible=True";
_gamot._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 116;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _btnqrreader_click() throws Exception{
b4a.OPTUMizerPhysician.dqrreader _qrreader = null;
 //BA.debugLineNum = 124;BA.debugLine="Sub btnQrReader_click()";
 //BA.debugLineNum = 125;BA.debugLine="Dim qrReader As DQrReader";
_qrreader = new b4a.OPTUMizerPhysician.dqrreader();
 //BA.debugLineNum = 126;BA.debugLine="qrReader=Starter.DQrReader1";
_qrreader = (b4a.OPTUMizerPhysician.dqrreader)(_starter._dqrreader1 /*Object*/ );
 //BA.debugLineNum = 127;BA.debugLine="qrReader.Visible=True";
_qrreader._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 128;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnPrescription As Panel";
_btnprescription = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnBack As Panel";
_btnback = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnQrReader As Panel";
_btnqrreader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim lblPatientName As Label";
_lblpatientname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblDesc1 As Label";
_lbldesc1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblAdherence As Label";
_lbladherence = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lblPatientID As Label";
_lblpatientid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lblEncounter As Label";
_lblencounter = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim btnMedHistory As Panel";
_btnmedhistory = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim btnHome As Panel";
_btnhome = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim btnLogs As Panel";
_btnlogs = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 54;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 55;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 171;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 161;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 87;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 88;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 89;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 90;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 91;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"PatientProfile-12bf4.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 92;BA.debugLine="mBase.AddView(btnPrescription,0.06 * mBase.Width,";
_mbase.AddView((android.view.View)(_btnprescription.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.76*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 93;BA.debugLine="mBase.AddView(btnBack,0.05 * mBase.Width,0.01 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 94;BA.debugLine="mBase.AddView(btnQrReader,0.81 * mBase.Width,0.02";
_mbase.AddView((android.view.View)(_btnqrreader.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 95;BA.debugLine="mBase.AddView(lblPatientName,0.36 * mBase.Width,0";
_mbase.AddView((android.view.View)(_lblpatientname.getObject()),(int) (0.36*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 96;BA.debugLine="mBase.AddView(lblDesc1,0.06 * mBase.Width,0.34 *";
_mbase.AddView((android.view.View)(_lbldesc1.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.34*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.40*_mbase.getHeight()));
 //BA.debugLineNum = 97;BA.debugLine="mBase.AddView(lblAdherence,0.36 * mBase.Width,0.1";
_mbase.AddView((android.view.View)(_lbladherence.getObject()),(int) (0.36*_mbase.getWidth()),(int) (0.18*_mbase.getHeight()),(int) (0.59*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 98;BA.debugLine="mBase.AddView(lblPatientID,0.36 * mBase.Width,0.2";
_mbase.AddView((android.view.View)(_lblpatientid.getObject()),(int) (0.36*_mbase.getWidth()),(int) (0.22*_mbase.getHeight()),(int) (0.59*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 99;BA.debugLine="mBase.AddView(lblEncounter,0.35 * mBase.Width,0.2";
_mbase.AddView((android.view.View)(_lblencounter.getObject()),(int) (0.35*_mbase.getWidth()),(int) (0.29*_mbase.getHeight()),(int) (0.59*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 100;BA.debugLine="mBase.AddView(btnMedHistory,0.06 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_btnmedhistory.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.84*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 101;BA.debugLine="mBase.AddView(btnHome,0.33 * mBase.Width,0.93 * m";
_mbase.AddView((android.view.View)(_btnhome.getObject()),(int) (0.33*_mbase.getWidth()),(int) (0.93*_mbase.getHeight()),(int) (0.17*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 102;BA.debugLine="mBase.AddView(btnLogs,0.51 * mBase.Width,0.93 * m";
_mbase.AddView((android.view.View)(_btnlogs.getObject()),(int) (0.51*_mbase.getWidth()),(int) (0.93*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 104;BA.debugLine="initDpatientProfile";
_initdpatientprofile();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _initdpatientprofile() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub initDpatientProfile";
 //BA.debugLineNum = 59;BA.debugLine="btnPrescription.Color =  0x0000979f";
_btnprescription.setColor((int) (0x0000979f));
 //BA.debugLineNum = 60;BA.debugLine="btnBack.Color =  0x00008b67";
_btnback.setColor((int) (0x00008b67));
 //BA.debugLineNum = 61;BA.debugLine="btnQrReader.Color =  0x00008b67";
_btnqrreader.setColor((int) (0x00008b67));
 //BA.debugLineNum = 62;BA.debugLine="btnMedHistory.Color =  0x0000979f";
_btnmedhistory.setColor((int) (0x0000979f));
 //BA.debugLineNum = 63;BA.debugLine="btnLogs.Color =  0x0000979f";
_btnlogs.setColor((int) (0x0000979f));
 //BA.debugLineNum = 64;BA.debugLine="btnHome.Color =  0x0000979f";
_btnhome.setColor((int) (0x0000979f));
 //BA.debugLineNum = 65;BA.debugLine="lblPatientName.Color =  0x00ffffff";
_lblpatientname.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 66;BA.debugLine="lblPatientName.TextColor = 0xff000000";
_lblpatientname.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 67;BA.debugLine="lblPatientName.Gravity = Gravity.CENTER_HORIZONTA";
_lblpatientname.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 68;BA.debugLine="lblPatientName.Text = \"\"";
_lblpatientname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 69;BA.debugLine="lblDesc1.Color =  0x00ffffff";
_lbldesc1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 70;BA.debugLine="lblDesc1.TextColor = 0xff000000";
_lbldesc1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 71;BA.debugLine="lblDesc1.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldesc1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.LEFT));
 //BA.debugLineNum = 72;BA.debugLine="lblDesc1.Text = \"\"";
_lbldesc1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 73;BA.debugLine="lblAdherence.Color =  0x00ffffff";
_lbladherence.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 74;BA.debugLine="lblAdherence.TextColor = 0xff000000";
_lbladherence.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 75;BA.debugLine="lblAdherence.Gravity = Gravity.CENTER_HORIZONTAL+";
_lbladherence.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 76;BA.debugLine="lblAdherence.Text = \"\"";
_lbladherence.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 77;BA.debugLine="lblPatientID.Color =  0x00ffffff";
_lblpatientid.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 78;BA.debugLine="lblPatientID.TextColor = 0xff000000";
_lblpatientid.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 79;BA.debugLine="lblPatientID.Gravity = Gravity.CENTER_HORIZONTAL+";
_lblpatientid.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 80;BA.debugLine="lblPatientID.Text = \"\"";
_lblpatientid.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 81;BA.debugLine="lblEncounter.Color =  0x00ffffff";
_lblencounter.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 82;BA.debugLine="lblEncounter.TextColor = 0xff000000";
_lblencounter.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 83;BA.debugLine="lblEncounter.Gravity = Gravity.CENTER_HORIZONTAL+";
_lblencounter.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 84;BA.debugLine="lblEncounter.Text = \"\"";
_lblencounter.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 36;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 37;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 38;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 39;BA.debugLine="btnPrescription.Initialize(\"btnPrescription\")";
_btnprescription.Initialize(ba,"btnPrescription");
 //BA.debugLineNum = 40;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 41;BA.debugLine="btnQrReader.Initialize(\"btnQrReader\")";
_btnqrreader.Initialize(ba,"btnQrReader");
 //BA.debugLineNum = 42;BA.debugLine="lblPatientName.Initialize(\"lblPatientName\")";
_lblpatientname.Initialize(ba,"lblPatientName");
 //BA.debugLineNum = 43;BA.debugLine="lblDesc1.Initialize(\"lblDesc1\")";
_lbldesc1.Initialize(ba,"lblDesc1");
 //BA.debugLineNum = 44;BA.debugLine="lblAdherence.Initialize(\"lblAdherence\")";
_lbladherence.Initialize(ba,"lblAdherence");
 //BA.debugLineNum = 45;BA.debugLine="lblPatientID.Initialize(\"lblPatientID\")";
_lblpatientid.Initialize(ba,"lblPatientID");
 //BA.debugLineNum = 46;BA.debugLine="lblEncounter.Initialize(\"lblEncounter\")";
_lblencounter.Initialize(ba,"lblEncounter");
 //BA.debugLineNum = 47;BA.debugLine="btnMedHistory.Initialize(\"btnMedHistory\")";
_btnmedhistory.Initialize(ba,"btnMedHistory");
 //BA.debugLineNum = 48;BA.debugLine="btnHome.Initialize(\"btnHome\")";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 49;BA.debugLine="btnLogs.Initialize(\"btnLogs\")";
_btnlogs.Initialize(ba,"btnLogs");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _lbladherence_click() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub lblAdherence_click()";
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _lbldesc1_click() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub lblDesc1_click()";
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _lblencounter_click() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub lblEncounter_click()";
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _lblpatientid_click() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub lblPatientID_click()";
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _lblpatientname_click() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub lblPatientName_click()";
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 167;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 164;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
