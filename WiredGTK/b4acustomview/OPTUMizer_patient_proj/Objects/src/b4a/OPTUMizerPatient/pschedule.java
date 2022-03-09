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
public anywheresoftware.b4a.objects.PanelWrapper _btn1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitlea = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitleb = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitlec = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitled = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn9 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn8 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn7 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn6 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btn5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 40;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 41;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 42;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _btn1_click() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub btn1_click()";
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _btn2_click() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub btn2_click()";
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public String  _btn3_click() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub btn3_click()";
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _btn4_click() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub btn4_click()";
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _btn5_click() throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub btn5_click()";
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _btn6_click() throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub btn6_click()";
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public String  _btn7_click() throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub btn7_click()";
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _btn8_click() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub btn8_click()";
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _btn9_click() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub btn9_click()";
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPatient.phome _home = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 162;BA.debugLine="Dim home As PHome";
_home = new b4a.OPTUMizerPatient.phome();
 //BA.debugLineNum = 163;BA.debugLine="home=Starter.PHome1";
_home = (b4a.OPTUMizerPatient.phome)(_starter._phome1 /*Object*/ );
 //BA.debugLineNum = 164;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 165;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _btnqr_click() throws Exception{
b4a.OPTUMizerPatient.pqr _qrcode = null;
 //BA.debugLineNum = 167;BA.debugLine="Sub btnQr_click()";
 //BA.debugLineNum = 168;BA.debugLine="Dim qrCode As PQr";
_qrcode = new b4a.OPTUMizerPatient.pqr();
 //BA.debugLineNum = 169;BA.debugLine="qrCode=Starter.PQr1";
_qrcode = (b4a.OPTUMizerPatient.pqr)(_starter._pqr1 /*Object*/ );
 //BA.debugLineNum = 170;BA.debugLine="qrCode.Visible=True";
