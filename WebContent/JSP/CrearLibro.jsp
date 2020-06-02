<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear libro</title>
</head>
<body>
<div class="header">
	<h1>Agregar libro</h1>
</div>
<div class="topnav">
	
</div>
<div class="container">
	<form action="/CalleOrtega-Pablo-Examen/CrearLibro" method="POST">
		<h1>Registrar Libro</h1><br>
				<input type="text" placeholder="Codigo" name="codigo" required><br>
				<input type="text" placeholder="Nombre" name="nombre" required><br>
				<input type="text" placeholder="ISBN" name="ISBN" required><br>
				<input type="text" placeholder="NumeroPaginas" name="numeroPaginas" required><br>
				<button type="submit" name="resp" value="Registrar">Registrar</button>
	</form>
</div>


</body>
</html>