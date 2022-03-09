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
	Dim btnQrReader As Panel
	Dim btnSchedule As Panel
	Dim btnContact As Panel
	Dim btnLogs As Panel
	Dim lblName As Label
	Dim lblProgress As Label
	Dim d_Notif1 As Label
	Dim d_Notif2 As Label

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
	btnQrReader.Initialize("btnQrReader")
	btnSchedule.Initialize("btnSchedule")
	btnContact.Initialize("btnContact")
	btnLogs.Initialize("btnLogs")
	lblName.Initialize("lblName")
	lblProgress.Initialize("lblProgress")
	d_Notif1.Initialize("d_Notif1")
	d_Notif2.Initialize("d_Notif2")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub initDHome
	btnProfile.Color =  0x00008125
	btnQrReader.Color =  0x00008125
	btnSchedule.Color =  0x00008125
	btnContact.Color =  0x00008125
	btnLogs.Color =  0x00008125
	lblName.Color =  0x00ffffff
	lblName.TextColor = 0xff000000
	lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblName.Text = ""
	lblProgress.Color =  0x00ffffff
	lblProgress.TextColor = 0xff000000
	lblProgress.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblProgress.Text = ""
	d_Notif1.Color =  0x00ffffff
	d_Notif1.TextColor = 0xff000000
	d_Notif1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	d_Notif1.Text = ""
	d_Notif2.Color =  0x00ffffff
	d_Notif2.TextColor = 0xff000000
	d_Notif2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	d_Notif2.Text = ""
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"HomeModule-5ae79.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnProfile,0.05 * mBase.Width,0.01 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnQrReader,0.82 * mBase.Width,0.01 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnSchedule,0.54 * mBase.Width,0.22 * mBase.Height,0.40 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(btnContact,0.54 * mBase.Width,0.45 * mBase.Height,0.37 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(btnLogs,0.49 * mBase.Width,0.93 * mBase.Height,0.17 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(lblName,0.05 * mBase.Width,0.11 * mBase.Height,0.88 * mBase.Width,0.10 * mBase.Height)
	mBase.AddView(lblProgress,0.09 * mBase.Width,0.33 * mBase.Height,0.83 * mBase.Width,0.11 * mBase.Height)
	mBase.AddView(d_Notif1,0.25 * mBase.Width,0.60 * mBase.Height,0.64 * mBase.Width,0.11 * mBase.Height)
	mBase.AddView(d_Notif2,0.25 * mBase.Width,0.74 * mBase.Height,0.64 * mBase.Width,0.11 * mBase.Height)

	initDHome
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnProfile_click()
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
Sub btnSchedule_click()
	Dim schedule As DSchedule
	schedule=Starter.DSchedule1
	schedule.Visible=True
	setVisible(False)
End Sub
Sub btnContact_click()
	'overlay of patient
End Sub
Sub btnLogs_click()
	Dim logs As DLogs
	logs=Starter.DLogs1
	logs.Visible=True
	setVisible(False)
End Sub
Sub lblName_click()
End Sub
Sub lblProgress_click()
End Sub
Sub d_Notif1_click()
End Sub
Sub d_Notif2_click()
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
