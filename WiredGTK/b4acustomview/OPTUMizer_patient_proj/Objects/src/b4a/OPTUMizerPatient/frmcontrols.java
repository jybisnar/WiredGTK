package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class frmcontrols extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.frmcontrols");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.frmcontrols.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _layland = null;
public anywheresoftware.b4a.objects.PanelWrapper _laywater = null;
public anywheresoftware.b4a.objects.PanelWrapper _laymanual = null;
public anywheresoftware.b4a.objects.PanelWrapper _layauto = null;
public anywheresoftware.b4a.objects.PanelWrapper _laysweep = null;
public anywheresoftware.b4a.objects.PanelWrapper _layup = null;
public anywheresoftware.b4a.objects.PanelWrapper _layleft = null;
public anywheresoftware.b4a.objects.PanelWrapper _layright = null;
public anywheresoftware.b4a.objects.PanelWrapper _laybt = null;
public anywheresoftware.b4a.objects.PanelWrapper _laydown = null;
public anywheresoftware.b4a.objects.PanelWrapper _layout1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblclass = null;
public anywheresoftware.b4a.objects.PanelWrapper _layout2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblplastic = null;
public anywheresoftware.b4a.objects.PanelWrapper _layout4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnonplastic = null;
public boolean _manual = false;
public boolean _land = false;
public b4a.OPTUMizerPatient.objdetect _detected = null;
public anywheresoftware.b4a.objects.PanelWrapper _laylbin = null;
public anywheresoftware.b4a.objects.PanelWrapper _layrbin = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 39;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 40;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 41;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
 //BA.debugLineNum = 13;BA.debugLine="Dim Image1 As ImageView";
_image1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim layLand As Panel";
_layland = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim laywater As Panel";
_laywater = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim layManual As Panel";
_laymanual = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim layauto As Panel";
_layauto = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim laySweep As Panel";
_laysweep = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim layUp As Panel";
_layup = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim layLeft As Panel";
_layleft = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim layRight As Panel";
_layright = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim layBT As Panel";
_laybt = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim layDown As Panel";
_laydown = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim Layout1 As Panel";
_layout1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim lblclass As Label";
_lblclass = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim Layout2 As Panel";
_layout2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim lblplastic As Label";
_lblplastic = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim Layout4 As Panel";
_layout4 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim lblnonplastic As Label";
_lblnonplastic = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim manual As Boolean=True";
_manual = __c.True;
 //BA.debugLineNum = 31;BA.debugLine="Dim land As Boolean=True";
_land = __c.True;
 //BA.debugLineNum = 32;BA.debugLine="Dim detected As objdetect";
_detected = new b4a.OPTUMizerPatient.objdetect();
 //BA.debugLineNum = 33;BA.debugLine="Dim layLBIN As Panel";
