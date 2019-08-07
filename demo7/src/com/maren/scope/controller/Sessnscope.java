package com.maren.scope.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sessnscope
 */
@WebServlet("/Sessnscope")
public class Sessnscope extends HttpServlet {
	
	String FirstName="";
	String LastName="";
    String Email="";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 FirstName = request.getParameter("firstname");
		 LastName = request.getParameter("lastname");
		 Email = request.getParameter("email");
		 setAttributes(request,response);
		 RequestDispatcher rd = request.getRequestDispatcher("/Getattributes");
		 rd.forward(request,response);
	}



	private void setAttributes(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		HttpSession session=request.getSession();
		
		session.setAttribute("FIRSTNAME",FirstName);
		session.setAttribute("LASTNAME",LastName);
		session.setAttribute("EMAIL",Email);
		
	}

}
