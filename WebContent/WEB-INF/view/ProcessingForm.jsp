<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoL</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/styles/style.css">

</head>
<body>
	<h1>Hello ${param.UserName }. Welcome to the website. </h1>
	<br>
	<br>
	<h2>${message }</h2>	
	<img alt="Foto" src="${pageContext.request.contextPath}/resources/images/FotoCV.jpg">
	
</body>
</html>