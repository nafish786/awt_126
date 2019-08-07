<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <h1>LOGIN </h1>
    <form action="Logserv" method="post">
         Name  <input type="text" name="name" ><br>
         Password  <input type="password" name="pass" ><br>
         <input type="submit" value="login">
    
    </form>
    <p><a href="register.jsp">Register</a> if you don't have account.</p>
</body>
</html>