<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
<div class="container col-md-5 col-md-offset-8" >
		<div class="card">
					<div class=card-body>
							<form method = "post" >
							      <h4> ${profileCreated}</h4>
								  <h1>Create  Profile</h1>
								  <hr>
										<br> <label>First Name</label><input type= "text" class="form-control" name="firstName"><br>
										 <br> <label>Last Name</label><input type = "text" class="form-control" name ="lastName"><br>
										 <br><label>Username</label><input type = "text" class="form-control" name ="loginName"><br>
										 <br><label>Password</label><input type = "password" class="form-control"name = "password"><br>
										 <div class="form-group">
												<label for ="dropdown" class="center"> Select a role</label>
												<select name= "role">
												<option value ="manager">Manager</option>
												<option value ="receptionist">Receptionist</option>
												<option value ="cleaner">Cleaner</option>
												<option value ="waiter">Waiter</option>
												</select>
							 			</div>
									   <div class="form-group">
									    <br> <input type = submit class = "btn btn-SUCCESS">
									 </div>
								  </form>
					</div>
		</div>
</div>
	   <%@ include file = "common/footer.jspf" %>
		
</html>