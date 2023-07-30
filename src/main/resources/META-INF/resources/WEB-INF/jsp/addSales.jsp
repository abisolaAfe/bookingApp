
<%@ include file = "common/header.jspf" %>
 <nav class = "navbar navbar-expand-md navbar-light bg-light mb-3 p-1 ">
      	      <a class= "navbar-brand m-1" href= "https://afeezdigitalspace.netlify.app/" target="_blank"> Developer's Website</a>
        	      <div class= "collapse navbar-collapse">
          	          <ul class="navbar-nav">
          	              <li class= "nav-item"><a class="nav-link" href="/discription">Discription</a>
          	          </ul>
        	      </div>
          	    
   </nav>
				<div class="container col-md-5 col-md-offset-8" >
				<h1> Enter Sales Details</h1>
				<hr>
				  <form:form method = "post" modelAttribute= "sale">
			                                               <form:input type = "hidden" path ="worker"/> 
		                                                   <form:input type = "hidden" path ="room"/> 
		           <br>  Item Description  <form:input type = "text" class='form-control' path ="itemDescription"/><br>
		            <br>  Price                    <form:input type = "number" class='form-control' path ="price"/><br>
		           <br>   Quantity               <form:input type = "number" class='form-control' path ="quantity"/> <br> 
		                                                    <form:input type = "hidden" path ="timeOfSales"/> 
		                                                    <form:input type = "hidden" path ="amount"/> 
		         <div class= "container-center" >
				             <label for="dropdown" class="center">Select a room</label>
		                     <select name="dropdown">
		                     <c:forEach items ="${allRooms}" var = "Rooms">
		                     <option value="${Rooms.roomNumber }"> ${Rooms.roomNumber}</option>
		                     </c:forEach>
		                     </select>
                  </div>
                     <div>
				    <br> <input type = submit class = "btn btn-SUCCESS">
				    </div>
				  </form:form>
				  </div>
<%@ include file = "common/footer.jspf" %>
		
</html>