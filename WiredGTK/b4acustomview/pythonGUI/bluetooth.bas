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
	Dim imgconnect as ImageView
	Dim imgdisconnect as ImageView
	Dim Timer1 As Timer
	Dim Label2 as Label

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
	imgconnect.Initialize("imgconnect")
	imgdisconnect.Initialize("imgdisconnect")
	Timer1.Initialize("Timer1",1000)
	Timer1.Enabled = True
	Label2.Initialize("Label2")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(imgconnect,0.08 * mBase.Width,0.18 * mBase.Height,0.43 * mBase.Width,0.14 * mBase.Height)
	imgconnect.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",imgconnect.Width,imgconnect.Height,true)
	mBase.AddView(imgdisconnect,0.61 * mBase.Width,0.21 * mBase.Height,0.20 * mBase.Width,0.07 * mBase.Height)
	imgdisconnect.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",imgdisconnect.Width,imgdisconnect.Height,true)
	Label2.Color =  0x00ffffff
	Label2.TextColor = 0xff000000
	Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label2.Text = "Label1"
	mBase.AddView(Label2,0.26 * mBase.Width,0.05 * mBase.Height,0.33 * mBase.Width,0.06 * mBase.Height)

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub imgconnect_click()
End Sub
Sub imgdisconnect_click()
End Sub
Sub Timer1_Tick()
End Sub
Sub Label2_click()
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub