<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
		<head>
		<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		<title>Testing form page </title>
		</head>
				<body>
			
                <div class="container col-md-5 col-md-offset-8" >
                <div class="card">
                <div class=card-body>
               
				  <form method = "post" >
				  <h1>Create  Profile</h1>
				  <hr>
			<br> <label>First Name</label><input type= "text" class="form-control" name="firstName"><br>
		   <br> <label>Last Name</label><input type = "text" class="form-control" name ="lastName"><br>
		  <br><label>User Name</label><input type = "text" class="form-control" name ="loginName"><br>
		  <br><label>Password</label><input type = "password" class="form-control"name = "password"><br>
		  <div class="form-group">
		 <br> <label >Role</label><input type= "text" class="form-control" name="role"><br>
		  </div>
		    <div class="form-group">
			 <br> <input type = submit class = "btn btn-SUCCESS">
			 </div>
				  </form>
				  </div>
				  </div>
				  </div>
				  	     <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
					      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
				</body>
		
</html>