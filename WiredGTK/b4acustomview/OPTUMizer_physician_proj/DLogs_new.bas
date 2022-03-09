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
	Dim Image1 as ImageView
	Dim btnHome as Panel
	Dim btnProfile as Panel
	Dim btnQrReader as Panel
	Dim lblText1 as Label
	Dim lblText2 as Label
	Dim lblText3 as Label
	Dim lbl_dateTime1 as Label
	Dim lbl_dateTime2 as Label
	Dim lbl_dateTime3 as Label
	Dim lblText4 as Label
	Dim lbl_dateTime4 as Label
	Dim btnProf1 as Panel
	Dim btnProf2 as Panel
	Dim btnProf3 as Panel
	Dim btnProf4 as Panel

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
	btnProfile.Initialize("btnProfile")
	btnQrReader.Initialize("btnQrReader")
	lblText1.Initialize("lblText1")
	lblText2.Initialize("lblText2")
	lblText3.Initialize("lblText3")
	lbl_dateTime1.Initialize("lbl_dateTime1")
	lbl_dateTime2.Initialize("lbl_dateTime2")
	lbl_dateTime3.Initialize("lbl_dateTime3")
	lblText4.Initialize("lblText4")
	lbl_dateTime4.Initialize("lbl_dateTime4")
	btnProf1.Initialize("btnProf1")
	btnProf2.Initialize("btnProf2")
	btnProf3.Initialize("btnProf3")
	btnProf4.Initialize("btnProf4")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"NewScreen-40038.png",Image1.Width,Image1.Height,true)
	mBase.AddView(btnHome,0.30 * mBase.Width,0.92 * mBase.Height,0.22 * mBase.Width,0.07 * mBase.Height)
	btnHome.Color =  0xff001f59
	mBase.AddView(btnProfile,0.02 * mBase.Width,0.02 * mBase.Height,0.19 * mBase.Width,0.08 * mBase.Height)
	btnProfile.Color =  0xff001f59
	mBase.AddView(btnQrReader,0.78 * mBase.Width,0.01 * mBase.Height,0.19 * mBase.Width,0.08 * mBase.Height)
	btnQrReader.Color =  0xff001f59
	lblText1.Color =  0x00ffffff
	lblText1.TextColor = 0xff000000
	lblText1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblText1.Text = ""
	mBase.AddView(lblText1,0.26 * mBase.Width,0.17 * mBase.Height,0.68 * mBase.Width,0.11 * mBase.Height)
	lblText2.Color =  0x00ffffff
	lblText2.TextColor = 0xff000000
	lblText2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblText2.Text = ""
	mBase.AddView(lblText2,0.26 * mBase.Width,0.36 * mBase.Height,0.68 * mBase.Width,0.11 * mBase.Height)
	lblText3.Color =  0x00ffffff
	lblText3.TextColor = 0xff000000
	lblText3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblText3.Text = ""
	mBase.AddView(lblText3,0.26 * mBase.Width,0.54 * mBase.Height,0.68 * mBase.Width,0.10 * mBase.Height)
	lbl_dateTime1.Color =  0x00ffffff
	lbl_dateTime1.TextColor = 0xff000000
	lbl_dateTime1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_dateTime1.Text = ""
	mBase.AddView(lbl_dateTime1,0.56 * mBase.Width,0.13 * mBase.Height,0.38 * mBase.Width,0.04 * mBase.Height)
	lbl_dateTime2.Color =  0x00ffffff
	lbl_dateTime2.TextColor = 0xff000000
	lbl_dateTime2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_dateTime2.Text = ""
	mBase.AddView(lbl_dateTime2,0.56 * mBase.Width,0.32 * mBase.Height,0.38 * mBase.Width,0.04 * mBase.Height)
	lbl_dateTime3.Color =  0x00ffffff
	lbl_dateTime3.TextColor = 0xff000000
	lbl_dateTime3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_dateTime3.Text = ""
	mBase.AddView(lbl_dateTime3,0.56 * mBase.Width,0.50 * mBase.Height,0.38 * mBase.Width,0.04 * mBase.Height)
	lblText4.Color =  0x00ffffff
	lblText4.TextColor = 0xff000000
	lblText4.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblText4.Text = ""
	mBase.AddView(lblText4,0.26 * mBase.Width,0.72 * mBase.Height,0.68 * mBase.Width,0.11 * mBase.Height)
	lbl_dateTime4.Color =  0x00ffffff
	lbl_dateTime4.TextColor = 0xff000000
	lbl_dateTime4.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_dateTime4.Text = ""
	mBase.AddView(lbl_dateTime4,0.56 * mBase.Width,0.68 * mBase.Height,0.38 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(btnProf1,0.04 * mBase.Width,0.13 * mBase.Height,0.93 * mBase.Width,0.16 * mBase.Height)
	btnProf1.Color =  0xff00a471
	mBase.AddView(btnProf2,0.04 * mBase.Width,0.31 * mBase.Height,0.93 * mBase.Width,0.17 * mBase.Height)
	btnProf2.Color =  0xff00f023
	mBase.AddView(btnProf3,0.04 * mBase.Width,0.49 * mBase.Height,0.93 * mBase.Width,0.17 * mBase.Height)
	btnProf3.Color =  0xff0028d6
	mBase.AddView(btnProf4,0.04 * mBase.Width,0.67 * mBase.Height,0.93 * mBase.Width,0.17 * mBase.Height)
	btnProf4.Color =  0xff001beb

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnHome_click()
End Sub
Sub btnProfile_click()
End Sub
Sub btnQrReader_click()
End Sub
Sub lblText1_click()
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
Sub lblText4_click()
End Sub
Sub lbl_dateTime4_click()
End Sub
Sub btnProf1_click()
End Sub
Sub btnProf2_click()
End Sub
Sub btnProf3_click()
End Sub
Sub btnProf4_click()
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
