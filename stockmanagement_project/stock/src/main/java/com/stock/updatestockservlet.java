package com.stock;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/updatestockservlet")
public class updatestockservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String p_id=request.getParameter("product_id");
		String p_type=request.getParameter("product_type");
		String p_name=request.getParameter("product_name");
		String p_unitprice=request.getParameter("product_unit_price");
		String p_stock=request.getParameter("total_stock");
		
		boolean isTure;
		
		isTure=stocklistDBUtill.updatestock(p_id, p_type, p_name, p_unitprice, p_stock);
		
		if(isTure==true) {
			List<stock> stockDetails=stocklistDBUtill.getstockDetails(p_id);
			request.setAttribute("stockDetails", stockDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("stockaccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<stock> stockDetails=stocklistDBUtill.getstockDetails(p_id);
			request.setAttribute("stockDetails", stockDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("stockaccount.jsp");
			dis.forward(request, response);
		}
		
	}

}
