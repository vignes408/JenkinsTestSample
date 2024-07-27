<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
#b1{
width: 12%;
}
form {
margin: 0 auto;
width:500px;
background-color: black;
border-radius: 10px;
}
#div1{
margin-top: 3rem;
}
h1{
margin-top: 2rem;
}
h2{
color: orange;
}
body {
    background-color: orange;
}
</style>
</head>
<body>
<h1 style="color: black; text-align: center;">Delete Student by ID</h1>
<div class="form-container" id="div1">
<center>
<form action="Deletion" method="post">
<br>
<h1 style="color: orange;">Select ID               :</h1><br>
       <select name="id">
       <option selected>Select ID </option>
       <c:forEach items="${IdList}" var="id" >
      <option value="${id}">${id}</option>
      </c:forEach>
      </select>
     
      <br><br><br>
      <input type="Submit" value="Delete" name="button" id="b1">
      <br>
      <br>
</form>
</center>
</div>
<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
   
if(result.equals("Success")){
     out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
}
else{
     out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>