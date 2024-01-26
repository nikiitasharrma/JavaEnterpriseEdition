package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		
		int addition = number1 + number2;
		
		/**
		 * Instead of url rewriting, Tomcat maintains a session. 
		 * We simply put data into session which is accessible to every servlet
		 */
		HttpSession session = req.getSession();
		
		session.setAttribute("addition", addition);
		
		res.sendRedirect("print");
	}
}
