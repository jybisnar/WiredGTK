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
	Dim layLand as Panel
	Dim laywater as Panel
	Dim layManual as Panel
	Dim layauto as Panel
	Dim laySweep as Panel
	Dim layUp as Panel
	Dim layLeft as Panel
	Dim layRight as Panel
	Dim layBT as Panel
	Dim layDown as Panel
	Dim Layout1 as Panel
	Dim lblclass as Label
	Dim Layout2 as Panel
	Dim lblplastic as Label
	Dim Layout4 as Panel
	Dim lblnonplastic as Label
	Dim layLBIN as Panel
	Dim layRBIN as Panel

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
	layLand.Initialize("layLand")
	laywater.Initialize("laywater")
	layManual.Initialize("layManual")
	layauto.Initialize("layauto")
	laySweep.Initialize("laySweep")
	layUp.Initialize("layUp")
	layLeft.Initialize("layLeft")
	layRight.Initialize("layRight")
	layBT.Initialize("layBT")
	layDown.Initialize("layDown")
	Layout1.Initialize("Layout1")
	lblclass.Initialize("lblclass")
	Layout2.Initialize("Layout2")
	lblplastic.Initialize("lblplastic")
	Layout4.Initialize("Layout4")
	lblnonplastic.Initialize("lblnonplastic")
	layLBIN.Initialize("layLBIN")
	layRBIN.Initialize("layRBIN")

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
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"frmusercontrol.png",Image1.Width,Image1.Height,true)
	mBase.AddView(layLand,0.32 * mBase.Width,0.13 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	layLand.Color =  0xff0076f6
	mBase.AddView(laywater,0.53 * mBase.Width,0.13 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	laywater.Color =  0xff0076f6
	mBase.AddView(layManual,0.32 * mBase.Width,0.28 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	layManual.Color =  0xff0076f6
	mBase.AddView(layauto,0.53 * mBase.Width,0.28 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	layauto.Color =  0xff0076f6
	mBase.AddView(laySweep,0.60 * mBase.Width,0.76 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	laySweep.Color =  0xff0076f6
	mBase.AddView(layUp,0.27 * mBase.Width,0.72 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layUp.Color =  0xff0076f6
	mBase.AddView(layLeft,0.16 * mBase.Width,0.79 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layLeft.Color =  0xff0076f6
	mBase.AddView(layRight,0.38 * mBase.Width,0.79 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layRight.Color =  0xff0076f6
	mBase.AddView(layBT,0.46 * mBase.Width,0.93 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layBT.Color =  0xff0076f6
	mBase.AddView(layDown,0.27 * mBase.Width,0.85 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layDown.Color =  0xff0076f6
	mBase.AddView(Layout1,0.26 * mBase.Width,0.46 * mBase.Height,0.57 * mBase.Width,0.04 * mBase.Height)
	Layout1.Color =  0xff0076f6
	lblclass.Color =  0x00ffffff
	lblclass.TextColor = 0xff000000
	lblclass.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblclass.Text = "Label1"
	Layout1.AddView(lblclass,0.00 * Layout1.Width,0.00 * Layout1.Height,0.91 * Layout1.Width,0.75 * Layout1.Height)
	mBase.AddView(Layout2,0.47 * mBase.Width,0.57 * mBase.Height,0.41 * mBase.Width,0.04 * mBase.Height)
	Layout2.Color =  0xff0076f6
	lblplastic.Color =  0x00ffffff
	lblplastic.TextColor = 0xff000000
	lblplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblplastic.Text = "Label2"
	Layout2.AddView(lblplastic,0.00 * Layout2.Width,0.00 * Layout2.Height,0.88 * Layout2.Width,0.75 * Layout2.Height)
	mBase.AddView(Layout4,0.53 * mBase.Width,0.60 * mBase.Height,0.41 * mBase.Width,0.04 * mBase.Height)
	Layout4.Color =  0xff0076f6
	lblnonplastic.Color =  0x00ffffff
	lblnonplastic.TextColor = 0xff000000
	lblnonplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblnonplastic.Text = "Label4"
	Layout4.AddView(lblnonplastic,0.00 * Layout4.Width,0.00 * Layout4.Height,0.88 * Layout4.Width,0.75 * Layout4.Height)
	mBase.AddView(layLBIN,0.63 * mBase.Width,0.88 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layLBIN.Color =  0xff0076f6
	mBase.AddView(layRBIN,0.77 * mBase.Width,0.88 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layRBIN.Color =  0xff0076f6

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub layLand_click()
End Sub
Sub laywater_click()
End Sub
Sub layManual_click()
End Sub
Sub layauto_click()
End Sub
Sub laySweep_click()
End Sub
Sub layUp_click()
End Sub
Sub layLeft_click()
End Sub
Sub layRight_click()
End Sub
Sub layBT_click()
End Sub
Sub layDown_click()
End Sub
Sub Layout1_click()
End Sub
Sub lblclass_click()
End Sub
Sub Layout2_click()
End Sub
Sub lblplastic_click()
End Sub
Sub Layout4_click()
End Sub
Sub lblnonplastic_click()
End Sub
Sub layLBIN_click()
End Sub
Sub layRBIN_click()
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
