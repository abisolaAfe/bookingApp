<html>
<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
				<div class="container col-md-5 col-md-offset-8" >
				   <h5  class="container center"> ADD  R00M</h5> 
				    <hr/>
				    <h5> ${roomAdded}</h5>
				  <form method = "post" >
			Room Number:	  <input type = "number" name ="roomNum">
				  <input type = submit class = "btn btn-SUCCESS">
				  </form>
				  </div>
				<%@ include file = "common/footer.jspf" %>
</html>