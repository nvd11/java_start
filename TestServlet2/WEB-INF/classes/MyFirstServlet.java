package com.pkg1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFirstServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException{
        //this method will be call only once! even the servlet has been accessed many times
        try{
            System.setOut(new PrintStream("~/tmp/servlet.logs"));
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Servlet object inited!");
    }

    @Override
    public void destroy(){
        //this method only be called when the servlet object is released from memory
        System.out.println("Servlet object has been destroyed!");
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
    
        System.out.println("service() has been called!"); 
        res.getWriter().println("<font color=\"blue\" style=\"font-size:40px;\">Just a testing</font>");
        res.getWriter().flush();
    }

    @Override 
    public String getServletInfo(){
        //get the info string of the servlet 
        return null;
    }



}
