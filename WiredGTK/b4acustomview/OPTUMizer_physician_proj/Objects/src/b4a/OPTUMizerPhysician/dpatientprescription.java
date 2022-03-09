package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dpatientprescription extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dpatientprescription");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dpatientprescription.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnprescription = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqrreader = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblid = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 27;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 28;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 29;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientprof _patient = null;
 //BA.debugLineNum = 95;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 96;BA.debugLine="Dim patient As DPatientProf";
_patient = new b4a.OPTUMizerPhysician.dpatientprof();
 //BA.debugLineNum = 97;BA.debugLine="patient=Starter.DPatientProf1";
_patient = (b4a.OPTUMizerPhysician.dpatientprof)(_starter._dpatientprof1 /*Object*/ );
 //BA.debugLineNum = 98;BA.debugLine="patient.Visible=True";
_patient._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 99;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _btnprescription_click() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub btnPrescription_click()";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _btnqrreader_click() throws Exception{
b4a.OPTUMizerPhysician.dqrreader _qrreader = null;
 //BA.debugLineNum = 101;BA.debugLine="Sub btnQrReader_click()";
 //BA.debugLineNum = 102;BA.debugLine="Dim qrReader As DQrReader";
_qrreader = new b4a.OPTUMizerPhysician.dqrreader();
 //BA.debugLineNum = 103;BA.debugLine="qrReader=Starter.DQrReader1";
_qrreader = (b4a.OPTUMizerPhysician.dqrreader)(_starter._dqrreader1 /*Object*/ );
 //BA.debugLineNum = 104;BA.debugLine="qrReader.Visible=True";
_qrreader._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 105;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnPrescription As Panel";
_btnprescription = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnBack As Panel";
_btnback = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnQrReader As Panel";
_btnqrreader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim lblDesc1 As Label";
_lbldesc1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblDesc As Label";
_lbldesc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim lblID As Label";
_lblid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 46;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 47;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 127;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 117;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 72;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 73;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 74;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 75;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 76;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"Prescriptions-b4c1a.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 77;BA.debugLine="mBase.AddView(btnPrescription,0.57 * mBase.Width,";
_mbase.AddView((android.view.View)(_btnprescription.getObject()),(int) (0.57*_mbase.getWidth()),(int) (0.31*_mbase.getHeight()),(int) (0.38*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 78;BA.debugLine="mBase.AddView(btnBack,0.06 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 79;BA.debugLine="mBase.AddView(btnQrReader,0.81 * mBase.Width,0.02";
_mbase.AddView((android.view.View)(_btnqrreader.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 80;BA.debugLine="mBase.AddView(lblDesc1,0.07 * mBase.Width,0.44 *";
_mbase.AddView((android.view.View)(_lbldesc1.getObject()),(int) (0.07*_mbase.getWidth()),(int) (0.44*_mbase.getHeight()),(int) (0.85*_mbase.getWidth()),(int) (0.11*_mbase.getHeight()));
 //BA.debugLineNum = 81;BA.debugLine="mBase.AddView(lblName,0.38 * mBase.Width,0.15 * m";
_mbase.AddView((android.view.View)(_lblname.getObject()),(int) (0.38*_mbase.getWidth()),(int) (0.15*_mbase.getHeight()),(int) (0.56*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 82;BA.debugLine="mBase.AddView(lblDesc,0.06 * mBase.Width,0.40 * m";
_mbase.AddView((android.view.View)(_lbldesc.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.40*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.57*_mbase.getHeight()));
 //BA.debugLineNum = 83;BA.debugLine="mBase.AddView(lblID,0.38 * mBase.Width,0.21 * mBa";
_mbase.AddView((android.view.View)(_lblid.getObject()),(int) (0.38*_mbase.getWidth()),(int) (0.21*_mbase.getHeight()),(int) (0.56*_mbase.getWidth()),(int) (0.04*_mbase.getHeight()));
 //BA.debugLineNum = 85;BA.debugLine="initDpatientPrescription";
_initdpatientprescription();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _initdpatientprescription() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub initDpatientPrescription";
 //BA.debugLineNum = 51;BA.debugLine="btnPrescription.Color =  0x0000979f";
_btnprescription.setColor((int) (0x0000979f));
 //BA.debugLineNum = 52;BA.debugLine="btnBack.Color =  0x00008b67";
_btnback.setColor((int) (0x00008b67));
 //BA.debugLineNum = 53;BA.debugLine="btnQrReader.Color =  0x00008b67";
_btnqrreader.setColor((int) (0x00008b67));
 //BA.debugLineNum = 54;BA.debugLine="lblDesc1.Color =  0x00ffffff";
_lbldesc1.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 55;BA.debugLine="lblDesc1.TextColor = 0xff000000";
_lbldesc1.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 56;BA.debugLine="lblDesc1.Gravity = Gravity.CENTER_HORIZONTAL+Grav";
_lbldesc1.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 57;BA.debugLine="lblDesc1.Text = \"\"";
_lbldesc1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 58;BA.debugLine="lblName.Color =  0x00ffffff";
_lblname.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 59;BA.debugLine="lblName.TextColor = 0xff000000";
_lblname.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 60;BA.debugLine="lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravi";
_lblname.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 61;BA.debugLine="lblName.Text = \"\"";
_lblname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 62;BA.debugLine="lblDesc.Color =  0x00ffffff";
_lbldesc.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 63;BA.debugLine="lblDesc.TextColor = 0xff000000";
_lbldesc.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 64;BA.debugLine="lblDesc.Gravity = Gravity.CENTER_HORIZONTAL+Gravi";
_lbldesc.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 65;BA.debugLine="lblDesc.Text = \"\"";
_lbldesc.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 66;BA.debugLine="lblID.Color =  0x00ffffff";
_lblid.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 67;BA.debugLine="lblID.TextColor = 0xff000000";
_lblid.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 68;BA.debugLine="lblID.Gravity = Gravity.CENTER_HORIZONTAL+Gravity";
_lblid.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 69;BA.debugLine="lblID.Text = \"\"";
_lblid.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 32;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 33;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 34;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 35;BA.debugLine="btnPrescription.Initialize(\"btnPrescription\")";
_btnprescription.Initialize(ba,"btnPrescription");
 //BA.debugLineNum = 36;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 37;BA.debugLine="btnQrReader.Initialize(\"btnQrReader\")";
_btnqrreader.Initialize(ba,"btnQrReader");
 //BA.debugLineNum = 38;BA.debugLine="lblDesc1.Initialize(\"lblDesc1\")";
_lbldesc1.Initialize(ba,"lblDesc1");
 //BA.debugLineNum = 39;BA.debugLine="lblName.Initialize(\"lblName\")";
_lblname.Initialize(ba,"lblName");
 //BA.debugLineNum = 40;BA.debugLine="lblDesc.Initialize(\"lblDesc\")";
_lbldesc.Initialize(ba,"lblDesc");
 //BA.debugLineNum = 41;BA.debugLine="lblID.Initialize(\"lblID\")";
_lblid.Initialize(ba,"lblID");
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _lbldesc_click() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub lblDesc_click()";
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _lbldesc1_click() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub lblDesc1_click()";
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _lblid_click() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub lblID_click()";
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _lblname_click() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub lblName_click()";
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 123;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 120;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
