<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
<h1>User List</h1>
	<table>
		<thead>
			<tr>
				<th>User Name</th>
				<th>Password</th>
				<th>Email</th>
				<th>Mobile No</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${user.userName}</td>
				<td>${user.password}</td>
				<td>${user.email}</td>
				<td>${user.mobileNo}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>