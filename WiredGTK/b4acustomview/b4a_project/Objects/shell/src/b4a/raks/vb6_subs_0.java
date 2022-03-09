package b4a.raks;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vb6_subs_0 {


public static RemoteObject  _constrain(RemoteObject _ba,RemoteObject _amt,RemoteObject _low,RemoteObject _high) throws Exception{
try {
		Debug.PushSubsStack("constrain (vb6) ","vb6",7,_ba,vb6.mostCurrent,15);
if (RapidSub.canDelegate("constrain")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","constrain", _ba, _amt, _low, _high);}
;
Debug.locals.put("amt", _amt);
Debug.locals.put("low", _low);
Debug.locals.put("high", _high);
 BA.debugLineNum = 15;BA.debugLine="Sub constrain(amt As Float,low As Float,high As Fl";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="If amt<low Then amt=low";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("<",_amt,BA.numberCast(double.class, _low))) { 
_amt = _low;Debug.locals.put("amt", _amt);};
 BA.debugLineNum = 17;BA.debugLine="If amt>high Then amt=high";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_amt,BA.numberCast(double.class, _high))) { 
_amt = _high;Debug.locals.put("amt", _amt);};
 BA.debugLineNum = 18;BA.debugLine="Return amt";
Debug.ShouldStop(131072);
if (true) return _amt;
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _date(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Date (vb6) ","vb6",7,_ba,vb6.mostCurrent,63);
if (RapidSub.canDelegate("date")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","date", _ba);}
;
 BA.debugLineNum = 63;BA.debugLine="Sub Date() As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Return DateTime.Date(DateTime.Now)";
Debug.ShouldStop(-2147483648);
if (true) return vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcsv(RemoteObject _ba,RemoteObject _x,RemoteObject _chars,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("getCSV (vb6) ","vb6",7,_ba,vb6.mostCurrent,96);
if (RapidSub.canDelegate("getcsv")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","getcsv", _ba, _x, _chars, _str);}
RemoteObject _b = RemoteObject.createImmutable(0);
RemoteObject _ret = RemoteObject.createImmutable("");
;
Debug.locals.put("x", _x);
Debug.locals.put("Chars", _chars);
Debug.locals.put("str", _str);
 BA.debugLineNum = 96;BA.debugLine="Sub getCSV(x As Int, Chars As String, str As Strin";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim B As Int";
Debug.ShouldStop(1);
_b = RemoteObject.createImmutable(0);Debug.locals.put("B", _b);
 BA.debugLineNum = 98;BA.debugLine="Dim ret As String";
Debug.ShouldStop(2);
_ret = RemoteObject.createImmutable("");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 99;BA.debugLine="B = 1";
Debug.ShouldStop(4);
_b = BA.numberCast(int.class, 1);Debug.locals.put("B", _b);
 BA.debugLineNum = 100;BA.debugLine="Do While (x <> 0)";
Debug.ShouldStop(8);
while ((RemoteObject.solveBoolean("!",_x,BA.numberCast(double.class, 0)))) {
 BA.debugLineNum = 101;BA.debugLine="If Mid2(str, B, 1) = Chars Then x = x - 1";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_mid2(_ba,_str,_b,BA.numberCast(int.class, 1)),_chars)) { 
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("x", _x);};
 BA.debugLineNum = 103;BA.debugLine="B = B + 1";
Debug.ShouldStop(64);
_b = RemoteObject.solve(new RemoteObject[] {_b,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("B", _b);
 }
;
 BA.debugLineNum = 105;BA.debugLine="Do While ((Mid2(str, B, 1) <> Chars) AND ((str";
Debug.ShouldStop(256);
while ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_mid2(_ba,_str,_b,BA.numberCast(int.class, 1)),_chars)))) && RemoteObject.solveBoolean("!",(RemoteObject.solve(new RemoteObject[] {(_str.runMethod(true,"length")),RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(double.class, _b)))) {
 BA.debugLineNum = 106;BA.debugLine="ret = ret & Mid2(str, B, 1)";
Debug.ShouldStop(512);
_ret = RemoteObject.concat(_ret,_mid2(_ba,_str,_b,BA.numberCast(int.class, 1)));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 107;BA.debugLine="B = B + 1";
Debug.ShouldStop(1024);
_b = RemoteObject.solve(new RemoteObject[] {_b,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("B", _b);
 }
;
 BA.debugLineNum = 109;BA.debugLine="Return ret";
Debug.ShouldStop(4096);
if (true) return _ret;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfilestr(RemoteObject _ba,RemoteObject _file_) throws Exception{
try {
		Debug.PushSubsStack("GetFileStr (vb6) ","vb6",7,_ba,vb6.mostCurrent,37);
if (RapidSub.canDelegate("getfilestr")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","getfilestr", _ba, _file_);}
;
Debug.locals.put("file_", _file_);
 BA.debugLineNum = 37;BA.debugLine="Sub GetFileStr(file_ As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Return File.GetText(File.DirInternal,file_)";
Debug.ShouldStop(32);
if (true) return vb6.mostCurrent.__c.getField(false,"File").runMethod(true,"GetText",(Object)(vb6.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_file_));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _instr(RemoteObject _ba,RemoteObject _start,RemoteObject _string1,RemoteObject _string2) throws Exception{
try {
		Debug.PushSubsStack("InStr (vb6) ","vb6",7,_ba,vb6.mostCurrent,29);
if (RapidSub.canDelegate("instr")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","instr", _ba, _start, _string1, _string2);}
RemoteObject _x = RemoteObject.createImmutable(0L);
;
Debug.locals.put("Start", _start);
Debug.locals.put("String1", _string1);
Debug.locals.put("String2", _string2);
 BA.debugLineNum = 29;BA.debugLine="Sub InStr(Start As Int,String1 As String,String2 A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Dim x As Long";
Debug.ShouldStop(536870912);
_x = RemoteObject.createImmutable(0L);Debug.locals.put("x", _x);
 BA.debugLineNum = 31;BA.debugLine="x=String1.IndexOf(String2)";
Debug.ShouldStop(1073741824);
_x = BA.numberCast(long.class, _string1.runMethod(true,"indexOf",(Object)(_string2)));Debug.locals.put("x", _x);
 BA.debugLineNum = 32;BA.debugLine="Return x+1";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 2);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _len(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Len (vb6) ","vb6",7,_ba,vb6.mostCurrent,69);
if (RapidSub.canDelegate("len")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","len", _ba, _str);}
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 69;BA.debugLine="Sub Len(str As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return str.Length";
Debug.ShouldStop(32);
if (true) return BA.NumberToString(_str.runMethod(true,"length"));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maparduino(RemoteObject _ba,RemoteObject _x,RemoteObject _in_min,RemoteObject _in_max,RemoteObject _out_min,RemoteObject _out_max) throws Exception{
try {
		Debug.PushSubsStack("mapArduino (vb6) ","vb6",7,_ba,vb6.mostCurrent,22);
if (RapidSub.canDelegate("maparduino")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","maparduino", _ba, _x, _in_min, _in_max, _out_min, _out_max);}
;
Debug.locals.put("x", _x);
Debug.locals.put("in_min", _in_min);
Debug.locals.put("in_max", _in_max);
Debug.locals.put("out_min", _out_min);
Debug.locals.put("out_max", _out_max);
 BA.debugLineNum = 22;BA.debugLine="Sub mapArduino(x As Float, in_min As Float,  in_ma";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Return (x - in_min) * (out_max - out_min) / (in_";
Debug.ShouldStop(4194304);
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,_in_min}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {_out_max,_out_min}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {_in_max,_in_min}, "-",1, 0)),_out_min}, "*/+",1, 0));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mid(RemoteObject _ba,RemoteObject _string1,RemoteObject _start) throws Exception{
try {
		Debug.PushSubsStack("Mid (vb6) ","vb6",7,_ba,vb6.mostCurrent,42);
if (RapidSub.canDelegate("mid")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","mid", _ba, _string1, _start);}
;
Debug.locals.put("String1", _string1);
Debug.locals.put("Start", _start);
 BA.debugLineNum = 42;BA.debugLine="Sub Mid(String1 As String,Start As Int) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If(String1.Length>=Start)Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("g",_string1.runMethod(true,"length"),BA.numberCast(double.class, _start)))) { 
 BA.debugLineNum = 44;BA.debugLine="Return String1.SubString(Start-1)";
Debug.ShouldStop(2048);
if (true) return _string1.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)));
 }else {
 BA.debugLineNum = 46;BA.debugLine="Return \"\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mid2(RemoteObject _ba,RemoteObject _string1,RemoteObject _start,RemoteObject _lenght) throws Exception{
try {
		Debug.PushSubsStack("Mid2 (vb6) ","vb6",7,_ba,vb6.mostCurrent,49);
if (RapidSub.canDelegate("mid2")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","mid2", _ba, _string1, _start, _lenght);}
;
Debug.locals.put("String1", _string1);
Debug.locals.put("Start", _start);
Debug.locals.put("Lenght", _lenght);
 BA.debugLineNum = 49;BA.debugLine="Sub Mid2(String1 As String,Start As Int,Lenght As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If(String1.Length>=Start)Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("g",_string1.runMethod(true,"length"),BA.numberCast(double.class, _start)))) { 
 }else {
 BA.debugLineNum = 52;BA.debugLine="Return \"\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 54;BA.debugLine="If(String1.Length>=Start+Lenght-1)Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("g",_string1.runMethod(true,"length"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_start,_lenght,RemoteObject.createImmutable(1)}, "+-",2, 1))))) { 
 BA.debugLineNum = 55;BA.debugLine="Return String1.SubString2(Start-1,Lenght+Start-1";
Debug.ShouldStop(4194304);
if (true) return _string1.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_lenght,_start,RemoteObject.createImmutable(1)}, "+-",2, 1)));
 }else {
 BA.debugLineNum = 57;BA.debugLine="Return String1.SubString(Start-1)";
Debug.ShouldStop(16777216);
if (true) return _string1.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)));
 };
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _now(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Now (vb6) ","vb6",7,_ba,vb6.mostCurrent,60);
if (RapidSub.canDelegate("now")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","now", _ba);}
;
 BA.debugLineNum = 60;BA.debugLine="Sub Now() As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Return DateTime.Date(DateTime.Now) & \" \" & DateTi";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" "),vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _savefilestr(RemoteObject _ba,RemoteObject _file_,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("SaveFileStr (vb6) ","vb6",7,_ba,vb6.mostCurrent,34);
if (RapidSub.canDelegate("savefilestr")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","savefilestr", _ba, _file_, _str);}
;
Debug.locals.put("file_", _file_);
Debug.locals.put("str", _str);
 BA.debugLineNum = 34;BA.debugLine="Sub SaveFileStr(file_ As String, str As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="File.WriteString(File.DirInternal,file_,str)";
Debug.ShouldStop(4);
vb6.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(vb6.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_file_),(Object)(_str));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _split(RemoteObject _ba,RemoteObject _str,RemoteObject _delimeter) throws Exception{
try {
		Debug.PushSubsStack("Split (vb6) ","vb6",7,_ba,vb6.mostCurrent,10);
if (RapidSub.canDelegate("split")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","split", _ba, _str, _delimeter);}
;
Debug.locals.put("str", _str);
Debug.locals.put("delimeter", _delimeter);
 BA.debugLineNum = 10;BA.debugLine="Sub Split(str As String,delimeter As String) As St";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Regex.Split(delimeter,str)";
Debug.ShouldStop(1024);
if (true) return vb6.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(_delimeter),(Object)(_str));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _time(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Time (vb6) ","vb6",7,_ba,vb6.mostCurrent,66);
if (RapidSub.canDelegate("time")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","time", _ba);}
;
 BA.debugLineNum = 66;BA.debugLine="Sub Time() As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Return DateTime.Time(DateTime.Now)";
Debug.ShouldStop(4);
if (true) return vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timeinbetween(RemoteObject _ba,RemoteObject _mintime,RemoteObject _maxtime,RemoteObject _timenow) throws Exception{
try {
		Debug.PushSubsStack("TimeInBetween (vb6) ","vb6",7,_ba,vb6.mostCurrent,73);
if (RapidSub.canDelegate("timeinbetween")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","timeinbetween", _ba, _mintime, _maxtime, _timenow);}
RemoteObject _mintimelong = RemoteObject.createImmutable(0L);
RemoteObject _maxtimelong = RemoteObject.createImmutable(0L);
RemoteObject _currtimelong = RemoteObject.createImmutable(0L);
;
Debug.locals.put("minTime", _mintime);
Debug.locals.put("maxTime", _maxtime);
Debug.locals.put("timenow", _timenow);
 BA.debugLineNum = 73;BA.debugLine="Sub TimeInBetween(minTime As String, maxTime As St";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim minTimeLong As Long";
Debug.ShouldStop(512);
_mintimelong = RemoteObject.createImmutable(0L);Debug.locals.put("minTimeLong", _mintimelong);
 BA.debugLineNum = 75;BA.debugLine="Dim maxTimeLong As Long";
Debug.ShouldStop(1024);
_maxtimelong = RemoteObject.createImmutable(0L);Debug.locals.put("maxTimeLong", _maxtimelong);
 BA.debugLineNum = 76;BA.debugLine="Dim currTimeLong As Long";
Debug.ShouldStop(2048);
_currtimelong = RemoteObject.createImmutable(0L);Debug.locals.put("currTimeLong", _currtimelong);
 BA.debugLineNum = 81;BA.debugLine="minTimeLong = DateTime.TimeParse(minTime)/1000";
Debug.ShouldStop(65536);
_mintimelong = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)(_mintime)),RemoteObject.createImmutable(1000)}, "/",0, 0));Debug.locals.put("minTimeLong", _mintimelong);
 BA.debugLineNum = 82;BA.debugLine="maxTimeLong = DateTime.TimeParse(maxTime)/1000";
Debug.ShouldStop(131072);
_maxtimelong = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)(_maxtime)),RemoteObject.createImmutable(1000)}, "/",0, 0));Debug.locals.put("maxTimeLong", _maxtimelong);
 BA.debugLineNum = 83;BA.debugLine="currTimeLong = DateTime.TimeParse(timenow)/100";
