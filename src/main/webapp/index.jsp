<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
Welcome <%= session.getAttribute("loggedin") %>
<form action="/login" method="POST">
<p>Username: <input type="text" name="username"/></p>
<input type="submit"/>
</form>
</body>
</html>