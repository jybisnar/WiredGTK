B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
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
	Dim layLand As Panel
	Dim laywater As Panel
	Dim layManual As Panel
	Dim layauto As Panel
	Dim laySweep As Panel
	Dim layUp As Panel
	Dim layLeft As Panel
	Dim layRight As Panel
	Dim layBT As Panel
	Dim layDown As Panel
	Dim Layout1 As Panel
	Dim lblclass As Label
	Dim Layout2 As Panel
	Dim lblplastic As Label
	Dim Layout4 As Panel
	Dim lblnonplastic As Label
	Dim manual As Boolean=True
	Dim land As Boolean=True
	Dim detected As objdetect
	Dim layLBIN As Panel
	Dim layRBIN As Panel
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
Sub myinit
	lblclass.Text="Bottle 91%"
	lblplastic.Text = "0"
	lblnonplastic.Text = "0"
	lblplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.LEFT
	lblnonplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.LEFT
	layLand.Color =  Colors.argb(20,0,0,255)
	layManual.Color =  Colors.argb(20,0,0,255)
	detected.Initialize(lblplastic,lblnonplastic,lblclass)
End Sub
Public Sub GTKForms
	
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.00 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"frmusercontrol.png",Image1.Width,Image1.Height,False)
	mBase.AddView(layLand,0.32 * mBase.Width,0.13 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	layLand.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(laywater,0.53 * mBase.Width,0.13 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	laywater.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(layManual,0.32 * mBase.Width,0.28 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	layManual.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(layauto,0.53 * mBase.Width,0.28 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	layauto.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(laySweep,0.60 * mBase.Width,0.76 * mBase.Height,0.15 * mBase.Width,0.10 * mBase.Height)
	laySweep.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(layUp,0.27 * mBase.Width,0.72 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layUp.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(layLeft,0.16 * mBase.Width,0.79 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layLeft.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(layRight,0.38 * mBase.Width,0.79 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layRight.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(layBT,0.46 * mBase.Width,0.93 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layBT.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(layDown,0.27 * mBase.Width,0.85 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layDown.Color =  Colors.argb(1,0,0,255)
	mBase.AddView(Layout1,0.26 * mBase.Width,0.46 * mBase.Height,0.52 * mBase.Width,0.04 * mBase.Height)
	Layout1.Color =  Colors.argb(1,0,0,255)
	lblclass.Color =  0x00ffffff
	lblclass.TextColor = 0xff000000
	lblclass.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblclass.Text = "Class Label"
	Layout1.AddView(lblclass,0.00 * Layout1.Width,0.00 * Layout1.Height,1.00 * Layout1.Width,0.75 * Layout1.Height)
	mBase.AddView(Layout2,0.47 * mBase.Width,0.57 * mBase.Height,0.36 * mBase.Width,0.04 * mBase.Height)
	Layout2.Color =  Colors.argb(1,0,0,255)
	lblplastic.Color =  0x00ffffff
	lblplastic.TextColor = 0xff000000
	lblplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblplastic.Text = "0"
	Layout2.AddView(lblplastic,0.00 * Layout2.Width,0.00 * Layout2.Height,1.00 * Layout2.Width,0.75 * Layout2.Height)
	mBase.AddView(Layout4,0.53 * mBase.Width,0.60 * mBase.Height,0.35 * mBase.Width,0.04 * mBase.Height)
	Layout4.Color =  Colors.argb(1,0,0,255)
	lblnonplastic.Color =  0x00ffffff
	lblnonplastic.TextColor = 0xff000000
	lblnonplastic.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblnonplastic.Text = "0"
	Layout4.AddView(lblnonplastic,0.00 * Layout4.Width,0.00 * Layout4.Height,1.04 * Layout4.Width,0.75 * Layout4.Height)
	mBase.AddView(layLBIN,0.63 * mBase.Width,0.88 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layLBIN.Color =  Colors.argb(10,0,0,255)
	mBase.AddView(layRBIN,0.77 * mBase.Width,0.88 * mBase.Height,0.10 * mBase.Width,0.07 * mBase.Height)
	layRBIN.Color =  Colors.argb(10,0,0,255)
	
	myinit
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub layLand_click()
	layLand.Color =  Colors.argb(50,0,0,255)
	laywater.Color =  Colors.argb(1,0,0,255)
	land=True
	Starter.Println("LAND")
End Sub
Sub laywater_click()
	layLand.Color =  Colors.argb(1,0,0,255)
	laywater.Color =  Colors.argb(50,0,0,255)
	land=False
	Starter.Println("WATER")
End Sub
Sub layManual_click()
	manual=True
	ToastMessageShow("Manual Mode",False)
	layManual.Color =  Colors.argb(50,0,0,255)
	layauto.Color =  Colors.argb(1,0,0,255)
	Starter.Println("MANUAL")
End Sub
Sub layauto_click()
	manual=False
	ToastMessageShow("Automatic Mode",False)
	layauto.Color =  Colors.argb(50,0,0,255)
	layManual.Color =  Colors.argb(1,0,0,255)
	Starter.Println("AUTOMATIC")
	
End Sub
Sub laySweep_click()
	If manual=True Then
		Starter.Println("HAKOT")
	End If
End Sub

Sub layBT_click()
	If Starter.connected_BT=False Then
		Starter.mnuConnect_Click
	Else
		Starter.mnuDisconnect_Click
	End If
End Sub
Sub layLBIN_click()
	If  manual=False Then
		Return
	End If
	Starter.Println("LBIN")
End Sub
Sub layRBIN_click()
	If  manual=False Then
		Return
	End If
	Starter.Println("RBIN")
End Sub
Sub layUp_Touch (Action As Int, X As Float, Y As Float)
	If  manual=False Then
		Return
	End If
If Action=0 Then
	Starter.Println("FORWARD")
	If land=False Then
		Starter.Println("FORWARX")
	End If
		ToastMessageShow("1down" & X,False)
End If
If Action=1 Then
		Starter.Println("STOP")
		If land=False Then
			Starter.Println("STOX")
		End If

		
End If
End Sub
Sub layDown_Touch (Action As Int, X As Float, Y As Float)
	If  manual=False Then
		Return
	End If
If Action=0 Then
		Starter.Println("BACKWARD")
	If land=False Then
			Starter.Println("BACKWARX")
		End If
	End If
If Action=1 Then
		Starter.Println("STOP")
		If land=False Then
			Starter.Println("STOX")
		End If

	'	ToastMessageShow("2up" & X,False)
End If
End Sub
Sub layLeft_Touch (Action As Int, X As Float, Y As Float)
	If  manual=False Then
		Return
	End If
If Action=0 Then
		Starter.Println("LEFT")
		If land=False Then
			Starter.Println("LEFX")
		End If

End If
If Action=1 Then
		Starter.Println("STOP")
		If land=False Then
			Starter.Println("STOX")
		End If
		'	ToastMessageShow("2up" & X,False)
End If
End Sub
Sub layRight_Touch (Action As Int, X As Float, Y As Float)
	If  manual=False Then
		Return
	End If
If Action=0 Then
		Starter.Println("RIGHT")
		If land=False Then
			Starter.Println("RIGHX")
		End If

End If
If Action=1 Then
		Starter.Println("STOP")
		If land=False Then
			Starter.Println("STOX")
		End If

	'	ToastMessageShow("2up" & X,False)
End If
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
