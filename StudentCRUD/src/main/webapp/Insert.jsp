<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form {
margin: 0 auto;
width:500px;
background-color: black;
border-radius: 10px;
}
#div1{
margin-top: 2rem;
}
h1{
margin-top: 2rem;
	color: black;
} 
h2{
color: orange;
}
body {
	background-color: orange;
}
#sub{
width: 35%;
}
</style>
</head>
<body>
<center><h1>Please Insert the Student Details!!!!!</h1></center>

<div class="form-container" id="div1">
<center>
<form action="Insertion" method="post" modelAttribute="bean"><br>
<h2>Enter Student Name</h2>
<input type="text" name="sname" id="in"><br>
<h2>Enter Student City</h2>
<input type="text" name="scity" id="in"><br>
<br><br>
<input type="submit" name="button" value="Insert" id="sub"><br><br><br>
</form>
</center>
</div>
<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><center><font color=green>Insertion Operation is Successfully Done</font></center></h3>");
}
else{
	 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
}
 
}
%>
</body>
</html>