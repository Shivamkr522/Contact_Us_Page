<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="login.css">

</head>
<body>
	<div id="login-box">
		<h2>Login</h2>
		<form action="login" method="post">
		<div>
			<div>
				<label for="user-name" class="label-data">Username</label>
			</div>
			<br>
			<div>
				<input type="text" name="username" id="user" placeholder="Enter Username" required>
				
			</div>
			<br>
			<div>
				<label for="password" class="label-data">Password</label>
			</div>
			<br>
			<div>
				<input type="password" name="password" id="pass" placeholder="Enter Password" required>
			</div>
			<br>
			<div>
				<button>Submit</button>
			</div>
		</div>
		</form>
	</div>
</body>
</html>