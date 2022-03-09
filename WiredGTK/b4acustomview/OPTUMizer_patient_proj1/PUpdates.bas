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
	Dim btnProfile As Panel
	Dim btnHome As Panel
	Dim btnLogs As Panel
	Dim btnQr As Panel

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
	btnProfile.Initialize("btnProfile")
	btnHome.Initialize("btnHome")
	btnLogs.Initialize("btnLogs")
	btnQr.Initialize("btnQr")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub init_PUpdates
	btnProfile.Color =  0x0000ab5b
	btnHome.Color =  0x0000c96a
	btnLogs.Color =  0x0000c96a
	btnQr.Color =  0x0000ab5b
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"NewsModule-9b7ab.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnProfile,0.04 * mBase.Width,0.01 * mBase.Height,0.14 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(btnHome,0.00 * mBase.Width,0.92 * mBase.Height,0.26 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(btnLogs,0.73 * mBase.Width,0.92 * mBase.Height,0.26 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(btnQr,0.82 * mBase.Width,0.01 * mBase.Height,0.14 * mBase.Width,0.08 * mBase.Height)

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnProfile_click()
	Dim profile As PProfile
	profile=Starter.PProfile1
	profile.Visible=True
	setVisible(False)
End Sub
Sub btnHome_click()
	Dim home As PHome
	home=Starter.PHome1
	home.Visible=True
	setVisible(False)
End Sub
Sub btnLogs_click()
	Dim p_Log As PLogs
	p_Log=Starter.PLogs1
	p_Log.Visible=True
	setVisible(False)
End Sub
Sub btnQr_click()
	Dim qrCode As PQr
	qrCode=Starter.PQr1
	qrCode.Visible=True
	setVisible(False)
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
