package b4a.OPTUMizerPatient;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class plogin extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.OPTUMizerPatient.plogin");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.OPTUMizerPatient.plogin.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassword = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.OPTUMizerPatient.main _main = null;
public b4a.OPTUMizerPatient.starter _starter = null;
public b4a.OPTUMizerPatient.vb6 _vb6 = null;
public b4a.OPTUMizerPatient.b4xcollections _b4xcollections = null;
public String  _addtoparent(anywheresoftware.b4a.objects.ActivityWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub AddToParent(Parent As Activity, Left As";
 //BA.debugLineNum = 22;BA.debugLine="mBase.Initialize(\"mBase\")";
_mbase.Initialize(ba,"mBase");
 //BA.debugLineNum = 23;BA.debugLine="Parent.AddView(mBase, Left, Top, Width, Height)";
_parent.AddView((android.view.View)(_mbase.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 24;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public void  _btnlogin_click() throws Exception{
ResumableSub_btnLogIn_click rsub = new ResumableSub_btnLogIn_click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnLogIn_click extends BA.ResumableSub {
public ResumableSub_btnLogIn_click(b4a.OPTUMizerPatient.plogin parent) {
this.parent = parent;
}
b4a.OPTUMizerPatient.plogin parent;
b4a.OPTUMizerPatient.phome _home = null;
b4a.OPTUMizerPatient.pprofile _prof = null;
b4a.OPTUMizerPatient.plogs _plogsa = null;
b4a.OPTUMizerPatient.pschedule _psched = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.List _quotes = null;
anywheresoftware.b4a.objects.collections.Map _quot = null;
b4a.OPTUMizerPatient.pqr _x = null;
b4a.OPTUMizerPatient.qrgenerator _qr = null;
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 67;BA.debugLine="Dim home As PHome";
_home = new b4a.OPTUMizerPatient.phome();
 //BA.debugLineNum = 68;BA.debugLine="Dim prof As PProfile";
_prof = new b4a.OPTUMizerPatient.pprofile();
 //BA.debugLineNum = 69;BA.debugLine="Dim plogsA As PLogs";
_plogsa = new b4a.OPTUMizerPatient.plogs();
 //BA.debugLineNum = 70;BA.debugLine="Dim psched As PSchedule";
_psched = new b4a.OPTUMizerPatient.pschedule();
 //BA.debugLineNum = 71;BA.debugLine="home = Starter.PHome1";
_home = (b4a.OPTUMizerPatient.phome)(parent._starter._phome1 /*Object*/ );
 //BA.debugLineNum = 72;BA.debugLine="prof = Starter.PProfile1";
_prof = (b4a.OPTUMizerPatient.pprofile)(parent._starter._pprofile1 /*Object*/ );
 //BA.debugLineNum = 73;BA.debugLine="plogsA = Starter.PLogs1";
_plogsa = (b4a.OPTUMizerPatient.plogs)(parent._starter._plogs1 /*Object*/ );
 //BA.debugLineNum = 74;BA.debugLine="psched = Starter.PSchedule1";
_psched = (b4a.OPTUMizerPatient.pschedule)(parent._starter._pschedule1 /*Object*/ );
 //BA.debugLineNum = 76;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 77;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no l";
_j._initialize(ba,"",parent);
 //BA.debugLineNum = 78;BA.debugLine="j.PostString(\"http://\"& Starter.serverURL &\"/logi";
_j._poststring("http://"+parent._starter._serverurl /*String*/ +"/login?username="+parent._txtid.getText()+"&password="+parent._txtpassword.getText(),"");
 //BA.debugLineNum = 79;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
 //BA.debugLineNum = 80;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 82;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 83;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring());
 //BA.debugLineNum = 84;BA.debugLine="Dim quotes As List = jp.NextArray";
_quotes = new anywheresoftware.b4a.objects.collections.List();
_quotes = _jp.NextArray();
 //BA.debugLineNum = 85;BA.debugLine="For Each quot As Map In quotes";
if (true) break;

case 4:
//for
this.state = 13;
_quot = new anywheresoftware.b4a.objects.collections.Map();
group17 = _quotes;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 13;
if (index17 < groupLen17) {
this.state = 6;
_quot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group17.Get(index17)));}
if (true) break;

case 17:
//C
this.state = 16;
index17++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 86;BA.debugLine="If quot.Get(\"id\")<> \"\" Then";
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
 //BA.debugLineNum = 87;BA.debugLine="Starter.user.Id=quot.Get(\"id\") 'From patients.";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Id /*String*/  = BA.ObjectToString(_quot.Get((Object)("id")));
 //BA.debugLineNum = 88;BA.debugLine="Starter.user.First=txtID.Text 'From patients.c";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .First /*String*/  = parent._txtid.getText();
 //BA.debugLineNum = 89;BA.debugLine="Starter.user.Last=txtPassword.Text 'From patie";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Last /*String*/  = parent._txtpassword.getText();
 //BA.debugLineNum = 90;BA.debugLine="Starter.user.provider=quot.Get(\"physician\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .provider /*String*/  = BA.ObjectToString(_quot.Get((Object)("physician")));
 //BA.debugLineNum = 91;BA.debugLine="Starter.user.Lat=quot.Get(\"lat\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Lat /*String*/  = BA.ObjectToString(_quot.Get((Object)("lat")));
 //BA.debugLineNum = 92;BA.debugLine="Starter.user.Lon=quot.Get(\"lon\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Lon /*String*/  = BA.ObjectToString(_quot.Get((Object)("lon")));
 //BA.debugLineNum = 93;BA.debugLine="Starter.user.encounterProblem=quot.Get(\"encoun";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .encounterProblem /*String*/  = BA.ObjectToString(_quot.Get((Object)("encounterclass")));
 //BA.debugLineNum = 94;BA.debugLine="Starter.user.specialty=quot.Get(\"specialty\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .specialty /*String*/  = BA.ObjectToString(_quot.Get((Object)("specialty")));
 //BA.debugLineNum = 95;BA.debugLine="Starter.user.Address=quot.Get(\"address\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Address /*String*/  = BA.ObjectToString(_quot.Get((Object)("address")));
 //BA.debugLineNum = 96;BA.debugLine="Starter.user.City=quot.Get(\"city\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .City /*String*/  = BA.ObjectToString(_quot.Get((Object)("city")));
 //BA.debugLineNum = 97;BA.debugLine="Starter.user.State=quot.Get(\"state\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .State /*String*/  = BA.ObjectToString(_quot.Get((Object)("state")));
 //BA.debugLineNum = 98;BA.debugLine="Starter.user.County=quot.Get(\"county\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .County /*String*/  = BA.ObjectToString(_quot.Get((Object)("county")));
 //BA.debugLineNum = 99;BA.debugLine="Starter.user.Zip=quot.Get(\"zip\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Zip /*String*/  = BA.ObjectToString(_quot.Get((Object)("zip")));
 //BA.debugLineNum = 100;BA.debugLine="Starter.user.Percent = quot.Get(\"percent\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Percent /*String*/  = BA.ObjectToString(_quot.Get((Object)("percent")));
 //BA.debugLineNum = 101;BA.debugLine="Starter.user.progIncrement = quot.Get(\"progInc";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .progIncrement /*String*/  = BA.ObjectToString(_quot.Get((Object)("progIncrement")));
 //BA.debugLineNum = 102;BA.debugLine="Starter.user.Start = quot.Get(\"start\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Start /*String*/  = BA.ObjectToString(_quot.Get((Object)("start")));
 //BA.debugLineNum = 103;BA.debugLine="Starter.user.Stop = quot.Get(\"stop\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Stop /*String*/  = BA.ObjectToString(_quot.Get((Object)("stop")));
 //BA.debugLineNum = 104;BA.debugLine="Starter.user.DescriptionMed = quot.Get(\"descMe";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .DescriptionMed /*String*/  = BA.ObjectToString(_quot.Get((Object)("descMed")));
 //BA.debugLineNum = 105;BA.debugLine="Starter.user.DescriptionAppoint= quot.Get(\"Des";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .DescriptionAppoint /*String*/  = BA.ObjectToString(_quot.Get((Object)("DescAppoint")));
 //BA.debugLineNum = 106;BA.debugLine="Starter.user.Prefix = quot.Get(\"prefix\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Prefix /*String*/  = BA.ObjectToString(_quot.Get((Object)("prefix")));
 //BA.debugLineNum = 107;BA.debugLine="Starter.user.Dispenses = quot.Get(\"dispenses\")";
parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Dispenses /*String*/  = BA.ObjectToString(_quot.Get((Object)("dispenses")));
 //BA.debugLineNum = 108;BA.debugLine="Dim x As PQr";
_x = new b4a.OPTUMizerPatient.pqr();
 //BA.debugLineNum = 109;BA.debugLine="x=Starter.PQr1";
_x = (b4a.OPTUMizerPatient.pqr)(parent._starter._pqr1 /*Object*/ );
 //BA.debugLineNum = 110;BA.debugLine="Dim qr As QRGenerator";
_qr = new b4a.OPTUMizerPatient.qrgenerator();
 //BA.debugLineNum = 111;BA.debugLine="qr.Initialize(x.p_Qr.Width)";
_qr._initialize /*String*/ (ba,_x._p_qr /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 //BA.debugLineNum = 112;BA.debugLine="x.p_Qr.SetBackgroundImage(qr.Create(Starter.us";
_x._p_qr /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_qr._create /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Id /*String*/ ).getObject()));
 //BA.debugLineNum = 113;BA.debugLine="home.lblName.Text=\"User:\"& txtID.Text & \" \" &";
_home._lblname /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("User:"+parent._txtid.getText()+" "+parent._txtpassword.getText()));
 //BA.debugLineNum = 114;BA.debugLine="prof.lblName.Text = txtID.Text & \" \" & txtPass";
_prof._lblname /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._txtid.getText()+" "+parent._txtpassword.getText()));
 //BA.debugLineNum = 115;BA.debugLine="prof.lbl_ID.Text = Starter.user.Id";
