package b4a.joey;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmpatient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.joey.frmpatient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.joey.frmpatient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnadd = null;
public anywheresoftware.b4a.objects.PanelWrapper _btndelete = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public b4a.joey.main _main = null;
public b4a.joey.starter _starter = null;
public b4a.joey.vb6 _vb6 = null;
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
public String  _btnadd_click() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub btnadd_click()";
 //BA.debugLineNum = 62;BA.debugLine="ToastMessageShow(\"add\",False)'''";
__c.ToastMessageShow(BA.ObjectToCharSequence("add"),__c.False);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _btndelete_click() throws Exception{
b4a.joey.frmcontrols _x = null;
 //BA.debugLineNum = 64;BA.debugLine="Sub btndelete_click()";
 //BA.debugLineNum = 65;BA.debugLine="Dim x As frmcontrols";
_x = new b4a.joey.frmcontrols();
 //BA.debugLineNum = 66;BA.debugLine="x=Starter.frmcontrols1";
_x = (b4a.joey.frmcontrols)(_starter._frmcontrols1 /*Object*/ );
 //BA.debugLineNum = 67;BA.debugLine="x.Visible=True";
_x._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 68;BA.debugLine="x.lblplastic.Text=\"Joey\"";
_x._lblplastic /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Joey"));
 //BA.debugLineNum = 69;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnadd As Panel";
_btnadd = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btndelete As Panel";
_btndelete = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim txtname As EditText";
_txtname = new anywheresoftware.b4a.objects.EditTextWrapper();
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
 //BA.debugLineNum = 84;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 85;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 75;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 42;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 43;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 44;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 45;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 46;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"frmsplash.jpg",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 47;BA.debugLine="mBase.AddView(btnadd,0.43 * mBase.Width,0.77 * mB";
_mbase.AddView((android.view.View)(_btnadd.getObject()),(int) (0.43*_mbase.getWidth()),(int) (0.77*_mbase.getHeight()),(int) (0.16*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 48;BA.debugLine="btnadd.Color =  0x00007600";
_btnadd.setColor((int) (0x00007600));
 //BA.debugLineNum = 49;BA.debugLine="mBase.AddView(btndelete,0.29 * mBase.Width,0.31 *";
_mbase.AddView((android.view.View)(_btndelete.getObject()),(int) (0.29*_mbase.getWidth()),(int) (0.31*_mbase.getHeight()),(int) (0.21*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()));
 //BA.debugLineNum = 50;BA.debugLine="btndelete.Color =  0x20007620";
_btndelete.setColor((int) (0x20007620));
 //BA.debugLineNum = 51;BA.debugLine="mBase.AddView(txtname,0.31 * mBase.Width,0.65 * m";
_mbase.AddView((android.view.View)(_txtname.getObject()),(int) (0.31*_mbase.getWidth()),(int) (0.65*_mbase.getHeight()),(int) (0.42*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 31;BA.debugLine="btnadd.Initialize(\"btnadd\")";
_btnadd.Initialize(ba,"btnadd");
 //BA.debugLineNum = 32;BA.debugLine="btndelete.Initialize(\"btndelete\")";
_btndelete.Initialize(ba,"btndelete");
 //BA.debugLineNum = 33;BA.debugLine="txtname.Initialize(\"txtname\")";
_txtname.Initialize(ba,"txtname");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 81;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 78;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _txtname_click() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub txtname_click()";
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
