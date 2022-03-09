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
	Dim btnQr As Panel
	Dim btnMed As Panel
	Dim btnAppoint As Panel
	Dim lblTitlea As Label
	Dim lblTitleb As Label

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
	btnQr.Initialize("btnQr")
	btnMed.Initialize("btnMed")
	btnAppoint.Initialize("btnAppoint")
	lblTitlea.Initialize("lblTitlea")
	lblTitleb.Initialize("lblTitleb")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub init_PSchedule
	btnBack.Color =  0x0000e6ed
	btnQr.Color =  0x0000e6ed
	btnMed.Color =  0x0000e6ed
	btnAppoint.Color =  0x0000e6ed
	lblTitlea.Color =  0x00ffffff
	lblTitlea.TextColor = 0xff000000
	lblTitlea.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblTitlea.Text = ""
	lblTitleb.Color =  0x00ffffff
	lblTitleb.TextColor = 0xff000000
	lblTitleb.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblTitleb.Text = ""
	
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"ScheduleSubModule-6d6b7.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnBack,0.05 * mBase.Width,0.01 * mBase.Height,0.16 * mBase.Width,0.09 * mBase.Height)
	mBase.AddView(btnQr,0.81 * mBase.Width,0.01 * mBase.Height,0.16 * mBase.Width,0.09 * mBase.Height)
	mBase.AddView(btnMed,0.32 * mBase.Width,0.74 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnAppoint,0.80 * mBase.Width,0.75 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lblTitlea,0.06 * mBase.Width,0.81 * mBase.Height,0.38 * mBase.Width,0.15 * mBase.Height)
	mBase.AddView(lblTitleb,0.56 * mBase.Width,0.82 * mBase.Height,0.38 * mBase.Width,0.14 * mBase.Height)
	
	init_PSchedule
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnBack_click()
	Dim home As PHome
	home=Starter.PHome1
	home.Visible=True
	setVisible(False)
End Sub
Sub btnQr_click()
	Dim qrCode As PQr
	qrCode=Starter.PQr1
	qrCode.Visible=True
	setVisible(False)
End Sub
Sub btnMed_click()
	Dim p_Medication As PMedication
	p_Medication=Starter.PMedication1
	p_Medication.Visible=True
	setVisible(False)
End Sub
Sub btnAppoint_click()
	Dim p_Appointment As PAppointment
	p_Appointment=Starter.PAppointment1
	p_Appointment.Visible=True
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
