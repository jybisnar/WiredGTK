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
	Dim btnSetAppointment As Panel
	Dim btnBack As Panel
	Dim btnQrReader As Panel
	Dim lblName As Label
	Dim lblDesc As Label
	Dim lblID As Label

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
	btnSetAppointment.Initialize("btnSetAppointment")
	btnBack.Initialize("btnBack")
	btnQrReader.Initialize("btnQrReader")
	lblName.Initialize("lblName")
	lblDesc.Initialize("lblDesc")
	lblID.Initialize("lblID")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub initDpatientHistory
	btnSetAppointment.Color =  0x0000979f
	btnBack.Color =  0x00008b67
	btnQrReader.Color =  0x00008b67
	lblName.Color =  0x00ffffff
	lblName.TextColor = 0xff000000
	lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblName.Text = ""
	lblDesc.Color =  0x00ffffff
	lblDesc.TextColor = 0xff000000
	lblDesc.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblDesc.Text = ""
	lblID.Color =  0x00ffffff
	lblID.TextColor = 0xff000000
	lblID.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblID.Text = ""
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"MedicalHistory-4cd35.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnSetAppointment,0.49 * mBase.Width,0.34 * mBase.Height,0.46 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(btnBack,0.06 * mBase.Width,0.02 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnQrReader,0.81 * mBase.Width,0.02 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lblName,0.40 * mBase.Width,0.12 * mBase.Height,0.56 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lblDesc,0.06 * mBase.Width,0.41 * mBase.Height,0.88 * mBase.Width,0.55 * mBase.Height)
	mBase.AddView(lblID,0.40 * mBase.Width,0.20 * mBase.Height,0.56 * mBase.Width,0.05 * mBase.Height)

	initDpatientHistory
	
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnSetAppointment_click()
End Sub
Sub btnBack_click()
	Dim patient As DPatientProf
	patient=Starter.DPatientProf1
	patient.Visible=True
	setVisible(False)
End Sub
Sub btnQrReader_click()
	Dim qrReader As DQrReader
	qrReader=Starter.DQrReader1
	qrReader.Visible=True
	setVisible(False)
End Sub
Sub lblName_click()
End Sub
Sub lblDesc_click()
End Sub
Sub lblID_click()
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
