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
	Dim Layout1 As ScrollView
	Dim Layout2 As Panel
	Dim Button1 As Button
	Dim Button2 As Button
	Dim num As Int=0
	Dim panellst As List
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
	Layout1.Initialize(100.00%y)'add Layout1.Height=xx%y at the end of GTKForms
	Layout2.Initialize("Layout2")
	Button1.Initialize("Button1")
	Button2.Initialize("Button2")
	panellst.Initialize
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
	Layout1.Height=100%y
	add_data("xxx","yyy")
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Layout1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Layout1.Color =  Colors.Transparent'0xff00579d
'	Layout1.Panel.AddView(Layout2,0.00 * Layout1.Width,0.00 * Layout1.Height,1.00 * Layout1.Width,0.22 * Layout1.Height)
'	Layout2.Color =  0xff00f337
'	Layout2.AddView(Button1,0.00 * Layout2.Width,0.50 * Layout2.Height,0.24 * Layout2.Width,0.50 * Layout2.Height)
'	Layout2.AddView(Button2,0.76 * Layout2.Width,0.00 * Layout2.Height,0.24 * Layout2.Width,0.50 * Layout2.Height)

End Sub
public Sub add_data(t1 As String,t2 As String)
	'Dim num As Int=0		'in globals
	'Dim panellst As List	'in globals
	'panellst.Initialize	'in sub Initialize
	
	Dim Layout2 As Panel	'declare here
	Dim Button1 As Button	'declare here
	Dim Button2 As Button	'declare here
	Layout2.Initialize("Layout2")	'init here
	Button1.Initialize("Button1")	'init here
	Button2.Initialize("Button2")	'init here
	Layout2.Width=1 * Layout1.Width'from line 69
	Layout2.Height=0.22 * Layout1.Height'from line 69
	
	''''''''''''from gtkForms
	Layout1.Panel.AddView(Layout2,0.00 * Layout1.Width, Layout2.Height*num,1.00 * Layout1.Width,0.22 * Layout1.Height)
	Layout2.Color =  0xff00f337
	Layout2.AddView(Button1,0.00 * Layout2.Width,0.50 * Layout2.Height,0.24 * Layout2.Width,0.50 * Layout2.Height)
	Layout2.AddView(Button2,0.76 * Layout2.Width,0.00 * Layout2.Height,0.24 * Layout2.Width,0.50 * Layout2.Height)
	''''''''''''from gtkForms
	
	Button1.Text=t1		'update content
	Button2.Text=t2		'update content
	
	''''''''''''add this
	Layout2.Color=Colors.Transparent
	Layout2.Height=Layout2.Height
	num=num+1
	Layout1.Panel.Height=Layout2.Height*1.02*num+Layout2.Height*0.2
	Layout2.Tag=num
	panellst.Add(Layout2)
	''''''''''''add this
End Sub
'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Layout1_click()
End Sub
Sub Layout2_click()
End Sub
Sub Button2_click()
	add_data("222","111")
	
End Sub
Sub Button1_click()
	Dim x As Button=Sender
	Dim p As Panel=x.Parent
	ToastMessageShow(p.Tag,False)
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
