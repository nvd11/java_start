package com.pkg1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFirstServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException{
        //this method will be call only once! even the servlet has been accessed many times
    }

    @Override
    public void destroy(){
        //this method only be called when the servlet object is released from memory
    }

    @Override
    public ServletConfig getServletConfig(){
        //this method is used get a Servlet config object
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) 
                                     throws ServletException, java.io.IOException{
        //this method is the core function, we will write the business logic here
        //this method will be called everytime the servlet is accessed 
    	
    	//will be showed on console
    	System.out.println("Helloworld" + new java.util.Date().toString());
    	
    	//will be showed on browser
    	res.getWriter().write("ABCCCC");
    }

    @Override 
    public String getServletInfo(){
        //get the info string of the servlet 
        return null;
    }



}
