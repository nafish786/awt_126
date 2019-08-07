package com.maren.scope.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Getattributes
 */
@WebServlet("/Getattributes")
public class Getattributes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String FirstName = (String)session.getAttribute("FIRSTNAME");
		String LastName = (String)session.getAttribute("LASTNAME");
		String Email = (String)session.getAttribute("EMAIL");
		
		PrintWriter out = response.getWriter();
		out.println("first name :" +FirstName);
		out.println("<br>last name :"+LastName);
		out.println("<br>email :"+Email);
	}

}
