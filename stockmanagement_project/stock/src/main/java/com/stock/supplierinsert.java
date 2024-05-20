package com.stock;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/supplierinsert")
public class supplierinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Create a PrintWriter to send responses back to the client
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		// Retrieve data
		String Supplier_ID = request.getParameter("ID");
		String Supplier_Name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String Address = request.getParameter("add");

		boolean isTure;
		

		
			// Insert the supplier data into the database
			isTure = supplierDBUtill.insertsupplier(Supplier_ID, Supplier_Name, email, phone, Address);

			if (isTure == true) {
				// Retrieve a list of supplier details and set it 
				List<supplier> supplierdetails = supplierDBUtill.listSupplierDetails();
				request.setAttribute("supplierdetails", supplierdetails);
				//redirect the manageSuppliers.jsp
				RequestDispatcher dis = request.getRequestDispatcher("manageSuppliers.jsp");
				dis.forward(request, response);
			} else {
				List<supplier> supplierdetails = supplierDBUtill.listSupplierDetails();
				request.setAttribute("supplierdetails", supplierdetails);
				//redirect the manageSuppliers.jsp
				RequestDispatcher dis2 = request.getRequestDispatcher("manageSuppliers.jsp");
				dis2.forward(request, response);
			}
		}

	}


