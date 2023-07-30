<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <nav class = "navbar navbar-expand-md navbar-light bg-light mb-3 p-1 ">
      	      <a class= "navbar-brand m-1" href= "https://afeezdigitalspace.netlify.app/" target="_blank"> Developer's Website</a>
        	      <div class= "collapse navbar-collapse">
          	          <ul class="navbar-nav">
          	              <li class= "nav-item"><a class="nav-link" href="/discription">Discription</a>
          	               <li class= "nav-item"><a class="nav-link" href="/dashboard">Dashboard</a>
          	          </ul>
        	      </div>
          	      <ul class="navbar-nav">
          	          <li class= "nav-item"><a class="nav-link" href="/logout">Logout</a></li>
          	      </ul>
   </nav>
<html>
	    <head>
	        <link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		        <title>Home page</title>
		</head>
				<body>
				    <div class= "container" class="center">
						     <h1>Welcome ${lastName}</h1>
						      <hr>
						      <font size="+3">
								<br><a href = "add-worker"> click</a>to create a worker profile<br>
								<br> <a href = "sales"> click</a>to check sales<br>
								 <br><a href = "bookings"> click</a>to view bookings<br>
								  <br><a href = "add-room"> click</a>to add a room<br>
								 
								</font>
					</div>
					     <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
					      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		  </body>
</html>