_prof._lbl_id /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Id /*String*/ ));
 //BA.debugLineNum = 116;BA.debugLine="prof.lblAddress.Text = Starter.user.Address";
_prof._lbladdress /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Address /*String*/ ));
 //BA.debugLineNum = 117;BA.debugLine="prof.lblCounty.Text = Starter.user.County";
_prof._lblcounty /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .County /*String*/ ));
 //BA.debugLineNum = 118;BA.debugLine="prof.lblZip.Text = Starter.user.Zip";
_prof._lblzip /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Zip /*String*/ ));
 //BA.debugLineNum = 119;BA.debugLine="prof.lblState.Text = Starter.user.State";
_prof._lblstate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .State /*String*/ ));
 //BA.debugLineNum = 120;BA.debugLine="plogsA.lbl_dateTime1.Text = Starter.user.Start";
_plogsa._lbl_datetime1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .Start /*String*/ ));
 //BA.debugLineNum = 121;BA.debugLine="plogsA.lblText1.Text = Starter.user.Descriptio";
_plogsa._lbltext1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .DescriptionAppoint /*String*/ ));
 //BA.debugLineNum = 122;BA.debugLine="psched.lblTitlea.Text = Starter.user.Descripti";
_psched._lbltitlea /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .DescriptionMed /*String*/ ));
 //BA.debugLineNum = 123;BA.debugLine="psched.lblTitleb.Text = Starter.user.Descripti";
