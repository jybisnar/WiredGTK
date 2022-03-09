package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dlogs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dlogs");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dlogs.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _btnprofile = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqrreader = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_datetime1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_datetime2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_datetime3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_datetime4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprof1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprof2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprof3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprof4 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
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
public String  _btnhome_click() throws Exception{
b4a.OPTUMizerPhysician.dhome _home = null;
 //BA.debugLineNum = 137;BA.debugLine="Sub btnHome_click()";
 //BA.debugLineNum = 138;BA.debugLine="Dim home As DHome";
_home = new b4a.OPTUMizerPhysician.dhome();
 //BA.debugLineNum = 139;BA.debugLine="home=Starter.DHome1";
_home = (b4a.OPTUMizerPhysician.dhome)(_starter._dhome1 /*Object*/ );
 //BA.debugLineNum = 140;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 141;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public String  _btnprof1_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientprof _patient1 = null;
 //BA.debugLineNum = 155;BA.debugLine="Sub btnProf1_click()";
 //BA.debugLineNum = 156;BA.debugLine="Dim patient1 As DPatientProf";
_patient1 = new b4a.OPTUMizerPhysician.dpatientprof();
 //BA.debugLineNum = 157;BA.debugLine="patient1=Starter.DPatientProf1";
_patient1 = (b4a.OPTUMizerPhysician.dpatientprof)(_starter._dpatientprof1 /*Object*/ );
 //BA.debugLineNum = 158;BA.debugLine="patient1.Visible=True";
_patient1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 159;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _btnprof2_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientprof _patient1 = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub btnProf2_click()";
 //BA.debugLineNum = 162;BA.debugLine="Dim patient1 As DPatientProf";
_patient1 = new b4a.OPTUMizerPhysician.dpatientprof();
 //BA.debugLineNum = 163;BA.debugLine="patient1=Starter.DPatientProf1";
_patient1 = (b4a.OPTUMizerPhysician.dpatientprof)(_starter._dpatientprof1 /*Object*/ );
 //BA.debugLineNum = 164;BA.debugLine="patient1.Visible=True";
_patient1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 165;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _btnprof3_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientprof _patient1 = null;
 //BA.debugLineNum = 167;BA.debugLine="Sub btnProf3_click()";
 //BA.debugLineNum = 168;BA.debugLine="Dim patient1 As DPatientProf";
_patient1 = new b4a.OPTUMizerPhysician.dpatientprof();
 //BA.debugLineNum = 169;BA.debugLine="patient1=Starter.DPatientProf1";
_patient1 = (b4a.OPTUMizerPhysician.dpatientprof)(_starter._dpatientprof1 /*Object*/ );
 //BA.debugLineNum = 170;BA.debugLine="patient1.Visible=True";
_patient1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 171;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public String  _btnprof4_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientprof _patient1 = null;
 //BA.debugLineNum = 173;BA.debugLine="Sub btnProf4_click()";
 //BA.debugLineNum = 174;BA.debugLine="Dim patient1 As DPatientProf";
_patient1 = new b4a.OPTUMizerPhysician.dpatientprof();
 //BA.debugLineNum = 175;BA.debugLine="patient1=Starter.DPatientProf1";
_patient1 = (b4a.OPTUMizerPhysician.dpatientprof)(_starter._dpatientprof1 /*Object*/ );
 //BA.debugLineNum = 176;BA.debugLine="patient1.Visible=True";
_patient1._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 177;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _btnprofile_click() throws Exception{
b4a.OPTUMizerPhysician.dprofile _profile = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub btnProfile_click()";
 //BA.debugLineNum = 144;BA.debugLine="Dim profile As DProfile";
_profile = new b4a.OPTUMizerPhysician.dprofile();
 //BA.debugLineNum = 145;BA.debugLine="profile=Starter.DProfile1";
_profile = (b4a.OPTUMizerPhysician.dprofile)(_starter._dprofile1 /*Object*/ );
 //BA.debugLineNum = 146;BA.debugLine="profile.Visible=True";
_profile._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 147;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _btnqrreader_click() throws Exception{
b4a.OPTUMizerPhysician.dqrreader _qrreader = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub btnQrReader_click()";
 //BA.debugLineNum = 150;BA.debugLine="Dim qrReader As DQrReader";
_qrreader = new b4a.OPTUMizerPhysician.dqrreader();
 //BA.debugLineNum = 151;BA.debugLine="qrReader=Starter.DQrReader1";
_qrreader = (b4a.OPTUMizerPhysician.dqrreader)(_starter._dqrreader1 /*Object*/ );
 //BA.debugLineNum = 152;BA.debugLine="qrReader.Visible=True";
_qrreader._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 153;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim btnProfile As Panel";
_btnprofile = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnQrReader As Panel";
_btnqrreader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim lblText1 As Label";
_lbltext1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblText2 As Label";
_lbltext2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblText3 As Label";
_lbltext3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lbl_dateTime1 As Label";
_lbl_datetime1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lbl_dateTime2 As Label";
_lbl_datetime2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim lbl_dateTime3 As Label";
_lbl_datetime3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim lblText4 As Label";
_lbltext4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim lbl_dateTime4 As Label";
_lbl_datetime4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim btnProf1 As Panel";
_btnprof1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim btnProf2 As Panel";
_btnprof2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim btnProf3 As Panel";
_btnprof3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim btnProf4 As Panel";
_btnprof4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 62;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 63;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 207;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 197;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 108;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 109;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 110;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 111;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 112;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"NewScreen-40038.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 113;BA.debugLine="mBase.AddView(btnHome,0.30 * mBase.Width,0.92 * m";
_mbase.AddView((android.view.View)(_btnhome.getObject()),(int) (0.30*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.22*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 114;BA.debugLine="mBase.AddView(btnProfile,0.02 * mBase.Width,0.02";
_mbase.AddView((android.view.View)(_btnprofile.getObject()),(int) (0.02*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 115;BA.debugLine="mBase.AddView(btnQrReader,0.78 * mBase.Width,0.01";
_mbase.AddView((android.view.View)(_btnqrreader.getObject()),(int) (0.78*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.19*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 116;BA.debugLine="mBase.AddView(lblText1,0.26 * mBase.Width,0.17 *";
_mbase.AddView((android.view.View)(_lbltext1.getObject()),(int) (0.26*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()),(int) (0.68*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 117;BA.debugLine="mBase.AddView(lblText2,0.26 * mBase.Width,0.36 *";
_mbase.AddView((android.view.View)(_lbltext2.getObject()),(int) (0.26*_mbase.getWidth()),(int) (0.36*_mbase.getHeight()),(int) (0.68*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 118;BA.debugLine="mBase.AddView(lblText3,0.26 * mBase.Width,0.54 *";
_mbase.AddView((android.view.View)(_lbltext3.getObject()),(int) (0.26*_mbase.getWidth()),(int) (0.54*_mbase.getHeight()),(int) (0.68*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()));
 //BA.debugLineNum = 119;BA.debugLine="mBase.AddView(lbl_dateTime1,0.56 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_lbl_datetime1.getObject()),(int) (0.56*_mbase.getWidth()),(int) (0.13*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 120;BA.debugLine="mBase.AddView(lbl_dateTime2,0.56 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_lbl_datetime2.getObject()),(int) (0.56*_mbase.getWidth()),(int) (0.32*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 121;BA.debugLine="mBase.AddView(lbl_dateTime3,0.56 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_lbl_datetime3.getObject()),(int) (0.56*_mbase.getWidth()),(int) (0.50*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 122;BA.debugLine="mBase.AddView(lblText4,0.26 * mBase.Width,0.72 *";
_mbase.AddView((android.view.View)(_lbltext4.getObject()),(int) (0.26*_mbase.getWidth()),(int) (0.72*_mbase.getHeight()),(int) (0.68*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 123;BA.debugLine="mBase.AddView(lbl_dateTime4,0.56 * mBase.Width,0.";
_mbase.AddView((android.view.View)(_lbl_datetime4.getObject()),(int) (0.56*_mbase.getWidth()),(int) (0.68*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 124;BA.debugLine="mBase.AddView(btnProf1,0.04 * mBase.Width,0.13 *";
_mbase.AddView((android.view.View)(_btnprof1.getObject()),(int) (0.04*_mbase.getWidth()),(int) (0.13*_mbase.getHeight()),(int) (0.93*_mbase.getWidth()),(int) (0.16*_mbase.getHeight()));
 //BA.debugLineNum = 125;BA.debugLine="mBase.AddView(btnProf2,0.04 * mBase.Width,0.31 *";
_mbase.AddView((android.view.View)(_btnprof2.getObject()),(int) (0.04*_mbase.getWidth()),(int) (0.31*_mbase.getHeight()),(int) (0.93*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()));
 //BA.debugLineNum = 126;BA.debugLine="mBase.AddView(btnProf3,0.04 * mBase.Width,0.49 *";
_mbase.AddView((android.view.View)(_btnprof3.getObject()),(int) (0.04*_mbase.getWidth()),(int) (0.49*_mbase.getHeight()),(int) (0.93*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()));
 //BA.debugLineNum = 127;BA.debugLine="mBase.AddView(btnProf4,0.04 * mBase.Width,0.67 *";
_mbase.AddView((android.view.View)(_btnprof4.getObject()),(int) (0.04*_mbase.getWidth()),(int) (0.67*_mbase.getHeight()),(int) (0.93*_mbase.getWidth()),(int) (0.17*_mbase.getHeight()));
 //BA.debugLineNum = 129;BA.debugLine="initDlogs";
_initdlogs();
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _initdlogs() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub initDlogs";
 //BA.debugLineNum = 67;BA.debugLine="btnHome.Color =  0x00001f59";
_btnhome.setColor((int) (0x00001f59));
 //BA.debugLineNum = 68;BA.debugLine="btnProfile.Color =  0x00001f59";
_btnprofile.setColor((int) (0x00001f59));
 //BA.debugLineNum = 69;BA.debugLine="btnQrReader.Color =  0x00001f59";
_btnqrreader.setColor((int) (0x00001f59));
 //BA.debugLineNum = 70;BA.debugLine="btnProf1.Color =  0x0000a471";
_btnprof1.setColor((int) (0x0000a471));
 //BA.debugLineNum = 71;BA.debugLine="btnProf2.Color =  0x0000f023";
_btnprof2.setColor((int) (0x0000f023));
 //BA.debugLineNum = 72;BA.debugLine="btnProf3.Color =  0x000028d6";
_btnprof3.setColor((int) (0x000028d6));
 //BA.debugLineNum = 73;BA.debugLine="btnProf4.Color =  0x00001beb";
_btnprof4.setColor((int) (0x00001beb));
 //BA.debugLineNum = 74;BA.debugLine="lblText1.Color =  0x00ffffff";
_lbltext1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 75;BA.debugLine="lblText1.TextColor = 0xff000000";
_lbltext1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 76;BA.debugLine="lblText1.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbltext1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 77;BA.debugLine="lblText1.Text = \"aaa\"";
_lbltext1.setText(BA.ObjectToCharSequence("aaa"));
 //BA.debugLineNum = 78;BA.debugLine="lblText2.Color =  0x00ffffff";
_lbltext2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 79;BA.debugLine="lblText2.TextColor = 0xff000000";
_lbltext2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 80;BA.debugLine="lblText2.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbltext2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 81;BA.debugLine="lblText2.Text = \"aaa\"";
_lbltext2.setText(BA.ObjectToCharSequence("aaa"));
 //BA.debugLineNum = 82;BA.debugLine="lblText3.Color =  0x00ffffff";
_lbltext3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 83;BA.debugLine="lblText3.TextColor = 0xff000000";
_lbltext3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 84;BA.debugLine="lblText3.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbltext3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 85;BA.debugLine="lblText3.Text = \"aa\"";
_lbltext3.setText(BA.ObjectToCharSequence("aa"));
 //BA.debugLineNum = 86;BA.debugLine="lbl_dateTime1.Color =  0x00ffffff";
_lbl_datetime1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 87;BA.debugLine="lbl_dateTime1.TextColor = 0xff000000";
_lbl_datetime1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 88;BA.debugLine="lbl_dateTime1.Gravity = Gravity.CENTER_HORIZONTAL";
_lbl_datetime1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 89;BA.debugLine="lbl_dateTime1.Text = \"aa\"";
_lbl_datetime1.setText(BA.ObjectToCharSequence("aa"));
 //BA.debugLineNum = 90;BA.debugLine="lbl_dateTime2.Color =  0x00ffffff";
_lbl_datetime2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 91;BA.debugLine="lbl_dateTime2.TextColor = 0xff000000";
_lbl_datetime2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 92;BA.debugLine="lbl_dateTime2.Gravity = Gravity.CENTER_HORIZONTAL";
_lbl_datetime2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 93;BA.debugLine="lbl_dateTime2.Text = \"aa\"";
_lbl_datetime2.setText(BA.ObjectToCharSequence("aa"));
 //BA.debugLineNum = 94;BA.debugLine="lbl_dateTime3.Color =  0x00ffffff";
_lbl_datetime3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 95;BA.debugLine="lbl_dateTime3.TextColor = 0xff000000";
_lbl_datetime3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 96;BA.debugLine="lbl_dateTime3.Gravity = Gravity.CENTER_HORIZONTAL";
_lbl_datetime3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 97;BA.debugLine="lbl_dateTime3.Text = \"aa\"";
_lbl_datetime3.setText(BA.ObjectToCharSequence("aa"));
 //BA.debugLineNum = 98;BA.debugLine="lblText4.Color =  0x00ffffff";
_lbltext4.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 99;BA.debugLine="lblText4.TextColor = 0xff000000";
_lbltext4.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 100;BA.debugLine="lblText4.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbltext4.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 101;BA.debugLine="lblText4.Text = \"aa\"";
_lbltext4.setText(BA.ObjectToCharSequence("aa"));
 //BA.debugLineNum = 102;BA.debugLine="lbl_dateTime4.Color =  0x00ffffff";
_lbl_datetime4.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 103;BA.debugLine="lbl_dateTime4.TextColor = 0xff000000";
_lbl_datetime4.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 104;BA.debugLine="lbl_dateTime4.Gravity = Gravity.CENTER_HORIZONTAL";
_lbl_datetime4.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 105;BA.debugLine="lbl_dateTime4.Text = \"\"";
_lbl_datetime4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 43;BA.debugLine="btnHome.Initialize(\"btnHome\")";
_btnhome.Initialize(ba,"btnHome");
 //BA.debugLineNum = 44;BA.debugLine="btnProfile.Initialize(\"btnProfile\")";
_btnprofile.Initialize(ba,"btnProfile");
 //BA.debugLineNum = 45;BA.debugLine="btnQrReader.Initialize(\"btnQrReader\")";
_btnqrreader.Initialize(ba,"btnQrReader");
 //BA.debugLineNum = 46;BA.debugLine="lblText1.Initialize(\"lblText1\")";
_lbltext1.Initialize(ba,"lblText1");
 //BA.debugLineNum = 47;BA.debugLine="lblText2.Initialize(\"lblText2\")";
_lbltext2.Initialize(ba,"lblText2");
 //BA.debugLineNum = 48;BA.debugLine="lblText3.Initialize(\"lblText3\")";
_lbltext3.Initialize(ba,"lblText3");
 //BA.debugLineNum = 49;BA.debugLine="lbl_dateTime1.Initialize(\"lbl_dateTime1\")";
_lbl_datetime1.Initialize(ba,"lbl_dateTime1");
 //BA.debugLineNum = 50;BA.debugLine="lbl_dateTime2.Initialize(\"lbl_dateTime2\")";
_lbl_datetime2.Initialize(ba,"lbl_dateTime2");
 //BA.debugLineNum = 51;BA.debugLine="lbl_dateTime3.Initialize(\"lbl_dateTime3\")";
_lbl_datetime3.Initialize(ba,"lbl_dateTime3");
 //BA.debugLineNum = 52;BA.debugLine="lblText4.Initialize(\"lblText4\")";
_lbltext4.Initialize(ba,"lblText4");
 //BA.debugLineNum = 53;BA.debugLine="lbl_dateTime4.Initialize(\"lbl_dateTime4\")";
_lbl_datetime4.Initialize(ba,"lbl_dateTime4");
 //BA.debugLineNum = 54;BA.debugLine="btnProf1.Initialize(\"btnProf1\")";
_btnprof1.Initialize(ba,"btnProf1");
 //BA.debugLineNum = 55;BA.debugLine="btnProf2.Initialize(\"btnProf2\")";
_btnprof2.Initialize(ba,"btnProf2");
 //BA.debugLineNum = 56;BA.debugLine="btnProf3.Initialize(\"btnProf3\")";
_btnprof3.Initialize(ba,"btnProf3");
 //BA.debugLineNum = 57;BA.debugLine="btnProf4.Initialize(\"btnProf4\")";
_btnprof4.Initialize(ba,"btnProf4");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _lbl_datetime1_click() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub lbl_dateTime1_click()";
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _lbl_datetime2_click() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub lbl_dateTime2_click()";
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _lbl_datetime3_click() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub lbl_dateTime3_click()";
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _lbl_datetime4_click() throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub lbl_dateTime4_click()";
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _lbltext1_click() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub lblText1_click()";
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _lbltext2_click() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub lblText2_click()";
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _lbltext3_click() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub lblText3_click()";
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _lbltext4_click() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub lblText4_click()";
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 203;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 200;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
