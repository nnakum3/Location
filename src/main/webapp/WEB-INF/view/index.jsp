<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post">
	 <table>
	 	<tr>
	 		<td>Name </td>
	 		<td> <input type="text" name="name"> </td>
	 	</tr>
	 		<tr>
	 		<td>City</td>
	 		<td> <input type="text" name="city"> </td>
	 	</tr>
	 		<tr>
	 		<td>Area type </td>
	 		<td>Urban :
	 		 <input type="radio" name="type" value="urban"> 
	 		Rural :
	 		<input type="radio" name="type" value="rural"> </td>
	 	</tr>
	 		<tr>
	 		<td> <input type="submit" value="save"> </td>
	 	</tr>
	 </table>
</form>
</body>
</html>