_psched._lbltitleb /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._starter._user /*b4a.OPTUMizerPatient.starter._mytype*/ .DescriptionAppoint /*String*/ ));
 //BA.debugLineNum = 124;BA.debugLine="home.Visible=True";
_home._setvisible /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 125;BA.debugLine="setVisible(False)";
parent._setvisible(parent.__c.False);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 127;BA.debugLine="ToastMessageShow(\"User Doesnt exist\",False)";
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
 //BA.debugLineNum = 131;BA.debugLine="j.Release";
_j._release();
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Dim txtID As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim txtPassword As EditText";
_txtpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 36;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 37;BA.debugLine="GTKForms";
_gtkforms();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 151;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub getVisible() As Boolean";
 //BA.debugLineNum = 141;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return false;
}
public String  _gtkforms() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub GTKForms";
 //BA.debugLineNum = 47;BA.debugLine="mBase.Color=0x000000'transparent background";
_mbase.setColor((int) (0x000000));
 //BA.debugLineNum = 48;BA.debugLine="mBase.Width=100%x";
_mbase.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 49;BA.debugLine="mBase.height=100%y";
_mbase.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 50;BA.debugLine="mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mB";
_mbase.AddView((android.view.View)(_image1.getObject()),(int) (0.00*_mbase.getWidth()),(int) (0.00*_mbase.getHeight()),(int) (1.01*_mbase.getWidth()),(int) (1.00*_mbase.getHeight()));
 //BA.debugLineNum = 51;BA.debugLine="Image1.Bitmap = LoadBitmapResize(File.DirAssets,\"";
