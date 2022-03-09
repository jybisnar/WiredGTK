
package b4a.raks;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class frmusercontrol {
    public static RemoteObject myClass;
	public frmusercontrol() {
	}
    public static PCBA staticBA = new PCBA(null, frmusercontrol.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _defaultcolorconstant = RemoteObject.createImmutable(0);
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _datagridtreeview1 = RemoteObject.declareNull("b4a.raks.table");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _mytimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _image1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _radiobutton1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _radiobutton2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _checkbutton1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkbutton2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static b4a.raks.main _main = null;
public static b4a.raks.starter _starter = null;
public static b4a.raks.vb6 _vb6 = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CheckButton1",_ref.getField(false, "_checkbutton1"),"CheckButton2",_ref.getField(false, "_checkbutton2"),"DatagridTreeView1",_ref.getField(false, "_datagridtreeview1"),"DefaultColorConstant",_ref.getField(false, "_defaultcolorconstant"),"Image1",_ref.getField(false, "_image1"),"Label1",_ref.getField(false, "_label1"),"Label2",_ref.getField(false, "_label2"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mytimer",_ref.getField(false, "_mytimer"),"RadioButton1",_ref.getField(false, "_radiobutton1"),"RadioButton2",_ref.getField(false, "_radiobutton2"),"Timer1",_ref.getField(false, "_timer1")};
}
}