<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="index.css" />
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if(session.getAttribute("admin")==null){response.sendRedirect("login.jsp");}
session.getAttribute("list");
%>
	<table>
		<tr>
		    <th>Id</th>
            <th>Fullname</th>
            <th>Email</th>
            <th>Message</th>
            <th>Timestamp</th>
            <th>Status</th>
    	</tr>
        <c:forEach var="request" items="${list}">
		 <tr>
			<td>${request.getId()}</td>
			<td>${request.getName()}</td>
			<td>${request.getEmail()}</td>
			<td>${request.getMessage()}</td>
			<td>${request.getTime()}</td>
			<td>${request.getStatus()}</td>
			<td><form action="dashboard" method="post">
	        <input type="hidden" name="id" value="${request.getId()}">
	            <button type="submit" name="status"value="${request.getStatus()}">${request.getStatus()}</button>
	            </form>
	        </td>
	      </tr>
 	    </c:forEach>
	</table>
	<form action="logout" method="post">
		<button type="submit" value="Logout">Logout</button>
	</form>
</body>
</html>