<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
</head>
<body>
<%@include file="NewFile.jsp"%>
<form method="post" action="/LoginProject/cs">
UserName: <input type='text' name ='username'/>
Password: <input type='password' name ='password'/>
<%!   int ab=10;     %>

<%for(int j=0; j<10; j++) {
	ab=ab+j;
} %>
Value of i = <%= ab %>

<input type='submit' value = "login" name ='action'/>
<input type='submit' value = "logout" name ='action'/>

</form>

<%-- --%>

</body>
