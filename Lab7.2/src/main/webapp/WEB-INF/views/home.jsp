<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Hotel Search</h1>
City<br><br>
<form action="/results">
<select name="city"><option value="Dallas">Dallas</option>
					<option value="Las Vegas">Las Vegas</option>
					<option value="Detroit">Detroit</option>
					<option value="Vancouver">Vancouver</option>
</select><br><br>
<input type="submit" value="Go!"></form>
</body>
</html>