<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.*, com.contactus.Request"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
<link rel="stylesheet" href="dashboard.css">
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("admin")==null){
			response.sendRedirect("login.jsp");
		}
		session.getAttribute("contactUsData");
	%>
	<div id="table-content">
		<h1>User Details</h1>
		<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Email</td>
				<td>Message</td>
				<td>Time</td>
				<td>Status</td>	
			</tr>
		</thead>
		<tbody>
			<c:forEach var="sendData" items = "${contactUsData}"  >
				<tr>
					<td>${sendData.getId()}</td>
					<td>${sendData.getName()}</td>
					<td>${sendData.getEmail()}</td>
					<td>${sendData.getMessage()}</td>
					<td>${sendData.getTime()}</td>
					<td>${sendData.getStatus()}</td>
					<td><form action="dashboard" method="post">
            			<input type="hidden" name="id" value="${sendData.getId()}">
            			<button type="submit" name="status"value="${sendData.getStatus()}">${sendData.getStatus()}</button>
            			</form>
            		</td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
	</div>
	<div id="logout" >
		<form action="LogoutServlet" >
			<button type="button">Logout</button>
		</form>
	</div>
</body>
</html>