package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = "Nikita";
		
		req.setAttribute("label",name);
		RequestDispatcher rd = req.getRequestDispatcher("exp.jsp");
		rd.forward(req, res);
		
	}
}
