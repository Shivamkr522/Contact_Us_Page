<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body>
<style>
.center {
  margin-left: auto;
  margin-right: auto;
}
</style>
<%response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); %>
	<form class="center" action="login" method="post">
		Admin<br><br>
		Name:<br><input type="text" name="name"><br><br>
		Password:<br><input type="password"  name="password"><br><br>
		<input type="Submit">
	</form>
</body>
</html>