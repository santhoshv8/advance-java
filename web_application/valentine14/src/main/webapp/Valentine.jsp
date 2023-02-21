<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-WORKZ</title>
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
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48">
			</a> <a class="nav-item nav-link active" href="index.jsp">Home</a>
			<a class="nav-item nav-link active" href="ValentineSearch.jsp">ValentineSearch</a>
		</nav>
	</nav>

	<h1>welcome to valentine Details</h1>
  
     <c:forEach items="${error}" var="e">
      <p>
      <span style="color:red;">${e.message}</span>
      </p>
     </c:forEach>
 
	<form action="vale" method="post"> 
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name
				: </label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Enter Name">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Valentine Name : </label> 
			<input type="text" class="form-control" name="valentineName"
				id="exampleFormControlInput1" placeholder="Enter Valentine Name">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Places : </label> 
			<select class="custom-select" name="place" >
				<option value="">SELECT PLACE</option>
				<c:forEach items="${places}" var="p">
				<option value="${p}">${p}</option>
				</c:forEach>
			</select>
        </div>
        
        <div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Gift : </label> 
			<select class="custom-select" name="gift" >
				<option value="">SELECT GIFT</option>
				<c:forEach items="${gifts}" var="g">
				<option value="${g}">${g}</option>
				</c:forEach>
			</select>
        </div> 
		
		<input type="submit" class="btn btn-primary" value="submit">
	</form>
</body>
</html>