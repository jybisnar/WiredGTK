package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class plogs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.plogs");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.plogs.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnupdates = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprofile = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqr = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_datetime1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_datetime2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_datetime3 = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 30;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 31;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 32;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
b4a.OPTUMizerPatient.phome _home = null;
 //BA.debugLineNum = 110;BA.debugLine="Sub btnHome_click()";
 //BA.debugLineNum = 111;BA.debugLine="Dim home As PHome";
_home = new b4a.OPTUMizerPatient.phome();
 //BA.debugLineNum = 112;BA.debugLine="home=Starter.PHome1";
_home = (b4a.OPTUMizerPatient.phome)(_starter._phome1 /*Object*/ );
 //BA.debugLineNum = 113;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 114;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _btnprofile_click() throws Exception{
b4a.OPTUMizerPatient.pprofile _profile = null;
 //BA.debugLineNum = 122;BA.debugLine="Sub btnProfile_click()";
 //BA.debugLineNum = 123;BA.debugLine="Dim profile As PProfile";
_profile = new b4a.OPTUMizerPatient.pprofile();
 //BA.debugLineNum = 124;BA.debugLine="profile=Starter.PProfile1";
_profile = (b4a.OPTUMizerPatient.pprofile)(_starter._pprofile1 /*Object*/ );
 //BA.debugLineNum = 125;BA.debugLine="profile.Visible=True";
