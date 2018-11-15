<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Person</title>
</head>
<body>
	<div class="container">
		<h1>Update Person</h1>
		<form action="updateperson">
			<input type="hidden" name="id" value="${id}">
			Name: <input type="text" name="name" value="Grant Chirpus">
			Location: <input type="text" name="location">
			<input type="submit" value="Update">
		</form>
	
	
	</div>
</body>
</html>