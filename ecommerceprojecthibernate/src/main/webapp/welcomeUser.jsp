<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <style type="text/css">
.bg, html{
  height: 100%; 
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="bg" style="text-align: center; margin-top: 50px;" background="images/LandingStock_image_26.jpg">

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

		if (session.getAttribute("username") == null) {
			response.sendRedirect("index.jsp");
		}
	%>

<h1 style="font-family: cursive;">Welcome, ${username} </h1>
	<br>
	<form action="ProductServlet" method="post">
		<input type="submit" class="btn btn-primary btn-lg" value="See Our Products">
	</form>
	<br>
	<form action="Logout" method="post">
		<input type="submit" class="btn btn-danger btn-lg" value="Logout">
	</form>
	
	

</body>
</html>