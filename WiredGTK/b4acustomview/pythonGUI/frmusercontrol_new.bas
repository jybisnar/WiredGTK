B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
	Dim Label1 as Label
	Dim Label2 as Label
	Dim DatagridTreeView1 as Table
	Dim Timer1 As Timer
	Dim mytimer As Timer
	Dim Image1 as ImageView
	Dim RadioButton1 as RadioButton
	Dim RadioButton2 as RadioButton
	Dim CheckButton1 as CheckBox
	Dim CheckButton2 as CheckBox

End Sub
'clsTest.Initialize(Me, "clsTest")
'clsTest.AddToParent(Activity,0,0,100%x,100%y)
Public Sub AddToParent(Parent As Activity, Left As Int, Top As Int, Width As Int,Height As Int)
	mBase.Initialize("mBase")
	Parent.AddView(mBase, Left, Top, Width, Height)
	GTKForms
End Sub
Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	Label1.Initialize("Label1")
	Label2.Initialize("Label2")
	DatagridTreeView1.Initialize(Me,"DatagridTreeView1",4)
	'DatagridTreeView1.LoadTableFromCSV(Dir, Filename, HeadersExist)
	'vb6.SetDataGrid(Activity,Main.SQL,DatagridTreeView1,"History")
	Timer1.Initialize("Timer1",1000)
	Timer1.Enabled = True
	mytimer.Initialize("mytimer",1000)
	mytimer.Enabled = True
	Image1.Initialize("Image1")
	RadioButton1.Initialize("RadioButton1")
	RadioButton2.Initialize("RadioButton2")
	CheckButton1.Initialize("CheckButton1")
	CheckButton2.Initialize("CheckButton2")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	Label1.Color =  0x00ffffff
	Label1.TextColor = 0xff000000
	Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label1.Text = "Label1"
	mBase.AddView(Label1,0.08 * mBase.Width,0.04 * mBase.Height,0.24 * mBase.Width,0.06 * mBase.Height)
	Label2.Color =  0x00ffffff
	Label2.TextColor = 0xff000000
	Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label2.Text = "Label2"
	mBase.AddView(Label2,0.39 * mBase.Width,0.04 * mBase.Height,0.24 * mBase.Width,0.06 * mBase.Height)
	DatagridTreeView1.AddToActivity(mBase,0.08 * mBase.Width,0.19 * mBase.Height,0.48 * mBase.Width,0.34 * mBase.Height)
	'DatagridTreeView1.LoadTableFromCSV(File.DirAssets, "datus.csv", True)
	'DatagridTreeView1.SetDatagrid(Array As String ("A","B","C"),Array(Array As String("1","2","3"),Array As String("4","5","6")))
	mBase.AddView(Image1,0.65 * mBase.Width,0.54 * mBase.Height,0.24 * mBase.Width,0.22 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image1.Width,Image1.Height,true)
	mBase.AddView(RadioButton1,0.59 * mBase.Width,0.16 * mBase.Height,0.19 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(RadioButton2,0.60 * mBase.Width,0.44 * mBase.Height,0.19 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(CheckButton1,0.09 * mBase.Width,0.56 * mBase.Height,0.19 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(CheckButton2,0.09 * mBase.Width,0.63 * mBase.Height,0.19 * mBase.Width,0.06 * mBase.Height)

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Label1_click()
End Sub
Sub Label2_click()
End Sub
Sub DatagridTreeView1_CellClick (Col As Int, Row As Int)
	Log("CellClick: " & Col & " , " & Row)
	Dim val As String = DatagridTreeView1.GetValue(Col, Row)
	ToastMessageShow(val,False)
End Sub
Sub Timer1_Tick()
End Sub
Sub mytimer_Tick()
End Sub
Sub Image1_click()
End Sub
Sub RadioButton1_CheckedChange(Checked As Boolean)
End Sub
Sub RadioButton2_CheckedChange(Checked As Boolean)
End Sub
Sub CheckButton1_CheckedChange(Checked As Boolean)
End Sub
Sub CheckButton2_CheckedChange(Checked As Boolean)
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub