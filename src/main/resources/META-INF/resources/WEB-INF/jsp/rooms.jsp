<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	    <head>
	        <link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		        <title>manage room cleaning</title>
		</head>
				<body>
				    <div class= "container">
						     <h1>Welcome ${lastName}</h1>
						      <hr>
							<table class = "table">
								<thead>
										<tr>
											<th>Room Number</th>
											<th>Available Time</th>
											<th>Booking Status </th>
											<th>Clean Status</th>
											<th> Checking Time  </th>
											<th> Checkout Time  </th>
											<th>Cancel Booking</th>
										</tr>
								</thead>
							<tbody>
								<c:forEach items ="${allBookings}" var = "Bookings">
									<tr>
										<td>${Bookings.room.roomNumber} </td>
										<td>${Bookings.room.roomAvailableTime} </td>
										<td> ${Bookings.room. bookingStatus}</td>
										<td>${Bookings.room.cleanStatus} </td>
										<td>${Bookings.checkingTime} </td>
										<td>${Bookings.checkOutTime} </td>
										 <td><a href = "cancelBooking?id=${Bookings.bookingId}" class = "btn btn-WARNING"> cancel</a></td>
									</tr>
									</c:forEach>
							</tbody>
							</table>
							 <a href = "bookARoom" class = "btn btn-SUCCESS"> Book A Room</a>
					</div>
					     <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
					      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		  </body>
</html>