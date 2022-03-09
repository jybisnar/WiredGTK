package b4a.raks;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class vb6 {
private static vb6 mostCurrent = new vb6();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.raks.main _main = null;
public b4a.raks.starter _starter = null;
public static String  _mid2(anywheresoftware.b4a.BA _ba,String _string1,int _start,int _lenght) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "mid2", false))
	 {return ((String) Debug.delegate(null, "mid2", new Object[] {_ba,_string1,_start,_lenght}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub Mid2(String1 As String,Start As Int,Lenght As";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="If(String1.Length>=Start)Then";
if ((_string1.length()>=_start)) { 
 }else {
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="If(String1.Length>=Start+Lenght-1)Then";
if ((_string1.length()>=_start+_lenght-1)) { 
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="Return String1.SubString2(Start-1,Lenght+Start-1";
if (true) return _string1.substring((int) (_start-1),(int) (_lenght+_start-1));
 }else {
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Return String1.SubString(Start-1)";
if (true) return _string1.substring((int) (_start-1));
 };
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="End Sub";
return "";
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _string1,int _start) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "mid", false))
	 {return ((String) Debug.delegate(null, "mid", new Object[] {_ba,_string1,_start}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Mid(String1 As String,Start As Int) As String";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="If(String1.Length>=Start)Then";
if ((_string1.length()>=_start)) { 
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Return String1.SubString(Start-1)";
if (true) return _string1.substring((int) (_start-1));
 }else {
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="End Sub";
return "";
}
public static String  _len(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "len", false))
	 {return ((String) Debug.delegate(null, "len", new Object[] {_ba,_str}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub Len(str As String) As String";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return str.Length";
if (true) return BA.NumberToString(_str.length());
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
public static float  _constrain(anywheresoftware.b4a.BA _ba,float _amt,float _low,float _high) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "constrain", false))
	 {return ((Float) Debug.delegate(null, "constrain", new Object[] {_ba,_amt,_low,_high}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub constrain(amt As Float,low As Float,high As Fl";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="If amt<low Then amt=low";
if (_amt<_low) { 
_amt = _low;};
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="If amt>high Then amt=high";
if (_amt>_high) { 
_amt = _high;};
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Return amt";
if (true) return _amt;
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return 0f;
}
public static String  _date(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "date", false))
	 {return ((String) Debug.delegate(null, "date", new Object[] {_ba}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub Date() As String";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public static String  _getcsv(anywheresoftware.b4a.BA _ba,int _x,String _chars,String _str) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "getcsv", false))
	 {return ((String) Debug.delegate(null, "getcsv", new Object[] {_ba,_x,_chars,_str}));}
int _b = 0;
String _ret = "";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub getCSV(x As Int, Chars As String, str As Strin";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim B As Int";
_b = 0;
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim ret As String";
_ret = "";
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="B = 1";
_b = (int) (1);
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="Do While (x <> 0)";
while ((_x!=0)) {
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="If Mid2(str, B, 1) = Chars Then x = x - 1";
if ((_mid2(_ba,_str,_b,(int) (1))).equals(_chars)) { 
_x = (int) (_x-1);};
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="B = B + 1";
_b = (int) (_b+1);
 }
;
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="Do While ((Mid2(str, B, 1) <> Chars) AND ((str";
while ((((_mid2(_ba,_str,_b,(int) (1))).equals(_chars) == false) && ((_str.length())+1)!=_b)) {
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="ret = ret & Mid2(str, B, 1)";
_ret = _ret+_mid2(_ba,_str,_b,(int) (1));
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="B = B + 1";
_b = (int) (_b+1);
 }
;
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="End Sub";
return "";
}
public static String  _getfilestr(anywheresoftware.b4a.BA _ba,String _file_) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "getfilestr", false))
	 {return ((String) Debug.delegate(null, "getfilestr", new Object[] {_ba,_file_}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub GetFileStr(file_ As String) As String";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Return File.GetText(File.DirInternal,file_)";
if (true) return anywheresoftware.b4a.keywords.Common.File.GetText(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_file_);
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public static long  _instr(anywheresoftware.b4a.BA _ba,int _start,String _string1,String _string2) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "instr", false))
	 {return ((Long) Debug.delegate(null, "instr", new Object[] {_ba,_start,_string1,_string2}));}
long _x = 0L;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub InStr(Start As Int,String1 As String,String2 A";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim x As Long";
_x = 0L;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="x=String1.IndexOf(String2)";
_x = (long) (_string1.indexOf(_string2));
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Return x+1";
if (true) return (long) (_x+1);
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="End Sub";
return 0L;
}
public static float  _maparduino(anywheresoftware.b4a.BA _ba,float _x,float _in_min,float _in_max,float _out_min,float _out_max) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "maparduino", false))
	 {return ((Float) Debug.delegate(null, "maparduino", new Object[] {_ba,_x,_in_min,_in_max,_out_min,_out_max}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub mapArduino(x As Float, in_min As Float,  in_ma";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Return (x - in_min) * (out_max - out_min) / (in_";
if (true) return (float) ((_x-_in_min)*(_out_max-_out_min)/(double)(_in_max-_in_min)+_out_min);
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return 0f;
}
public static String  _now(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "now", false))
	 {return ((String) Debug.delegate(null, "now", new Object[] {_ba}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub Now() As String";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Return DateTime.Date(DateTime.Now) & \" \" & DateTi";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
public static String  _savefilestr(anywheresoftware.b4a.BA _ba,String _file_,String _str) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "savefilestr", false))
	 {return ((String) Debug.delegate(null, "savefilestr", new Object[] {_ba,_file_,_str}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub SaveFileStr(file_ As String, str As String)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="File.WriteString(File.DirInternal,file_,str)";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_file_,_str);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _str,String _delimeter) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "split", false))
	 {return ((String[]) Debug.delegate(null, "split", new Object[] {_ba,_str,_delimeter}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Split(str As String,delimeter As String) As St";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Return Regex.Split(delimeter,str)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimeter,_str);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return null;
}
public static String  _time(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "time", false))
	 {return ((String) Debug.delegate(null, "time", new Object[] {_ba}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Time() As String";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Return DateTime.Time(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return "";
}
public static boolean  _timeinbetween(anywheresoftware.b4a.BA _ba,String _mintime,String _maxtime,String _timenow) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "timeinbetween", false))
	 {return ((Boolean) Debug.delegate(null, "timeinbetween", new Object[] {_ba,_mintime,_maxtime,_timenow}));}
long _mintimelong = 0L;
long _maxtimelong = 0L;
long _currtimelong = 0L;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub TimeInBetween(minTime As String, maxTime As St";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim minTimeLong As Long";
_mintimelong = 0L;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim maxTimeLong As Long";
_maxtimelong = 0L;
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Dim currTimeLong As Long";
_currtimelong = 0L;
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="minTimeLong = DateTime.TimeParse(minTime)/1000";
_mintimelong = (long) (anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(_mintime)/(double)1000);
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="maxTimeLong = DateTime.TimeParse(maxTime)/1000";
_maxtimelong = (long) (anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(_maxtime)/(double)1000);
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="currTimeLong = DateTime.TimeParse(timenow)/100";
_currtimelong = (long) (anywheresoftware.b4a.keywords.Common.DateTime.TimeParse(_timenow)/(double)1000);
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="If minTimeLong < maxTimeLong Then";
if (_mintimelong<_maxtimelong) { 
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="If currTimeLong >= minTimeLong AND currTim";
if (_currtimelong>=_mintimelong && _currtimelong<=_maxtimelong) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
 }else {
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="If currTimeLong > maxTimeLong Then";
if (_currtimelong>_maxtimelong) { 
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="If currTimeLong >= minTimeLong AND cur";
if (_currtimelong>=_mintimelong && _currtimelong>=_maxtimelong) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
 }else {
RDebugUtils.currentLine=7012370;
 //BA.debugLineNum = 7012370;BA.debugLine="If currTimeLong <= minTimeLong AND cur";
if (_currtimelong<=_mintimelong && _currtimelong<=_maxtimelong) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
 };
 };
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=7012374;
 //BA.debugLineNum = 7012374;BA.debugLine="End Sub";
return false;
}
public static long  _ubound(anywheresoftware.b4a.BA _ba,String[] _str) throws Exception{
RDebugUtils.currentModule="vb6";
if (Debug.shouldDelegate(null, "ubound", false))
	 {return ((Long) Debug.delegate(null, "ubound", new Object[] {_ba,_str}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub UBound(str() As String) As Long";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Return str.Length";
if (true) return (long) (_str.length);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return 0L;
}
}