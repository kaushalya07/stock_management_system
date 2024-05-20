package com.stock;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/supplierservlet")
public class supplierservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String s_id=request.getParameter("sid");
		
		try {
		List<supplier> supplierDetails=supplierDBUtill.validate(s_id);
		
		request.setAttribute("supplierDetails", supplierDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis=request.getRequestDispatcher("supplieraccount.jsp");
		
		dis.forward(request, response);
	}

}
