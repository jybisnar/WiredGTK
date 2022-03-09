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
	Dim btn1 As Panel
	Dim btn2 As Panel
	Dim btn3 As Panel
	Dim btn4 As Panel
	Dim lblTitlea As Label
	Dim lblTitleb As Label
	Dim lblTitlec As Label
	Dim lblTitled As Label
	Dim btn9 As Panel
	Dim btn8 As Panel
	Dim btn7 As Panel
	Dim btn6 As Panel
	Dim btn5 As Panel
	Dim Label1 As Label
	Dim Label2 As Label
	Dim Label3 As Label
	Dim Label4 As Label
	Dim Label5 as Label

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
	btn1.Initialize("btn1")
	btn2.Initialize("btn2")
	btn3.Initialize("btn3")
	btn4.Initialize("btn4")
	lblTitlea.Initialize("lblTitlea")
	lblTitleb.Initialize("lblTitleb")
	lblTitlec.Initialize("lblTitlec")
	lblTitled.Initialize("lblTitled")
	btn9.Initialize("btn9")
	btn8.Initialize("btn8")
	btn7.Initialize("btn7")
	btn6.Initialize("btn6")
	btn5.Initialize("btn5")
	Label1.Initialize("Label1")
	Label2.Initialize("Label2")
	Label3.Initialize("Label3")
	Label4.Initialize("Label4")
	Label5.Initialize("Label5")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub init_PSchedule
	btnBack.Color =  0xff00e6ed
	btnQr.Color =  0xff00e6ed
	btn1.Color =  0xff00e6ed
	btn2.Color =  0xff00e6ed
	btn3.Color =  0xff00e6ed
	btn4.Color =  0xff00e6ed
	btn5.Color =  0xff00e6ed
	btn9.Color =  0xff00e6ed
	btn8.Color =  0xff00e6ed
	btn7.Color =  0xff00e6ed
	btn6.Color =  0xff00e6ed
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
	Label1.Color =  0x00ffffff
	Label1.TextColor = 0xff000000
	Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label1.Text = ""
	Label2.Color =  0x00ffffff
	Label2.TextColor = 0xff000000
	Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label2.Text = ""
	Label3.Color =  0x00ffffff
	Label3.TextColor = 0xff000000
	Label3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label3.Text = ""
	Label4.Color =  0x00ffffff
	Label4.TextColor = 0xff000000
	Label4.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label4.Text = ""
	Label5.Color =  0x00ffffff
	Label5.TextColor = 0xff000000
	Label5.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label5.Text = ""
	
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"ScheduleSubModule-004a0.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnBack,0.05 * mBase.Width,0.01 * mBase.Height,0.16 * mBase.Width,0.09 * mBase.Height)
	mBase.AddView(btnQr,0.81 * mBase.Width,0.01 * mBase.Height,0.16 * mBase.Width,0.09 * mBase.Height)
	mBase.AddView(btn1,0.81 * mBase.Width,0.58 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btn2,0.81 * mBase.Width,0.67 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btn3,0.81 * mBase.Width,0.77 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btn4,0.81 * mBase.Width,0.86 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lblTitlea,0.23 * mBase.Width,0.59 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblTitleb,0.23 * mBase.Width,0.68 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblTitlec,0.23 * mBase.Width,0.78 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblTitled,0.23 * mBase.Width,0.87 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(btn9,0.81 * mBase.Width,0.15 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btn8,0.81 * mBase.Width,0.23 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btn7,0.81 * mBase.Width,0.32 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btn6,0.81 * mBase.Width,0.41 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btn5,0.81 * mBase.Width,0.50 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(Label1,0.23 * mBase.Width,0.50 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(Label2,0.23 * mBase.Width,0.42 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(Label3,0.23 * mBase.Width,0.33 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(Label4,0.23 * mBase.Width,0.24 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(Label5,0.23 * mBase.Width,0.16 * mBase.Height,0.57 * mBase.Width,0.05 * mBase.Height)
	
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
Sub btn1_click()
End Sub
Sub btn2_click()
End Sub
Sub btn3_click()
End Sub
Sub btn4_click()
End Sub
Sub lblTitlea_click()
End Sub
Sub lblTitleb_click()
End Sub
Sub lblTitlec_click()
End Sub
Sub lblTitled_click()
End Sub
Sub btn9_click()
End Sub
Sub btn8_click()
End Sub
Sub btn7_click()
End Sub
Sub btn6_click()
End Sub
Sub btn5_click()
End Sub
Sub Label1_click()
End Sub
Sub Label2_click()
End Sub
Sub Label3_click()
End Sub
Sub Label4_click()
End Sub
Sub Label5_click()
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
