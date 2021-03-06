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
	Dim p_Qr As Panel
	Dim zx1 As ZxingBarcodeScanner
	Dim rp As RuntimePermissions
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
	p_Qr.Initialize("p_Qr")
	zx1.Initialize("zx1")

End Sub
Sub zx1_scan_result (scantext As String, scanformat As String)
	
	'Log ("B4A scan text = " & scantext)
	'Log ("B4A scan format = " & scanformat)
	Dim strs As String =scantext & ":" & scanformat
	zx1.Visible = False
	zx1.stopScanner
	ToastMessageShow(strs,True)
End Sub
Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub initDQrReader
	btnBack.Color =  0x00000f70
	p_Qr.Color =  0x1000d3a5
	
	zx1.LaserColor = Colors.Yellow
	zx1.MaskColor = Colors.ARGB(150, 0, 0, 200)
	zx1.BorderColor = Colors.Magenta
	zx1.BorderStrokeWidth = 5
	zx1.BorderLineLength = 40
	zx1.Visible = False
	
'	For Each permission As String In Array( rp.PERMISSION_READ_EXTERNAL_STORAGE, rp.PERMISSION_CAMERA,rp.PERMISSION_ACCESS_FINE_LOCATION )
'		rp.CheckAndRequest( permission )
'		Wait For Activity_PermissionResult( permission As String, Result As Boolean )
'		If Result = False Then
'			ToastMessageShow( "No storage or camera permission!", True )
'			'Activity.Finish
'			Return
'		End If
'	Next
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"QRCodeSubModule-22420.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnBack,0.01 * mBase.Width,0.01 * mBase.Height,0.20 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(p_Qr,0.06 * mBase.Width,0.19 * mBase.Height,0.89 * mBase.Width,0.54 * mBase.Height)
	mBase.AddView(zx1,0.06 * mBase.Width,0.19 * mBase.Height,0.89 * mBase.Width,0.54 * mBase.Height)
	initDQrReader
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnBack_click()
	Dim home As DHome
	home=Starter.DHome1
	home.Visible=True
	setVisible(False)
End Sub
Sub p_Qr_click()
'	
	zx1.Visible = True
	zx1.startScanner
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
