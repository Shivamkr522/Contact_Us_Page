package com.contactus;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contactus")
public class ContactUsServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name=request.getParameter("fullName");
		String email=request.getParameter("email");
		String message =request.getParameter("message");
		Request requestInit = new Request(name,email,message);
		RequestDAO requestdao = new RequestDAO();
		requestdao.saveRequest(requestInit);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("successfulSubmission.jsp");
		requestDispatcher.forward(request, response);
	}
	
}
