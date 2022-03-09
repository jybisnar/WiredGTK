B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private mModule As Object
	Private mEventName As String
	Private wsh As Socket
	Private wtaserverIO As AsyncStreams
	Dim connected As Boolean=False
	Dim myid As String="456"
	Dim clientid As String="123"
	Private tmrwtaserver As Timer

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pModule As Object, pEventName As String,id As String,clientid_ As String)
	mModule    = pModule
	mEventName = pEventName
	myid=id
	clientid=clientid_
End Sub
Sub wsh_Connected(Successful As Boolean)
	ProgressDialogHide

	If Successful Then
		'ProgressDialogShow2("Sending Request To Server",True)
		wtaserverIO.Initialize(wsh.InputStream,wsh.OutputStream,"wsh")
		Dim strs As String="WTAREGISTER^"&myid & Chr(13)
		wtaserverIO.Write(strs.GetBytes("UTF8"))
		connected=True
	Else
		wsh.Close
		Msgbox("Please Tr-y Again","Error Connecting")
	End If
End Sub

Sub wsh_NewData(Buffer() As Byte)
	Dim mLine As String
	mLine = BytesToString(Buffer,0,Buffer.Length,"UTF-8")
	If SubExists(mModule,mEventName & "_" & "NewData") Then
		CallSub2(mModule,mEventName & "_" & "NewData",mLine)
	End If
	
End Sub
Sub SendServer(s As String)
	Try	
		s=s&Chr(13)
		If wtaserverIO.IsInitialized Then
			wtaserverIO.Write(s.GetBytes("UTF8"))
		Else
			InitWTAServer
		End If
	Catch
		ToastMessageShow("Check Internet",False)
	End Try
End Sub
Sub SendClient(s As String)
	Try
		If wtaserverIO.IsInitialized Then
			s="WTARELAY^" & clientid & "^" & s & Chr(13)
			wtaserverIO.Write(s.GetBytes("UTF8"))
		Else
			connected=False
			InitWTAServer
		End If
	Catch
		ToastMessageShow("Check Internet",False)
	End Try	
End Sub

Sub wtaserver_Terminated()
	ToastMessageShow("Terminated raks",False)
	connected=False
End Sub
Sub wtaserver_Error()
	wtaserverIO.Close
	wsh.Close
	connected=False
	ToastMessageShow("wtaserver_Error",False)
End Sub
Sub InitWTAServer
	Try
		If tmrwtaserver.IsInitialized=False Then
			tmrwtaserver.Initialize("tmrwtaserver",5000)
			tmrwtaserver.Enabled=True
		End If
		If CheckConnection  Then
			wsh.Initialize("wsh")
			wsh.Connect("107.180.92.29",5001,30000)
		End If
	Catch
		ToastMessageShow("Check Internet",False)
	End Try
End Sub
Sub tmrwtaserver_Tick
	SendServer("x")'prevent disconnection
End Sub
Sub CheckConnection As Boolean
	Dim p As Phone
  
	If (p.GetDataState == "CONNECTED") Then
		Return True
	End If
      
	If (p.GetSettings ("wifi_on") == 1) Then
		Return True
	End If
  
	If (p.GetDataState == "DISCONNECTED") Then
		Return False
	End If
  
	If (p.GetDataState == "SUSPENDED") Then
		Return False
	End If
	Return False
End Sub
