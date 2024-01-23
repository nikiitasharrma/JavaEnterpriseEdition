package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int number1 = (int) req.getAttribute("number1");
		int number2 = (int) req.getAttribute("number2");
		int addition = (int) req.getAttribute("addition");
		
        PrintWriter out = res.getWriter();
		out.print("The addition of " + number1 + " and " + number2 + " is: " + addition);
	}
}
