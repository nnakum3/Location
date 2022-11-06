<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Name </th>
		<th>City </th>
		<th>Type </th>
		<th>Delete</th>
		<th>Update</th>

		
	</tr>
	<c:forEach var="location" items="${location}">
	<tr>
		<td> ${location.name} </td>
		<td> ${location.city} </td>
		<td> ${location.type} </td>
		<td><a href="delete?id=${location.id}">delete</a> </td>
		<td><a href="update?id=${location.id}">update</a> </td>
	 </tr>
	</c:forEach>
</table>
</body>
</html>