package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textarea1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4a.objects.collections.List _list1 = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 23;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 15;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 16;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\") 'Load the";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
 //BA.debugLineNum = 17;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 18;BA.debugLine="list1.Initialize";
_list1.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
anywheresoftware.b4a.objects.collections.Map _a = null;
 //BA.debugLineNum = 26;BA.debugLine="Sub Button1_Click";
 //BA.debugLineNum = 27;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 28;BA.debugLine="a.Initialize";
_a.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="a.Put(\"1\",\"wwwed\")";
_a.Put((Object)("1"),(Object)("wwwed"));
 //BA.debugLineNum = 30;BA.debugLine="a.Put(\"1232\",\"wwwed\")";
_a.Put((Object)("1232"),(Object)("wwwed"));
 //BA.debugLineNum = 31;BA.debugLine="a.Put(\"123\",\"wwwed\")";
_a.Put((Object)("123"),(Object)("wwwed"));
 //BA.debugLineNum = 32;BA.debugLine="TextArea1.Text=a.Get(\"123\")";
_textarea1.setText(BA.ObjectToString(_a.Get((Object)("123"))));
 //BA.debugLineNum = 33;BA.debugLine="Label1.Text=a.Get(\"123\")";
_label1.setText(BA.ObjectToString(_a.Get((Object)("123"))));
 //BA.debugLineNum = 34;BA.debugLine="Log(a.Get(\"123\"))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_a.Get((Object)("123"))));
 //BA.debugLineNum = 35;BA.debugLine="list1.Add(a)";
_list1.Add((Object)(_a.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private TextArea1 As TextArea";
_textarea1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
}
