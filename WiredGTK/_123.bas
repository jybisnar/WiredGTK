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
	dim Label1 as Label
End Sub
Public Sub GTKForms
	mBase.AddView(Image1xx,0.07 * mBase.Width,0.22 * mBase.Height,0.43 * mBase.Width,0.18 * mBase.Height)
	Label1.TextColor = 0xff000000
	Label1.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label1.Text = "Label1
	mBase.AddView(Label1,0.07 * mBase.Width,0.43 * mBase.Height,0.33 * mBase.Width,0.08 * mBase.Height)
	Label2.TextColor = 0xff000000
	Label2.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label2.Text = "Label2
	mBase.AddView(Label2,0.59 * mBase.Width,0.11 * mBase.Height,0.33 * mBase.Width,0.08 * mBase.Height)
	Label3.TextColor = 0xff35427a
	Label3.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Label3.Text = "Fuck
	Layout1.AddView(Label3,0.09 * Layout1.Width,0.09 * Layout1.Height,0.44 * Layout1.Width,0.20 * Layout1.Height)
End Sub
Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	Label1.Initialize("Label1")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	mBase.Color=0x000000'transparent background
	Label1.Color = Colors.Green
End Sub
Sub Label1_click()
Public Sub GetBase As Panel
	Return mBase
End Sub