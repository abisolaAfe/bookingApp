<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
				    <div class= "container">
						     <h1>Welcome ${lastName}</h1>
						      
							<table class = "table">
								<thead>
										<tr>
											<th>Worker </th>
											<th>Room Number</th>
											<th>Item Description </th>
											<th>Price</th>
											<th> Quantity  </th>
											<th> Date & Time  </th>
											<th> Amount  </th>
										</tr>
								</thead>
							<tbody>
								<c:forEach items ="${allSales}" var = "Sales">
									<tr>
										<td>${Sales.worker.lastName} </td>
										<td>${Sales.room.roomNumber} </td>
										<td> ${Sales.itemDescription}</td>
										<td>${Sales.price} </td>
										<td>${Sales.quantity} </td>
										<td>${Sales.timeOfSales} </td>
										<td>${Sales.amount}</td>
									</tr>
									</c:forEach>
							</tbody>
							</table>
								<a href = "add-sales" class = "btn btn-SUCCESS"> Add Sales</a>
					</div>
<%@ include file = "common/footer.jspf" %>
</html>