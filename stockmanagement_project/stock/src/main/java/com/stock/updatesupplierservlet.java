package com.stock;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatesupplierservlet")
public class updatesupplierservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s_id=request.getParameter("supplier_id");
		String s_name=request.getParameter("supplier_name");
		String s_email=request.getParameter("email");
		String s_phonenumber=request.getParameter("phonenumber");
		String s_address=request.getParameter("address");
		
		boolean isTure;
		
		isTure=supplierDBUtill.updatesupplier(s_id, s_name, s_email, s_phonenumber, s_address);
		
		if(isTure==true) {
			List<supplier> supplierDetails=supplierDBUtill.getsupplierDetails(s_id);
			request.setAttribute("supplierDetails", supplierDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("supplieraccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<supplier> supplierDetails=supplierDBUtill.getsupplierDetails(s_id);
			request.setAttribute("supplierDetails", supplierDetails);
			RequestDispatcher dis=request.getRequestDispatcher("supplierlist.jsp");
			dis.forward(request, response);
		}
	}

}
