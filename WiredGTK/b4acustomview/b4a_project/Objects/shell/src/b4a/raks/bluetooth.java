
package b4a.raks;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bluetooth {
    public static RemoteObject myClass;
	public bluetooth() {
	}
    public static PCBA staticBA = new PCBA(null, bluetooth.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _defaultcolorconstant = RemoteObject.createImmutable(0);
public static RemoteObject _imgconnect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _imgdisconnect = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static b4a.raks.main _main = null;
public static b4a.raks.starter _starter = null;
public static b4a.raks.vb6 _vb6 = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DefaultColorConstant",_ref.getField(false, "_defaultcolorconstant"),"imgconnect",_ref.getField(false, "_imgconnect"),"imgdisconnect",_ref.getField(false, "_imgdisconnect"),"Label2",_ref.getField(false, "_label2"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Timer1",_ref.getField(false, "_timer1")};
}
}