_image1.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"LoginModule-bf106.png",_image1.getWidth(),_image1.getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 52;BA.debugLine="mBase.AddView(btnLogIn,0.12 * mBase.Width,0.80 *";
_mbase.AddView((android.view.View)(_btnlogin.getObject()),(int) (0.12*_mbase.getWidth()),(int) (0.80*_mbase.getHeight()),(int) (0.76*_mbase.getWidth()),(int) (0.05*_mbase.getHeight()));
 //BA.debugLineNum = 53;BA.debugLine="mBase.AddView(txtID,0.11 * mBase.Width,0.60 * mBa";
_mbase.AddView((android.view.View)(_txtid.getObject()),(int) (0.11*_mbase.getWidth()),(int) (0.60*_mbase.getHeight()),(int) (0.79*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 54;BA.debugLine="mBase.AddView(txtPassword,0.11 * mBase.Width,0.69";
_mbase.AddView((android.view.View)(_txtpassword.getObject()),(int) (0.11*_mbase.getWidth()),(int) (0.69*_mbase.getHeight()),(int) (0.79*_mbase.getWidth()),(int) (0.09*_mbase.getHeight()));
 //BA.debugLineNum = 56;BA.debugLine="initPLogin";
_initplogin();
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _image1_click() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Image1_click()";
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 29;BA.debugLine="Image1.Initialize(\"Image1\")";
_image1.Initialize(ba,"Image1");
 //BA.debugLineNum = 30;BA.debugLine="btnLogIn.Initialize(\"btnLogIn\")";
_btnlogin.Initialize(ba,"btnLogIn");
 //BA.debugLineNum = 31;BA.debugLine="txtID.Initialize(\"txtID\")";
_txtid.Initialize(ba,"txtID");
 //BA.debugLineNum = 32;BA.debugLine="txtPassword.Initialize(\"txtPassword\")";
_txtpassword.Initialize(ba,"txtPassword");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _initplogin() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub initPLogin";
 //BA.debugLineNum = 42;BA.debugLine="btnLogIn.Color =  0x00001f59";
_btnlogin.setColor((int) (0x00001f59));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _setlayout(int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Public Sub SetLayout(Left As Int,Top As Int,Width";
 //BA.debugLineNum = 147;BA.debugLine="mBase.SetLayout(Left,Top,Width,Height )";
_mbase.SetLayout(_left,_top,_width,_height);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _flag) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub setVisible(flag As Boolean)";
 //BA.debugLineNum = 144;BA.debugLine="mBase.Visible=flag";
_mbase.setVisible(_flag);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _txtid_click() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub txtID_click()";
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _txtpassword_click() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub txtPassword_click()";
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
