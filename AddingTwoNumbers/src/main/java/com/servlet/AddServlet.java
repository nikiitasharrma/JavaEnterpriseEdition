package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	/**
	 * The doPost method internally calls the service method. 
	 * It is specific to Http Post method requests only, i.e., 
	 * doesn't deal with Get method requests
	 * @throws ServletException 
	 * @throws IOException 
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		
		int addition = number1 + number2;
		
		req.setAttribute("number1", number1);
		req.setAttribute("number2", number2);
		req.setAttribute("addition", addition);
		
		RequestDispatcher rd = req.getRequestDispatcher("print");
		rd.forward(req, res);	
	}
}
