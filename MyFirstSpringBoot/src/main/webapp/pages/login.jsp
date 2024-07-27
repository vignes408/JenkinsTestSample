<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<style type="text/css">
form{
margin: 0 auto;
width: 500px;
background-color: black;
border-radius: 10px
}
#div1{
margin-top: 2rem;
}
#val{
text-align: center;
align-content: center;}
#sub{
width: 20%;
margin-bottom:5%;
font-weight: bold;
background-color: yellow;
}
</style>

</head>
<body>
<div id="val">
<form action="validate" id="div1">
<h2 style="color: white;">Enter User Name: </h2><br>
<input type="text" name="uname"><br>
<h2 style="color: white;">Enter Password: </h2><br>
<input type="text" name="pwd"><br><br>
<input type="submit" value="Login" id="sub">
</form>
</div>
<%
String result = (String) request.getAttribute("Action");

if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Login Success</font></h3>");
}
else{
	 out.print("<h3><font color=red>Login Failure</font></h3></div>");
}
 
}
%>
</body>
</html>