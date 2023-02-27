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
			<a class="nav-item nav-link active" href="turb">Details</a>
		</nav>
		<a class="navbar-brand" href="#"> <img
				src="https://tse2.mm.bing.net/th?id=OIP.phzccXej_Pd-CP3sJ4jnzwHaE8&pid=Api&P=0"
				alt="" width="80" height="48"></a>
	</nav> 
 
	<h3><span style="color:red;">${message}</span></h3> 
	
	<form action="search" method="get">
		<pre>
		 Search By Id <input type="text" name="id">
		 
		 <input type="submit" class="btn btn-primary" value="search">
			
			  Company : ${dto.company}
			  Name    : ${dto.name}
			  Cost    : ${dto.cost}
			  Type    : ${dto.type}
			  Country : ${dto.country}
	 	</pre>
	</form>
</body>
</html>