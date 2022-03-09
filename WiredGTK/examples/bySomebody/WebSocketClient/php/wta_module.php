<?php
function getCSV($x, $ch, $str) 
{
$a=0;
$b=0;
$dst='';
	while ($x!=0)
	{
	    if ((SubStr($str, $b, 1)) == $ch) 
			    $x--;
	    $b++;
	    if($b>strlen($str))
		return '';
		
	}
	while ((SubStr($str, $b, 1)) != $ch)
	{
		if(ord(SubStr($str, $b, 1))==0)break;
		$dst = $dst . SubStr($str, $b, 1);
		$b++;
		if($b>strlen($str))
			return '';
	}
	return $dst;
}
Function IsExist($Table, $Fields, $Fieldsval) 
{
	$result=mysql_query("select * from $Table where $Fields = '$Fieldsval'"); 
	$num_rows = mysql_num_rows($result);
	if($num_rows>=1)
		return 1;
	else
		return 0;
}
Function IsExist2($Table, $Fields1, $Fieldsval1,$Fields2, $Fieldsval2) 
{
	$result=mysql_query("select * from $Table where $Fields1 = '$Fieldsval1' and $Fields2 = '$Fieldsval2'"); 
	$num_rows = mysql_num_rows($result);
	if($num_rows>=1)
		return 1;
	else
		return 0;
}
Function GetSingleRec($Table, $Fields, $Fieldsval,$retvalfields) 
{
	$result=mysql_query("select * from $Table where $Fields = '$Fieldsval'"); 
	$num_rows = mysql_num_rows($result);
	if($num_rows>=1)
	{
		$row = mysql_fetch_array($result);
		return $row[$retvalfields];
	}
	else
	{
		return "";
	}
}
Function GetSingleRec2($Table, $Fields1, $Fieldsval1,$Fields2, $Fieldsval2,$retvalfields) 
{
	$result=mysql_query("select * from $Table where $Fields1 = '$Fieldsval1' and $Fields2 = '$Fieldsval2'"); 
	$num_rows = mysql_num_rows($result);
	if($num_rows>=1)
	{
		
		$row = mysql_fetch_array($result);
		return $row[$retvalfields];
	}
	else
	{
		return "";
	}
}
Function UpdateSingleRec2($Table, $Fields1, $Fieldsval1,$Fields2, $Fieldsval2,$updatefields,$updatevalue) 
{
	$result=mysql_query("UPDATE $Table SET [$updatefields]='$updatevalue' where $Fields1 = '$Fieldsval1' and $Fields2 = '$Fieldsval2'"); 
	$num_rows = mysql_num_rows($result);
	if($num_rows>=1)
	{
		
		$row = mysql_fetch_array($result);
		return $row[$retvalfields];
	}
	else
	{
		return "";
	}
}

?>
