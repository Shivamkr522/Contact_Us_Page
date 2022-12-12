<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
<link rel="stylesheet" type="text/css" href="contact-us.css">
</head>
<body>
	<div id="main-form">
		<h1 id="head">Contact Us</h1>
		<form action="contactus" method="post">
			<div id="name">
				<label><strong>Full Name:</strong></label><br>
				<input type="text" id="fullName" name="fullName" placeholder="Enter the Name" required>
			</div>
			<div id="email">
				<label><strong>E-mail:</strong></label><br>
				<input type="email" id="email-block" name="email" placeholder="Enter the email address" required>
				<p>example@example.com</p>
			</div>
			<div id="message">
				<label><strong>Message:</strong></label>
				<br>
				<textarea rows="20" cols="50" name="message" id="message-block" placeholder="Enter the message" required></textarea>
			</div>
			<div id="submit-button">
				<input type="submit" id="submit" value="Submit">
			</div>
		</form>
	</div>
</body>
</html>