_qrcode._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 171;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 17;BA.debugLine="Dim btn1 As Panel";
_btn1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim btn2 As Panel";
_btn2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim btn3 As Panel";
_btn3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim btn4 As Panel";
_btn4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lblTitlea As Label";
_lbltitlea = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lblTitleb As Label";
_lbltitleb = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim lblTitlec As Label";
_lbltitlec = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim lblTitled As Label";
_lbltitled = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim btn9 As Panel";
_btn9 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim btn8 As Panel";
_btn8 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim btn7 As Panel";
_btn7 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim btn6 As Panel";
_btn6 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim btn5 As Panel";
_btn5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Dim Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Dim Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Dim Label5 as Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 72;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 73;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 126;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 127;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 128;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 129;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 130;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 131;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"ScheduleSubModule-004a0.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 132;BA.debugLine="mBase.AddView(btnBack,0.05 * mBase.Width,0.01 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.05*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 133;BA.debugLine="mBase.AddView(btnQr,0.81 * mBase.Width,0.01 * mBa";
_mbase.AddView((android.view.View)(_btnqr.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.01*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 134;BA.debugLine="mBase.AddView(btn1,0.81 * mBase.Width,0.58 * mBas";
_mbase.AddView((android.view.View)(_btn1.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.58*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 135;BA.debugLine="mBase.AddView(btn2,0.81 * mBase.Width,0.67 * mBas";
_mbase.AddView((android.view.View)(_btn2.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.67*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 136;BA.debugLine="mBase.AddView(btn3,0.81 * mBase.Width,0.77 * mBas";
_mbase.AddView((android.view.View)(_btn3.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.77*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 137;BA.debugLine="mBase.AddView(btn4,0.81 * mBase.Width,0.86 * mBas";
_mbase.AddView((android.view.View)(_btn4.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.86*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 138;BA.debugLine="mBase.AddView(lblTitlea,0.23 * mBase.Width,0.59 *";
_mbase.AddView((android.view.View)(_lbltitlea.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.59*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 139;BA.debugLine="mBase.AddView(lblTitleb,0.23 * mBase.Width,0.68 *";
_mbase.AddView((android.view.View)(_lbltitleb.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.68*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 140;BA.debugLine="mBase.AddView(lblTitlec,0.23 * mBase.Width,0.78 *";
_mbase.AddView((android.view.View)(_lbltitlec.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.78*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 141;BA.debugLine="mBase.AddView(lblTitled,0.23 * mBase.Width,0.87 *";
_mbase.AddView((android.view.View)(_lbltitled.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.87*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 142;BA.debugLine="mBase.AddView(btn9,0.81 * mBase.Width,0.15 * mBas";
_mbase.AddView((android.view.View)(_btn9.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 143;BA.debugLine="mBase.AddView(btn8,0.81 * mBase.Width,0.23 * mBas";
_mbase.AddView((android.view.View)(_btn8.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.23*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 144;BA.debugLine="mBase.AddView(btn7,0.81 * mBase.Width,0.32 * mBas";
_mbase.AddView((android.view.View)(_btn7.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.32*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 145;BA.debugLine="mBase.AddView(btn6,0.81 * mBase.Width,0.41 * mBas";
_mbase.AddView((android.view.View)(_btn6.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.41*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 146;BA.debugLine="mBase.AddView(btn5,0.81 * mBase.Width,0.50 * mBas";
_mbase.AddView((android.view.View)(_btn5.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.50*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 147;BA.debugLine="mBase.AddView(Label1,0.23 * mBase.Width,0.50 * mB";
_mbase.AddView((android.view.View)(_label1.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.50*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 148;BA.debugLine="mBase.AddView(Label2,0.23 * mBase.Width,0.42 * mB";
_mbase.AddView((android.view.View)(_label2.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.42*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 149;BA.debugLine="mBase.AddView(Label3,0.23 * mBase.Width,0.33 * mB";
_mbase.AddView((android.view.View)(_label3.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.33*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 150;BA.debugLine="mBase.AddView(Label4,0.23 * mBase.Width,0.24 * mB";
_mbase.AddView((android.view.View)(_label4.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.24*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 151;BA.debugLine="mBase.AddView(Label5,0.23 * mBase.Width,0.16 * mB";
_mbase.AddView((android.view.View)(_label5.getObject()),(int) (0.23*_mbase.getWidth()),(int) (0.16*_mbase.getHeight()),(int) (0.57*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 153;BA.debugLine="init_PSchedule";
_init_pschedule();
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _init_pschedule() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub init_PSchedule";
 //BA.debugLineNum = 77;BA.debugLine="btnBack.Color =  0xff00e6ed";
_btnback.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 78;BA.debugLine="btnQr.Color =  0xff00e6ed";
_btnqr.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 79;BA.debugLine="btn1.Color =  0xff00e6ed";
_btn1.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 80;BA.debugLine="btn2.Color =  0xff00e6ed";
_btn2.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 81;BA.debugLine="btn3.Color =  0xff00e6ed";
_btn3.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 82;BA.debugLine="btn4.Color =  0xff00e6ed";
_btn4.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 83;BA.debugLine="btn5.Color =  0xff00e6ed";
_btn5.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 84;BA.debugLine="btn9.Color =  0xff00e6ed";
_btn9.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 85;BA.debugLine="btn8.Color =  0xff00e6ed";
_btn8.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 86;BA.debugLine="btn7.Color =  0xff00e6ed";
_btn7.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 87;BA.debugLine="btn6.Color =  0xff00e6ed";
_btn6.setColor((int) (0xff00e6ed));
 //BA.debugLineNum = 88;BA.debugLine="lblTitlea.Color =  0x00ffffff";
_lbltitlea.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 89;BA.debugLine="lblTitlea.TextColor = 0xff000000";
_lbltitlea.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 90;BA.debugLine="lblTitlea.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitlea.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 91;BA.debugLine="lblTitlea.Text = \"\"";
_lbltitlea.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 92;BA.debugLine="lblTitleb.Color =  0x00ffffff";
_lbltitleb.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 93;BA.debugLine="lblTitleb.TextColor = 0xff000000";
_lbltitleb.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 94;BA.debugLine="lblTitleb.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitleb.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 95;BA.debugLine="lblTitleb.Text = \"\"";
_lbltitleb.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 96;BA.debugLine="lblTitlec.Color =  0x00ffffff";
_lbltitlec.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 97;BA.debugLine="lblTitlec.TextColor = 0xff000000";
_lbltitlec.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 98;BA.debugLine="lblTitlec.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitlec.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 99;BA.debugLine="lblTitlec.Text = \"\"";
_lbltitlec.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 100;BA.debugLine="lblTitled.Color =  0x00ffffff";
_lbltitled.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 101;BA.debugLine="lblTitled.TextColor = 0xff000000";
_lbltitled.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 102;BA.debugLine="lblTitled.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lbltitled.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 103;BA.debugLine="lblTitled.Text = \"\"";
_lbltitled.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 104;BA.debugLine="Label1.Color =  0x00ffffff";
_label1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 105;BA.debugLine="Label1.TextColor = 0xff000000";
_label1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 106;BA.debugLine="Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_label1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 107;BA.debugLine="Label1.Text = \"\"";
_label1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 108;BA.debugLine="Label2.Color =  0x00ffffff";
_label2.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 109;BA.debugLine="Label2.TextColor = 0xff000000";
_label2.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 110;BA.debugLine="Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_label2.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 111;BA.debugLine="Label2.Text = \"\"";
_label2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 112;BA.debugLine="Label3.Color =  0x00ffffff";
_label3.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 113;BA.debugLine="Label3.TextColor = 0xff000000";
_label3.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 114;BA.debugLine="Label3.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_label3.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 115;BA.debugLine="Label3.Text = \"\"";
_label3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 116;BA.debugLine="Label4.Color =  0x00ffffff";
_label4.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 117;BA.debugLine="Label4.TextColor = 0xff000000";
_label4.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 118;BA.debugLine="Label4.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_label4.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 119;BA.debugLine="Label4.Text = \"\"";
_label4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 120;BA.debugLine="Label5.Color =  0x00ffffff";
_label5.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 121;BA.debugLine="Label5.TextColor = 0xff000000";
_label5.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 122;BA.debugLine="Label5.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_label5.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 123;BA.debugLine="Label5.Text = \"\"";
_label5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 45;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 46;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 47;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 48;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 49;BA.debugLine="btnQr.Initialize(\"btnQr\")";
_btnqr.Initialize(ba,"btnQr");
 //BA.debugLineNum = 50;BA.debugLine="btn1.Initialize(\"btn1\")";
_btn1.Initialize(ba,"btn1");
 //BA.debugLineNum = 51;BA.debugLine="btn2.Initialize(\"btn2\")";
_btn2.Initialize(ba,"btn2");
 //BA.debugLineNum = 52;BA.debugLine="btn3.Initialize(\"btn3\")";
_btn3.Initialize(ba,"btn3");
 //BA.debugLineNum = 53;BA.debugLine="btn4.Initialize(\"btn4\")";
_btn4.Initialize(ba,"btn4");
 //BA.debugLineNum = 54;BA.debugLine="lblTitlea.Initialize(\"lblTitlea\")";
_lbltitlea.Initialize(ba,"lblTitlea");
 //BA.debugLineNum = 55;BA.debugLine="lblTitleb.Initialize(\"lblTitleb\")";
_lbltitleb.Initialize(ba,"lblTitleb");
 //BA.debugLineNum = 56;BA.debugLine="lblTitlec.Initialize(\"lblTitlec\")";
_lbltitlec.Initialize(ba,"lblTitlec");
 //BA.debugLineNum = 57;BA.debugLine="lblTitled.Initialize(\"lblTitled\")";
_lbltitled.Initialize(ba,"lblTitled");
 //BA.debugLineNum = 58;BA.debugLine="btn9.Initialize(\"btn9\")";
_btn9.Initialize(ba,"btn9");
 //BA.debugLineNum = 59;BA.debugLine="btn8.Initialize(\"btn8\")";
_btn8.Initialize(ba,"btn8");
 //BA.debugLineNum = 60;BA.debugLine="btn7.Initialize(\"btn7\")";
_btn7.Initialize(ba,"btn7");
 //BA.debugLineNum = 61;BA.debugLine="btn6.Initialize(\"btn6\")";
_btn6.Initialize(ba,"btn6");
 //BA.debugLineNum = 62;BA.debugLine="btn5.Initialize(\"btn5\")";
_btn5.Initialize(ba,"btn5");
 //BA.debugLineNum = 63;BA.debugLine="Label1.Initialize(\"Label1\")";
_label1.Initialize(ba,"Label1");
 //BA.debugLineNum = 64;BA.debugLine="Label2.Initialize(\"Label2\")";
_label2.Initialize(ba,"Label2");
 //BA.debugLineNum = 65;BA.debugLine="Label3.Initialize(\"Label3\")";
_label3.Initialize(ba,"Label3");
 //BA.debugLineNum = 66;BA.debugLine="Label4.Initialize(\"Label4\")";
_label4.Initialize(ba,"Label4");
 //BA.debugLineNum = 67;BA.debugLine="Label5.Initialize(\"Label5\")";
_label5.Initialize(ba,"Label5");
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _label1_click() throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub Label1_click()";
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public String  _label2_click() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub Label2_click()";
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _label3_click() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub Label3_click()";
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _label4_click() throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub Label4_click()";
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public String  _label5_click() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub Label5_click()";
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _lbltitlea_click() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub lblTitlea_click()";
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _lbltitleb_click() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub lblTitleb_click()";
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _lbltitlec_click() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub lblTitlec_click()";
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _lbltitled_click() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub lblTitled_click()";
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
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
