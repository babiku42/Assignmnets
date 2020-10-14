<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
</head>
<body>
	<h1>User info has been submitted into the database</h1>
	<div>
		<form action="user_update" method="post">
			<div>
				<label>Id</label><input name="id" type="text" readonly="readonly"
					value="${user.id}">
			</div>
			<div>
				<label>User name </label> <input type="text" name="userName"
					value="${user.userName}">
			</div>
			<div>
				<label> Password</label> <input type="password" name="password"
					value="${user.password}">
			</div>
			<div>
				<label>Email</label> <input type="email" name="email"
					value="${user.email}">
			</div>
			<div>
				<label>MobileNo</label> <input type="number" name="mobileNo"
					value="${user.mobileNo}">
			</div>
			<div>
				<label>Gender</label> <input type="radio" name="gender" value="Male"
					${user.gender=='Male'?'checked':'' }>Male <input
					type="radio" name="gender"
					value="Female${user.gender=='Female'?'checked':' ' }">Female
			</div>
			<div>
				<label>DOB</label> <input type="date" name=dob value="{user.dob}">
			</div>
			<div>
				<label>Hobbies</label> <input type="checkbox" name="hobbies"
					value="Reading"
					<c:if test="${fn:contains(users.hobbies,'Reading')}">checked</c:if>>Reading 
					<input type="checkbox"
					name="hobbies" value="Hiking"<c:if test="${fn:contains(users.hobbies,'Hiking')}">checked</c:if>>Hiking
			</div>
			<div>
				<label>Nationality</label> <select name="nationality">
					<option value="Nepalese"${user.nationality=='Nepalese'?'selected':' '}>Nepalese</option>
					<option value="American"${user.nationality=='American'?'selected':' ' }>American</option>
					<option value="Indian"${user.nationality=='Indian'?'selected':' ' }>Indian</option>
					<option value="Chinese"${user.nationality=='Chinese'?'selected':' '}>Chinese</option>
				</select>
			</div>

			<div>
				<label style="font-weight: bold;">Address</label>
				<div>
					<label>CityName</label> <input type="text" name=address.cityName  value="${user.address.cityName}">
				</div>
				<div>
					<label>CountryName</label> <input type="text"
						name=address.countryName  value="${user.address.countryName}">
				</div>
			</div>
			<div>
				<label>Comments</label>
				<textarea rows="5" cols="10" name="comments">"${user.comments}"</textarea>
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>

</body>
</html>