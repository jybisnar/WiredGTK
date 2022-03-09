B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7
@EndOfDesignText@
Sub Class_Globals
	Dim obj1 As Int=0
	Dim obj2 As Int=0
	Dim timer1 As Timer
	Dim MAX1 As Int=10
	Dim MAX2 As Int=10
	Dim label1 As Label
	Dim label2 As Label
	Dim label3 As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(lb1 As Label,lb2 As Label,lb3 As Label)
	timer1.Initialize("Timer1", 2000)
	timer1.Enabled = True
	label1=lb1
	label2=lb2
	label3=lb3
	lb1.Text=0
	lb2.Text=0
	lb3.Text=""
End Sub
Sub Timer1_Tick
	'Handle tick events
	check
End Sub

public Sub objectdetected(x As String) As Int
	Dim arr() As String = Array As String("Bottle","Cup","Can","Box")
	Dim value() As Int = Array As Int(1,1,2,2)
	For a=0 To arr.Length-1
		If x.Contains(arr(a)) Then
			label3.Text=x
			If  value(a)=1 Then
				obj1=obj1+1
			End If
			If  value(a)=2 Then
				obj2=obj2+1
			End If
		End If
	Next
	label1.Text=obj1
	label2.Text=obj2
	check
	Return -1
End Sub
Sub check()
	If obj1>=MAX1 Then
		label1.TextColor=Colors.Red
		'Log("Bin 1 Max")
		'toastmessageShow("Bin 1 Max",False)
	end	if
	If obj2>=MAX2 Then
		label2.TextColor=Colors.Red
		'Log("Bin 2 Max")
		'toastmessageShow("Bin 2 Max",False)
	end	if
End Sub				