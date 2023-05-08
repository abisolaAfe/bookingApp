<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		<head>
		<title>Add  Room </title>
		</head>
		
				<body>
				<div class="container">
				    Add Room
				  <form method = "post" >
			Room Number:	  <input type = "number" name ="roomNum">
				  <input type = submit class = "btn btn-SUCCESS">
				  </form>
				  </div>
				  <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
				 <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
				</body>
		
</html>