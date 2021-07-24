package com.bsjxt.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 *  
 *  "/" only pass *.jsp but not *.html
 * 
 */

@WebServlet("/")
public class DispatchServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) {
		System.out.println("executing controller");
	}
}
