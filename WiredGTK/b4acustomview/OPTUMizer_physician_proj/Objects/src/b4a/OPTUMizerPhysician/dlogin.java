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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
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
public void  _btnlogin_click() throws Exception{
ResumableSub_btnLogIn_click rsub = new ResumableSub_btnLogIn_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnLogIn_click extends BA.ResumableSub {
public ResumableSub_btnLogIn_click(b4a.OPTUMizerPhysician.dlogin parent) {
this.parent = parent;
}
b4a.OPTUMizerPhysician.dlogin parent;
b4a.OPTUMizerPhysician.dhome _home = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.List _quotes = null;
anywheresoftware.b4a.objects.collections.Map _quot = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 71;BA.debugLine="Dim home As DHome";
_home = new b4a.OPTUMizerPhysician.dhome();
 //BA.debugLineNum = 72;BA.debugLine="home=Starter.DHome1";
_home = (b4a.OPTUMizerPhysician.dhome)(parent._starter._dhome1 /*Object*/ );
 //BA.debugLineNum = 73;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 74;BA.debugLine="setVisible(False)";
parent._setvisible(parent.__c.False);
 //BA.debugLineNum = 75;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 76;BA.debugLine="txtID.Text=\"Terrell212\"";
parent._txtid.setText(BA.ObjectToCharSequence("Terrell212"));
 //BA.debugLineNum = 77;BA.debugLine="txtPassword.Text=\"Fadel536\"";
parent._txtpassword.setText(BA.ObjectToCharSequence("Fadel536"));
 //BA.debugLineNum = 78;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no l";
_j._initialize(ba,"",parent);
 //BA.debugLineNum = 79;BA.debugLine="j.PostString(\"http://\"& Starter.serverURL &\"/dlog";
_j._poststring("http://"+parent._starter._serverurl /*String*/ +"/dlogin?username="+parent._txtid.getText()+"&password="+parent._txtpassword.getText(),"");
 //BA.debugLineNum = 81;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
 //BA.debugLineNum = 82;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_j._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 84;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 85;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring());
 //BA.debugLineNum = 86;BA.debugLine="Dim quotes As List = jp.NextArray";
_quotes = new anywheresoftware.b4a.objects.collections.List();
_quotes = _jp.NextArray();
 //BA.debugLineNum = 87;BA.debugLine="For Each quot As Map In quotes";
if (true) break;

case 4:
//for
this.state = 13;
_quot = new anywheresoftware.b4a.objects.collections.Map();
group15 = _quotes;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 13;
if (index15 < groupLen15) {
this.state = 6;
_quot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group15.Get(index15)));}
if (true) break;

case 17:
//C
this.state = 16;
index15++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 88;BA.debugLine="If quot.Get(\"id\")<> \"\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((_quot.Get((Object)("id"))).equals((Object)("")) == false) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 89;BA.debugLine="Starter.user.Id=quot.Get(\"id\") 'From patients.";
parent._starter._user /*b4a.OPTUMizerPhysician.starter._mytype*/ .Id /*String*/  = BA.ObjectToString(_quot.Get((Object)("id")));
 //BA.debugLineNum = 90;BA.debugLine="Starter.user.Name=txtID.Text & \" \" & txtPasswo";
parent._starter._user /*b4a.OPTUMizerPhysician.starter._mytype*/ .Name /*String*/  = parent._txtid.getText()+" "+parent._txtpassword.getText();
 //BA.debugLineNum = 97;BA.debugLine="Log(\"Title: \" & quot.GetValueAt(0))";
parent.__c.LogImpl("84259867","Title: "+BA.ObjectToString(_quot.GetValueAt((int) (0))),0);
 //BA.debugLineNum = 98;BA.debugLine="home.lblName.Text=\"User:\"& txtID.Text & \" \" &";
_home._lblname /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("User:"+parent._txtid.getText()+" "+parent._txtpassword.getText()));
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 100;BA.debugLine="ToastMessageShow(\"User Doesnt exist\",False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("User Doesnt exist"),parent.__c.False);
 if (true) break;

case 12:
//C
this.state = 17;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 104;BA.debugLine="j.Release";
_j._release();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _j) throws Exception{
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
 //BA.debugLineNum = 122;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 123;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 113;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 118;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 119;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 116;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _txtid_click() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub txtID_click()";
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _txtpassword_click() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub txtPassword_click()";
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
