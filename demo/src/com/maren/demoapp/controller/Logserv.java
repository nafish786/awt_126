package com.maren.demoapp.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Logserv")
public class Logserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	            
		   String Name=request.getParameter("name");
		   String Pass=request.getParameter("pass");
		
		try {
			String sql="select * from reg where fname=? and pass=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demoapplication","root","Aps143sims#");
		    PreparedStatement ps = con.prepareStatement(sql);
		    ps.setString(1, Name);
		    ps.setString(2, Pass);
		    ResultSet rs=ps.executeQuery();
		    if(rs.next())
		    {
		    	RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
		    }
		    else
		    {
		    	RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
		    }
		    
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
