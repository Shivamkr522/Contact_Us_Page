<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
<style>

* {
  font-family: Arial, Helvetica, sans-serif;
}
body{
 background-color: pink;
}
h3{ 
text-align: center;
padding-top: 30px;
padding-bottom: 60px;
}

form{
display: block;
flex-direction: column;
text-align: center;
background-color: beige;
padding: 5rem 0;
}

#label{

display: flex;
	flex-direction: column;

}



</style>

</head>
<body>
<h3>Contact Us</h3>
<div id="contactform">	
	<form  action="contactus" method="post">
		<label id="label">Name:</label><br><input type="text" name="name"><br><br>
		<label id="label">Email:</label><br><input type="email" name="email" ><br><br>
		<label id="label">Message:</label><br><textarea  name="message"></textarea><br><br>
		<input type="Submit">
	</form>
</div>
</body>
</html>