_laylbin = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Dim layRBIN As Panel";
_layrbin = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 68;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 69;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 283;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 273;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 83;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 84;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 85;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 86;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 87;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"frmusercontrol.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 88;BA.debugLine="mBase.AddView(layLand,0.32 * mBase.Width,0.13 * m";
_mbase.AddView((android.view.View)(_layland.getObject()),(int) (0.32*_mbase.getWidth()),(int) (0.13*_mbase.getHeight()),(int) (0.15*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()));
 //BA.debugLineNum = 89;BA.debugLine="layLand.Color =  Colors.argb(1,0,0,255)";
_layland.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 90;BA.debugLine="mBase.AddView(laywater,0.53 * mBase.Width,0.13 *";
_mbase.AddView((android.view.View)(_laywater.getObject()),(int) (0.53*_mbase.getWidth()),(int) (0.13*_mbase.getHeight()),(int) (0.15*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()));
 //BA.debugLineNum = 91;BA.debugLine="laywater.Color =  Colors.argb(1,0,0,255)";
_laywater.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 92;BA.debugLine="mBase.AddView(layManual,0.32 * mBase.Width,0.28 *";
_mbase.AddView((android.view.View)(_laymanual.getObject()),(int) (0.32*_mbase.getWidth()),(int) (0.28*_mbase.getHeight()),(int) (0.15*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()));
 //BA.debugLineNum = 93;BA.debugLine="layManual.Color =  Colors.argb(1,0,0,255)";
_laymanual.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 94;BA.debugLine="mBase.AddView(layauto,0.53 * mBase.Width,0.28 * m";
_mbase.AddView((android.view.View)(_layauto.getObject()),(int) (0.53*_mbase.getWidth()),(int) (0.28*_mbase.getHeight()),(int) (0.15*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()));
 //BA.debugLineNum = 95;BA.debugLine="layauto.Color =  Colors.argb(1,0,0,255)";
_layauto.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 96;BA.debugLine="mBase.AddView(laySweep,0.60 * mBase.Width,0.76 *";
_mbase.AddView((android.view.View)(_laysweep.getObject()),(int) (0.60*_mbase.getWidth()),(int) (0.76*_mbase.getHeight()),(int) (0.15*_mbase.getWidth()),(int) (0.10*_mbase.getHeight()));
 //BA.debugLineNum = 97;BA.debugLine="laySweep.Color =  Colors.argb(1,0,0,255)";
_laysweep.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 98;BA.debugLine="mBase.AddView(layUp,0.27 * mBase.Width,0.72 * mBa";
_mbase.AddView((android.view.View)(_layup.getObject()),(int) (0.27*_mbase.getWidth()),(int) (0.72*_mbase.getHeight()),(int) (0.10*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 99;BA.debugLine="layUp.Color =  Colors.argb(1,0,0,255)";
_layup.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 100;BA.debugLine="mBase.AddView(layLeft,0.16 * mBase.Width,0.79 * m";
_mbase.AddView((android.view.View)(_layleft.getObject()),(int) (0.16*_mbase.getWidth()),(int) (0.79*_mbase.getHeight()),(int) (0.10*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 101;BA.debugLine="layLeft.Color =  Colors.argb(1,0,0,255)";
_layleft.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 102;BA.debugLine="mBase.AddView(layRight,0.38 * mBase.Width,0.79 *";
_mbase.AddView((android.view.View)(_layright.getObject()),(int) (0.38*_mbase.getWidth()),(int) (0.79*_mbase.getHeight()),(int) (0.10*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 103;BA.debugLine="layRight.Color =  Colors.argb(1,0,0,255)";
_layright.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 104;BA.debugLine="mBase.AddView(layBT,0.46 * mBase.Width,0.93 * mBa";
_mbase.AddView((android.view.View)(_laybt.getObject()),(int) (0.46*_mbase.getWidth()),(int) (0.93*_mbase.getHeight()),(int) (0.10*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 105;BA.debugLine="layBT.Color =  Colors.argb(1,0,0,255)";
_laybt.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 106;BA.debugLine="mBase.AddView(layDown,0.27 * mBase.Width,0.85 * m";
_mbase.AddView((android.view.View)(_laydown.getObject()),(int) (0.27*_mbase.getWidth()),(int) (0.85*_mbase.getHeight()),(int) (0.10*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 107;BA.debugLine="layDown.Color =  Colors.argb(1,0,0,255)";
_laydown.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 108;BA.debugLine="mBase.AddView(Layout1,0.26 * mBase.Width,0.46 * m";
_mbase.AddView((android.view.View)(_layout1.getObject()),(int) (0.26*_mbase.getWidth()),(int) (0.46*_mbase.getHeight()),(int) (0.52*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 109;BA.debugLine="Layout1.Color =  Colors.argb(1,0,0,255)";
_layout1.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 110;BA.debugLine="lblclass.Color =  0x00ffffff";
_lblclass.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 111;BA.debugLine="lblclass.TextColor = 0xff000000";
_lblclass.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 112;BA.debugLine="lblclass.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lblclass.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 113;BA.debugLine="lblclass.Text = \"Class Label\"";
_lblclass.setText(BA.ObjectToCharSequence("Class Label"));
 //BA.debugLineNum = 114;BA.debugLine="Layout1.AddView(lblclass,0.00 * Layout1.Width,0.0";
_layout1.AddView((android.view.View)(_lblclass.getObject()),(int) (0.00*_layout1.getWidth()),(int) (0.00*_layout1.getHeight()),(int) (1.00*_layout1.getWidth()),(int) (0.75*_layout1.getHeight()));
 //BA.debugLineNum = 115;BA.debugLine="mBase.AddView(Layout2,0.47 * mBase.Width,0.57 * m";
_mbase.AddView((android.view.View)(_layout2.getObject()),(int) (0.47*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()),(int) (0.36*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 116;BA.debugLine="Layout2.Color =  Colors.argb(1,0,0,255)";
_layout2.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 117;BA.debugLine="lblplastic.Color =  0x00ffffff";
_lblplastic.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 118;BA.debugLine="lblplastic.TextColor = 0xff000000";
_lblplastic.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 119;BA.debugLine="lblplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gr";
_lblplastic.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 120;BA.debugLine="lblplastic.Text = \"0\"";
_lblplastic.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 121;BA.debugLine="Layout2.AddView(lblplastic,0.00 * Layout2.Width,0";
_layout2.AddView((android.view.View)(_lblplastic.getObject()),(int) (0.00*_layout2.getWidth()),(int) (0.00*_layout2.getHeight()),(int) (1.00*_layout2.getWidth()),(int) (0.75*_layout2.getHeight()));
 //BA.debugLineNum = 122;BA.debugLine="mBase.AddView(Layout4,0.53 * mBase.Width,0.60 * m";
_mbase.AddView((android.view.View)(_layout4.getObject()),(int) (0.53*_mbase.getWidth()),(int) (0.60*_mbase.getHeight()),(int) (0.35*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 123;BA.debugLine="Layout4.Color =  Colors.argb(1,0,0,255)";
_layout4.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 124;BA.debugLine="lblnonplastic.Color =  0x00ffffff";
_lblnonplastic.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 125;BA.debugLine="lblnonplastic.TextColor = 0xff000000";
_lblnonplastic.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 126;BA.debugLine="lblnonplastic.Gravity = Gravity.CENTER_HORIZONTAL";
_lblnonplastic.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 127;BA.debugLine="lblnonplastic.Text = \"0\"";
_lblnonplastic.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 128;BA.debugLine="Layout4.AddView(lblnonplastic,0.00 * Layout4.Widt";
_layout4.AddView((android.view.View)(_lblnonplastic.getObject()),(int) (0.00*_layout4.getWidth()),(int) (0.00*_layout4.getHeight()),(int) (1.04*_layout4.getWidth()),(int) (0.75*_layout4.getHeight()));
 //BA.debugLineNum = 129;BA.debugLine="mBase.AddView(layLBIN,0.63 * mBase.Width,0.88 * m";
_mbase.AddView((android.view.View)(_laylbin.getObject()),(int) (0.63*_mbase.getWidth()),(int) (0.88*_mbase.getHeight()),(int) (0.10*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 130;BA.debugLine="layLBIN.Color =  Colors.argb(10,0,0,255)";
_laylbin.setColor(__c.Colors.ARGB((int) (10),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 131;BA.debugLine="mBase.AddView(layRBIN,0.77 * mBase.Width,0.88 * m";
_mbase.AddView((android.view.View)(_layrbin.getObject()),(int) (0.77*_mbase.getWidth()),(int) (0.88*_mbase.getHeight()),(int) (0.10*_mbase.getWidth()),(int) (0.07*_mbase.getHeight()));
 //BA.debugLineNum = 132;BA.debugLine="layRBIN.Color =  Colors.argb(10,0,0,255)";
_layrbin.setColor(__c.Colors.ARGB((int) (10),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 134;BA.debugLine="myinit";
_myinit();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 44;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 45;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 46;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 47;BA.debugLine="layLand.Initialize(\"layLand\")";
_layland.Initialize(ba,"layLand");
 //BA.debugLineNum = 48;BA.debugLine="laywater.Initialize(\"laywater\")";
_laywater.Initialize(ba,"laywater");
 //BA.debugLineNum = 49;BA.debugLine="layManual.Initialize(\"layManual\")";
_laymanual.Initialize(ba,"layManual");
 //BA.debugLineNum = 50;BA.debugLine="layauto.Initialize(\"layauto\")";
_layauto.Initialize(ba,"layauto");
 //BA.debugLineNum = 51;BA.debugLine="laySweep.Initialize(\"laySweep\")";
_laysweep.Initialize(ba,"laySweep");
 //BA.debugLineNum = 52;BA.debugLine="layUp.Initialize(\"layUp\")";
_layup.Initialize(ba,"layUp");
 //BA.debugLineNum = 53;BA.debugLine="layLeft.Initialize(\"layLeft\")";
_layleft.Initialize(ba,"layLeft");
 //BA.debugLineNum = 54;BA.debugLine="layRight.Initialize(\"layRight\")";
_layright.Initialize(ba,"layRight");
 //BA.debugLineNum = 55;BA.debugLine="layBT.Initialize(\"layBT\")";
_laybt.Initialize(ba,"layBT");
 //BA.debugLineNum = 56;BA.debugLine="layDown.Initialize(\"layDown\")";
_laydown.Initialize(ba,"layDown");
 //BA.debugLineNum = 57;BA.debugLine="Layout1.Initialize(\"Layout1\")";
_layout1.Initialize(ba,"Layout1");
 //BA.debugLineNum = 58;BA.debugLine="lblclass.Initialize(\"lblclass\")";
_lblclass.Initialize(ba,"lblclass");
 //BA.debugLineNum = 59;BA.debugLine="Layout2.Initialize(\"Layout2\")";
_layout2.Initialize(ba,"Layout2");
 //BA.debugLineNum = 60;BA.debugLine="lblplastic.Initialize(\"lblplastic\")";
_lblplastic.Initialize(ba,"lblplastic");
 //BA.debugLineNum = 61;BA.debugLine="Layout4.Initialize(\"Layout4\")";
_layout4.Initialize(ba,"Layout4");
 //BA.debugLineNum = 62;BA.debugLine="lblnonplastic.Initialize(\"lblnonplastic\")";
_lblnonplastic.Initialize(ba,"lblnonplastic");
 //BA.debugLineNum = 63;BA.debugLine="layLBIN.Initialize(\"layLBIN\")";
_laylbin.Initialize(ba,"layLBIN");
 //BA.debugLineNum = 64;BA.debugLine="layRBIN.Initialize(\"layRBIN\")";
_layrbin.Initialize(ba,"layRBIN");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _layauto_click() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub layauto_click()";
 //BA.debugLineNum = 162;BA.debugLine="manual=False";
_manual = __c.False;
 //BA.debugLineNum = 163;BA.debugLine="ToastMessageShow(\"Automatic Mode\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Automatic Mode"),__c.False);
 //BA.debugLineNum = 164;BA.debugLine="layauto.Color =  Colors.argb(50,0,0,255)";
_layauto.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 165;BA.debugLine="layManual.Color =  Colors.argb(1,0,0,255)";
_laymanual.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 166;BA.debugLine="Starter.Println(\"AUTOMATIC\")";
_starter._println /*String*/ ("AUTOMATIC");
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _laybt_click() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub layBT_click()";
 //BA.debugLineNum = 176;BA.debugLine="If Starter.connected_BT=False Then";
if (_starter._connected_bt /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 177;BA.debugLine="Starter.mnuConnect_Click";
_starter._mnuconnect_click /*String*/ ();
 }else {
 //BA.debugLineNum = 179;BA.debugLine="Starter.mnuDisconnect_Click";
_starter._mnudisconnect_click /*String*/ ();
 };
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _laydown_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub layDown_Touch (Action As Int, X As Float, Y As";
 //BA.debugLineNum = 215;BA.debugLine="If  manual=False Then";
if (_manual==__c.False) { 
 //BA.debugLineNum = 216;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 218;BA.debugLine="If Action=0 Then";
if (_action==0) { 
 //BA.debugLineNum = 219;BA.debugLine="Starter.Println(\"BACKWARD\")";
_starter._println /*String*/ ("BACKWARD");
 //BA.debugLineNum = 220;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 221;BA.debugLine="Starter.Println(\"BACKWARX\")";
_starter._println /*String*/ ("BACKWARX");
 };
 };
 //BA.debugLineNum = 224;BA.debugLine="If Action=1 Then";
if (_action==1) { 
 //BA.debugLineNum = 225;BA.debugLine="Starter.Println(\"STOP\")";
_starter._println /*String*/ ("STOP");
 //BA.debugLineNum = 226;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 227;BA.debugLine="Starter.Println(\"STOX\")";
_starter._println /*String*/ ("STOX");
 };
 };
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public String  _layland_click() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub layLand_click()";
 //BA.debugLineNum = 143;BA.debugLine="layLand.Color =  Colors.argb(50,0,0,255)";
_layland.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 144;BA.debugLine="laywater.Color =  Colors.argb(1,0,0,255)";
_laywater.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 145;BA.debugLine="land=True";
_land = __c.True;
 //BA.debugLineNum = 146;BA.debugLine="Starter.Println(\"LAND\")";
_starter._println /*String*/ ("LAND");
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _laylbin_click() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub layLBIN_click()";
 //BA.debugLineNum = 183;BA.debugLine="If  manual=False Then";
if (_manual==__c.False) { 
 //BA.debugLineNum = 184;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 186;BA.debugLine="Starter.Println(\"LBIN\")";
_starter._println /*String*/ ("LBIN");
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _layleft_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub layLeft_Touch (Action As Int, X As Float, Y As";
 //BA.debugLineNum = 234;BA.debugLine="If  manual=False Then";
if (_manual==__c.False) { 
 //BA.debugLineNum = 235;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 237;BA.debugLine="If Action=0 Then";
if (_action==0) { 
 //BA.debugLineNum = 238;BA.debugLine="Starter.Println(\"LEFT\")";
_starter._println /*String*/ ("LEFT");
 //BA.debugLineNum = 239;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 240;BA.debugLine="Starter.Println(\"LEFX\")";
_starter._println /*String*/ ("LEFX");
 };
 };
 //BA.debugLineNum = 244;BA.debugLine="If Action=1 Then";
if (_action==1) { 
 //BA.debugLineNum = 245;BA.debugLine="Starter.Println(\"STOP\")";
_starter._println /*String*/ ("STOP");
 //BA.debugLineNum = 246;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 247;BA.debugLine="Starter.Println(\"STOX\")";
_starter._println /*String*/ ("STOX");
 };
 };
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _laymanual_click() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub layManual_click()";
 //BA.debugLineNum = 155;BA.debugLine="manual=True";
_manual = __c.True;
 //BA.debugLineNum = 156;BA.debugLine="ToastMessageShow(\"Manual Mode\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Manual Mode"),__c.False);
 //BA.debugLineNum = 157;BA.debugLine="layManual.Color =  Colors.argb(50,0,0,255)";
_laymanual.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 158;BA.debugLine="layauto.Color =  Colors.argb(1,0,0,255)";
_layauto.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 159;BA.debugLine="Starter.Println(\"MANUAL\")";
_starter._println /*String*/ ("MANUAL");
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _layrbin_click() throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Sub layRBIN_click()";
 //BA.debugLineNum = 189;BA.debugLine="If  manual=False Then";
if (_manual==__c.False) { 
 //BA.debugLineNum = 190;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 192;BA.debugLine="Starter.Println(\"RBIN\")";
_starter._println /*String*/ ("RBIN");
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _layright_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub layRight_Touch (Action As Int, X As Float, Y A";
 //BA.debugLineNum = 253;BA.debugLine="If  manual=False Then";
if (_manual==__c.False) { 
 //BA.debugLineNum = 254;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 256;BA.debugLine="If Action=0 Then";
if (_action==0) { 
 //BA.debugLineNum = 257;BA.debugLine="Starter.Println(\"RIGHT\")";
_starter._println /*String*/ ("RIGHT");
 //BA.debugLineNum = 258;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 259;BA.debugLine="Starter.Println(\"RIGHX\")";
_starter._println /*String*/ ("RIGHX");
 };
 };
 //BA.debugLineNum = 263;BA.debugLine="If Action=1 Then";
if (_action==1) { 
 //BA.debugLineNum = 264;BA.debugLine="Starter.Println(\"STOP\")";
_starter._println /*String*/ ("STOP");
 //BA.debugLineNum = 265;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 266;BA.debugLine="Starter.Println(\"STOX\")";
_starter._println /*String*/ ("STOX");
 };
 };
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _laysweep_click() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub laySweep_click()";
 //BA.debugLineNum = 170;BA.debugLine="If manual=True Then";
if (_manual==__c.True) { 
 //BA.debugLineNum = 171;BA.debugLine="Starter.Println(\"HAKOT\")";
_starter._println /*String*/ ("HAKOT");
 };
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _layup_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub layUp_Touch (Action As Int, X As Float, Y As F";
 //BA.debugLineNum = 195;BA.debugLine="If  manual=False Then";
if (_manual==__c.False) { 
 //BA.debugLineNum = 196;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 198;BA.debugLine="If Action=0 Then";
if (_action==0) { 
 //BA.debugLineNum = 199;BA.debugLine="Starter.Println(\"FORWARD\")";
_starter._println /*String*/ ("FORWARD");
 //BA.debugLineNum = 200;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 201;BA.debugLine="Starter.Println(\"FORWARX\")";
_starter._println /*String*/ ("FORWARX");
 };
 //BA.debugLineNum = 203;BA.debugLine="ToastMessageShow(\"1down\" & X,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("1down"+BA.NumberToString(_x)),__c.False);
 };
 //BA.debugLineNum = 205;BA.debugLine="If Action=1 Then";
if (_action==1) { 
 //BA.debugLineNum = 206;BA.debugLine="Starter.Println(\"STOP\")";
_starter._println /*String*/ ("STOP");
 //BA.debugLineNum = 207;BA.debugLine="If land=False Then";
if (_land==__c.False) { 
 //BA.debugLineNum = 208;BA.debugLine="Starter.Println(\"STOX\")";
_starter._println /*String*/ ("STOX");
 };
 };
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _laywater_click() throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub laywater_click()";
 //BA.debugLineNum = 149;BA.debugLine="layLand.Color =  Colors.argb(1,0,0,255)";
_layland.setColor(__c.Colors.ARGB((int) (1),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 150;BA.debugLine="laywater.Color =  Colors.argb(50,0,0,255)";
_laywater.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 151;BA.debugLine="land=False";
_land = __c.False;
 //BA.debugLineNum = 152;BA.debugLine="Starter.Println(\"WATER\")";
_starter._println /*String*/ ("WATER");
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _myinit() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub myinit";
 //BA.debugLineNum = 72;BA.debugLine="lblclass.Text=\"Bottle 91%\"";
_lblclass.setText(BA.ObjectToCharSequence("Bottle 91%"));
 //BA.debugLineNum = 73;BA.debugLine="lblplastic.Text = \"0\"";
_lblplastic.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 74;BA.debugLine="lblnonplastic.Text = \"0\"";
_lblnonplastic.setText(BA.ObjectToCharSequence("0"));
 //BA.debugLineNum = 75;BA.debugLine="lblplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gr";
_lblplastic.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.LEFT));
 //BA.debugLineNum = 76;BA.debugLine="lblnonplastic.Gravity = Gravity.CENTER_HORIZONTAL";
_lblnonplastic.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.LEFT));
 //BA.debugLineNum = 77;BA.debugLine="layLand.Color =  Colors.argb(20,0,0,255)";
_layland.setColor(__c.Colors.ARGB((int) (20),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 78;BA.debugLine="layManual.Color =  Colors.argb(20,0,0,255)";
_laymanual.setColor(__c.Colors.ARGB((int) (20),(int) (0),(int) (0),(int) (255)));
 //BA.debugLineNum = 79;BA.debugLine="detected.Initialize(lblplastic,lblnonplastic,lblc";
_detected._initialize /*String*/ (ba,_lblplastic,_lblnonplastic,_lblclass);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 279;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 276;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