_profile._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 126;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _btnqr_click() throws Exception{
b4a.OPTUMizerPatient.pqr _qrcode = null;
 //BA.debugLineNum = 128;BA.debugLine="Sub btnQr_click()";
 //BA.debugLineNum = 129;BA.debugLine="Dim qrCode As PQr";
_qrcode = new b4a.OPTUMizerPatient.pqr();
 //BA.debugLineNum = 130;BA.debugLine="qrCode=Starter.PQr1";
_qrcode = (b4a.OPTUMizerPatient.pqr)(_starter._pqr1 /*Object*/ );
 //BA.debugLineNum = 131;BA.debugLine="qrCode.Visible=True";
_qrcode._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 132;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _btnupdates_click() throws Exception{
b4a.OPTUMizerPatient.pupdates _p_update = null;
 //BA.debugLineNum = 116;BA.debugLine="Sub btnUpdates_click()";
 //BA.debugLineNum = 117;BA.debugLine="Dim p_Update As PUpdates";
_p_update = new b4a.OPTUMizerPatient.pupdates();
 //BA.debugLineNum = 118;BA.debugLine="p_Update=Starter.PUpdates1";
_p_update = (b4a.OPTUMizerPatient.pupdates)(_starter._pupdates1 /*Object*/ );
 //BA.debugLineNum = 119;BA.debugLine="p_Update.Visible=True";
_p_update._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 120;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnHome As Panel";
_btnhome = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnUpdates As Panel";
_btnupdates = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnProfile As Panel";
_btnprofile = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btnQr As Panel";
_btnqr = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblText1 As Label";
_lbltext1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblText2 As Label";
_lbltext2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lblText3 As Label";
_lbltext3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lbl_dateTime1 As Label";
_lbl_datetime1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim lbl_dateTime2 As Label";
_lbl_datetime2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim lbl_dateTime3 As Label";
_lbl_datetime3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 52;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 53;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 159;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 149;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
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
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"PatientLogsModule-0beda.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 92;BA.debugLine="mBase.AddView(btnHome,0.00 * mBase.Width,0.92 * m";
_mbase.AddView((android.view.View)(_btnhome.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 93;BA.debugLine="mBase.AddView(btnUpdates,0.38 * mBase.Width,0.92";
_mbase.AddView((android.view.View)(_btnupdates.getObject()),(int) (0.38*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.25*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 94;BA.debugLine="mBase.AddView(btnProfile,0.01 * mBase.Width,0.01";
_mbase.AddView((android.view.View)(_btnprofile.getObject()),(int) (0.01*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 95;BA.debugLine="mBase.AddView(btnQr,0.79 * mBase.Width,0.01 * mBa";
_mbase.AddView((android.view.View)(_btnqr.getObject()),(int) (0.79*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 96;BA.debugLine="mBase.AddView(lblText1,0.27 * mBase.Width,0.17 *";
_mbase.AddView((android.view.View)(_lbltext1.getObject()),(int) (0.27*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()),(int) (0.72*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()));
 //BA.debugLineNum = 97;BA.debugLine="mBase.AddView(lblText2,0.27 * mBase.Width,0.44 *";
_mbase.AddView((android.view.View)(_lbltext2.getObject()),(int) (0.27*_mbase.getWidth()),(int) (0.44*_mbase.getHeight()),(int) (0.72*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()));
 //BA.debugLineNum = 98;BA.debugLine="mBase.AddView(lblText3,0.27 * mBase.Width,0.69 *";
_mbase.AddView((android.view.View)(_lbltext3.getObject()),(int) (0.27*_mbase.getWidth()),(int) (0.69*_mbase.getHeight()),(int) (0.72*_mbase.getWidth()),(int) (0.14*_mbase.getHeight()));
 //BA.debugLineNum = 99;BA.debugLine="mBase.AddView(lbl_dateTime1,0.60 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_lbl_datetime1.getObject()),(int) (0.60*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 100;BA.debugLine="mBase.AddView(lbl_dateTime2,0.60 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_lbl_datetime2.getObject()),(int) (0.60*_mbase.getWidth()),(int) (0.39*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 101;BA.debugLine="mBase.AddView(lbl_dateTime3,0.60 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_lbl_datetime3.getObject()),(int) (0.60*_mbase.getWidth()),(int) (0.64*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _init_plogs() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub init_Plogs";
 //BA.debugLineNum = 57;BA.debugLine="btnHome.Color =  0x00001f59";
_btnhome.setColor((int) (0x00001f59));
 //BA.debugLineNum = 58;BA.debugLine="btnUpdates.Color =  0x00001f59";
_btnupdates.setColor((int) (0x00001f59));
 //BA.debugLineNum = 59;BA.debugLine="btnProfile.Color =  0x00001f59";
_btnprofile.setColor((int) (0x00001f59));
 //BA.debugLineNum = 60;BA.debugLine="btnQr.Color =  0x00001f59";
_btnqr.setColor((int) (0x00001f59));
 //BA.debugLineNum = 61;BA.debugLine="lblText1.Color =  0x00ffffff";
_lbltext1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 62;BA.debugLine="lblText1.TextColor = 0xff000000";
_lbltext1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 63;BA.debugLine="lblText1.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbltext1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 64;BA.debugLine="lblText1.Text = \"\"";
_lbltext1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 65;BA.debugLine="lblText2.Color =  0x00ffffff";
_lbltext2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 66;BA.debugLine="lblText2.TextColor = 0xff000000";
_lbltext2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 67;BA.debugLine="lblText2.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbltext2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 68;BA.debugLine="lblText2.Text = \"\"";
_lbltext2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 69;BA.debugLine="lblText3.Color =  0x00ffffff";
_lbltext3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 70;BA.debugLine="lblText3.TextColor = 0xff000000";
_lbltext3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 71;BA.debugLine="lblText3.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbltext3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 72;BA.debugLine="lblText3.Text = \"\"";
_lbltext3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 73;BA.debugLine="lbl_dateTime1.Color =  0x00ffffff";
_lbl_datetime1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 74;BA.debugLine="lbl_dateTime1.TextColor = 0xff000000";
_lbl_datetime1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 75;BA.debugLine="lbl_dateTime1.Gravity = Gravity.CENTER_HORIZONTAL";
_lbl_datetime1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 76;BA.debugLine="lbl_dateTime1.Text = \"\"";
_lbl_datetime1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 77;BA.debugLine="lbl_dateTime2.Color =  0x00ffffff";
_lbl_datetime2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 78;BA.debugLine="lbl_dateTime2.TextColor = 0xff000000";
_lbl_datetime2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 79;BA.debugLine="lbl_dateTime2.Gravity = Gravity.CENTER_HORIZONTAL";
_lbl_datetime2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 80;BA.debugLine="lbl_dateTime2.Text = \"\"";
_lbl_datetime2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 81;BA.debugLine="lbl_dateTime3.Color =  0x00ffffff";
_lbl_datetime3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 82;BA.debugLine="lbl_dateTime3.TextColor = 0xff000000";
_lbl_datetime3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 83;BA.debugLine="lbl_dateTime3.Gravity = Gravity.CENTER_HORIZONTAL";
_lbl_datetime3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 84;BA.debugLine="lbl_dateTime3.Text = \"\"";
_lbl_datetime3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 35;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 36;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 37;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 38;BA.debugLine="btnHome.Initialize(\"btnHome\")";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 39;BA.debugLine="btnUpdates.Initialize(\"btnUpdates\")";
_btnupdates.Initialize(ba,"btnUpdates");
 //BA.debugLineNum = 40;BA.debugLine="btnProfile.Initialize(\"btnProfile\")";
_btnprofile.Initialize(ba,"btnProfile");
 //BA.debugLineNum = 41;BA.debugLine="btnQr.Initialize(\"btnQr\")";
_btnqr.Initialize(ba,"btnQr");
 //BA.debugLineNum = 42;BA.debugLine="lblText1.Initialize(\"lblText1\")";
_lbltext1.Initialize(ba,"lblText1");
 //BA.debugLineNum = 43;BA.debugLine="lblText2.Initialize(\"lblText2\")";
_lbltext2.Initialize(ba,"lblText2");
 //BA.debugLineNum = 44;BA.debugLine="lblText3.Initialize(\"lblText3\")";
_lbltext3.Initialize(ba,"lblText3");
 //BA.debugLineNum = 45;BA.debugLine="lbl_dateTime1.Initialize(\"lbl_dateTime1\")";
_lbl_datetime1.Initialize(ba,"lbl_dateTime1");
 //BA.debugLineNum = 46;BA.debugLine="lbl_dateTime2.Initialize(\"lbl_dateTime2\")";
_lbl_datetime2.Initialize(ba,"lbl_dateTime2");
 //BA.debugLineNum = 47;BA.debugLine="lbl_dateTime3.Initialize(\"lbl_dateTime3\")";
_lbl_datetime3.Initialize(ba,"lbl_dateTime3");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _lbl_datetime1_click() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub lbl_dateTime1_click()";
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _lbl_datetime2_click() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub lbl_dateTime2_click()";
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _lbl_datetime3_click() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub lbl_dateTime3_click()";
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _lbltext1_click() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub lblText1_click()";
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _lbltext2_click() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub lblText2_click()";
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _lbltext3_click() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub lblText3_click()";
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 155;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 152;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
