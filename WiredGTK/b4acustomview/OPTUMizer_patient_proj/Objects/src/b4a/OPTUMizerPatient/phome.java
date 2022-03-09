package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class phome extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.phome");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.phome.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _btnqr = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnschedule = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnupload = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnmedications = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnappointments = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnhotline = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnupdates = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnlogs = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprogress = null;
public anywheresoftware.b4a.objects.LabelWrapper _progressbar = null;
public anywheresoftware.b4a.objects.ListViewWrapper _pdoclist = null;
public anywheresoftware.b4a.objects.LabelWrapper _progresspercent = null;
public anywheresoftware.b4a.objects.ListViewWrapper _photline = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 35;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 36;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 37;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _btnappointments_click() throws Exception{
b4a.OPTUMizerPatient.pappointment _p_appointment = null;
 //BA.debugLineNum = 159;BA.debugLine="Sub btnAppointments_click()";
 //BA.debugLineNum = 160;BA.debugLine="Dim p_Appointment As PAppointment";
_p_appointment = new b4a.OPTUMizerPatient.pappointment();
 //BA.debugLineNum = 161;BA.debugLine="p_Appointment=Starter.PAppointment1";
_p_appointment = (b4a.OPTUMizerPatient.pappointment)(_starter._pappointment1 /*Object*/ );
 //BA.debugLineNum = 162;BA.debugLine="p_Appointment.Visible=True";
_p_appointment._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 163;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _btnhotline_click() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub btnHotline_click()";
 //BA.debugLineNum = 169;BA.debugLine="pHotline.Visible=True";
_photline.setVisible(__c.True);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _btnlogs_click() throws Exception{
b4a.OPTUMizerPatient.plogs _p_log = null;
 //BA.debugLineNum = 178;BA.debugLine="Sub btnLogs_click()";
 //BA.debugLineNum = 179;BA.debugLine="Dim p_Log As PLogs";
_p_log = new b4a.OPTUMizerPatient.plogs();
 //BA.debugLineNum = 180;BA.debugLine="p_Log=Starter.PLogs1";
_p_log = (b4a.OPTUMizerPatient.plogs)(_starter._plogs1 /*Object*/ );
 //BA.debugLineNum = 181;BA.debugLine="p_Log.Visible=True";
_p_log._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 182;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _btnmedications_click() throws Exception{
b4a.OPTUMizerPatient.pmedication _p_medication = null;
 //BA.debugLineNum = 153;BA.debugLine="Sub btnMedications_click()";
 //BA.debugLineNum = 154;BA.debugLine="Dim p_Medication As PMedication";
_p_medication = new b4a.OPTUMizerPatient.pmedication();
 //BA.debugLineNum = 155;BA.debugLine="p_Medication=Starter.PMedication1";
_p_medication = (b4a.OPTUMizerPatient.pmedication)(_starter._pmedication1 /*Object*/ );
 //BA.debugLineNum = 156;BA.debugLine="p_Medication.Visible=True";
_p_medication._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 157;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _btnprofile_click() throws Exception{
b4a.OPTUMizerPatient.pprofile _profile = null;
 //BA.debugLineNum = 132;BA.debugLine="Sub btnProfile_click()";
 //BA.debugLineNum = 133;BA.debugLine="Dim profile As PProfile";
_profile = new b4a.OPTUMizerPatient.pprofile();
 //BA.debugLineNum = 134;BA.debugLine="profile=Starter.PProfile1";
_profile = (b4a.OPTUMizerPatient.pprofile)(_starter._pprofile1 /*Object*/ );
 //BA.debugLineNum = 135;BA.debugLine="profile.Visible=True";
_profile._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 136;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _btnqr_click() throws Exception{
b4a.OPTUMizerPatient.pqr _qrcode = null;
 //BA.debugLineNum = 138;BA.debugLine="Sub btnQr_click()";
 //BA.debugLineNum = 139;BA.debugLine="Dim qrCode As PQr";
_qrcode = new b4a.OPTUMizerPatient.pqr();
 //BA.debugLineNum = 140;BA.debugLine="qrCode=Starter.PQr1";
_qrcode = (b4a.OPTUMizerPatient.pqr)(_starter._pqr1 /*Object*/ );
 //BA.debugLineNum = 141;BA.debugLine="qrCode.Visible=True";
_qrcode._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 142;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _btnschedule_click() throws Exception{
b4a.OPTUMizerPatient.pschedule _p_schedule = null;
 //BA.debugLineNum = 144;BA.debugLine="Sub btnSchedule_click()";
 //BA.debugLineNum = 145;BA.debugLine="Dim p_Schedule As PSchedule";
_p_schedule = new b4a.OPTUMizerPatient.pschedule();
 //BA.debugLineNum = 146;BA.debugLine="p_Schedule=Starter.PSchedule1";
_p_schedule = (b4a.OPTUMizerPatient.pschedule)(_starter._pschedule1 /*Object*/ );
 //BA.debugLineNum = 147;BA.debugLine="p_Schedule.Visible=True";
_p_schedule._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 148;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _btnupdates_click() throws Exception{
b4a.OPTUMizerPatient.pupdates _p_update = null;
 //BA.debugLineNum = 172;BA.debugLine="Sub btnUpdates_click()";
 //BA.debugLineNum = 173;BA.debugLine="Dim p_Update As PUpdates";
_p_update = new b4a.OPTUMizerPatient.pupdates();
 //BA.debugLineNum = 174;BA.debugLine="p_Update=Starter.PUpdates1";
_p_update = (b4a.OPTUMizerPatient.pupdates)(_starter._pupdates1 /*Object*/ );
 //BA.debugLineNum = 175;BA.debugLine="p_Update.Visible=True";
_p_update._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 176;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _btnupload_click() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub btnUpload_click()";
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim btnQr As Panel";
_btnqr = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnSchedule As Panel";
_btnschedule = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btnUpload As Panel";
_btnupload = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim btnMedications As Panel";
_btnmedications = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim btnAppointments As Panel";
_btnappointments = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim btnHotline As Panel";
_btnhotline = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim btnUpdates As Panel";
_btnupdates = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim btnLogs As Panel";
_btnlogs = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim lblProgress As Label";
_lblprogress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim progressBar As Label";
_progressbar = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim pDocList As ListView";
_pdoclist = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim ProgressPercent As Label";
_progresspercent = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim pHotline As ListView";
_photline = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 64;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 65;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 221;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 211;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 102;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 103;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 104;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 105;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 106;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"HomeModule-809c8.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 107;BA.debugLine="mBase.AddView(btnProfile,0.05 * mBase.Width,0.01";
_mbase.AddView((android.view.View)(_btnprofile.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 108;BA.debugLine="mBase.AddView(btnQr,0.83 * mBase.Width,0.01 * mBa";
_mbase.AddView((android.view.View)(_btnqr.getObject()),(int) (0.83*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 109;BA.debugLine="mBase.AddView(btnSchedule,0.52 * mBase.Width,0.19";
_mbase.AddView((android.view.View)(_btnschedule.getObject()),(int) (0.52*_mbase.getWidth()),(int) (0.19*_mbase.getHeight()),(int) (0.42*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 110;BA.debugLine="mBase.AddView(btnUpload,0.80 * mBase.Width,0.30 *";
_mbase.AddView((android.view.View)(_btnupload.getObject()),(int) (0.80*_mbase.getWidth()),(int) (0.30*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 111;BA.debugLine="mBase.AddView(btnMedications,0.07 * mBase.Width,0";
_mbase.AddView((android.view.View)(_btnmedications.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.42*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 112;BA.debugLine="mBase.AddView(btnAppointments,0.38 * mBase.Width,";
_mbase.AddView((android.view.View)(_btnappointments.getObject()),(int) (0.38*_mbase.getWidth()),(int) (0.42*_mbase.getHeight()),(int) (0.26*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 113;BA.debugLine="mBase.AddView(btnHotline,0.69 * mBase.Width,0.42";
_mbase.AddView((android.view.View)(_btnhotline.getObject()),(int) (0.69*_mbase.getWidth()),(int) (0.42*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 114;BA.debugLine="mBase.AddView(btnUpdates,0.41 * mBase.Width,0.93";
_mbase.AddView((android.view.View)(_btnupdates.getObject()),(int) (0.41*_mbase.getWidth()),(int) (0.93*_mbase.getHeight()),(int) (0.22*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 115;BA.debugLine="mBase.AddView(btnLogs,0.78 * mBase.Width,0.93 * m";
_mbase.AddView((android.view.View)(_btnlogs.getObject()),(int) (0.78*_mbase.getWidth()),(int) (0.93*_mbase.getHeight()),(int) (0.22*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 116;BA.debugLine="mBase.AddView(lblName,0.05 * mBase.Width,0.10 * m";
_mbase.AddView((android.view.View)(_lblname.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()),(int) (0.90*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 117;BA.debugLine="mBase.AddView(lblProgress,0.09 * mBase.Width,0.30";
_mbase.AddView((android.view.View)(_lblprogress.getObject()),(int) (0.09*_mbase.getWidth()),(int) (0.30*_mbase.getHeight()),(int) (0.68*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 118;BA.debugLine="mBase.AddView(progressBar,0.09 * mBase.Width,0.37";
_mbase.AddView((android.view.View)(_progressbar.getObject()),(int) (0.09*_mbase.getWidth()),(int) (0.37*_mbase.getHeight()),(int) (0.83*_mbase.getWidth()),(int) (0.03*_mbase.getHeight()));
 //BA.debugLineNum = 119;BA.debugLine="mBase.AddView(pDocList,0.06 * mBase.Width,0.57 *";
_mbase.AddView((android.view.View)(_pdoclist.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.32*_mbase.getHeight()));
 //BA.debugLineNum = 120;BA.debugLine="mBase.AddView(ProgressPercent,0.09 * mBase.Width,";
_mbase.AddView((android.view.View)(_progresspercent.getObject()),(int) (0.09*_mbase.getWidth()),(int) (0.34*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 121;BA.debugLine="mBase.AddView(pHotline,0.05 * mBase.Width,0.34 *";
_mbase.AddView((android.view.View)(_photline.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.34*_mbase.getHeight()),(int) (0.90*_mbase.getWidth()),(int) (0.46*_mbase.getHeight()));
 //BA.debugLineNum = 123;BA.debugLine="initPHome";
_initphome();
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 40;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 41;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 42;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 43;BA.debugLine="btnProfile.Initialize(\"btnProfile\")";
_btnprofile.Initialize(ba,"btnProfile");
 //BA.debugLineNum = 44;BA.debugLine="btnQr.Initialize(\"btnQr\")";
_btnqr.Initialize(ba,"btnQr");
 //BA.debugLineNum = 45;BA.debugLine="btnSchedule.Initialize(\"btnSchedule\")";
_btnschedule.Initialize(ba,"btnSchedule");
 //BA.debugLineNum = 46;BA.debugLine="btnUpload.Initialize(\"btnUpload\")";
_btnupload.Initialize(ba,"btnUpload");
 //BA.debugLineNum = 47;BA.debugLine="btnMedications.Initialize(\"btnMedications\")";
_btnmedications.Initialize(ba,"btnMedications");
 //BA.debugLineNum = 48;BA.debugLine="btnAppointments.Initialize(\"btnAppointments\")";
_btnappointments.Initialize(ba,"btnAppointments");
 //BA.debugLineNum = 49;BA.debugLine="btnHotline.Initialize(\"btnHotline\")";
_btnhotline.Initialize(ba,"btnHotline");
 //BA.debugLineNum = 50;BA.debugLine="btnUpdates.Initialize(\"btnUpdates\")";
_btnupdates.Initialize(ba,"btnUpdates");
 //BA.debugLineNum = 51;BA.debugLine="btnLogs.Initialize(\"btnLogs\")";
_btnlogs.Initialize(ba,"btnLogs");
 //BA.debugLineNum = 52;BA.debugLine="lblName.Initialize(\"lblName\")";
_lblname.Initialize(ba,"lblName");
 //BA.debugLineNum = 53;BA.debugLine="lblProgress.Initialize(\"lblProgress\")";
_lblprogress.Initialize(ba,"lblProgress");
 //BA.debugLineNum = 54;BA.debugLine="progressBar.Initialize(\"progressBar\")";
_progressbar.Initialize(ba,"progressBar");
 //BA.debugLineNum = 55;BA.debugLine="pDocList.Initialize(\"pDocList\")";
_pdoclist.Initialize(ba,"pDocList");
 //BA.debugLineNum = 56;BA.debugLine="pDocList.AddSingleLine(\"My ListView\")";
_pdoclist.AddSingleLine(BA.ObjectToCharSequence("My ListView"));
 //BA.debugLineNum = 57;BA.debugLine="ProgressPercent.Initialize(\"ProgressPercent\")";
_progresspercent.Initialize(ba,"ProgressPercent");
 //BA.debugLineNum = 58;BA.debugLine="pHotline.Initialize(\"pHotline\")";
_photline.Initialize(ba,"pHotline");
 //BA.debugLineNum = 59;BA.debugLine="pHotline.AddSingleLine(\"My ListView\")";
_photline.AddSingleLine(BA.ObjectToCharSequence("My ListView"));
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _initphome() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub initPHome";
 //BA.debugLineNum = 69;BA.debugLine="btnProfile.Color =  0x00008125";
_btnprofile.setColor((int) (0x00008125));
 //BA.debugLineNum = 70;BA.debugLine="btnQr.Color =  0x00008125";
_btnqr.setColor((int) (0x00008125));
 //BA.debugLineNum = 71;BA.debugLine="btnSchedule.Color =  0x00008125";
_btnschedule.setColor((int) (0x00008125));
 //BA.debugLineNum = 72;BA.debugLine="btnUpload.Color =  0x00008125";
_btnupload.setColor((int) (0x00008125));
 //BA.debugLineNum = 73;BA.debugLine="btnMedications.Color =  0x00008125";
_btnmedications.setColor((int) (0x00008125));
 //BA.debugLineNum = 74;BA.debugLine="btnAppointments.Color =  0x00008125";
_btnappointments.setColor((int) (0x00008125));
 //BA.debugLineNum = 75;BA.debugLine="btnHotline.Color =  0x00008125";
_btnhotline.setColor((int) (0x00008125));
 //BA.debugLineNum = 76;BA.debugLine="btnUpdates.Color =  0x00008125";
_btnupdates.setColor((int) (0x00008125));
 //BA.debugLineNum = 77;BA.debugLine="btnLogs.Color =  0x00008125";
_btnlogs.setColor((int) (0x00008125));
 //BA.debugLineNum = 78;BA.debugLine="lblName.Color =  0x00ffffff";
_lblname.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 79;BA.debugLine="lblName.TextColor = 0xff000000";
_lblname.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 80;BA.debugLine="lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravi";
_lblname.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 81;BA.debugLine="lblName.Text = \"\"";
_lblname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 82;BA.debugLine="lblProgress.Color =  0x00ffffff";
_lblprogress.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 83;BA.debugLine="lblProgress.TextColor = 0xff000000";
_lblprogress.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 84;BA.debugLine="lblProgress.Gravity = Gravity.CENTER_HORIZONTAL+G";
_lblprogress.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 85;BA.debugLine="lblProgress.Text = \"\"";
_lblprogress.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 86;BA.debugLine="progressBar.Color =  0x00ffffff";
_progressbar.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 87;BA.debugLine="progressBar.TextColor = 0xff000000";
_progressbar.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 88;BA.debugLine="progressBar.Gravity = Gravity.CENTER_HORIZONTAL+G";
_progressbar.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 89;BA.debugLine="progressBar.Text = \"\"";
_progressbar.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 90;BA.debugLine="pDocList.Color =  0x00000000";
_pdoclist.setColor((int) (0x00000000));
 //BA.debugLineNum = 91;BA.debugLine="pDocList.SingleLineLayout.Label.Color =  0x000000";
_pdoclist.getSingleLineLayout().Label.setColor((int) (0x00000000));
 //BA.debugLineNum = 92;BA.debugLine="ProgressPercent.Color =  0x00ffffff";
_progresspercent.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 93;BA.debugLine="ProgressPercent.TextColor = 0xff000000";
_progresspercent.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 94;BA.debugLine="ProgressPercent.Gravity = Gravity.CENTER_HORIZONT";
_progresspercent.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 95;BA.debugLine="ProgressPercent.Text = \"\"";
_progresspercent.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 96;BA.debugLine="pHotline.Color =  0x00ffffff";
_photline.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 97;BA.debugLine="pHotline.SingleLineLayout.Label.Color =  0x000000";
_photline.getSingleLineLayout().Label.setColor((int) (0x00000000));
 //BA.debugLineNum = 98;BA.debugLine="pHotline.Visible=False";
_photline.setVisible(__c.False);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _lblname_click() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub lblName_click()";
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _lblprogress_click() throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub lblProgress_click()";
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _pdoclist_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub pDocList_ItemClick (Position As Int, Value As";
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _photline_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub pHotline_ItemClick (Position As Int, Value As";
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _progressbar_click() throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub progressBar_click()";
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _progresspercent_click() throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub ProgressPercent_click()";
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 217;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 214;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
