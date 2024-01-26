package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PrintServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		
		int addition = (int) session.getAttribute("addition");
		
        PrintWriter out = res.getWriter();
		out.print("The addition of is: " + addition);
	}
}
