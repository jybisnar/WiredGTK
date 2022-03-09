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
	Dim Image1 As ImageView
	Dim btnLogIn As Panel
	Dim txtID As Label
	Dim txtPassword As Label
	'Dim txtID As EditText
	'Dim txtPassword As EditText
	'Dim ListBox1 As ListView
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
	btnLogIn.Initialize("btnLogIn")
	txtID.Initialize("txtID")
	txtPassword.Initialize("txtPassword")
	'ListBox1.Initialize("ListBox1")
	'ListBox1.AddSingleLine("My ListView1")
	'ListBox1.AddSingleLine("My ListView2")
	'ListBox1.AddSingleLine("My ListView3")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Sub initPLogin
	'txtID.TextColor=Colors.Blue
	'txtPassword.TextColor=Colors.Red
	btnLogIn.Color =  0x00001f59
	txtID.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	txtID.Color =  0x00ffffff
	txtID.TextColor = 0xff000000
	txtID.Text = ""
	txtPassword.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	txtPassword.Color =  0x00ffffff
	txtPassword.TextColor = 0xff000000
	txtPassword.Text = ""
	
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.01 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"LoginModule-bf106.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnLogIn,0.12 * mBase.Width,0.80 * mBase.Height,0.76 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(txtID,0.14 * mBase.Width,0.70 * mBase.Height,0.75 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(txtPassword,0.14 * mBase.Width,0.70 * mBase.Height,0.75 * mBase.Width,0.06 * mBase.Height)
	
	initPLogin
	
	
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnLogIn_click()
	Dim home As PHome
	home=Starter.PHome1
	home.Visible=True
	'home.lblplastic.Text="Joey"
	setVisible(False)
End Sub
Sub txtID_click()
	'ID must match with the ID in patients.csv
End Sub
Sub txtPassword_click()
	'random password for now
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

Public Sub GetBase As Panel
	Return mBase
End Sub
