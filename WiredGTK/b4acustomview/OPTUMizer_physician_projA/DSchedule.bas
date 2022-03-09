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
	Dim btnBack As Panel
	Dim btnQrReader As Panel
	Dim lblTitlea As Label
	Dim lblTitleb As Label
	Dim lblTitlec As Label
	Dim btnHome As Panel
	Dim btnLogs As Panel
	Dim lblTitled As Label

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
	btnBack.Initialize("btnBack")
	btnQrReader.Initialize("btnQrReader")
	lblTitlea.Initialize("lblTitlea")
	lblTitleb.Initialize("lblTitleb")
	lblTitlec.Initialize("lblTitlec")
	btnHome.Initialize("btnHome")
	btnLogs.Initialize("btnLogs")
	lblTitled.Initialize("lblTitled")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub initDSchedule
	btnBack.Color =  0x0000e6ed
	btnQrReader.Color =  0x0000e6ed
	btnHome.Color =  0x00006224
	btnLogs.Color =  0x00006224
	lblTitlea.Color =  0x00ffffff
	lblTitlea.TextColor = 0xff000000
	lblTitlea.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblTitlea.Text = ""
	lblTitleb.Color =  0x00ffffff
	lblTitleb.TextColor = 0xff000000
	lblTitleb.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblTitleb.Text = ""
	lblTitlec.Color =  0x00ffffff
	lblTitlec.TextColor = 0xff000000
	lblTitlec.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblTitlec.Text = ""
	lblTitled.Color =  0x00ffffff
	lblTitled.TextColor = 0xff000000
	lblTitled.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblTitled.Text = ""
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"CalendarModule-3ab08.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnBack,0.04 * mBase.Width,0.01 * mBase.Height,0.16 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(btnQrReader,0.80 * mBase.Width,0.01 * mBase.Height,0.16 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(lblTitlea,0.21 * mBase.Width,0.14 * mBase.Height,0.72 * mBase.Width,0.15 * mBase.Height)
	mBase.AddView(lblTitleb,0.21 * mBase.Width,0.33 * mBase.Height,0.72 * mBase.Width,0.15 * mBase.Height)
	mBase.AddView(lblTitlec,0.21 * mBase.Width,0.52 * mBase.Height,0.72 * mBase.Width,0.15 * mBase.Height)
	mBase.AddView(btnHome,0.31 * mBase.Width,0.92 * mBase.Height,0.17 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(btnLogs,0.51 * mBase.Width,0.92 * mBase.Height,0.17 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(lblTitled,0.21 * mBase.Width,0.71 * mBase.Height,0.72 * mBase.Width,0.15 * mBase.Height)
	
	initDSchedule
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnBack_click()
	Dim profile As DProfile
	profile=Starter.DProfile1
	profile.Visible=True
	setVisible(False)
End Sub
Sub btnQrReader_click()
	Dim qrReader As DQrReader
	qrReader=Starter.DQrReader1
	qrReader.Visible=True
	setVisible(False)
End Sub
Sub btnHome_click()
	Dim home As DHome
	home=Starter.DHome1
	home.Visible=True
	setVisible(False)
End Sub
Sub btnLogs_click()
	Dim logs As DLogs
	logs=Starter.DLogs1
	logs.Visible=True
	setVisible(False)
End Sub
Sub lblTitlea_click()
End Sub
Sub lblTitleb_click()
End Sub
Sub lblTitlec_click()
End Sub
Sub lblTitled_click()
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
