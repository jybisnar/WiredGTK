package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmstay extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.frmstay");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.frmstay.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ScrollViewWrapper _layout1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _layout2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public int _num = 0;
public anywheresoftware.b4a.objects.collections.List _panellst = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public String  _add_data(String _t1,String _t2) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="public Sub add_data(t1 As String,t2 As String)";
 //BA.debugLineNum = 61;BA.debugLine="Dim Layout2 As Panel	'declare here";
_layout2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Dim Button1 As Button	'declare here";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Dim Button2 As Button	'declare here";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Layout2.Initialize(\"Layout2\")	'init here";
_layout2.Initialize(ba,"Layout2");
 //BA.debugLineNum = 65;BA.debugLine="Button1.Initialize(\"Button1\")	'init here";
_button1.Initialize(ba,"Button1");
 //BA.debugLineNum = 66;BA.debugLine="Button2.Initialize(\"Button2\")	'init here";
_button2.Initialize(ba,"Button2");
 //BA.debugLineNum = 67;BA.debugLine="Layout2.Width=1 * Layout1.Width'from line 69";
_layout2.setWidth((int) (1*_layout1.getWidth()));
 //BA.debugLineNum = 68;BA.debugLine="Layout2.Height=0.22 * Layout1.Height'from line 69";
_layout2.setHeight((int) (0.22*_layout1.getHeight()));
 //BA.debugLineNum = 71;BA.debugLine="Layout1.Panel.AddView(Layout2,0.00 * Layout1.Widt";
_layout1.getPanel().AddView((android.view.View)(_layout2.getObject()),(int) (0.00*_layout1.getWidth()),(int) (_layout2.getHeight()*_num),(int) (1.00*_layout1.getWidth()),(int) (0.22*_layout1.getHeight()));
 //BA.debugLineNum = 72;BA.debugLine="Layout2.Color =  0xff00f337";
_layout2.setColor((int) (0xff00f337));
 //BA.debugLineNum = 73;BA.debugLine="Layout2.AddView(Button1,0.00 * Layout2.Width,0.50";
_layout2.AddView((android.view.View)(_button1.getObject()),(int) (0.00*_layout2.getWidth()),(int) (0.50*_layout2.getHeight()),(int) (0.24*_layout2.getWidth()),(int) (0.50*_layout2.getHeight()));
 //BA.debugLineNum = 74;BA.debugLine="Layout2.AddView(Button2,0.76 * Layout2.Width,0.00";
_layout2.AddView((android.view.View)(_button2.getObject()),(int) (0.76*_layout2.getWidth()),(int) (0.00*_layout2.getHeight()),(int) (0.24*_layout2.getWidth()),(int) (0.50*_layout2.getHeight()));
 //BA.debugLineNum = 77;BA.debugLine="Button1.Text=t1		'update content";
_button1.setText(BA.ObjectToCharSequence(_t1));
 //BA.debugLineNum = 78;BA.debugLine="Button2.Text=t2		'update content";
_button2.setText(BA.ObjectToCharSequence(_t2));
 //BA.debugLineNum = 81;BA.debugLine="Layout2.Color=Colors.Transparent";
_layout2.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 82;BA.debugLine="Layout2.Height=Layout2.Height";
_layout2.setHeight(_layout2.getHeight());
 //BA.debugLineNum = 83;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 //BA.debugLineNum = 84;BA.debugLine="Layout1.Panel.Height=Layout2.Height*1.02*num+Layo";
_layout1.getPanel().setHeight((int) (_layout2.getHeight()*1.02*_num+_layout2.getHeight()*0.2));
 //BA.debugLineNum = 85;BA.debugLine="Layout2.Tag=num";
_layout2.setTag((Object)(_num));
 //BA.debugLineNum = 86;BA.debugLine="panellst.Add(Layout2)";
_panellst.Add((Object)(_layout2.getObject()));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 24;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 25;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 26;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _x = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub Button1_click()";
 //BA.debugLineNum = 101;BA.debugLine="Dim x As Button=Sender";
_x = new anywheresoftware.b4a.objects.ButtonWrapper();
_x.setObject((android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 102;BA.debugLine="Dim p As Panel=x.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p.setObject((android.view.ViewGroup)(_x.getParent()));
 //BA.debugLineNum = 103;BA.debugLine="ToastMessageShow(p.Tag,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_p.getTag()),__c.False);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub Button2_click()";
 //BA.debugLineNum = 97;BA.debugLine="add_data(\"222\",\"111\")";
_add_data("222","111");
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 14;BA.debugLine="Dim Layout1 As ScrollView";
_layout1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim Layout2 As Panel";
_layout2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim num As Int=0";
_num = (int) (0);
 //BA.debugLineNum = 19;BA.debugLine="Dim panellst As List";
_panellst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 39;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 40;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 41;BA.debugLine="Layout1.Height=100%y";
_layout1.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 42;BA.debugLine="add_data(\"xxx\",\"yyy\")";
_add_data("xxx","yyy");
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 117;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 107;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 45;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 46;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 47;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 48;BA.debugLine="mBase.AddView(Layout1,0.00 * mBase.Width,0.00 * m";
_mbase.AddView((android.view.View)(_layout1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 49;BA.debugLine="Layout1.Color =  Colors.Transparent'0xff00579d";
_layout1.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 31;BA.debugLine="Layout1.Initialize(100.00%y)'add Layout1.Height=x";
_layout1.Initialize(ba,__c.PerYToCurrent((float) (100.00),ba));
 //BA.debugLineNum = 32;BA.debugLine="Layout2.Initialize(\"Layout2\")";
_layout2.Initialize(ba,"Layout2");
 //BA.debugLineNum = 33;BA.debugLine="Button1.Initialize(\"Button1\")";
_button1.Initialize(ba,"Button1");
 //BA.debugLineNum = 34;BA.debugLine="Button2.Initialize(\"Button2\")";
_button2.Initialize(ba,"Button2");
 //BA.debugLineNum = 35;BA.debugLine="panellst.Initialize";
_panellst.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _layout1_click() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Layout1_click()";
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _layout2_click() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub Layout2_click()";
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 113;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 110;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
