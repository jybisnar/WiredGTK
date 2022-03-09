package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dprofile extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dprofile");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dprofile.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnlogout = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqr = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnback = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_id = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcounty = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblzip = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstate = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
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
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPhysician.dhome _home = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 121;BA.debugLine="Dim home As DHome";
_home = new b4a.OPTUMizerPhysician.dhome();
 //BA.debugLineNum = 122;BA.debugLine="home=Starter.DHome1";
_home = (b4a.OPTUMizerPhysician.dhome)(_starter._dhome1 /*Object*/ );
 //BA.debugLineNum = 123;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 124;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _btnlogout_click() throws Exception{
b4a.OPTUMizerPhysician.dlogin _signout = null;
 //BA.debugLineNum = 108;BA.debugLine="Sub btnLogout_click()";
 //BA.debugLineNum = 109;BA.debugLine="Dim signOut As DLogin";
_signout = new b4a.OPTUMizerPhysician.dlogin();
 //BA.debugLineNum = 110;BA.debugLine="signOut=Starter.DLogin1";
_signout = (b4a.OPTUMizerPhysician.dlogin)(_starter._dlogin1 /*Object*/ );
 //BA.debugLineNum = 111;BA.debugLine="signOut.Visible=True";
_signout._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 112;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _btnqr_click() throws Exception{
b4a.OPTUMizerPhysician.dqrreader _qrreader = null;
 //BA.debugLineNum = 114;BA.debugLine="Sub btnQr_click()";
 //BA.debugLineNum = 115;BA.debugLine="Dim qrReader As DQrReader";
_qrreader = new b4a.OPTUMizerPhysician.dqrreader();
 //BA.debugLineNum = 116;BA.debugLine="qrReader=Starter.DQrReader1";
_qrreader = (b4a.OPTUMizerPhysician.dqrreader)(_starter._dqrreader1 /*Object*/ );
 //BA.debugLineNum = 117;BA.debugLine="qrReader.Visible=True";
_qrreader._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 118;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnLogout As Panel";
_btnlogout = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnQr As Panel";
_btnqr = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnBack As Panel";
_btnback = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lbl_ID As Label";
_lbl_id = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblAddress As Label";
_lbladdress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lblCounty As Label";
_lblcounty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim lblZip As Label";
_lblzip = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim lblState As Label";
_lblstate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 155;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 156;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 146;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 85;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 86;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 87;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 88;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 89;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"ProfileSubModule-a80b6.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 90;BA.debugLine="mBase.AddView(btnLogout,0.31 * mBase.Width,0.92 *";
_mbase.AddView((android.view.View)(_btnlogout.getObject()),(int) (0.31*_mbase.getWidth()),(int) (0.92*_mbase.getHeight()),(int) (0.35*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 91;BA.debugLine="mBase.AddView(btnQr,0.83 * mBase.Width,0.02 * mBa";
_mbase.AddView((android.view.View)(_btnqr.getObject()),(int) (0.83*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.12*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 92;BA.debugLine="mBase.AddView(btnBack,0.04 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.04*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.11*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 93;BA.debugLine="mBase.AddView(lblName,0.07 * mBase.Width,0.36 * m";
_mbase.AddView((android.view.View)(_lblname.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.36*_mbase.getHeight()),(int) (0.86*_mbase.getWidth()),(int) (0.08*_mbase.getHeight()));
 //BA.debugLineNum = 94;BA.debugLine="mBase.AddView(lbl_ID,0.06 * mBase.Width,0.56 * mB";
_mbase.AddView((android.view.View)(_lbl_id.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.56*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 95;BA.debugLine="mBase.AddView(lblAddress,0.06 * mBase.Width,0.66";
_mbase.AddView((android.view.View)(_lbladdress.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.66*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 96;BA.debugLine="mBase.AddView(lblCounty,0.06 * mBase.Width,0.74 *";
_mbase.AddView((android.view.View)(_lblcounty.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.74*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 97;BA.debugLine="mBase.AddView(lblZip,0.51 * mBase.Width,0.74 * mB";
_mbase.AddView((android.view.View)(_lblzip.getObject()),(int) (0.51*_mbase.getWidth()),(int) (0.74*_mbase.getHeight()),(int) (0.43*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 98;BA.debugLine="mBase.AddView(lblState,0.06 * mBase.Width,0.82 *";
_mbase.AddView((android.view.View)(_lblstate.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.82*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 100;BA.debugLine="initDProfile";
_initdprofile();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _initdprofile() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub initDProfile";
 //BA.debugLineNum = 55;BA.debugLine="btnLogout.Color =  0x0000bc17";
_btnlogout.setColor((int) (0x0000bc17));
 //BA.debugLineNum = 56;BA.debugLine="btnQr.Color =  0x0000182b";
_btnqr.setColor((int) (0x0000182b));
 //BA.debugLineNum = 57;BA.debugLine="btnBack.Color =  0x000091cc";
_btnback.setColor((int) (0x000091cc));
 //BA.debugLineNum = 58;BA.debugLine="lblName.Color =  0x00ffffff";
_lblname.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 59;BA.debugLine="lblName.TextColor = 0xff000000";
_lblname.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 60;BA.debugLine="lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravi";
_lblname.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 61;BA.debugLine="lblName.Text = \"\"";
_lblname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 62;BA.debugLine="lbl_ID.Color =  0x00ffffff";
_lbl_id.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 63;BA.debugLine="lbl_ID.TextColor = 0xff000000";
_lbl_id.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 64;BA.debugLine="lbl_ID.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_lbl_id.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 65;BA.debugLine="lbl_ID.Text = \"\"";
_lbl_id.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 66;BA.debugLine="lblAddress.Color =  0x00ffffff";
_lbladdress.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 67;BA.debugLine="lblAddress.TextColor = 0xff000000";
_lbladdress.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 68;BA.debugLine="lblAddress.Gravity = Gravity.CENTER_HORIZONTAL+Gr";
_lbladdress.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 69;BA.debugLine="lblAddress.Text = \"\"";
_lbladdress.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 70;BA.debugLine="lblCounty.Color =  0x00ffffff";
_lblcounty.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 71;BA.debugLine="lblCounty.TextColor = 0xff000000";
_lblcounty.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 72;BA.debugLine="lblCounty.Gravity = Gravity.CENTER_HORIZONTAL+Gra";
_lblcounty.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 73;BA.debugLine="lblCounty.Text = \"\"";
_lblcounty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 74;BA.debugLine="lblZip.Color =  0x00ffffff";
_lblzip.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 75;BA.debugLine="lblZip.TextColor = 0xff000000";
_lblzip.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 76;BA.debugLine="lblZip.Gravity = Gravity.CENTER_HORIZONTAL+Gravit";
_lblzip.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 77;BA.debugLine="lblZip.Text = \"\"";
_lblzip.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 78;BA.debugLine="lblState.Color =  0x00ffffff";
_lblstate.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 79;BA.debugLine="lblState.TextColor = 0xff000000";
_lblstate.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 80;BA.debugLine="lblState.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lblstate.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 81;BA.debugLine="lblState.Text = \"\"";
_lblstate.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 37;BA.debugLine="btnLogout.Initialize(\"btnLogout\")";
_btnlogout.Initialize(ba,"btnLogout");
 //BA.debugLineNum = 38;BA.debugLine="btnQr.Initialize(\"btnQr\")";
_btnqr.Initialize(ba,"btnQr");
 //BA.debugLineNum = 39;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 40;BA.debugLine="lblName.Initialize(\"lblName\")";
_lblname.Initialize(ba,"lblName");
 //BA.debugLineNum = 41;BA.debugLine="lbl_ID.Initialize(\"lbl_ID\")";
_lbl_id.Initialize(ba,"lbl_ID");
 //BA.debugLineNum = 42;BA.debugLine="lblAddress.Initialize(\"lblAddress\")";
_lbladdress.Initialize(ba,"lblAddress");
 //BA.debugLineNum = 43;BA.debugLine="lblCounty.Initialize(\"lblCounty\")";
_lblcounty.Initialize(ba,"lblCounty");
 //BA.debugLineNum = 44;BA.debugLine="lblZip.Initialize(\"lblZip\")";
_lblzip.Initialize(ba,"lblZip");
 //BA.debugLineNum = 45;BA.debugLine="lblState.Initialize(\"lblState\")";
_lblstate.Initialize(ba,"lblState");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _lbl_id_click() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub lbl_ID_click()";
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _lbladdress_click() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub lblAddress_click()";
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _lblcounty_click() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub lblCounty_click()";
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _lblname_click() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub lblName_click()";
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _lblstate_click() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub lblState_click()";
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _lblzip_click() throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub lblZip_click()";
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 152;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 149;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
