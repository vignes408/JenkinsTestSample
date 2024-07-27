<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
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
margin-top: 1rem;
}
body{
background-color: orange;
}
h2,h1{
color: orange;
}
</style>
</head>
<body>
<div class="form-container" id="div1">
<center>
<form action="Find" method="post">
<h1>View Student by ID</h1>
<h2 style="color: orange;">ID               :</h2><br>
	   <select name="id">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="id" >
      <option value="${id}">${id}</option>
      </c:forEach>
      </select>
	  <br><br>
	  <input type="Submit" value="Find" name="button"><br><br>
</form>
<br>
<form action="Find" method="post" modelAttribute="bean">
<br>
<input type="hidden" name="id" placeholder="ID" value=${Stud.getId()}>
<h2>Enter Student Name</h2>
<input type="text" name="sname" id="in" placeholder="Student Name" value=${Stud.getSname()}><br>
<h2>Enter Student City</h2>
<input type="text" name="scity" id="in" placeholder="Student City" value=${Stud.getScity()}><br>
<br><br> </form>
</div>
<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("success")){
	 out.print("<h3><font color=green>Update Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Update Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>