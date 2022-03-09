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
	dim Label1 as Label	dim Image2 as ImageView	dim Image1 as ImageView	dim Image3 as ImageView	dim Label2 as Label	dim Layout1 as Panel	dim Label3 as Label	dim Image4 as ImageView
End Sub
Public Sub GTKForms
	mBase.AddView(Image1xx,0.07 * mBase.Width,0.22 * mBase.Height,0.43 * mBase.Width,0.18 * mBase.Height)
	
End Sub
Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	Label1.Initialize("Label1")	Image2.Initialize("Image2")	Image1.Initialize("Image1")	Image3.Initialize("Image3")	Label2.Initialize("Label2")	Layout1.Initialize("Layout1")	Label3.Initialize("Label3")	Image4.Initialize("Image4")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	mBase.Color=0x000000'transparent background
	Label1.Color = Colors.Green	Label1.TextColor = Colors.Red	Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL	Label1.Text = "Label1"	mBase.AddView(Label1,0.07 * mBase.Width,0.43 * mBase.Height,0.33 * mBase.Width,0.08 * mBase.Height)	mBase.AddView(Image2,0.06 * mBase.Width,0.01 * mBase.Height,0.43 * mBase.Width,0.14 * mBase.Height)	Image2.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image2.Width,Image2.Height,true)	mBase.AddView(Image1,0.07 * mBase.Width,0.22 * mBase.Height,0.43 * mBase.Width,0.18 * mBase.Height)	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image1.Width,Image1.Height,true)	mBase.AddView(Image3,0.51 * mBase.Width,0.43 * mBase.Height,0.20 * mBase.Width,0.07 * mBase.Height)	Image3.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image3.Width,Image3.Height,true)	Label2.Color = Colors.Green	Label2.TextColor = Colors.Red	Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL	Label2.Text = "Label2"	mBase.AddView(Label2,0.59 * mBase.Width,0.11 * mBase.Height,0.33 * mBase.Width,0.08 * mBase.Height)	mBase.AddView(Layout1,0.10 * mBase.Width,0.59 * mBase.Height,0.74 * mBase.Width,0.39 * mBase.Height)	Label3.Color = Colors.Green	Label3.TextColor = Colors.Red	Label3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL	Label3.Text = "Fuck"	Layout1.AddView(Label3,0.09 * Layout1.Width,0.09 * Layout1.Height,0.44 * Layout1.Width,0.20 * Layout1.Height)	Layout1.AddView(Image4,0.09 * Layout1.Width,0.31 * Layout1.Height,0.72 * Layout1.Width,0.66 * Layout1.Height)	Image4.Bitmap = LoadBitmapResize(File.DirAssets,"pics1.png",Image4.Width,Image4.Height,true)
End Sub
Sub Label1_click()End SubSub Image2_click()End SubSub Image1_click()End SubSub Image3_click()End SubSub Label2_click()End SubSub Layout1_click()End SubSub Label3_click()End SubSub Image4_click()End Sub
Public Sub GetBase As Panel
	Return mBase
End Sub