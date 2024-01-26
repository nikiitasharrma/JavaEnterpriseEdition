package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int addition = 0;
		/**
		 * There can be multiple cookies on client side, 
		 * sends an array of cookies with request
		 */
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("addition")) {
				addition = Integer.parseInt(c.getValue());
			}
		}
		
        PrintWriter out = res.getWriter();
		out.print("The addition is: " + addition);
	}
}
