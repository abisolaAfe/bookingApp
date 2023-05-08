<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
	     <link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel = "stylesheet">
		<title>Testing form page </title>
		<style>
		.center {
			text-align: center;
			margin: auto;
			width: 50%;
			padding: 50px;
			border: 1px solid black;
		}
	</style>
		</head>
				<body>
				 <div class= "container" >
				<h1> Enter Sales Details</h1>
				<hr>
				  <form:form method = "post" modelAttribute= "sale">
			                                               <form:input type = "hidden" path ="worker"/> 
		                                                   <form:input type = "hidden" path ="room"/> 
		           <br>  Description:         <form:input type = "text" path ="itemDescription"/>
		            <br>  Price                 <form:input type = "number" path ="price"/><br>
		           <br>   Quantity             <form:input type = "number" path ="quantity"/> <br> 
		                                                   <form:input type = "hidden" path ="timeOfSales"/> 
		                                                   <form:input type = "hidden" path ="amount"/> 
		          <br>  Room number:     <input type = "number" name ="roomNum"/> 
				    <br> <input type = submit class = "btn btn-SUCCESS">
				  </form:form>
				  </div>
				   <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
				   <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
				</body>
		
</html>