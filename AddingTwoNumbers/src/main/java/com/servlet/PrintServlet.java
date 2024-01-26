package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int addition = Integer.parseInt(req.getParameter("addition"));
		
        PrintWriter out = res.getWriter();
		out.print("The addition is: " + addition);
	}
}
