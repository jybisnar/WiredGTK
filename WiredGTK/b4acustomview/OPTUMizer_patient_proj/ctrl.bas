B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
'Custom View class 
#Event: close (Value As Int)
#Event: mains (Value As Int) as object
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
	Dim Image2 As ImageView
	Dim Image3 As ImageView
	Dim Label2 As Label
	Dim ComboBoxText1 As Spinner
	Dim Timer1 As Timer
	Dim DatagridTreeView1 As Table
	Dim raks1 As raks
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
	Image2.Initialize("Image2")
	Image3.Initialize("Image3")
	Label2.Initialize("Label2")
	ComboBoxText1.Initialize("ComboBoxText1")
	ComboBoxText1.AddAll(Array As String("Sunday", "Monday"))
	Timer1.Initialize("Timer1",1000)
	Timer1.Enabled = True
	DatagridTreeView1.Initialize(Me,"DatagridTreeView1",4)
	'DatagridTreeView1.LoadTableFromCSV(Dir, Filename, HeadersExist)
	'vb6.SetDataGrid(Activity,Main.SQL,DatagridTreeView1,"History")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
public Sub mainData
	If SubExists(mCallBack,mEventName & "_" & "mains") Then
		raks1= CallSub2(mCallBack,mEventName & "_" & "mains",123)
	End If
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image2,0.08 * mBase.Width,0.34 * mBase.Height,0.43 * mBase.Width,0.14 * mBase.Height)
	Image2.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image2.Width,Image2.Height,True)
	mBase.AddView(Image3,0.70 * mBase.Width,0.23 * mBase.Height,0.20 * mBase.Width,0.07 * mBase.Height)
	Image3.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image3.Width,Image3.Height,True)
	Label2.Color =  0x00ffffff
	Label2.TextColor = 0xff000000
	Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label2.Text = "Label2"
	mBase.AddView(Label2,0.08 * mBase.Width,0.49 * mBase.Height,0.33 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(ComboBoxText1,0.57 * mBase.Width,0.32 * mBase.Height,0.33 * mBase.Width,0.05 * mBase.Height)
	DatagridTreeView1.AddToActivity(mBase,0.07 * mBase.Width,0.58 * mBase.Height,0.41 * mBase.Width,0.14 * mBase.Height)
	'DatagridTreeView1.LoadTableFromCSV(File.DirAssets, "datus.csv", True)
	'DatagridTreeView1.SetDatagrid(Array As String ("A","B","C"),Array(Array As String("1","2","3"),Array As String("4","5","6")))

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image2_click()
	Dim raksx As raks
	raksx=Starter.raksview
	raksx.Label2.Text="what the"
	raksx.Label3_click
End Sub
Sub Image3_click()
	If SubExists(mCallBack,mEventName & "_" & "close") Then
		CallSub2(mCallBack,mEventName & "_" & "close",123)
	End If
End Sub
Sub Label2_click()
End Sub
Sub ComboBoxText1_ItemClick (Position As Int, Value As Object)
	Label2.Text=Value
End Sub
Sub Timer1_Tick()
	Label2.Text=DateTime.GetSecond(DateTime.Now)
End Sub
Sub DatagridTreeView1_CellClick (Col As Int, Row As Int)
	Log("CellClick: " & Col & " , " & Row)
	Dim val As String = DatagridTreeView1.GetValue(Col, Row)
	ToastMessageShow(val,False)
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub