package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	/**
	 * The doPost method internally calls the service method. 
	 * It is specific to Http Post method requests only, i.e., 
	 * doesn't deal with Get method requests
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		
		int addition = number1 + number2;
		
		PrintWriter out = res.getWriter();
		
		out.print("The addition of " + number1 + " and " + number2 + " is: " + addition);
	}
}
