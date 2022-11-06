<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update location</title>
</head>
<body>
<form action="updateLocation" method="post">
<c:set var="location" value="${location}"></c:set>
	<pre>
		Id<input type="text" name="id" value="${location.id}" readonly="readonly" /> 
		Name<input type="text" name="name" value="${location.name}" />
		City<input type="text" name="city" value="${location.city}" />
		Type:Urban <input type="radio" name="type" value="Urban" />	
		Rural <input type="radio" name="type" value="Rural" />
		<input type="submit" value="update" />	
	</pre>
</form>
</body>
</html>