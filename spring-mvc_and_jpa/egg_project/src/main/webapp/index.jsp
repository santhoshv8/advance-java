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
		<a class="navbar-brand" href="#"> <img
			src="https://raw.githubusercontent.com/X-workzDev01/xworkzwebsite/master/src/main/webapp/assets/images/Logo.png"
			alt="" width="80" height="48">
		</a> <a class="nav-item nav-link active" href="index.jsp">Home</a>
	</nav>

	<h1>Egg Application</h1>

	<form action="egg" method="post">

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name:
			</label> <input type="text" class="form-control" name="hotelName"
				id="exampleFormControlInput1" placeholder="Enter hotel Name">
		</div>

		<div class="form-group">
			<label for="exampleFormControlSelect1">Egg Dish Name</label> <select
				class="form-control" id="exampleFormControlSelect1" name="dishName">
				<option>Select</option>
				<option>Omlet</option>
				<option>Egg Rice</option>
				<option>Boiled Egg</option>
				<option>Egg Burge</option>
				<option>Egg Puff</option>
				<option>Egg Masala</option>
			</select>
		</div>

         <div class="form-group">
			<label for="exampleFormControlSelect2">Type</label> <select
				multiple class="form-control" id="exampleFormControlSelect2" name="type">
				<option>Nati koli</option>
				<option>Boiler</option>
			</select>
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
				Price</label> <input type="text" class="form-control" name="price"
				id="exampleFormControlInput1" placeholder="enter price">
		</div>


		<div class="form-group">
			<label for="exampleFormControlSelect2">Quantity</label> <select
				multiple class="form-control" id="exampleFormControlSelect2" name="quantity">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
			</select>
		</div>

		<div class="mb-3">
			<label>Take Away</label> 
			<input type="radio" value="true" name="takeAway">yes 
			<input type="radio" value="false" name="takeAway">no
		</div>


		<input type="submit" class="btn btn-sucess" value="order">

	</form>
</body>
</html> 