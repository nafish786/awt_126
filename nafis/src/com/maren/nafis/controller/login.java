package com.maren.nafis.controller;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class login extends HttpServlet {  
  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String a=request.getParameter("userName");  
    String p=request.getParameter("userPass");  
          
    if(p.equals("servlet1"))
    		{  
        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
        rd.forward(request, response);  
    }  
    else{  
        out.print("Sorry UserName or Password Error!");  
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.include(request, response);  
                      
        }  
    }
}
  