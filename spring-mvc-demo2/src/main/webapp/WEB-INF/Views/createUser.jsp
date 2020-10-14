<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
</head>
<body>
	<div>
		<form action="user_save">
			method="post">
			<div>
				<label>User name</label> <input type="text" name="userName">

			</div>
			<div>
				<label>Password></label> <input type="password" name="password">

			</div>
			<div>
				<label>Email</label> <input type="email" name="email">
			</div>
			<div>
				<label>Mobile No</label> <input type="number" name="mobileNo">
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
</body>
</html>
