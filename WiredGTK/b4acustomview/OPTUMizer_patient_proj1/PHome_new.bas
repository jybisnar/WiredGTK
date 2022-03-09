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
	Dim btnProfile as Panel
	Dim btnQr as Panel
	Dim btnSchedule as Panel
	Dim btnUpload as Panel
	Dim btnAppointments as Panel
	Dim btnHotline as Panel
	Dim btnUpdates as Panel
	Dim btnLogs as Panel
	Dim lblName as Label
	Dim lblProgress as Label
	Dim progressBar as Label
	Dim ProgressPercent as Label
	Dim btnMedications as Panel
	Dim Layout1 as Panel
	Dim pDocList as Table

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
	btnProfile.Initialize("btnProfile")
	btnQr.Initialize("btnQr")
	btnSchedule.Initialize("btnSchedule")
	btnUpload.Initialize("btnUpload")
	btnAppointments.Initialize("btnAppointments")
	btnHotline.Initialize("btnHotline")
	btnUpdates.Initialize("btnUpdates")
	btnLogs.Initialize("btnLogs")
	lblName.Initialize("lblName")
	lblProgress.Initialize("lblProgress")
	progressBar.Initialize("progressBar")
	ProgressPercent.Initialize("ProgressPercent")
	btnMedications.Initialize("btnMedications")
	Layout1.Initialize("Layout1")
	pDocList.Initialize(Me,"pDocList",4)
	'pDocList.LoadTableFromCSV(Dir, Filename, HeadersExist)
	'vb6.SetDataGrid(Activity,Main.SQL,pDocList,"History")

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
	Image1.Bitmap = LoadBitmapResize(File.DirAssets,"HomeModule-809c8.png",Image1.Width,Image1.Height,true)
	mBase.AddView(btnProfile,0.05 * mBase.Width,0.01 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	btnProfile.Color =  0xff008125
	mBase.AddView(btnQr,0.83 * mBase.Width,0.01 * mBase.Height,0.14 * mBase.Width,0.07 * mBase.Height)
	btnQr.Color =  0xff008125
	mBase.AddView(btnSchedule,0.52 * mBase.Width,0.19 * mBase.Height,0.42 * mBase.Width,0.05 * mBase.Height)
	btnSchedule.Color =  0xff008125
	mBase.AddView(btnUpload,0.80 * mBase.Width,0.30 * mBase.Height,0.11 * mBase.Width,0.06 * mBase.Height)
	btnUpload.Color =  0xff008125
	mBase.AddView(btnAppointments,0.38 * mBase.Width,0.42 * mBase.Height,0.26 * mBase.Width,0.11 * mBase.Height)
	btnAppointments.Color =  0xff008125
	mBase.AddView(btnHotline,0.69 * mBase.Width,0.42 * mBase.Height,0.25 * mBase.Width,0.11 * mBase.Height)
	btnHotline.Color =  0xff008125
	mBase.AddView(btnUpdates,0.41 * mBase.Width,0.93 * mBase.Height,0.22 * mBase.Width,0.07 * mBase.Height)
	btnUpdates.Color =  0xff008125
	mBase.AddView(btnLogs,0.78 * mBase.Width,0.93 * mBase.Height,0.22 * mBase.Width,0.07 * mBase.Height)
	btnLogs.Color =  0xff008125
	lblName.Color =  0x00ffffff
	lblName.TextColor = 0xff000000
	lblName.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblName.Text = ""
	mBase.AddView(lblName,0.05 * mBase.Width,0.10 * mBase.Height,0.90 * mBase.Width,0.09 * mBase.Height)
	lblProgress.Color =  0x00ffffff
	lblProgress.TextColor = 0xff000000
	lblProgress.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lblProgress.Text = ""
	mBase.AddView(lblProgress,0.09 * mBase.Width,0.30 * mBase.Height,0.68 * mBase.Width,0.04 * mBase.Height)
	progressBar.Color =  0x00ffffff
	progressBar.TextColor = 0xff000000
	progressBar.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	progressBar.Text = ""
	mBase.AddView(progressBar,0.09 * mBase.Width,0.37 * mBase.Height,0.83 * mBase.Width,0.03 * mBase.Height)
	ProgressPercent.Color =  0x00ffffff
	ProgressPercent.TextColor = 0xff000000
	ProgressPercent.Gravity = Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	ProgressPercent.Text = ""
	mBase.AddView(ProgressPercent,0.09 * mBase.Width,0.34 * mBase.Height,0.16 * mBase.Width,0.04 * mBase.Height)
	mBase.AddView(btnMedications,0.06 * mBase.Width,0.43 * mBase.Height,0.26 * mBase.Width,0.11 * mBase.Height)
	btnMedications.Color =  0xff008125
	mBase.AddView(Layout1,0.06 * mBase.Width,0.59 * mBase.Height,0.89 * mBase.Width,0.31 * mBase.Height)
	Layout1.Color =  0xff002bc2
	pDocList.AddToParent(mBase,0.00 * Layout1.Width,0.00 * Layout1.Height,1.00 * Layout1.Width,1.00 * Layout1.Height)
	'pDocList.LoadTableFromCSV(File.DirAssets, "datus.csv", True)
	'pDocList.SetDatagrid(Array As String ("A","B","C"),Array(Array As String("1","2","3"),Array As String("4","5","6")))

End Sub

'If SubExists(mCallBack,mEventName & "_" & "ExampleEvent") Then
'	CallSub2(mCallBack,mEventName & "_" & "ExampleEvent",123)
'End If
Sub Image1_click()
End Sub
Sub btnProfile_click()
End Sub
Sub btnQr_click()
End Sub
Sub btnSchedule_click()
End Sub
Sub btnUpload_click()
End Sub
Sub btnAppointments_click()
End Sub
Sub btnHotline_click()
End Sub
Sub btnUpdates_click()
End Sub
Sub btnLogs_click()
End Sub
Sub lblName_click()
End Sub
Sub lblProgress_click()
End Sub
Sub progressBar_click()
End Sub
Sub ProgressPercent_click()
End Sub
Sub btnMedications_click()
End Sub
Sub Layout1_click()
End Sub
Sub pDocList_CellClick (Col As Int, Row As Int)
	Log("CellClick: " & Col & " , " & Row)
	Dim val As String = pDocList.GetValue(Col, Row)
	ToastMessageShow(val,False)
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
