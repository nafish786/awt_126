package com.maren.scope.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Newscope2")
public class Newscope2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String Name=(String)request.getAttribute("NAME");
	    String Email=(String)request.getAttribute("EMAIL");
	    String Address=(String)request.getAttribute("ADDRESS");
	    String Branch=(String)request.getAttribute("BRANCH");
	    String College=(String)request.getAttribute("COLLEGE");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<br>name: "+Name);
	    out.println("<br>email: "+Email);
	    out.println("<br>address: "+Address);
	    out.println("<br>branch: "+Branch);
	    out.println("<br>college: "+College);
	}

}
