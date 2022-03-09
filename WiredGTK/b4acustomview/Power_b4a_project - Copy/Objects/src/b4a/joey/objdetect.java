package b4a.joey;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class objdetect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.joey.objdetect");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.joey.objdetect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _obj1 = 0;
public int _obj2 = 0;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public int _max1 = 0;
public int _max2 = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public b4a.joey.main _main = null;
public b4a.joey.starter _starter = null;
public b4a.joey.vb6 _vb6 = null;
public String  _check() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub check()";
 //BA.debugLineNum = 48;BA.debugLine="If obj1>=MAX1 Then";
if (_obj1>=_max1) { 
 //BA.debugLineNum = 49;BA.debugLine="label1.TextColor=Colors.Red";
_label1.setTextColor(__c.Colors.Red);
 };
 //BA.debugLineNum = 53;BA.debugLine="If obj2>=MAX2 Then";
if (_obj2>=_max2) { 
 //BA.debugLineNum = 54;BA.debugLine="label2.TextColor=Colors.Red";
_label2.setTextColor(__c.Colors.Red);
 };
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim obj1 As Int=0";
_obj1 = (int) (0);
 //BA.debugLineNum = 3;BA.debugLine="Dim obj2 As Int=0";
_obj2 = (int) (0);
 //BA.debugLineNum = 4;BA.debugLine="Dim timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 5;BA.debugLine="Dim MAX1 As Int=10";
_max1 = (int) (10);
 //BA.debugLineNum = 6;BA.debugLine="Dim MAX2 As Int=10";
_max2 = (int) (10);
 //BA.debugLineNum = 7;BA.debugLine="Dim label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.LabelWrapper _lb1,anywheresoftware.b4a.objects.LabelWrapper _lb2,anywheresoftware.b4a.objects.LabelWrapper _lb3) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(lb1 As Label,lb2 As Label,lb";
 //BA.debugLineNum = 14;BA.debugLine="timer1.Initialize(\"Timer1\", 2000)";
_timer1.Initialize(ba,"Timer1",(long) (2000));
 //BA.debugLineNum = 15;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 16;BA.debugLine="label1=lb1";
_label1 = _lb1;
 //BA.debugLineNum = 17;BA.debugLine="label2=lb2";
_label2 = _lb2;
 //BA.debugLineNum = 18;BA.debugLine="label3=lb3";
_label3 = _lb3;
 //BA.debugLineNum = 19;BA.debugLine="lb1.Text=0";
_lb1.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 20;BA.debugLine="lb2.Text=0";
_lb2.setText(BA.ObjectToCharSequence(0));
 //BA.debugLineNum = 21;BA.debugLine="lb3.Text=\"\"";
_lb3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public int  _objectdetected(String _x) throws Exception{
String[] _arr = null;
int[] _value = null;
int _a = 0;
 //BA.debugLineNum = 28;BA.debugLine="public Sub objectdetected(x As String) As Int";
 //BA.debugLineNum = 29;BA.debugLine="Dim arr() As String = Array As String(\"Bottle\",\"C";
_arr = new String[]{"Bottle","Cup","Can","Box"};
 //BA.debugLineNum = 30;BA.debugLine="Dim value() As Int = Array As Int(1,1,2,2)";
_value = new int[]{(int) (1),(int) (1),(int) (2),(int) (2)};
 //BA.debugLineNum = 31;BA.debugLine="For a=0 To arr.Length-1";
{
final int step3 = 1;
final int limit3 = (int) (_arr.length-1);
_a = (int) (0) ;
for (;_a <= limit3 ;_a = _a + step3 ) {
 //BA.debugLineNum = 32;BA.debugLine="If x.Contains(arr(a)) Then";
if (_x.contains(_arr[_a])) { 
 //BA.debugLineNum = 33;BA.debugLine="label3.Text=x";
_label3.setText(BA.ObjectToCharSequence(_x));
 //BA.debugLineNum = 34;BA.debugLine="If  value(a)=1 Then";
if (_value[_a]==1) { 
 //BA.debugLineNum = 35;BA.debugLine="obj1=obj1+1";
_obj1 = (int) (_obj1+1);
 };
 //BA.debugLineNum = 37;BA.debugLine="If  value(a)=2 Then";
if (_value[_a]==2) { 
 //BA.debugLineNum = 38;BA.debugLine="obj2=obj2+1";
_obj2 = (int) (_obj2+1);
 };
 };
 }
};
 //BA.debugLineNum = 42;BA.debugLine="label1.Text=obj1";
_label1.setText(BA.ObjectToCharSequence(_obj1));
 //BA.debugLineNum = 43;BA.debugLine="label2.Text=obj2";
_label2.setText(BA.ObjectToCharSequence(_obj2));
 //BA.debugLineNum = 44;BA.debugLine="check";
_check();
 //BA.debugLineNum = 45;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return 0;
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 25;BA.debugLine="check";
_check();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
