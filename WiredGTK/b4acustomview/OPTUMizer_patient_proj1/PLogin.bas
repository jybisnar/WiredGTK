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
	Dim btnLogIn As Panel
	Dim txtID As EditText
	Dim txtPassword As EditText
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
	btnLogIn.Initialize("btnLogIn")
	txtID.Initialize("txtID")
	txtPassword.Initialize("txtPassword")
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	GTKForms
End Sub
Sub initPLogin
	'txtID.TextColor=Colors.Blue
	'txtPassword.TextColor=Colors.Red
	btnLogIn.Color =  0x00001f59
	
	
End Sub
Public Sub GTKForms
	mBase.Color=0x000000'transparent background
	mBase.Width=100%x
	mBase.height=100%y
	mBase.AddView(Image1,0.00 * mBase.Width,0.00 * mBase.Height,1.01 * mBase.Width,1.00 * mBase.Height)
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"LoginModule-bf106.png",Image1.Width,Image1.Height,False)
	mBase.AddView(btnLogIn,0.12 * mBase.Width,0.80 * mBase.Height,0.76 * mBase.Width,0.05 * mBase.Height)
	mBase.AddView(txtID,0.11 * mBase.Width,0.60 * mBase.Height,0.79 * mBase.Width,0.09 * mBase.Height)
	mBase.AddView(txtPassword,0.11 * mBase.Width,0.69 * mBase.Height,0.79 * mBase.Width,0.09 * mBase.Height)
	
	initPLogin
	
	
End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnLogIn_click()
	Dim home As PHome
	Dim prof As PProfile
	Dim plogsA As PLogs
	Dim psched As PSchedule
	home = Starter.PHome1
	prof = Starter.PProfile1
	plogsA = Starter.PLogs1
	psched = Starter.PSchedule1
	
	Dim j As HttpJob
	j.Initialize("", Me) 'name is empty as it is no longer needed
	j.PostString("http://"& Starter.serverURL &"/login?username="&txtID.Text&"&password="& txtPassword.Text,"")
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		'The result Is a json string. We parse it And Log the fields.
		Dim jp As JSONParser
		jp.Initialize(j.GetString)
		Dim quotes As List = jp.NextArray
		For Each quot As Map In quotes
			If quot.Get("id")<> "" Then
				Starter.user.Id=quot.Get("id") 'From patients.csv
				Starter.user.First=txtID.Text 'From patients.csv
				Starter.user.Last=txtPassword.Text 'From patients.csv
				Starter.user.provider=quot.Get("physician")
				Starter.user.Lat=quot.Get("lat")
				Starter.user.Lon=quot.Get("lon")
				Starter.user.encounterProblem=quot.Get("encounterclass")
				Starter.user.specialty=quot.Get("specialty")
				Starter.user.Address=quot.Get("address")
				Starter.user.City=quot.Get("city")
				Starter.user.State=quot.Get("state")
				Starter.user.County=quot.Get("county")
				Starter.user.Zip=quot.Get("zip")
				Starter.user.Percent = quot.Get("percent")
				Starter.user.progIncrement = quot.Get("progIncrement")
				Starter.user.Start = quot.Get("start")
				Starter.user.Stop = quot.Get("stop")
				Starter.user.DescriptionMed = quot.Get("descMed")
				Starter.user.DescriptionAppoint= quot.Get("DescAppoint")
				Starter.user.Prefix = quot.Get("prefix")
				Starter.user.Dispenses = quot.Get("dispenses")
				Dim x As PQr
				x=Starter.PQr1
				Dim qr As QRGenerator
				qr.Initialize(x.p_Qr.Width)
				x.p_Qr.SetBackgroundImage(qr.Create(Starter.user.id))
				home.lblName.Text="User:"& txtID.Text & " " & txtPassword.Text
				prof.lblName.Text = txtID.Text & " " & txtPassword.Text
				prof.lbl_ID.Text = Starter.user.Id
				prof.lblAddress.Text = Starter.user.Address
				prof.lblCounty.Text = Starter.user.County
				prof.lblZip.Text = Starter.user.Zip
				prof.lblState.Text = Starter.user.State
				plogsA.lbl_dateTime1.Text = Starter.user.Start
				plogsA.lblText1.Text = Starter.user.DescriptionAppoint
				psched.lblTitlea.Text = Starter.user.DescriptionMed
				psched.lblTitleb.Text = Starter.user.DescriptionAppoint
				home.Visible=True
				setVisible(False)
			Else
				ToastMessageShow("User Doesnt exist",False)
			End If
		Next
	End If
	j.Release
End Sub
Sub txtID_click()
	'ID must match with the ID in patients.csv
End Sub
Sub txtPassword_click()
	'random password for now
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
