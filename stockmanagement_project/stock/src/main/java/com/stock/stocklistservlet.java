package com.stock;

import java.io.IOException;


import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/stocklistservlet")
public class stocklistservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String p_id=request.getParameter("pid");
		
		try {
			List<stock> stockDetails=stocklistDBUtill.validate(p_id);
			
			request.setAttribute("stockDetails", stockDetails);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dis=request.getRequestDispatcher("stockaccount.jsp");
			
			dis.forward(request, response);
		}
}

