package com.stock;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletesupplierservlet")
public class deletesupplierservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the Supplier ID to be deleted from the request
		String s_id=request.getParameter("supplier_id");
		
		boolean isTrue;
		isTrue=supplierDBUtill.deletesupplier(s_id);
		
		if(isTrue==true) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("success2.jsp");//redirect the sucess2.jsp
			dispatcher.forward(request, response);
		}
		else {
			List<supplier> supplierdetails=supplierDBUtill.getsupplierDetails(s_id);
			request.setAttribute("supplierdetails", supplierdetails);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("manageSuppliers.jsp");//redirect the manageSuppliers.jsp
			dispatcher.forward(request, response);
			
		}
		
	}

}
