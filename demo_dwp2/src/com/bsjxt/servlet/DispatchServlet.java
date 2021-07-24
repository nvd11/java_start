package com.bsjxt.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 *  
 *  "/" only pass *.jsp but not *.html/ can handle jsp file
 *  "/*"  cannot handel jsp file
 *  
 *  front design pattern
 */

@WebServlet("/")
public class DispatchServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) {
		String ctrl_para = req.getParameter("control");
		System.out.println("executing controller");
		System.out.println(ctrl_para);
		
		if (ctrl_para.equals("demo1")){
			demo1();
		}
			
		if (ctrl_para.equals("demo2")){
			demo2();
		}
		
		if (ctrl_para.equals("demo3")){
			demo3();
		}

		if (ctrl_para.equals("demo4")){
			demo4();
		}
	}
	
	private void demo1(){
		System.out.println("demo1 is called");
	}
	
	private void demo2(){
		System.out.println("demo2 is called");
	}
	
	private void demo3(){
		System.out.println("demo3 is called");
	}
	
	private void demo4(){
		System.out.println("demo4 is called");
	}
}
