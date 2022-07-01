<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Add issue</title>

<title>Your Issue</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

<div class="container">
		<form:form method="post" commandName="issue">
		
			 
			<form:hidden path="id"/> 
			
			<fieldset class="form-group">
				<form:label path="title">Title</form:label>
				<form:input path="title" type="text" class="form-control"
					required="required"/>
				<form:errors path="title" cssClass="text-warning" />
				
				
				<form:label path="desc">Description</form:label>
				<form:input path="desc" type="text" class="form-control"
					required="required"/>
				<form:errors path="desc" cssClass="text-warning" />
				
				
				<form:label path="targetDate">TargetDate</form:label>
				<form:input path="targetDate" type="text" class="form-control"
					required="required"/>
				<form:errors path="targetDate" cssClass="text-warning" />
				
				
			</fieldset>
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
	</div>

   
   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script> 
	
		
</body>
</html>




