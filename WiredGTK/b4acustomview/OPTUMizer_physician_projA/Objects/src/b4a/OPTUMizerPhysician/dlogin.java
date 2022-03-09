package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dlogin extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dlogin");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dlogin.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.LabelWrapper _txtid = null;
public anywheresoftware.b4a.objects.LabelWrapper _txtpassword = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 23;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 24;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 25;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click() throws Exception{
b4a.OPTUMizerPhysician.dhome _home = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub btnLogIn_click()";
 //BA.debugLineNum = 71;BA.debugLine="Dim home As DHome";
_home = new b4a.OPTUMizerPhysician.dhome();
 //BA.debugLineNum = 72;BA.debugLine="home=Starter.DHome1";
_home = (b4a.OPTUMizerPhysician.dhome)(_starter._dhome1 /*Object*/ );
 //BA.debugLineNum = 73;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 74;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnLogIn As Panel";
_btnlogin = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim txtID As Label";
_txtid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim txtPassword As Label";
_txtpassword = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 38;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 39;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 93;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 83;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 53;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 54;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 55;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 56;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 57;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"LoginModule-bf106.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 58;BA.debugLine="mBase.AddView(btnLogIn,0.12 * mBase.Width,0.80 *";
_mbase.AddView((android.view.View)(_btnlogin.getObject()),(int) (0.12*_mbase.getWidth()),(int) (0.80*_mbase.getHeight()),(int) (0.75*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 59;BA.debugLine="mBase.AddView(txtID,0.12 * mBase.Width,0.62 * mBa";
_mbase.AddView((android.view.View)(_txtid.getObject()),(int) (0.12*_mbase.getWidth()),(int) (0.62*_mbase.getHeight()),(int) (0.75*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 60;BA.debugLine="mBase.AddView(txtPassword,0.12 * mBase.Width,0.71";
_mbase.AddView((android.view.View)(_txtpassword.getObject()),(int) (0.12*_mbase.getWidth()),(int) (0.71*_mbase.getHeight()),(int) (0.75*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 62;BA.debugLine="initLogin";
_initlogin();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 30;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 31;BA.debugLine="btnLogIn.Initialize(\"btnLogIn\")";
_btnlogin.Initialize(ba,"btnLogIn");
 //BA.debugLineNum = 32;BA.debugLine="txtID.Initialize(\"txtID\")";
_txtid.Initialize(ba,"txtID");
 //BA.debugLineNum = 33;BA.debugLine="txtPassword.Initialize(\"txtPassword\")";
_txtpassword.Initialize(ba,"txtPassword");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _initlogin() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub initLogin";
 //BA.debugLineNum = 42;BA.debugLine="btnLogIn.Color =  0x00001f59";
_btnlogin.setColor((int) (0x00001f59));
 //BA.debugLineNum = 43;BA.debugLine="txtID.Color =  0x00ffffff";
_txtid.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 44;BA.debugLine="txtID.TextColor = 0xff000000";
_txtid.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 45;BA.debugLine="txtID.Gravity = Gravity.CENTER_HORIZONTAL+Gravity";
_txtid.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 46;BA.debugLine="txtID.Text = \"\"";
_txtid.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 47;BA.debugLine="txtPassword.Color =  0x00ffffff";
_txtpassword.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 48;BA.debugLine="txtPassword.TextColor = 0xff000000";
_txtpassword.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 49;BA.debugLine="txtPassword.Gravity = Gravity.CENTER_HORIZONTAL+G";
_txtpassword.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 50;BA.debugLine="txtPassword.Text = \"\"";
_txtpassword.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 89;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 86;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _txtid_click() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub txtID_click()";
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _txtpassword_click() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub txtPassword_click()";
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
