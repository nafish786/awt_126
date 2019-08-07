package com.maren.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Newscope")
public class Newscope extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String Name="";
       String Email="";
       String Address="";
       String Branch="";
       String College="";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		    Name=request.getParameter("name");
		    Email=request.getParameter("email");
		    Address=request.getParameter("address");
		    Branch=request.getParameter("branch");
		    College=request.getParameter("college");
		    setAttributes(request,response);
		    RequestDispatcher rd = request.getRequestDispatcher("Newscope2");
		    rd.forward(request,response);
	}

	private void setAttributes(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		request.setAttribute("NAME","Name");
		request.setAttribute("EMAIL","Email");
		request.setAttribute("ADDRESS","Address");
		request.setAttribute("BRANCH","Branch");
		request.setAttribute("COLLEGE","College");
		
	}

}
