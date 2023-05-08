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
											<th>Worker </th>
											<th>Room Number</th>
											<th>Item Description </th>
											<th>Price</th>
											<th> Quantity  </th>
											<th> Time  </th>
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
					     <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
					      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		  </body>
</html>