package com.stock;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/manageSupplierServlet")
public class manageSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<supplier> supplierdetails = supplierDBUtill.listSupplierDetails();
			request.setAttribute("supplierdetails", supplierdetails);

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dis = request.getRequestDispatcher("/manageSuppliers.jsp");
		dis.forward(request, response);
	}
}
