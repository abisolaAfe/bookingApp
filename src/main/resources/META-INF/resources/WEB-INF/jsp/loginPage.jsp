<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
		<head>
		    <link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		<title>Login page </title>
		</head>
				<body>
				<div class="container"class=center>
				<h2>Enter Login Details</h2>
				<hr>
			<div> ${errorMessage}</div>
				  <form method = "post" >
		 <br>  Enter  username:  <input type = "text" name ="loginName"><br>
	<br>	Enter   password: <input type = "password" name = "password"> <br>
				<br>  <input type = submit class = "btn btn-SUCCESS" >	 <br> 
				  </form>
				  </div>
				   <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
				   <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
				</body>
		
</html>