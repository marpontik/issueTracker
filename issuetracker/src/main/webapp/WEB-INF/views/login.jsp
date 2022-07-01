<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Welcome!!!</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <form action="/login" method="POST"> 
        Name : <input name="name" type="text" /> 
        Password : <input name="password" type="password" /> 
        <input type="submit" />
        
        
 
    
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	     
</body>
</html>

