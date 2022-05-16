<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
         <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<center>
<h1> Register Page</h1>
<form:form action="store" method="post" modelAttribute="bean">

Enter Name<form:input path="name"/><br/><br/>
Enter Password<form:input path="password"/><br/><br/>
Enter Address<form:input path="address"/><br/><br/>
Enter Email<form:input path="email"/><br/><br/>
Enter Mobile<form:input path="mobile"/><br/><br/>

<input type="submit" value="Register">

</form:form>
<h2> ${msg} </h2>
<center>
</body>

</html>