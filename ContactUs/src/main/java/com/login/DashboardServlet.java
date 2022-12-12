package com.login;
import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.contactus.RequestDAO;
import com.contactus.Request;
@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<Request> contactUsUserData = new ArrayList<>();
		contactUsUserData = RequestDAO.fetchData();
		HttpSession session=request.getSession();  
        session.setAttribute("contactUsData",contactUsUserData);
        
        RequestDispatcher reqDis = request.getRequestDispatcher("dashboard.jsp");
		reqDis.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String status = request.getParameter("status");
        Request requestdata = new Request();
        requestdata.setStatus(status);
        requestdata.setId(id);
        RequestDAO requestDao = new RequestDAO();
        try {
            requestDao.changeStatus(requestdata);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("dashboard");
	}
}
