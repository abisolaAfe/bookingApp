
<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
				     <div class="container col-md-5 col-md-offset-8">
				     <div div class=card-body>
			
			 <form:form method="post" modelAttribute="booking">
			 <h3 style="text-align: center;" >Record  Booking</h3>
		 <br>     Guest First Name <form:input type = "text"   class='form-control' path= "guestFirstName" /><br>
		 <br>     Guest Last Name <form:input type = "text"  class='form-control'  path= "guestLastName" /> <br>
		  <br>    Guest Address  <form:input type = "text"  class='form-control' path="guestAddress" /><br>
		                                   <form:input type = "hidden" path="checkingTime" />
		                                  <form:input type = "hidden" path="checkOutTime" />
		                                  <form:input type = "hidden" path="worker" />
		                                  <form:input type = "hidden" path="room" />
		     <br> Booking length <input type ="text"   class='form-control' name= "duration" /><br>
		  <br>   <div class= "container-center" >
				             <label for="dropdown" class="center">Select a room</label>
		                     <select name="roomNumber">
		                     <c:forEach items ="${allRooms}" var = "Rooms">
		                     <option value="${Rooms.roomNumber }"> ${Rooms.roomNumber}</option>
		                     </c:forEach>
		                     </select>
                  </div>><br>
				 <div style="text-align: center;">
				<br>  <input type = submit class = "btn btn-SUCCESS m-0" />	 
				</div> 
				  </form:form>
				        </div>
				        </div>
				        	<%@ include file = "common/footer.jspf" %>
		
</html>