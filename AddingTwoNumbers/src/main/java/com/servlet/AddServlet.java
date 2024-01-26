package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		
		int addition = number1 + number2;
		
		/**
		 * sending a response to the client asking him to redirect to another 
		 * servlet and passing the required paramteres in the url itself
		 */
		res.sendRedirect("print?addition=" + addition);
			
	}
}
