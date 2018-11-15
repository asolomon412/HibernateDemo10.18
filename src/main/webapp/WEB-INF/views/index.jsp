<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hibernate Demo</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->

</head>
<body>
	<div class="container">
	<h1>Search for People</h1>
		<form action="search">
			ID: <input type="text" name="personid">
			<input type="submit" value="Search">
		</form>
		
		<h1>Add a Person</h1>
		<form action="addperson">
			Name: <input type="text" name="pname">
			Location: <input type="text" name="plocation">
			<input type="submit" value="Add">
		</form>
		
		
	
	<h1>List of People</h1>
	<table class="table">
		<c:forEach var="p" items="${peoplelist }">
			<tr>
				<td>${p.id}</td>
				<td>${p.name }</td>
				<td>${p.location }</td>
				<td><a class="btn btn-primary" href="/update?personid=${p.id}">Edit</a></td>
				<td><a class="btn btn-primary" href="/delete?personid=${p.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
	
	
	</table>
		
	</div>

</body>
</html>