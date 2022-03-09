package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class pappointment extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.pappointment");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.pappointment.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnappointment = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqr = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_startstop1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_startstop2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_startstop3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc3 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public b4a.OPTUMizerPatient.b4xcollections _b4xcollections = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 32;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 33;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 34;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _btnappointment_click() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub btnAppointment_click()";
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPatient.phome _home = null;
 //BA.debugLineNum = 129;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 130;BA.debugLine="Dim home As PHome";
_home = new b4a.OPTUMizerPatient.phome();
 //BA.debugLineNum = 131;BA.debugLine="home=Starter.PHome1";
_home = (b4a.OPTUMizerPatient.phome)(_starter._phome1 /*Object*/ );
 //BA.debugLineNum = 132;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 133;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _btnqr_click() throws Exception{
b4a.OPTUMizerPatient.pqr _qrcode = null;
 //BA.debugLineNum = 135;BA.debugLine="Sub btnQr_click()";
 //BA.debugLineNum = 136;BA.debugLine="Dim qrCode As PQr";
_qrcode = new b4a.OPTUMizerPatient.pqr();
 //BA.debugLineNum = 137;BA.debugLine="qrCode=Starter.PQr1";
_qrcode = (b4a.OPTUMizerPatient.pqr)(_starter._pqr1 /*Object*/ );
 //BA.debugLineNum = 138;BA.debugLine="qrCode.Visible=True";
