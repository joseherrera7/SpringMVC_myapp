<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoL</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
	<h1>Register</h1>	
	<br>
	<br>
	<br>
	<form:form action="processForm" modelAttribute="person">
		<label>Email:</label>			<form:input path="email" class="form-control" placeholder="Email"/>
		<br/>
		<label>First Name:</label>		<form:input path="firstName" class="form-control" placeholder="First name"/>
		<br/>
		<label>Last Name:</label>		<form:input path="lastName" class="form-control" placeholder="Last name"/>
		<br/>
		<label>Cellphone:</label>		<form:input path="cellphone" class="form-control" placeholder="Cellphone"/>
		<br/>
		<label>Size:</label>			<form:input path="size" class="form-control" placeholder="Your size"/>
		<br/>
		<label>Password:</label> 		<form:password path="password" class="form-control" placeholder="Password"/>
		<br/>
		<label>Gender:</label>
		<form:select path="gender" class="form-control">
			<form:option value="Male" label="Male"></form:option>
			<form:option value="Female" label="Female"></form:option>
		</form:select>
		<br/>
		<br/>
		<label>Preferred gaming console:</label>
		<br/>
		<label>PS4:</label>
		
			<form:radiobutton path="preferredConsole" value="PS4"/>
			<br/>
			<label>Xbox One:</label>
		
			<form:radiobutton path="preferredConsole" value="Xbox One"/>
			<br/>
			<label>Nintendo Switch:</label>
		
			<form:radiobutton path="preferredConsole" value="Nintendo Switch"/>
			<br/>
			<label>PC:</label>
			<form:radiobutton path="preferredConsole" value="PC"/>
			<br/>
			<br/>
		<label>Languages:</label>
		<br/>
		<label>Spanish:</label> 
			<input name="languages" type="checkbox" value="Spanish"/>
        		<br/>
        <label>Russian:</label> 
          	<input name="languages" type="checkbox" value="Russian"/>	
          		<br/>
        <label>Italian:</label>
        	<input name="languages" type="checkbox" value="Italian"/>
        	<br/>
			<br/>
			<input type="submit" value="Submit" class="btn btn-default"	/>		
	</form:form>
</body>
</html>