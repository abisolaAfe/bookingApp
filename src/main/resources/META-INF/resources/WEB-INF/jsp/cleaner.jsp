<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
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
					  	<%@ include file = "common/footer.jspf" %>
</html>