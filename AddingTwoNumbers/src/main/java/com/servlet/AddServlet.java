package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		
		int addition = number1 + number2;
		
		/**
		 * Using cookies to pass data with response to the client
		 * The client sends all cookies with it's next request to the redirected servlet
		 */
		Cookie cookie = new Cookie("addition", addition+"");
		res.addCookie(cookie);
		
		res.sendRedirect("print");
			
	}
}
