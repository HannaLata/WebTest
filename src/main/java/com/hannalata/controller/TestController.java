package com.hannalata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet {
	
	private static final Logger LOG = Logger.getLogger(TestController.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String firstName = req.getParameter("first-name");
		String lastName = req.getParameter("last-name");
		
		LOG.info("Get data first-name " + firstName);
		LOG.info("Get data last-name " + lastName);
		
		PrintWriter out = resp.getWriter();
		out.write("<br>"
				+ "<h2>"
				+ "<br>"
				+ "First name is " + firstName
				+ "<br>"
				+ " Last name is " + lastName
				+ "</h2>");
			
	}
	
	

}
