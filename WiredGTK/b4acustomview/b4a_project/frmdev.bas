B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
#Event: ExampleEvent2)
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
	Dim Image1 As ImageView
	Dim ComboBoxText1 As Spinner
	Dim Label1 As Label
	Dim CheckButton1 As CheckBox
	Dim DatagridTreeView1 As Table
	Dim Timer1 As Timer
	Dim x As Int
	Dim Layout1 As Panel
	Dim CheckButton2 As CheckBox
	Dim RadioButton1 As RadioButton
	Dim ListBox1 As ListView
	Dim Layout2 As ScrollView
	Dim Entry1 As EditText
	Dim Button1 As Button
	Dim Button2 As Button
	Dim Image2 As ImageView
	Dim Image3 As ImageView
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
	Image1.Initialize("Image1")
	ComboBoxText1.Initialize("ComboBoxText1")
	ComboBoxText1.AddAll(Array As String("Sunday", "Monday"))
	Label1.Initialize("Label1")
	CheckButton1.Initialize("CheckButton1")
	DatagridTreeView1.Initialize(Me,"DatagridTreeView1",4)
	'DatagridTreeView1.LoadTableFromCSV(Dir, Filename, HeadersExist)
	'vb6.SetDataGrid(Activity,Main.SQL,DatagridTreeView1,"History")
	Timer1.Initialize("Timer1",1000)
	Timer1.Enabled = True
	Layout1.Initialize("Layout1")
	CheckButton2.Initialize("CheckButton2")
	RadioButton1.Initialize("RadioButton1")
	ListBox1.Initialize("ListBox1")
	ListBox1.AddSingleLine("My ListView")
	ListBox1.AddSingleLine("My ListView")
	ListBox1.AddSingleLine("My ListView")
	ListBox1.AddSingleLine("My ListView")
	
	Layout2.Initialize(108.60%y)
	Layout2.Tag=210
	Entry1.Initialize("Entry1")
	Button1.Initialize("Button1")
	Button2.Initialize("Button2")
	Image2.Initialize("Image2")
	Image3.Initialize("Image3")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.02 * mBase.Width,0.80 * mBase.Height,0.25 * mBase.Width,0.23 * mBase.Height)
	mBase.AddView(ComboBoxText1,0.49 * mBase.Width,0.24 * mBase.Height,0.40 * mBase.Width,0.09 * mBase.Height)
	ComboBoxText1.Color =  0xff964f4f
	ComboBoxText1.DropdownBackgroundColor =  0xff964f4f
	ComboBoxText1.DropdownTextColor =  0xff5663c1
	ComboBoxText1.TextColor =  0xff5663c1
	Label1.Color =  0x00ffffff
	Label1.TextColor = 0xff000000
	Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label1.Text = "Label1"
	mBase.AddView(Label1,0.49 * mBase.Width,0.12 * mBase.Height,0.18 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(CheckButton1,0.49 * mBase.Width,0.03 * mBase.Height,0.15 * mBase.Width,0.06 * mBase.Height)
	DatagridTreeView1.AddToParent(mBase,0.01 * mBase.Width,0.39 * mBase.Height,0.47 * mBase.Width,0.26 * mBase.Height)
	'DatagridTreeView1.LoadTableFromCSV(File.DirAssets, "datus.csv", True)
	DatagridTreeView1.SetDatagrid(Array As String ("A","B","C"),Array(Array As String("1","2","3"),Array As String("4","5","6")))
	mBase.AddView(Layout1,0.26 * mBase.Width,0.66 * mBase.Height,0.39 * mBase.Width,0.32 * mBase.Height)
	Layout1.Color =  0xffffc6c1
	Layout1.AddView(CheckButton2,0.00 * Layout1.Width,0.00 * Layout1.Height,0.37 * Layout1.Width,0.20 * Layout1.Height)
	Layout1.AddView(RadioButton1,0.00 * Layout1.Width,0.30 * Layout1.Height,0.37 * Layout1.Width,0.20 * Layout1.Height)
	mBase.AddView(ListBox1,0.51 * mBase.Width,0.37 * mBase.Height,0.37 * mBase.Width,0.25 * mBase.Height)
	ListBox1.Color =  0xff262bc4
	ListBox1.SingleLineLayout.Label.Color =  0xff2dc426
	mBase.AddView(Layout2,0.00 * mBase.Width,0.00 * mBase.Height,0.65 * mBase.Width,1.09 * mBase.Height)
	Layout2.Color =  0xff5e6bb5
	Layout2.Panel.AddView(Entry1,0.24 * Layout2.Width,0.01 * Layout2.Height,0.48 * Layout2.Width,0.06 * Layout2.Height)
	Layout2.Panel.AddView(Button1,0.10 * Layout2.Width,0.31 * Layout2.Height,0.28 * Layout2.Width,0.10 * Layout2.Height)
	Layout2.Panel.AddView(Button2,0.34 * Layout2.Width,0.07 * Layout2.Height,0.28 * Layout2.Width,0.10 * Layout2.Height)
	Layout2.Panel.AddView(Image2,0.58 * Layout2.Width,0.18 * Layout2.Height,0.28 * Layout2.Width,0.10 * Layout2.Height)
	Image2.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image2.Width,Image2.Height,True)
	Layout2.Panel.AddView(Image3,0.38 * Layout2.Width,0.90 * Layout2.Height,0.28 * Layout2.Width,0.10 * Layout2.Height)
	Image3.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image3.Width,Image3.Height,True)

	Layout2.Height=30%y
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
	ToastMessageShow("Hello",False)	
End Sub
Sub ComboBoxText1_ItemClick (Position As Int, Value As Object)
	
End Sub
Sub Label1_click()
	If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
		CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
	End If
End Sub
Sub CheckButton1_CheckedChange(Checked As Boolean)
End Sub

Public Sub getVisible() As Boolean
	Return mBase.Visible
End Sub
Public Sub setVisible(flag As Boolean)
	mBase.Visible=flag
End Sub
Public Sub SetLayout(Left As Int,Top As Int,Width As Int,Height As Int)
	mBase.SetLayout(Left,Top,Width,Height )
End Sub
Sub DatagridTreeView1_CellClick (Col As Int, Row As Int)
	Log("CellClick: " & Col & " , " & Row)
	Dim val As String = DatagridTreeView1.GetValue(Col, Row)
	ToastMessageShow(val,False)
End Sub
Sub Timer1_Tick()
	x=x+1	
	Label1.Text=x	
End Sub

Sub Layout2_click()
End Sub
Sub Entry1_click()
End Sub
Sub Button1_click()
	ToastMessageShow("but1",False)
End Sub
Sub Button2_click()
	ToastMessageShow("but2",False)
End Sub
Sub Image2_click()
	ToastMessageShow("img",False)
End Sub
Sub RadioButton1_CheckedChange(Checked As Boolean)
	Layout1.Visible=False
End Sub
Sub ListBox1_ItemClick (Position As Int, Value As Object)
End Sub

