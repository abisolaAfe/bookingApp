<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	    <head>
	        <link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		        <title>Receptionist Page</title>
		</head>
				<body>
				    <div class= "container" class="center">
						     <h1>Welcome ${lastName}</h1>
						      <hr>
						      <font size="+4">
								 <br><a href = "bookings"> click</a>to view bookings<br>
								<br> <a href = "sales"> click</a>to check sales<br>
								</font>
					</div>
					     <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
					      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		  </body>
</html>