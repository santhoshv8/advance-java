<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By Company</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<nav class="navbar navbar-dark bg-dark">
			<a class="navbar-brand" href="#"> <img
				src="https://tse1.mm.bing.net/th?id=OIP.bxyDtFEupXIi1Xr32QDQhgHaF7&pid=Api&rs=1&c=1&qlt=95&w=132&h=105"
				alt="" width="80" height="48"></a> <a
				class="nav-item nav-link active" href="rese">Register</a> <a
				class="nav-item nav-link active" href="index.jsp">Home</a>
		</nav>
	</nav>
<span style="color:green;">${messagedelete}</span>

	<h1>Welcome To Aeroplane Search</h1>
	<form action="searchbycompany" method="get">

		Search By Company <input type="text" name="company"> 
		                  <input type="submit" class="btn btn-primary" value="search">
	</form>

	<table>
		<tr>
			<th>Id</th>
			<th>Company</th>
			<th>Name</th>
			<th>Cost</th>
			<th>Type</th>
			<th>Country</th>
		</tr>

		<c:forEach items="${list}" var="t">
			<tr>
				<td>${t.id}</td>
				<td>${t.company}</td>
				<td>${t.name}</td>
				<td>${t.cost}</td>
				<td>${t.type}</td>
				<td>${t.country}</td>
				<td><a href="update?id=${t.id}"> Update </a></td>
				<td><a href="delete?id=${t.id}"> Delete </a></td>
			</tr> 
		</c:forEach>
	</table>
</body>
</html> 