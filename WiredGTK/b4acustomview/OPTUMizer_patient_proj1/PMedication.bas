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
	Dim btnOrder As Panel
	Dim btnBack As Panel
	Dim btnQr As Panel
	Dim lbl_startStop1 As Label
	Dim lblDesc1 As Label
	Dim lblDispenses1 As Label
	Dim lbl_startStop2 As Label
	Dim lblDispenses2 As Label
	Dim lblDesc2 As Label
	Dim lbl_startStop3 As Label
	Dim lblDispenses3 As Label
	Dim lblDesc3 As Label

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
	btnOrder.Initialize("btnOrder")
	btnBack.Initialize("btnBack")
	btnQr.Initialize("btnQr")
	lbl_startStop1.Initialize("lbl_startStop1")
	lblDesc1.Initialize("lblDesc1")
	lblDispenses1.Initialize("lblDispenses1")
	lbl_startStop2.Initialize("lbl_startStop2")
	lblDispenses2.Initialize("lblDispenses2")
	lblDesc2.Initialize("lblDesc2")
	lbl_startStop3.Initialize("lbl_startStop3")
	lblDispenses3.Initialize("lblDispenses3")
	lblDesc3.Initialize("lblDesc3")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub init_PMedication
	btnOrder.Color =  0x0000979f
	btnBack.Color =  0x00008b67
	btnQr.Color =  0x00008b67
	lbl_startStop1.Color =  0x00ffffff
	lbl_startStop1.TextColor = 0xff000000
	lbl_startStop1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_startStop1.Text = ""
	lblDesc1.Color =  0x00ffffff
	lblDesc1.TextColor = 0xff000000
	lblDesc1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblDesc1.Text = ""
	lblDispenses1.Color =  0x00ffffff
	lblDispenses1.TextColor = 0xff000000
	lblDispenses1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblDispenses1.Text = ""
	lbl_startStop2.Color =  0x00ffffff
	lbl_startStop2.TextColor = 0xff000000
	lbl_startStop2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_startStop2.Text = ""
	lblDispenses2.Color =  0x00ffffff
	lblDispenses2.TextColor = 0xff000000
	lblDispenses2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblDispenses2.Text = ""
	lblDesc2.Color =  0x00ffffff
	lblDesc2.TextColor = 0xff000000
	lblDesc2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblDesc2.Text = ""
	lbl_startStop3.Color =  0x00ffffff
	lbl_startStop3.TextColor = 0xff000000
	lbl_startStop3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_startStop3.Text = ""
	lblDispenses3.Color =  0x00ffffff
	lblDispenses3.TextColor = 0xff000000
	lblDispenses3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblDispenses3.Text = ""
	lblDesc3.Color =  0x00ffffff
	lblDesc3.TextColor = 0xff000000
	lblDesc3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblDesc3.Text = ""
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"MedicationsSubModule-6e7dd.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnOrder,0.28 * mBase.Width,0.30 * mBase.Height,0.41 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(btnBack,0.06 * mBase.Width,0.02 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnQr,0.81 * mBase.Width,0.02 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lbl_startStop1,0.20 * mBase.Width,0.40 * mBase.Height,0.46 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblDesc1,0.07 * mBase.Width,0.45 * mBase.Height,0.85 * mBase.Width,0.12 * mBase.Height)
	mBase.AddView(lblDispenses1,0.65 * mBase.Width,0.40 * mBase.Height,0.27 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lbl_startStop2,0.20 * mBase.Width,0.60 * mBase.Height,0.46 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblDispenses2,0.65 * mBase.Width,0.60 * mBase.Height,0.27 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblDesc2,0.07 * mBase.Width,0.65 * mBase.Height,0.85 * mBase.Width,0.12 * mBase.Height)
	mBase.AddView(lbl_startStop3,0.20 * mBase.Width,0.81 * mBase.Height,0.46 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblDispenses3,0.65 * mBase.Width,0.81 * mBase.Height,0.27 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblDesc3,0.07 * mBase.Width,0.85 * mBase.Height,0.85 * mBase.Width,0.12 * mBase.Height)

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnOrder_click()
	'Overlay
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
Sub lbl_startStop1_click()
	'Start
	'Stop From medications.csv
End Sub
Sub lblDesc1_click()
	'Encounter
	'Code
	'Description
	'Reason for Description from medications.csv
End Sub
Sub lblDispenses1_click()
	'Dispenses from medications.csv
End Sub
Sub lbl_startStop2_click()
End Sub
Sub lblDispenses2_click()
End Sub
Sub lblDesc2_click()
End Sub
Sub lbl_startStop3_click()
End Sub
Sub lblDispenses3_click()
End Sub
Sub lblDesc3_click()
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
