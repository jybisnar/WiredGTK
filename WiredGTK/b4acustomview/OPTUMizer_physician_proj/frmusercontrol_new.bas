﻿B4A=true
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
	Dim Timer1 As Timer
	Dim mytimer As Timer
	Dim Image1 as ImageView
	Dim Button1 as Button
	Dim Button2 as Button
	Dim Label1 as Label
	Dim Label2 as Label
	Dim Label3 as Label
	Dim Label4 as Label
	Dim Label5 as Label
	Dim Button3 as Button
	Dim Layout1 as Panel
	Dim Label6 as Label
	Dim Layout2 as Panel
	Dim Label7 as Label
	Dim Layout3 as Panel
	Dim Label8 as Label
	Dim Layout4 as Panel
	Dim Label9 as Label
	Dim Layout5 as Panel
	Dim Label10 as Label
	Dim Layout6 as Panel
	Dim Label11 as Label
	Dim Layout7 as Panel
	Dim Label12 as Label
	Dim Layout8 as Panel
	Dim Label13 as Label
	Dim txts11 as EditText
	Dim txts12 as EditText
	Dim btnservo11 as Button
	Dim btnservo12 as Button
	Dim btnservo22 as Button
	Dim btnservo21 as Button
	Dim txts22 as EditText
	Dim txts21 as EditText
	Dim txts31 as EditText
	Dim txts32 as EditText
	Dim btnservo31 as Button
	Dim btnservo32 as Button
	Dim txts41 as EditText
	Dim txts42 as EditText
	Dim btnservo42 as Button
	Dim btnservo41 as Button
	Dim HScrollbar1 as SeekBar
	Dim HScrollbar2 as SeekBar
	Dim HScrollbar3 as SeekBar
	Dim HScrollbar4 as SeekBar

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
	Timer1.Initialize("Timer1",1000)
	Timer1.Enabled = True
	mytimer.Initialize("mytimer",1000)
	mytimer.Enabled = True
	Image1.Initialize("Image1")
	Button1.Initialize("Button1")
	Button2.Initialize("Button2")
	Label1.Initialize("Label1")
	Label2.Initialize("Label2")
	Label3.Initialize("Label3")
	Label4.Initialize("Label4")
	Label5.Initialize("Label5")
	Button3.Initialize("Button3")
	Layout1.Initialize("Layout1")
	Label6.Initialize("Label6")
	Layout2.Initialize("Layout2")
	Label7.Initialize("Label7")
	Layout3.Initialize("Layout3")
	Label8.Initialize("Label8")
	Layout4.Initialize("Layout4")
	Label9.Initialize("Label9")
	Layout5.Initialize("Layout5")
	Label10.Initialize("Label10")
	Layout6.Initialize("Layout6")
	Label11.Initialize("Label11")
	Layout7.Initialize("Layout7")
	Label12.Initialize("Label12")
	Layout8.Initialize("Layout8")
	Label13.Initialize("Label13")
	txts11.Initialize("txts11")
	txts12.Initialize("txts12")
	btnservo11.Initialize("btnservo11")
	btnservo12.Initialize("btnservo12")
	btnservo22.Initialize("btnservo22")
	btnservo21.Initialize("btnservo21")
	txts22.Initialize("txts22")
	txts21.Initialize("txts21")
	txts31.Initialize("txts31")
	txts32.Initialize("txts32")
	btnservo31.Initialize("btnservo31")
	btnservo32.Initialize("btnservo32")
	txts41.Initialize("txts41")
	txts42.Initialize("txts42")
	btnservo42.Initialize("btnservo42")
	btnservo41.Initialize("btnservo41")
	HScrollbar1.Initialize("HScrollbar1")
	HScrollbar1.Max = 100
	HScrollbar2.Initialize("HScrollbar2")
	HScrollbar2.Max = 100
	HScrollbar3.Initialize("HScrollbar3")
	HScrollbar3.Max = 100
	HScrollbar4.Initialize("HScrollbar4")
	HScrollbar4.Max = 100

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.45 * mBase.Width,0.73 * mBase.Height,0.19 * mBase.Width,0.10 * mBase.Height)
	mBase.AddView(Button1,0.12 * mBase.Width,0.58 * mBase.Height,0.23 * mBase.Width,0.10 * mBase.Height)
	mBase.AddView(Button2,0.38 * mBase.Width,0.58 * mBase.Height,0.23 * mBase.Width,0.10 * mBase.Height)
	Label1.Color =  0x00ffffff
	Label1.TextColor = 0xff000000
	Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label1.Text = "Power Logger App"
	mBase.AddView(Label1,0.12 * mBase.Width,0.06 * mBase.Height,0.78 * mBase.Width,0.13 * mBase.Height)
	Label2.Color =  0x00ffffff
	Label2.TextColor = 0xff000000
	Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label2.Text = "V"
	mBase.AddView(Label2,0.12 * mBase.Width,0.24 * mBase.Height,0.50 * mBase.Width,0.06 * mBase.Height)
	Label3.Color =  0x00ffffff
	Label3.TextColor = 0xff000000
	Label3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label3.Text = "A"
	mBase.AddView(Label3,0.12 * mBase.Width,0.32 * mBase.Height,0.50 * mBase.Width,0.06 * mBase.Height)
	Label4.Color =  0x00ffffff
	Label4.TextColor = 0xff000000
	Label4.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label4.Text = "W"
	mBase.AddView(Label4,0.12 * mBase.Width,0.38 * mBase.Height,0.50 * mBase.Width,0.06 * mBase.Height)
	Label5.Color =  0x00ffffff
	Label5.TextColor = 0xff000000
	Label5.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label5.Text = "WH"
	mBase.AddView(Label5,0.12 * mBase.Width,0.46 * mBase.Height,0.50 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(Button3,0.12 * mBase.Width,0.69 * mBase.Height,0.18 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(Layout1,0.26 * mBase.Width,0.78 * mBase.Height,0.17 * mBase.Width,0.08 * mBase.Height)
	Layout1.Color =  0xff006f6d
	Label6.Color =  0x00ffffff
	Label6.TextColor = 0xff000000
	Label6.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label6.Text = "^"
	Layout1.AddView(Label6,0.33 * Layout1.Width,0.12 * Layout1.Height,0.27 * Layout1.Width,0.62 * Layout1.Height)
	mBase.AddView(Layout2,0.26 * mBase.Width,0.88 * mBase.Height,0.17 * mBase.Width,0.08 * mBase.Height)
	Layout2.Color =  0xff006f6d
	Label7.Color =  0x00ffffff
	Label7.TextColor = 0xff000000
	Label7.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label7.Text = "v"
	Layout2.AddView(Label7,0.33 * Layout2.Width,0.12 * Layout2.Height,0.27 * Layout2.Width,0.62 * Layout2.Height)
	mBase.AddView(Layout3,0.09 * mBase.Width,0.83 * mBase.Height,0.14 * mBase.Width,0.08 * mBase.Height)
	Layout3.Color =  0xff006f6d
	Label8.Color =  0x00ffffff
	Label8.TextColor = 0xff000000
	Label8.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label8.Text = "<"
	Layout3.AddView(Label8,0.42 * Layout3.Width,0.12 * Layout3.Height,0.25 * Layout3.Width,0.62 * Layout3.Height)
	mBase.AddView(Layout4,0.46 * mBase.Width,0.83 * mBase.Height,0.16 * mBase.Width,0.08 * mBase.Height)
	Layout4.Color =  0xff006f6d
	Label9.Color =  0x00ffffff
	Label9.TextColor = 0xff000000
	Label9.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label9.Text = ">"
	Layout4.AddView(Label9,0.29 * Layout4.Width,0.12 * Layout4.Height,0.36 * Layout4.Width,0.62 * Layout4.Height)
	mBase.AddView(Layout5,0.64 * mBase.Width,0.82 * mBase.Height,0.14 * mBase.Width,0.08 * mBase.Height)
	Layout5.Color =  0xff006f6d
	Label10.Color =  0x00ffffff
	Label10.TextColor = 0xff000000
	Label10.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label10.Text = "Label10"
	Layout5.AddView(Label10,0.42 * Layout5.Width,0.12 * Layout5.Height,0.25 * Layout5.Width,0.62 * Layout5.Height)
	mBase.AddView(Layout6,0.64 * mBase.Width,0.89 * mBase.Height,0.14 * mBase.Width,0.08 * mBase.Height)
	Layout6.Color =  0xff006f6d
	Label11.Color =  0x00ffffff
	Label11.TextColor = 0xff000000
	Label11.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label11.Text = "Label11"
	Layout6.AddView(Label11,0.42 * Layout6.Width,0.12 * Layout6.Height,0.25 * Layout6.Width,0.62 * Layout6.Height)
	mBase.AddView(Layout7,0.80 * mBase.Width,0.82 * mBase.Height,0.14 * mBase.Width,0.08 * mBase.Height)
	Layout7.Color =  0xff006f6d
	Label12.Color =  0x00ffffff
	Label12.TextColor = 0xff000000
	Label12.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label12.Text = "Label12"
	Layout7.AddView(Label12,0.42 * Layout7.Width,0.12 * Layout7.Height,0.25 * Layout7.Width,0.62 * Layout7.Height)
	mBase.AddView(Layout8,0.80 * mBase.Width,0.89 * mBase.Height,0.14 * mBase.Width,0.08 * mBase.Height)
	Layout8.Color =  0xff006f6d
	Label13.Color =  0x00ffffff
	Label13.TextColor = 0xff000000
	Label13.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label13.Text = "Label13"
	Layout8.AddView(Label13,0.42 * Layout8.Width,0.12 * Layout8.Height,0.25 * Layout8.Width,0.62 * Layout8.Height)
	mBase.AddView(txts11,0.64 * mBase.Width,0.23 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(txts12,0.79 * mBase.Width,0.23 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnservo11,0.64 * mBase.Width,0.29 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnservo12,0.79 * mBase.Width,0.29 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnservo22,0.80 * mBase.Width,0.12 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnservo21,0.64 * mBase.Width,0.12 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(txts22,0.80 * mBase.Width,0.06 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(txts21,0.64 * mBase.Width,0.06 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(txts31,0.64 * mBase.Width,0.39 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(txts32,0.79 * mBase.Width,0.39 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnservo31,0.64 * mBase.Width,0.45 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnservo32,0.79 * mBase.Width,0.46 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(txts41,0.64 * mBase.Width,0.57 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(txts42,0.79 * mBase.Width,0.57 * mBase.Height,0.14 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnservo42,0.79 * mBase.Width,0.62 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(btnservo41,0.64 * mBase.Width,0.63 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	mBase.AddView(HScrollbar1,0.41 * mBase.Width,0.20 * mBase.Height,0.60 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(HScrollbar2,0.41 * mBase.Width,0.36 * mBase.Height,0.60 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(HScrollbar3,0.41 * mBase.Width,0.52 * mBase.Height,0.60 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(HScrollbar4,0.41 * mBase.Width,0.69 * mBase.Height,0.60 * mBase.Width,0.04 * mBase.Height)

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Timer1_Tick()
End Sub
Sub mytimer_Tick()
End Sub
Sub Image1_click()
End Sub
Sub Button1_click()
End Sub
Sub Button2_click()
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
Sub Button3_click()
End Sub
Sub Layout1_click()
End Sub
Sub Label6_click()
End Sub
Sub Layout2_click()
End Sub
Sub Label7_click()
End Sub
Sub Layout3_click()
End Sub
Sub Label8_click()
End Sub
Sub Layout4_click()
End Sub
Sub Label9_click()
End Sub
Sub Layout5_click()
End Sub
Sub Label10_click()
End Sub
Sub Layout6_click()
End Sub
Sub Label11_click()
End Sub
Sub Layout7_click()
End Sub
Sub Label12_click()
End Sub
Sub Layout8_click()
End Sub
Sub Label13_click()
End Sub
Sub txts11_click()
End Sub
Sub txts12_click()
End Sub
Sub btnservo11_click()
End Sub
Sub btnservo12_click()
End Sub
Sub btnservo22_click()
End Sub
Sub btnservo21_click()
End Sub
Sub txts22_click()
End Sub
Sub txts21_click()
End Sub
Sub txts31_click()
End Sub
Sub txts32_click()
End Sub
Sub btnservo31_click()
End Sub
Sub btnservo32_click()
End Sub
Sub txts41_click()
End Sub
Sub txts42_click()
End Sub
Sub btnservo42_click()
End Sub
Sub btnservo41_click()
End Sub
Sub HScrollbar1_ValueChanged (Value As Int, UserChanged As Boolean)
End Sub
Sub HScrollbar2_ValueChanged (Value As Int, UserChanged As Boolean)
End Sub
Sub HScrollbar3_ValueChanged (Value As Int, UserChanged As Boolean)
End Sub
Sub HScrollbar4_ValueChanged (Value As Int, UserChanged As Boolean)
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
