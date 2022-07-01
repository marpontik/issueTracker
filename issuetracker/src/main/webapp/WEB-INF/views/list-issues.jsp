<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Issue Tracking ${name}</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
	<H1>Issue Tracking</H1>
	<div>
		<table>
		<div class="container">
		<table class="table table-striped">
			
			
			
			

			<thead>
				<tr>
				    <th>Title</th>
					<th>Description</th>
					<th>TargetDate</th>
					<th>Completed</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${issues}" var="issue"> 
					<tr>
						<td>${issue.title}</td>
						<td>${issue.desc}</td>
						
						<td><fmt:formatDate pattern="dd/MM/yyyy"
									value="${issue.targetDate}" /> </td> 
						
						<td>${issue.done}</td>
						<td>
						
								<a type="button" class="btn btn-success" href="/update-issue?id=${issue.id}">Update</a>
								<a type="button" class="btn btn-danger" href="/delete-issue?id=${issue.id}">Delete</a>
		
		
									     
								
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	


    <div>
	      <a class="btn btn-success" href="/add-issue">Add</a>
	     

   </div> 
	
  
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script> 
	   
	    
</body>
</html>