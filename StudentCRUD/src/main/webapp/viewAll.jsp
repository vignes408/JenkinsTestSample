<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("https://images.pexels.com/photos/6985136/pexels-photo-6985136.jpeg?cs=srgb&dl=pexels-codioful-6985136.jpg&fm=jpg");
 
}
h1{
color:rgb(82, 122, 122);
}
form{
background-color:rgb(255, 179, 209);
padding:4rem;
margin:0px auto;
width:80%
 
}
select{
	width:200px;
	height:30px;
}
input[type="text"]{
	width:150px;
	height:20px;
}
input[type="number"]{
	width:150px;
	height:20px;
}
input[type="submit"]{
border:none;
width:100px;
height:30px;
background-color:rgba(28, 180, 28, 0.605);
border-radius:3px;
font-weight:bold;
color:blue;
font-size:20px;
}
 
input[type="button"]{
border:none;
width:100px;
height:30px;
background-color:rgba(28, 180, 28, 0.605);
border-radius:3px;
font-weight:bold;
color:blue;
font-size:20px;
}
 
label{
font-weight:bold;
font-size:20px;
color:rgb(191, 64, 128);
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
 
function enableFields(button) {
    const row = button.closest('tr');
    const textInputs = row.querySelectorAll('input[type="text"]');
    textInputs.forEach(input => input.removeAttribute('disabled'));
}
 
</script>
</head>
<body>
<center>
<form action = "operation" method="post">
<h1>Student Details</h1>
<table cellpadding="10px" border="7" >
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student City</tr>
</tr>
 
<tr>
<c:forEach items="${StudList}" var="stud" >
<td><input type="text" value="${stud.getId()}" name="id" disabled ></td>
<td><input type="text" value="${stud.getSname()}" name="sname" disabled></td>
<td><input type="text" value="${stud.getScity()}" name="scity" disabled></td>
<td><input type="button" onclick="enableFields(this)" value="Edit" style="background-color:blue; color:white"></td>
<td><input type="Submit" value="Save" name="action" style="background-color:green; color:white"></td>
<td><input type="Submit" value="Delete" name="action" onclick="enableFields(this)" style="background-color:red; color:white"></td>
</tr>     
</c:forEach>
 
<tr>
<td><input type="number" name="id" placeholder="Enter id" disabled="disabled"></td>
<td><input type="text" name="sname" placeholder="Enter sname"></td>
<td><input type="text" name="scity" placeholder="Enter scity"></td>
<td colspan="3"><input type="Submit" Value="Add" name="action"></td>
</tr>
 
</table>
</form>
 
 
</center>
</body>