Debug.ShouldStop(262144);
_currtimelong = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {vb6.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)(_timenow)),RemoteObject.createImmutable(1000)}, "/",0, 0));Debug.locals.put("currTimeLong", _currtimelong);
 BA.debugLineNum = 84;BA.debugLine="If minTimeLong < maxTimeLong Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",_mintimelong,BA.numberCast(double.class, _maxtimelong))) { 
 BA.debugLineNum = 85;BA.debugLine="If currTimeLong >= minTimeLong AND currTim";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("g",_currtimelong,BA.numberCast(double.class, _mintimelong)) && RemoteObject.solveBoolean("k",_currtimelong,BA.numberCast(double.class, _maxtimelong))) { 
if (true) return vb6.mostCurrent.__c.getField(true,"True");};
 }else {
 BA.debugLineNum = 88;BA.debugLine="If currTimeLong > maxTimeLong Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_currtimelong,BA.numberCast(double.class, _maxtimelong))) { 
 BA.debugLineNum = 89;BA.debugLine="If currTimeLong >= minTimeLong AND cur";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("g",_currtimelong,BA.numberCast(double.class, _mintimelong)) && RemoteObject.solveBoolean("g",_currtimelong,BA.numberCast(double.class, _maxtimelong))) { 
if (true) return vb6.mostCurrent.__c.getField(true,"True");};
 }else {
 BA.debugLineNum = 91;BA.debugLine="If currTimeLong <= minTimeLong AND cur";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("k",_currtimelong,BA.numberCast(double.class, _mintimelong)) && RemoteObject.solveBoolean("k",_currtimelong,BA.numberCast(double.class, _maxtimelong))) { 
if (true) return vb6.mostCurrent.__c.getField(true,"True");};
 };
 };
 BA.debugLineNum = 94;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return vb6.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ubound(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("UBound (vb6) ","vb6",7,_ba,vb6.mostCurrent,25);
if (RapidSub.canDelegate("ubound")) { return b4a.raks.vb6.remoteMe.runUserSub(false, "vb6","ubound", _ba, _str);}
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 25;BA.debugLine="Sub UBound(str() As String) As Long";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return str.Length";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(long.class, _str.getField(true,"length"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}