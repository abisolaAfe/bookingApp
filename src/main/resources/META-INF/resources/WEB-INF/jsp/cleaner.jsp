<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
											<th>BookingStatus </th>
											<th>Clean Status</th>
											<th></th>
										</tr>
								</thead>
							<tbody>
								<c:forEach items ="${allRooms}" var = "Rooms">
									<tr>
										<td>${Rooms.roomNumber} </td>
										<td>${Rooms.roomAvailableTime} </td>
										<td> ${Rooms. bookingStatus}</td>
										<td>${Rooms.cleanStatus} </td>
										<td><a href = "update-cleaning?id=${Rooms.roomNumber}" class = "btn btn-SUCCESS"> Update</a></td>
									</tr>
									</c:forEach>
							</tbody>
							</table>
					</div>
					     <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
					      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		  </body>
</html>