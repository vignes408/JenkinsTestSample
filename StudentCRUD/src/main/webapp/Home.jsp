<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
<center>
<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<center><h1><font color=green>Record Successfully Updated</font></h1></center>");
}
else{
	 out.print("<center><h1><font color=red>Record Updatation Failed</font></h1></div></center>");
}
 
}
%>
<%
String result1 = (String) request.getAttribute("Action1");
 
if(result1!=null){
	
if(result1.equals("Success")){
	 out.print("<center><h1><font color=green>Record Deleted Successfully </font></h1></center>");
}
else{
	 out.print("<center><h1><font color=red>Record Deletion Failed</font></h1></div></center>");
}
 
}
%>
<%
String result2 = (String) request.getAttribute("Action2");
 
if(result2!=null){
	
if(result2.equals("Success")){
	 out.print("<center><h1><font color=green>Record Insert Successfully </font></h1></center>");
}
else{
	 out.print("<center><h1><font color=red>Record Insertion Failed</font></h1></div></center>");
}
 
}
%>
</center>
</body>
</html>