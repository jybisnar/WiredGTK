
package b4a.raks;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class wtaserver {
    public static RemoteObject myClass;
	public wtaserver() {
	}
    public static PCBA staticBA = new PCBA(null, wtaserver.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _wsh = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _wtaserverio = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _connected = RemoteObject.createImmutable(false);
public static RemoteObject _myid = RemoteObject.createImmutable("");
public static RemoteObject _clientid = RemoteObject.createImmutable("");
public static RemoteObject _tmrwtaserver = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static b4a.raks.main _main = null;
public static b4a.raks.starter _starter = null;
public static b4a.raks.vb6 _vb6 = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clientid",_ref.getField(false, "_clientid"),"connected",_ref.getField(false, "_connected"),"mEventName",_ref.getField(false, "_meventname"),"mModule",_ref.getField(false, "_mmodule"),"myid",_ref.getField(false, "_myid"),"tmrwtaserver",_ref.getField(false, "_tmrwtaserver"),"wsh",_ref.getField(false, "_wsh"),"wtaserverIO",_ref.getField(false, "_wtaserverio")};
}
}