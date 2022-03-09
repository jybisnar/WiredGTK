package b4a.raks;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clsparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.raks.clsparser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.raks.clsparser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _str = "";
public String _buffer = "";
public String _data = "";
public String _wait_header = "";
public String _terminate_char = "";
public int _num_terminate_char = 0;
public int _num_bufterminate_char = 0;
public boolean _status = false;
public int _currpointer = 0;
public b4a.raks.main _main = null;
public b4a.raks.starter _starter = null;
public b4a.raks.vb6 _vb6 = null;
public boolean  _available(b4a.raks.clsparser __ref,String _mscomm_input) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsparser";
if (Debug.shouldDelegate(ba, "available", false))
	 {return ((Boolean) Debug.delegate(ba, "available", new Object[] {_mscomm_input}));}
String _c = "";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub available(MSComm_input As String) As Boolean";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim c As String";
_c = "";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="str = str & MSComm_input";
__ref._str /*String*/  = __ref._str /*String*/ +_mscomm_input;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Do While (str <> \"\")";
while (((__ref._str /*String*/ ).equals("") == false)) {
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="c = vb6.Mid2(str, 1, 1)";
_c = _vb6._mid2 /*String*/ (getActivityBA(),__ref._str /*String*/ ,(int) (1),(int) (1));
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="If status Then data = data & c";
if (__ref._status /*boolean*/ ) { 
__ref._data /*String*/  = __ref._data /*String*/ +_c;};
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="If Pollbyte(c) Then";
if (__ref._pollbyte /*boolean*/ (null,_c)) { 
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="data = \"\"";
__ref._data /*String*/  = "";
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="status = True";
__ref._status /*boolean*/  = __c.True;
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="num_bufterminate_char = 0";
__ref._num_bufterminate_char /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="If (status = True) Then";
if ((__ref._status /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="If (c = terminate_char) Then";
if (((_c).equals(__ref._terminate_char /*String*/ ))) { 
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="str = vb6.Mid(str, 2)";
__ref._str /*String*/  = _vb6._mid /*String*/ (getActivityBA(),__ref._str /*String*/ ,(int) (2));
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="num_bufterminate_char = num_bufter";
__ref._num_bufterminate_char /*int*/  = (int) (__ref._num_bufterminate_char /*int*/ +1);
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="If (num_bufterminate_char = num_te";
if ((__ref._num_bufterminate_char /*int*/ ==__ref._num_terminate_char /*int*/ )) { 
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="status = False";
__ref._status /*boolean*/  = __c.False;
RDebugUtils.currentLine=7864338;
 //BA.debugLineNum = 7864338;BA.debugLine="data = vb6.Mid2(data, 1, vb6.L";
__ref._data /*String*/  = _vb6._mid2 /*String*/ (getActivityBA(),__ref._data /*String*/ ,(int) (1),(int) ((double)(Double.parseDouble(_vb6._len /*String*/ (getActivityBA(),__ref._data /*String*/ )))-1));
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 };
RDebugUtils.currentLine=7864343;
 //BA.debugLineNum = 7864343;BA.debugLine="If vb6.Len(str) > 1 Then";
if ((double)(Double.parseDouble(_vb6._len /*String*/ (getActivityBA(),__ref._str /*String*/ )))>1) { 
RDebugUtils.currentLine=7864344;
 //BA.debugLineNum = 7864344;BA.debugLine="str = vb6.Mid(str, 2)";
__ref._str /*String*/  = _vb6._mid /*String*/ (getActivityBA(),__ref._str /*String*/ ,(int) (2));
 }else {
RDebugUtils.currentLine=7864346;
 //BA.debugLineNum = 7864346;BA.debugLine="str = \"\"";
__ref._str /*String*/  = "";
RDebugUtils.currentLine=7864347;
 //BA.debugLineNum = 7864347;BA.debugLine="Exit";
if (true) break;
 };
 }
;
RDebugUtils.currentLine=7864350;
 //BA.debugLineNum = 7864350;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=7864351;
 //BA.debugLineNum = 7864351;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.raks.clsparser __ref,anywheresoftware.b4a.BA _ba,String _waitheader,String _terminatechar,int _numterminate) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsparser";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_waitheader,_terminatechar,_numterminate}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub Initialize(WaitHeader As String, Termin";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="num_terminate_char = numTerminate";
__ref._num_terminate_char /*int*/  = _numterminate;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="wait_header = WaitHeader";
__ref._wait_header /*String*/  = _waitheader;
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="terminate_char = TerminateChar";
__ref._terminate_char /*String*/  = _terminatechar;
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="currPointer = 1";
__ref._currpointer /*int*/  = (int) (1);
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="End Sub";
return "";
}
public boolean  _pollbyte(b4a.raks.clsparser __ref,String _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsparser";
if (Debug.shouldDelegate(ba, "pollbyte", false))
	 {return ((Boolean) Debug.delegate(ba, "pollbyte", new Object[] {_x}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub Pollbyte(x As String) As Boolean";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If (vb6.Mid2(wait_header, currPointer, 1) = x)";
if (((_vb6._mid2 /*String*/ (getActivityBA(),__ref._wait_header /*String*/ ,__ref._currpointer /*int*/ ,(int) (1))).equals(_x))) { 
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="currPointer = currPointer + 1";
__ref._currpointer /*int*/  = (int) (__ref._currpointer /*int*/ +1);
 }else {
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="currPointer = 1";
__ref._currpointer /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="If ((currPointer - 1) = vb6.Len(wait_header))";
if (((__ref._currpointer /*int*/ -1)==(double)(Double.parseDouble(_vb6._len /*String*/ (getActivityBA(),__ref._wait_header /*String*/ ))))) { 
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="currPointer = 1";
__ref._currpointer /*int*/  = (int) (1);
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.raks.clsparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsparser";
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim buffer As String";
_buffer = "";
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Dim data As String";
_data = "";
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Dim wait_header As String";
_wait_header = "";
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="Dim terminate_char As String";
_terminate_char = "";
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="Dim num_terminate_char As Int";
_num_terminate_char = 0;
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="Dim num_bufterminate_char As Int";
_num_bufterminate_char = 0;
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Dim status As Boolean";
_status = false;
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="Dim currPointer As Int";
_currpointer = 0;
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="End Sub";
return "";
}
public String  _databuffer(b4a.raks.clsparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsparser";
if (Debug.shouldDelegate(ba, "databuffer", false))
	 {return ((String) Debug.delegate(ba, "databuffer", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub Databuffer() As String";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Return data";
if (true) return __ref._data /*String*/ ;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return "";
}
}