<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous">
	
</script>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<nav class="navbar navbar-dark bg-dark">
			<a class="navbar-brand" href="#"> <img
				src="https://tse4.mm.bing.net/th?id=OIP.un91CaXqNMjadbNPwESv7gHaE8&pid=Api&P=0"
				alt="" width="80" height="48">
			</a> <a class="nav-item nav-link active" href="index.jsp">Home</a>
			<a class="nav-item nav-link active" href="TurbineSearch.jsp">Search By Id</a>
		</nav>
		<a class="navbar-brand" href="#"> <img
				src="https://tse2.mm.bing.net/th?id=OIP.phzccXej_Pd-CP3sJ4jnzwHaE8&pid=Api&P=0"
				alt="" width="80" height="48"></a>
	</nav> 
	
	<c:forEach items="${error}" var="e">
	   <p>
	   <span style="color:red;">${e.message}</span>
	   </p>
	</c:forEach>
<form action="turb" method="post">
	<div class="mb-3"> 
		<label for="exampleFormControlInput1" class="form-label">Company : </label> 
			<input type="text" class="form-control" name="company"
				   id="exampleFormControlInput1" placeholder="Enter Company">
	</div>
	
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Name : </label> 
			<input type="text" class="form-control" name="name"
				   id="exampleFormControlInput1" placeholder="Enter Name">
	</div>
	
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Cost : </label> 
			<input type="text" class="form-control" name="cost"
				   id="exampleFormControlInput1" placeholder="Enter Cost">
	</div>
	
	<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">TYPE : </label> 
			<select class="custom-select" name="type" >
				<option value="">SELECT TYPE</option>
				<c:forEach items="${type}" var="t">
				<option value="${t}">${t}</option>
				</c:forEach>
			</select>
        </div> 
	
	<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">COUNTRY : </label> 
			<select class="custom-select" name="country" >
				<option value="">SELECT COUNTRY</option>
				<c:forEach items="${country}" var="c">
				<option value="${c}">${c}</option>
				</c:forEach>
			</select>
        </div> 
	
	<input type="submit" class="btn btn-primary" value="submit">
</form>
</body> 
</html>