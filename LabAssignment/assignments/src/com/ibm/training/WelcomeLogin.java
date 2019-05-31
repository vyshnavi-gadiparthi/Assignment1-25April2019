package com.ibm.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class WelcomeLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String adminName = request.getParameter("userName");
		String adminPass = request.getParameter("passWord");
		
		System.out.println(adminName+" "+adminPass);
		
		if(adminName.trim().equals("Vyshnavi") && adminPass.equals("00000") ) {
			response.getWriter().println("Welcome " +adminName);
		}
		else {
			response.getWriter().println("incorrect Credentials");
		}	
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
		dispatcher.include(request, response);
	}

}