_qrcode._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 139;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnAppointment As Panel";
_btnappointment = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnBack As Panel";
_btnback = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnQr As Panel";
_btnqr = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim lbl_startStop1 As Label";
_lbl_startstop1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblDesc1 As Label";
_lbldesc1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblDate1 As Label";
_lbldate1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lbl_startStop2 As Label";
_lbl_startstop2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lblDate2 As Label";
_lbldate2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim lblDesc2 As Label";
_lbldesc2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim lbl_startStop3 As Label";
_lbl_startstop3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim lblDate3 As Label";
_lbldate3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim lblDesc3 As Label";
_lbldesc3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 56;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 57;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 178;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 168;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
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
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"AppointmentsSubModule-6e904.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 107;BA.debugLine="mBase.AddView(btnAppointment,0.28 * mBase.Width,0";
_mbase.AddView((android.view.View)(_btnappointment.getObject()),(int) (0.28*_mbase.getWidth()),(int) (0.30*_mbase.getHeight()),(int) (0.43*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 108;BA.debugLine="mBase.AddView(btnBack,0.06 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 109;BA.debugLine="mBase.AddView(btnQr,0.81 * mBase.Width,0.02 * mBa";
_mbase.AddView((android.view.View)(_btnqr.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 110;BA.debugLine="mBase.AddView(lbl_startStop1,0.20 * mBase.Width,0";
_mbase.AddView((android.view.View)(_lbl_startstop1.getObject()),(int) (0.20*_mbase.getWidth()),(int) (0.40*_mbase.getHeight()),(int) (0.46*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 111;BA.debugLine="mBase.AddView(lblDesc1,0.07 * mBase.Width,0.45 *";
_mbase.AddView((android.view.View)(_lbldesc1.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.45*_mbase.getHeight()),(int) (0.85*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 112;BA.debugLine="mBase.AddView(lblDate1,0.65 * mBase.Width,0.40 *";
_mbase.AddView((android.view.View)(_lbldate1.getObject()),(int) (0.65*_mbase.getWidth()),(int) (0.40*_mbase.getHeight()),(int) (0.27*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 113;BA.debugLine="mBase.AddView(lbl_startStop2,0.20 * mBase.Width,0";
_mbase.AddView((android.view.View)(_lbl_startstop2.getObject()),(int) (0.20*_mbase.getWidth()),(int) (0.60*_mbase.getHeight()),(int) (0.46*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 114;BA.debugLine="mBase.AddView(lblDate2,0.65 * mBase.Width,0.60 *";
_mbase.AddView((android.view.View)(_lbldate2.getObject()),(int) (0.65*_mbase.getWidth()),(int) (0.60*_mbase.getHeight()),(int) (0.27*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 115;BA.debugLine="mBase.AddView(lblDesc2,0.07 * mBase.Width,0.65 *";
_mbase.AddView((android.view.View)(_lbldesc2.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.65*_mbase.getHeight()),(int) (0.85*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 116;BA.debugLine="mBase.AddView(lbl_startStop3,0.20 * mBase.Width,0";
_mbase.AddView((android.view.View)(_lbl_startstop3.getObject()),(int) (0.20*_mbase.getWidth()),(int) (0.81*_mbase.getHeight()),(int) (0.46*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 117;BA.debugLine="mBase.AddView(lblDate3,0.65 * mBase.Width,0.81 *";
_mbase.AddView((android.view.View)(_lbldate3.getObject()),(int) (0.65*_mbase.getWidth()),(int) (0.81*_mbase.getHeight()),(int) (0.27*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 118;BA.debugLine="mBase.AddView(lblDesc3,0.07 * mBase.Width,0.85 *";
_mbase.AddView((android.view.View)(_lbldesc3.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.85*_mbase.getHeight()),(int) (0.85*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _init_pappointment() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub init_PAppointment";
 //BA.debugLineNum = 61;BA.debugLine="btnAppointment.Color =  0xff00979f";
_btnappointment.setColor((int) (0xff00979f));
 //BA.debugLineNum = 62;BA.debugLine="btnBack.Color =  0xff008b67";
_btnback.setColor((int) (0xff008b67));
 //BA.debugLineNum = 63;BA.debugLine="btnQr.Color =  0xff008b67";
_btnqr.setColor((int) (0xff008b67));
 //BA.debugLineNum = 64;BA.debugLine="lbl_startStop1.Color =  0x00ffffff";
_lbl_startstop1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 65;BA.debugLine="lbl_startStop1.TextColor = 0xff000000";
_lbl_startstop1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 66;BA.debugLine="lbl_startStop1.Gravity = Gravity.CENTER_HORIZONTA";
_lbl_startstop1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 67;BA.debugLine="lbl_startStop1.Text = \"\"";
_lbl_startstop1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 68;BA.debugLine="lblDesc1.Color =  0x00ffffff";
_lbldesc1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 69;BA.debugLine="lblDesc1.TextColor = 0xff000000";
_lbldesc1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 70;BA.debugLine="lblDesc1.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldesc1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 71;BA.debugLine="lblDesc1.Text = \"\"";
_lbldesc1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 72;BA.debugLine="lblDate1.Color =  0x00ffffff";
_lbldate1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 73;BA.debugLine="lblDate1.TextColor = 0xff000000";
_lbldate1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 74;BA.debugLine="lblDate1.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldate1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 75;BA.debugLine="lblDate1.Text = \"\"";
_lbldate1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 76;BA.debugLine="lbl_startStop2.Color =  0x00ffffff";
_lbl_startstop2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 77;BA.debugLine="lbl_startStop2.TextColor = 0xff000000";
_lbl_startstop2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 78;BA.debugLine="lbl_startStop2.Gravity = Gravity.CENTER_HORIZONTA";
_lbl_startstop2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 79;BA.debugLine="lbl_startStop2.Text = \"\"";
_lbl_startstop2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 80;BA.debugLine="lblDate2.Color =  0x00ffffff";
_lbldate2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 81;BA.debugLine="lblDate2.TextColor = 0xff000000";
_lbldate2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 82;BA.debugLine="lblDate2.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldate2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 83;BA.debugLine="lblDate2.Text = \"\"";
_lbldate2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 84;BA.debugLine="lblDesc2.Color =  0x00ffffff";
_lbldesc2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 85;BA.debugLine="lblDesc2.TextColor = 0xff000000";
_lbldesc2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 86;BA.debugLine="lblDesc2.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldesc2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 87;BA.debugLine="lblDesc2.Text = \"\"";
_lbldesc2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 88;BA.debugLine="lbl_startStop3.Color =  0x00ffffff";
_lbl_startstop3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 89;BA.debugLine="lbl_startStop3.TextColor = 0xff000000";
_lbl_startstop3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 90;BA.debugLine="lbl_startStop3.Gravity = Gravity.CENTER_HORIZONTA";
_lbl_startstop3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 91;BA.debugLine="lbl_startStop3.Text = \"\"";
_lbl_startstop3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 92;BA.debugLine="lblDate3.Color =  0x00ffffff";
_lbldate3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 93;BA.debugLine="lblDate3.TextColor = 0xff000000";
_lbldate3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 94;BA.debugLine="lblDate3.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldate3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 95;BA.debugLine="lblDate3.Text = \"\"";
_lbldate3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 96;BA.debugLine="lblDesc3.Color =  0x00ffffff";
_lbldesc3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 97;BA.debugLine="lblDesc3.TextColor = 0xff000000";
_lbldesc3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 98;BA.debugLine="lblDesc3.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldesc3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 99;BA.debugLine="lblDesc3.Text = \"\"";
_lbldesc3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 36;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 37;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 38;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 39;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 40;BA.debugLine="btnAppointment.Initialize(\"btnAppointment\")";
_btnappointment.Initialize(ba,"btnAppointment");
 //BA.debugLineNum = 41;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 42;BA.debugLine="btnQr.Initialize(\"btnQr\")";
_btnqr.Initialize(ba,"btnQr");
 //BA.debugLineNum = 43;BA.debugLine="lbl_startStop1.Initialize(\"lbl_startStop1\")";
_lbl_startstop1.Initialize(ba,"lbl_startStop1");
 //BA.debugLineNum = 44;BA.debugLine="lblDesc1.Initialize(\"lblDesc1\")";
_lbldesc1.Initialize(ba,"lblDesc1");
 //BA.debugLineNum = 45;BA.debugLine="lblDate1.Initialize(\"lblDate1\")";
_lbldate1.Initialize(ba,"lblDate1");
 //BA.debugLineNum = 46;BA.debugLine="lbl_startStop2.Initialize(\"lbl_startStop2\")";
_lbl_startstop2.Initialize(ba,"lbl_startStop2");
 //BA.debugLineNum = 47;BA.debugLine="lblDate2.Initialize(\"lblDate2\")";
_lbldate2.Initialize(ba,"lblDate2");
 //BA.debugLineNum = 48;BA.debugLine="lblDesc2.Initialize(\"lblDesc2\")";
_lbldesc2.Initialize(ba,"lblDesc2");
 //BA.debugLineNum = 49;BA.debugLine="lbl_startStop3.Initialize(\"lbl_startStop3\")";
_lbl_startstop3.Initialize(ba,"lbl_startStop3");
 //BA.debugLineNum = 50;BA.debugLine="lblDate3.Initialize(\"lblDate3\")";
_lbldate3.Initialize(ba,"lblDate3");
 //BA.debugLineNum = 51;BA.debugLine="lblDesc3.Initialize(\"lblDesc3\")";
_lbldesc3.Initialize(ba,"lblDesc3");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _lbl_startstop1_click() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub lbl_startStop1_click()";
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _lbl_startstop2_click() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub lbl_startStop2_click()";
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _lbl_startstop3_click() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub lbl_startStop3_click()";
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _lbldate1_click() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub lblDate1_click()";
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _lbldate2_click() throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub lblDate2_click()";
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _lbldate3_click() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub lblDate3_click()";
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _lbldesc1_click() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub lblDesc1_click()";
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _lbldesc2_click() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub lblDesc2_click()";
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _lbldesc3_click() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub lblDesc3_click()";
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 174;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 171;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
