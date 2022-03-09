package b4a.OPTUMizerPhysician;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dpatientmedhistory extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPhysician.dpatientmedhistory");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPhysician.dpatientmedhistory.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _image1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnsetappointment = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnback = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnqrreader = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblid = null;
public b4a.OPTUMizerPhysician.main _main = null;
public b4a.OPTUMizerPhysician.starter _starter = null;
public b4a.OPTUMizerPhysician.vb6 _vb6 = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 26;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 27;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 28;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click() throws Exception{
b4a.OPTUMizerPhysician.dpatientprof _patient = null;
 //BA.debugLineNum = 89;BA.debugLine="Sub btnBack_click()";
 //BA.debugLineNum = 90;BA.debugLine="Dim patient As DPatientProf";
_patient = new b4a.OPTUMizerPhysician.dpatientprof();
 //BA.debugLineNum = 91;BA.debugLine="patient=Starter.DPatientProf1";
_patient = (b4a.OPTUMizerPhysician.dpatientprof)(_starter._dpatientprof1 /*Object*/ );
 //BA.debugLineNum = 92;BA.debugLine="patient.Visible=True";
_patient._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 93;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _btnqrreader_click() throws Exception{
b4a.OPTUMizerPhysician.dqrreader _qrreader = null;
 //BA.debugLineNum = 95;BA.debugLine="Sub btnQrReader_click()";
 //BA.debugLineNum = 96;BA.debugLine="Dim qrReader As DQrReader";
_qrreader = new b4a.OPTUMizerPhysician.dqrreader();
 //BA.debugLineNum = 97;BA.debugLine="qrReader=Starter.DQrReader1";
_qrreader = (b4a.OPTUMizerPhysician.dqrreader)(_starter._dqrreader1 /*Object*/ );
 //BA.debugLineNum = 98;BA.debugLine="qrReader.Visible=True";
_qrreader._setvisible /*boolean*/ (__c.True);
 //BA.debugLineNum = 99;BA.debugLine="setVisible(False)";
_setvisible(__c.False);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _btnsetappointment_click() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub btnSetAppointment_click()";
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim btnSetAppointment As Panel";
_btnsetappointment = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim btnBack As Panel";
_btnback = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim btnQrReader As Panel";
_btnqrreader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim lblDesc As Label";
_lbldesc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim lblID As Label";
_lblid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 44;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 45;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 119;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 109;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 66;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 67;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 68;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 69;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.00*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 70;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"MedicalHistory-4cd35.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 71;BA.debugLine="mBase.AddView(btnSetAppointment,0.49 * mBase.Widt";
_mbase.AddView((android.view.View)(_btnsetappointment.getObject()),(int) (0.49*_mbase.getWidth()),(int) (0.34*_mbase.getHeight()),(int) (0.46*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 72;BA.debugLine="mBase.AddView(btnBack,0.06 * mBase.Width,0.02 * m";
_mbase.AddView((android.view.View)(_btnback.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 73;BA.debugLine="mBase.AddView(btnQrReader,0.81 * mBase.Width,0.02";
_mbase.AddView((android.view.View)(_btnqrreader.getObject()),(int) (0.81*_mbase.getWidth()),(int) (0.02*_mbase.getHeight()),(int) (0.14*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 74;BA.debugLine="mBase.AddView(lblName,0.40 * mBase.Width,0.12 * m";
_mbase.AddView((android.view.View)(_lblname.getObject()),(int) (0.40*_mbase.getWidth()),(int) (0.12*_mbase.getHeight()),(int) (0.56*_mbase.getWidth()),(int) (0.06*_mbase.getHeight()));
 //BA.debugLineNum = 75;BA.debugLine="mBase.AddView(lblDesc,0.06 * mBase.Width,0.41 * m";
_mbase.AddView((android.view.View)(_lbldesc.getObject()),(int) (0.06*_mbase.getWidth()),(int) (0.41*_mbase.getHeight()),(int) (0.88*_mbase.getWidth()),(int) (0.55*_mbase.getHeight()));
 //BA.debugLineNum = 76;BA.debugLine="mBase.AddView(lblID,0.40 * mBase.Width,0.20 * mBa";
_mbase.AddView((android.view.View)(_lblid.getObject()),(int) (0.40*_mbase.getWidth()),(int) (0.20*_mbase.getHeight()),(int) (0.56*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 78;BA.debugLine="initDpatientHistory";
_initdpatienthistory();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _initdpatienthistory() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub initDpatientHistory";
 //BA.debugLineNum = 49;BA.debugLine="btnSetAppointment.Color =  0x0000979f";
_btnsetappointment.setColor((int) (0x0000979f));
 //BA.debugLineNum = 50;BA.debugLine="btnBack.Color =  0x00008b67";
_btnback.setColor((int) (0x00008b67));
 //BA.debugLineNum = 51;BA.debugLine="btnQrReader.Color =  0x00008b67";
_btnqrreader.setColor((int) (0x00008b67));
 //BA.debugLineNum = 52;BA.debugLine="lblName.Color =  0x00ffffff";
_lblname.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 53;BA.debugLine="lblName.TextColor = 0xff000000";
_lblname.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 54;BA.debugLine="lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravi";
_lblname.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 55;BA.debugLine="lblName.Text = \"\"";
_lblname.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 56;BA.debugLine="lblDesc.Color =  0x00ffffff";
_lbldesc.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 57;BA.debugLine="lblDesc.TextColor = 0xff000000";
_lbldesc.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 58;BA.debugLine="lblDesc.Gravity = Gravity.CENTER_HORIZONTAL+Gravi";
_lbldesc.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 59;BA.debugLine="lblDesc.Text = \"\"";
_lbldesc.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 60;BA.debugLine="lblID.Color =  0x00ffffff";
_lblid.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 61;BA.debugLine="lblID.TextColor = 0xff000000";
_lblid.setTextColor((int) (0xff000000));
 //BA.debugLineNum = 62;BA.debugLine="lblID.Gravity = Gravity.CENTER_HORIZONTAL+Gravity";
_lblid.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 63;BA.debugLine="lblID.Text = \"\"";
_lblid.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 33;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 34;BA.debugLine="btnSetAppointment.Initialize(\"btnSetAppointment\")";
_btnsetappointment.Initialize(ba,"btnSetAppointment");
 //BA.debugLineNum = 35;BA.debugLine="btnBack.Initialize(\"btnBack\")";
_btnback.Initialize(ba,"btnBack");
 //BA.debugLineNum = 36;BA.debugLine="btnQrReader.Initialize(\"btnQrReader\")";
_btnqrreader.Initialize(ba,"btnQrReader");
 //BA.debugLineNum = 37;BA.debugLine="lblName.Initialize(\"lblName\")";
_lblname.Initialize(ba,"lblName");
 //BA.debugLineNum = 38;BA.debugLine="lblDesc.Initialize(\"lblDesc\")";
_lbldesc.Initialize(ba,"lblDesc");
 //BA.debugLineNum = 39;BA.debugLine="lblID.Initialize(\"lblID\")";
_lblid.Initialize(ba,"lblID");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _lbldesc_click() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub lblDesc_click()";
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _lblid_click() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub lblID_click()";
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _lblname_click() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub lblName_click()";
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 115;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 112;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
