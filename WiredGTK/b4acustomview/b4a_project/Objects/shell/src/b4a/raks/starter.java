
package b4a.raks;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "b4a.raks.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.raks.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sms_rx = RemoteObject.declareNull("anywheresoftware.b4a.phone.PhoneEvents.SMSInterceptor");
public static RemoteObject _sms = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneSms");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _astream = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _connected_bt = RemoteObject.createImmutable(false);
public static RemoteObject _serial1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Serial");
public static RemoteObject _msec_ = RemoteObject.createImmutable(0);
public static RemoteObject _customview = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _bluetoothview = RemoteObject.declareNull("Object");
public static RemoteObject _wsh = RemoteObject.declareNull("b4a.raks.wtaserver");
public static RemoteObject _myparser = RemoteObject.declareNull("b4a.raks.clsparser");
public static RemoteObject _parse1 = RemoteObject.declareNull("b4a.raks.clsparser");
public static RemoteObject _myparserserial = RemoteObject.declareNull("b4a.raks.clsparser");
public static b4a.raks.main _main = null;
public static b4a.raks.vb6 _vb6 = null;
  public Object[] GetGlobals() {
		return new Object[] {"astream",starter._astream,"bluetoothview",starter._bluetoothview,"connected_BT",starter._connected_bt,"customview",starter._customview,"Main",Debug.moduleToString(b4a.raks.main.class),"msec_",starter._msec_,"myparser",starter._myparser,"myparserserial",starter._myparserserial,"parse1",starter._parse1,"Serial1",starter._serial1,"Service",starter.mostCurrent._service,"sms",starter._sms,"sms_rx",starter._sms_rx,"timer1",starter._timer1,"vb6",Debug.moduleToString(b4a.raks.vb6.class),"wsh",starter._wsh};
}
}