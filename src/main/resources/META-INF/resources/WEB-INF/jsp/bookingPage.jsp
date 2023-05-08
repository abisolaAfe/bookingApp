
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<html>
		<head>
		 <link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		<title>BookingPage </title>
		</head>
				<body>
				     <div class= "container">
			<h1> Welcome ${lastName}</h1>
			<hr>
			 <form:form method="post" modelAttribute="booking">
			 <div class="center" >Record a booking</div>
		 <br>     Guest First Name:: <form:input type = "text" path= "guestFirstName" /><br>
		 <br>     Guest Last Name:: <form:input type = "text" path= "guestLastName" /> <br>
		  <br>    Guest Address:  <form:input type = "text" path="guestAddress" /><br>
		                                   <form:input type = "hidden" path="checkingTime" />
		                                  <form:input type = "hidden" path="checkOutTime" />
		                                  <form:input type = "hidden" path="worker" />
		                                  <form:input type = "hidden" path="room" />
		     <br> Booking length:: <input type ="text" name= "duration" /><br>
		  <br>    Room Number :: <input type ="text" name= "roomNumber" /><br>
				<br>  <input type = submit class = "btn btn-SUCCESS" />	  
				  </form:form>
				        </div>
				            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
					      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
				</body>
		
</html>