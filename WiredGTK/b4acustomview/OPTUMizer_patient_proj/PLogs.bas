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
	Dim btnHome As Panel
	Dim btnUpdates As Panel
	Dim btnProfile As Panel
	Dim btnQr As Panel
	Dim lblText1 As Label
	Dim lblText2 As Label
	Dim lblText3 As Label
	Dim lbl_dateTime1 As Label
	Dim lbl_dateTime2 As Label
	Dim lbl_dateTime3 As Label

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
	btnHome.Initialize("btnHome")
	btnUpdates.Initialize("btnUpdates")
	btnProfile.Initialize("btnProfile")
	btnQr.Initialize("btnQr")
	lblText1.Initialize("lblText1")
	lblText2.Initialize("lblText2")
	lblText3.Initialize("lblText3")
	lbl_dateTime1.Initialize("lbl_dateTime1")
	lbl_dateTime2.Initialize("lbl_dateTime2")
	lbl_dateTime3.Initialize("lbl_dateTime3")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub init_Plogs
	btnHome.Color =  0x00001f59
	btnUpdates.Color =  0x00001f59
	btnProfile.Color =  0x00001f59
	btnQr.Color =  0x00001f59
	lblText1.Color =  0x00ffffff
	lblText1.TextColor = 0xff000000
	lblText1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblText1.Text = ""
	lblText2.Color =  0x00ffffff
	lblText2.TextColor = 0xff000000
	lblText2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblText2.Text = ""
	lblText3.Color =  0x00ffffff
	lblText3.TextColor = 0xff000000
	lblText3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblText3.Text = ""
	lbl_dateTime1.Color =  0x00ffffff
	lbl_dateTime1.TextColor = 0xff000000
	lbl_dateTime1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_dateTime1.Text = ""
	lbl_dateTime2.Color =  0x00ffffff
	lbl_dateTime2.TextColor = 0xff000000
	lbl_dateTime2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_dateTime2.Text = ""
	lbl_dateTime3.Color =  0x00ffffff
	lbl_dateTime3.TextColor = 0xff000000
	lbl_dateTime3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_dateTime3.Text = ""
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"PatientLogsModule-0beda.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnHome,0.00 * mBase.Width,0.92 * mBase.Height,0.25 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnUpdates,0.38 * mBase.Width,0.92 * mBase.Height,0.25 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnProfile,0.01 * mBase.Width,0.01 * mBase.Height,0.19 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(btnQr,0.79 * mBase.Width,0.01 * mBase.Height,0.19 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(lblText1,0.27 * mBase.Width,0.17 * mBase.Height,0.72 * mBase.Width,0.14 * mBase.Height)
	mBase.AddView(lblText2,0.27 * mBase.Width,0.44 * mBase.Height,0.72 * mBase.Width,0.14 * mBase.Height)
	mBase.AddView(lblText3,0.27 * mBase.Width,0.69 * mBase.Height,0.72 * mBase.Width,0.14 * mBase.Height)
	mBase.AddView(lbl_dateTime1,0.60 * mBase.Width,0.12 * mBase.Height,0.38 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lbl_dateTime2,0.60 * mBase.Width,0.39 * mBase.Height,0.38 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lbl_dateTime3,0.60 * mBase.Width,0.64 * mBase.Height,0.38 * mBase.Width,0.05 * mBase.Height)

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnHome_click()
	Dim home As PHome
	home=Starter.PHome1
	home.Visible=True
	setVisible(False)
End Sub
Sub btnUpdates_click()
	Dim p_Update As PUpdates
	p_Update=Starter.PUpdates1
	p_Update.Visible=True
	setVisible(False)
End Sub
Sub btnProfile_click()
	Dim profile As PProfile
	profile=Starter.PProfile1
	profile.Visible=True
	setVisible(False)
End Sub
Sub btnQr_click()
	Dim qrCode As PQr
	qrCode=Starter.PQr1
	qrCode.Visible=True
	setVisible(False)
End Sub
Sub lblText1_click()
	'Reason for visit from encounters.csv
End Sub
Sub lblText2_click()
End Sub
Sub lblText3_click()
End Sub
Sub lbl_dateTime1_click()
End Sub
Sub lbl_dateTime2_click()
End Sub
Sub lbl_dateTime3_click()
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
