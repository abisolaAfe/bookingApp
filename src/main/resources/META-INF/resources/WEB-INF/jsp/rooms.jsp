<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
				    <div class= "container">
				    <title>Update room clean status</title>
						     <h1>Welcome ${lastName}</h1>
						      <hr>
							<table class = "table">
								<thead>
										<tr>
											<th>Room Number</th>
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
					  	<%@ include file = "common/footer.jspf" %>
</html>