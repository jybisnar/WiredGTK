package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class pschedule extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.pschedule");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.pschedule.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _btnqr = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnmed = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnappoint = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitlea = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitleb = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public b4a.OPTUMizerPatient.b4xcollections _b4xcollections = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 26;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 27;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 28;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btnappoint_click() throws Exception{
b4a.OPTUMizerPatient.pappointment _p_appointment = null;
 //BA.debugLineNum = 102;BA.debugLine="Sub btnAppoint_click()";
 //BA.debugLineNum = 103;BA.debugLine="Dim p_Appointment As PAppointment";
_p_appointment = new b4a.OPTUMizerPatient.pappointment();
 //BA.debugLineNum = 104;BA.debugLine="p_Appointment=Starter.PAppointment1";
_p_appointment = (b4a.OPTUMizerPatient.pappointment)(_starter._pappointment1 /*Object*/ );
 //BA.debugLineNum = 105;BA.debugLine="p_Appointment.Visible=True";
_p_appointment._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 106;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPatient.phome _home = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 85;BA.debugLine="Dim home As PHome";
_home = new b4a.OPTUMizerPatient.phome();
 //BA.debugLineNum = 86;BA.debugLine="home=Starter.PHome1";
_home = (b4a.OPTUMizerPatient.phome)(_starter._phome1 /*Object*/ );
 //BA.debugLineNum = 87;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 88;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _btnmed_click() throws Exception{
b4a.OPTUMizerPatient.pmedication _p_medication = null;
 //BA.debugLineNum = 96;BA.debugLine="Sub btnMed_click()";
 //BA.debugLineNum = 97;BA.debugLine="Dim p_Medication As PMedication";
_p_medication = new b4a.OPTUMizerPatient.pmedication();
 //BA.debugLineNum = 98;BA.debugLine="p_Medication=Starter.PMedication1";
_p_medication = (b4a.OPTUMizerPatient.pmedication)(_starter._pmedication1 /*Object*/ );
 //BA.debugLineNum = 99;BA.debugLine="p_Medication.Visible=True";
_p_medication._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 100;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _btnqr_click() throws Exception{
b4a.OPTUMizerPatient.pqr _qrcode = null;
 //BA.debugLineNum = 90;BA.debugLine="Sub btnQr_click()";
 //BA.debugLineNum = 91;BA.debugLine="Dim qrCode As PQr";
_qrcode = new b4a.OPTUMizerPatient.pqr();
 //BA.debugLineNum = 92;BA.debugLine="qrCode=Starter.PQr1";
_qrcode = (b4a.OPTUMizerPatient.pqr)(_starter._pqr1 /*Object*/ );
 //BA.debugLineNum = 93;BA.debugLine="qrCode.Visible=True";
_qrcode._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 94;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim btnQr As Panel";
_btnqr = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnMed As Panel";
_btnmed = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btnAppoint As Panel";
_btnappoint = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblTitlea As Label";
_lbltitlea = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblTitleb As Label";
_lbltitleb = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 44;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 45;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 119;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 109;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 64;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 65;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 66;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 67;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 68;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"ScheduleSubModule-6d6b7.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 69;BA.debugLine="mBase.AddView(btnBack,0.05 * mBase.Width,0.01 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 70;BA.debugLine="mBase.AddView(btnQr,0.81 * mBase.Width,0.01 * mBa";
_mbase.AddView((android.view.View)(_btnqr.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 71;BA.debugLine="mBase.AddView(btnMed,0.32 * mBase.Width,0.74 * mB";
_mbase.AddView((android.view.View)(_btnmed.getObject()),(int) (0.32*_mbase.getWidth()),(int) (0.74*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 72;BA.debugLine="mBase.AddView(btnAppoint,0.80 * mBase.Width,0.75";
_mbase.AddView((android.view.View)(_btnappoint.getObject()),(int) (0.80*_mbase.getWidth()),(int) (0.75*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 73;BA.debugLine="mBase.AddView(lblTitlea,0.06 * mBase.Width,0.81 *";
_mbase.AddView((android.view.View)(_lbltitlea.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.81*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()));
 //BA.debugLineNum = 74;BA.debugLine="mBase.AddView(lblTitleb,0.56 * mBase.Width,0.82 *";
_mbase.AddView((android.view.View)(_lbltitleb.getObject()),(int) (0.56*_mbase.getWidth()),(int) (0.82*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()));
 //BA.debugLineNum = 76;BA.debugLine="init_PSchedule";
_init_pschedule();
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _init_pschedule() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub init_PSchedule";
 //BA.debugLineNum = 49;BA.debugLine="btnBack.Color =  0x0000e6ed";
_btnback.setColor((int) (0x0000e6ed));
 //BA.debugLineNum = 50;BA.debugLine="btnQr.Color =  0x0000e6ed";
_btnqr.setColor((int) (0x0000e6ed));
 //BA.debugLineNum = 51;BA.debugLine="btnMed.Color =  0x0000e6ed";
_btnmed.setColor((int) (0x0000e6ed));
 //BA.debugLineNum = 52;BA.debugLine="btnAppoint.Color =  0x0000e6ed";
_btnappoint.setColor((int) (0x0000e6ed));
 //BA.debugLineNum = 53;BA.debugLine="lblTitlea.Color =  0x00ffffff";
_lbltitlea.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 54;BA.debugLine="lblTitlea.TextColor = 0xff000000";
_lbltitlea.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 55;BA.debugLine="lblTitlea.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitlea.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 56;BA.debugLine="lblTitlea.Text = \"\"";
_lbltitlea.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 57;BA.debugLine="lblTitleb.Color =  0x00ffffff";
_lbltitleb.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 58;BA.debugLine="lblTitleb.TextColor = 0xff000000";
_lbltitleb.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 59;BA.debugLine="lblTitleb.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitleb.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 60;BA.debugLine="lblTitleb.Text = \"\"";
_lbltitleb.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 33;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 34;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 35;BA.debugLine="btnQr.Initialize(\"btnQr\")";
_btnqr.Initialize(ba,"btnQr");
 //BA.debugLineNum = 36;BA.debugLine="btnMed.Initialize(\"btnMed\")";
_btnmed.Initialize(ba,"btnMed");
 //BA.debugLineNum = 37;BA.debugLine="btnAppoint.Initialize(\"btnAppoint\")";
_btnappoint.Initialize(ba,"btnAppoint");
 //BA.debugLineNum = 38;BA.debugLine="lblTitlea.Initialize(\"lblTitlea\")";
_lbltitlea.Initialize(ba,"lblTitlea");
 //BA.debugLineNum = 39;BA.debugLine="lblTitleb.Initialize(\"lblTitleb\")";
_lbltitleb.Initialize(ba,"lblTitleb");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 115;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 112;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
