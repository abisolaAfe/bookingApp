<html>
                                 <%@ include file = "common/header.jspf" %>
 <nav class = "navbar navbar-expand-md navbar-light bg-light mb-3 p-1 ">
      	      <a class= "navbar-brand m-1" href= "https://afeezdigitalspace.netlify.app/" target="_blank"> Developer's Website</a>
        	      <div class= "collapse navbar-collapse">
		          	          <ul class="navbar-nav">
		          	              <li class= "nav-item"><a class="nav-link" href="/discription" >Discription</a>
		          	          </ul>
        	      </div>
   </nav>
											<div class="container col-md-4 col-md-offset-8" >
											       <div class="card-body">
											       <div class=card>
													<h2 style="text-align: center;"> Login </h2>
									                 <div style="text-align: center;"> ${errorMessage}</div>
															    <form method = "post" >
															                 <div style="text-align: center;">
													                       <br>    username:  <input type = "text" name ="loginName"><br>
													                       </div>
													                           <div style="text-align: center;">
												                           <br>   password: <input type = "password" name = "password"> <br>
												                           </div>
															               <div style="text-align: center;">
															               <br>  <input type = submit class = "btn btn-SUCCESS"   style="display: inline-block;">	 <br> 
															               </div>
															                <div style="text-align: center;">
															                <br><a href = "get-info">create an account</a><br>
															                </div>
															   </form>
							                   </div>
							                 </div>
							                 </div>
						  <%@ include file = "common/footer.jspf" %>
		
</html>