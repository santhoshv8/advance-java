<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x=workz</title>
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
				src="https://tse1.mm.bing.net/th?id=OIP.bxyDtFEupXIi1Xr32QDQhgHaF7&pid=Api&rs=1&c=1&qlt=95&w=132&h=105"
				alt="" width="80" height="48">
			</a>  <a class="nav-item nav-link active" href="rese">Register</a> 
			 <a	class="nav-item nav-link active" href="index.jsp">Home</a>
			<a class="nav-item nav-link active" href="AeroplaneSearch.jsp">Search By Id</a>
			<a class="nav-item nav-link active" href="SearchByCompany.jsp">Search By Company</a>
		</nav>
	</nav> 
	<h1> Aeroplane UPDATE</h1>
	
	
	<p > <span style="color:red">  ${message} </span> </p>
	
	<p > <span style="color:green">  ${message} </span> </p>
	

	<form action="update" method="post">
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Id : </label> 
			<input type="text" class="form-control" name="id" value="${dto.id}"
				   id="exampleFormControlInput1" placeholder="Enter id" readonly>
	</div>
		<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Company : </label> 
			<input type="text" class="form-control" name="company" value="${dto.company}"
				   id="exampleFormControlInput1" placeholder="Enter Company" readonly>
	</div>
	
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Name : </label> 
			<input type="text" class="form-control" name="name" value="${dto.name}"
				   id="exampleFormControlInput1" placeholder="Enter name" >
	</div>
	
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Cost : </label> 
			<input type="text" class="form-control" name="cost" value="${dto.cost}"
				   id="exampleFormControlInput1" placeholder="Enter Cost" >
	</div>
	
	<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">TYPE : </label> 
			<select class="custom-select" name="type" >
				<option value="">SELECT TYPE</option>
				<option value="${dto.type }">${dto.type }</option>
				<c:forEach items="${type}" var="t">
				<option value="${t}">${t}</option>
				</c:forEach>
			</select>
        </div> 
	
	<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">COUNTRY : </label> 
			<select class="custom-select" name="country" >
			    <option value="">SELECT COUNTRY</option>
			    <option value="${dto.country}">${dto.country}</option>
				<c:forEach items="${country}" var="c">
				<option value="${c}">${c}</option>
				</c:forEach>
			</select>
        </div> 
		<input type="submit" class="btn btn-primary" value="update" />
		
	</form> 
</body>  
</html>