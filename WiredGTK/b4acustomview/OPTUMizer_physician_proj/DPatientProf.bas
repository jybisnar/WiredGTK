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
	Dim btnPrescription As Panel
	Dim btnBack As Panel
	Dim btnQrReader As Panel
	Dim lblPatientName As Label
	Dim lblDesc1 As Label
	Dim lblAdherence As Label
	Dim lblPatientID As Label
	Dim lblEncounter As Label
	Dim btnMedHistory As Panel
	Dim btnHome As Panel
	Dim btnLogs As Panel

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
	btnPrescription.Initialize("btnPrescription")
	btnBack.Initialize("btnBack")
	btnQrReader.Initialize("btnQrReader")
	lblPatientName.Initialize("lblPatientName")
	lblDesc1.Initialize("lblDesc1")
	lblAdherence.Initialize("lblAdherence")
	lblPatientID.Initialize("lblPatientID")
	lblEncounter.Initialize("lblEncounter")
	btnMedHistory.Initialize("btnMedHistory")
	btnHome.Initialize("btnHome")
	btnLogs.Initialize("btnLogs")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub initDpatientProfile
	btnPrescription.Color =  0x0000979f
	btnBack.Color =  0x00008b67
	btnQrReader.Color =  0x00008b67
	btnMedHistory.Color =  0x0000979f
	btnLogs.Color =  0x0000979f
	btnHome.Color =  0x0000979f
	lblPatientName.Color =  0x00ffffff
	lblPatientName.TextColor = 0xff000000
	lblPatientName.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblPatientName.Text = ""
	lblDesc1.Color =  0x00ffffff
	lblDesc1.TextColor = 0xff000000
	lblDesc1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.LEFT
	lblDesc1.Text = ""
	lblAdherence.Color =  0x00ffffff
	lblAdherence.TextColor = 0xff000000
	lblAdherence.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblAdherence.Text = ""
	lblPatientID.Color =  0x00ffffff
	lblPatientID.TextColor = 0xff000000
	lblPatientID.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblPatientID.Text = ""
	lblEncounter.Color =  0x00ffffff
	lblEncounter.TextColor = 0xff000000
	lblEncounter.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblEncounter.Text = ""
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"PatientProfile-12bf4.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnPrescription,0.06 * mBase.Width,0.76 * mBase.Height,0.88 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnBack,0.05 * mBase.Width,0.01 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnQrReader,0.81 * mBase.Width,0.02 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lblPatientName,0.36 * mBase.Width,0.11 * mBase.Height,0.57 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lblDesc1,0.06 * mBase.Width,0.34 * mBase.Height,0.88 * mBase.Width,0.40 * mBase.Height)
	mBase.AddView(lblAdherence,0.36 * mBase.Width,0.18 * mBase.Height,0.59 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(lblPatientID,0.36 * mBase.Width,0.22 * mBase.Height,0.59 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblEncounter,0.35 * mBase.Width,0.29 * mBase.Height,0.59 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(btnMedHistory,0.06 * mBase.Width,0.84 * mBase.Height,0.88 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnHome,0.33 * mBase.Width,0.93 * mBase.Height,0.17 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnLogs,0.51 * mBase.Width,0.93 * mBase.Height,0.19 * mBase.Width,0.06 * mBase.Height)
	
	initDpatientProfile
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnPrescription_click()
	Dim gamot As DPatientPrescription
	gamot=Starter.DPatientPrescription1
	gamot.Visible=True
	setVisible(False)
End Sub
Sub btnBack_click()
	Dim logs As DLogs
	logs=Starter.DLogs1
	logs.Visible=True
	setVisible(False)
End Sub
Sub btnQrReader_click()
	Dim qrReader As DQrReader
	qrReader=Starter.DQrReader1
	qrReader.Visible=True
	setVisible(False)
End Sub
Sub btnMedHistory_click()
	Dim medHis As DPatientMedHistory
	medHis=Starter.DPatientMedHistory1
	medHis.Visible=True
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

Sub lblPatientName_click()
End Sub
Sub lblDesc1_click()
End Sub
Sub lblAdherence_click()
End Sub
Sub lblPatientID_click()
End Sub
Sub lblEncounter_click()
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
