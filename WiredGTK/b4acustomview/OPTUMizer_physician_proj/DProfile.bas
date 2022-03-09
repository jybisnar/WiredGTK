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
	Dim btnLogout As Panel
	Dim btnQr As Panel
	Dim btnBack As Panel
	Dim lblName As Label
	Dim lbl_ID As Label
	Dim lblAddress As Label
	Dim lblCounty As Label
	Dim lblZip As Label
	Dim lblState As Label

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
	btnLogout.Initialize("btnLogout")
	btnQr.Initialize("btnQr")
	btnBack.Initialize("btnBack")
	lblName.Initialize("lblName")
	lbl_ID.Initialize("lbl_ID")
	lblAddress.Initialize("lblAddress")
	lblCounty.Initialize("lblCounty")
	lblZip.Initialize("lblZip")
	lblState.Initialize("lblState")

End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub

Sub initDProfile
	btnLogout.Color =  0x0000bc17
	btnQr.Color =  0x0000182b
	btnBack.Color =  0x000091cc
	lblName.Color =  0x00ffffff
	lblName.TextColor = 0xff000000
	lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblName.Text = ""
	lbl_ID.Color =  0x00ffffff
	lbl_ID.TextColor = 0xff000000
	lbl_ID.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_ID.Text = ""
	lblAddress.Color =  0x00ffffff
	lblAddress.TextColor = 0xff000000
	lblAddress.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblAddress.Text = ""
	lblCounty.Color =  0x00ffffff
	lblCounty.TextColor = 0xff000000
	lblCounty.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblCounty.Text = ""
	lblZip.Color =  0x00ffffff
	lblZip.TextColor = 0xff000000
	lblZip.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblZip.Text = ""
	lblState.Color =  0x00ffffff
	lblState.TextColor = 0xff000000
	lblState.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblState.Text = ""
	
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"ProfileSubModule-a80b6.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnLogout,0.31 * mBase.Width,0.92 * mBase.Height,0.35 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnQr,0.83 * mBase.Width,0.02 * mBase.Height,0.12 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(btnBack,0.04 * mBase.Width,0.02 * mBase.Height,0.11 * mBase.Width,0.06 * mBase.Height)
	mBase.AddView(lblName,0.07 * mBase.Width,0.36 * mBase.Height,0.86 * mBase.Width,0.08 * mBase.Height)
	mBase.AddView(lbl_ID,0.06 * mBase.Width,0.56 * mBase.Height,0.88 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblAddress,0.06 * mBase.Width,0.66 * mBase.Height,0.88 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(lblCounty,0.06 * mBase.Width,0.74 * mBase.Height,0.38 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(lblZip,0.51 * mBase.Width,0.74 * mBase.Height,0.43 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(lblState,0.06 * mBase.Width,0.82 * mBase.Height,0.88 * mBase.Width,0.05 * mBase.Height)

	initDProfile
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnLogout_click()
	Dim signOut As DLogin
	signOut=Starter.DLogin1
	signOut.Visible=True
	setVisible(False)
End Sub
Sub btnQr_click()
	Dim qrReader As DQrReader
	qrReader=Starter.DQrReader1
	qrReader.Visible=True
	setVisible(False)
End Sub
Sub btnBack_click()
	Dim home As DHome
	home=Starter.DHome1
	home.Visible=True
	setVisible(False)
End Sub
Sub lblName_click()
	'Name from providers.csv
End Sub
Sub lbl_ID_click()
	'ID from providers.csv
End Sub
Sub lblAddress_click()
	'Address from providers.csv
End Sub
Sub lblCounty_click()
	'County from providers.csv
End Sub
Sub lblZip_click()
	'Zip from providers.csv
End Sub
Sub lblState_click()
	'State from providers.csv
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
