package com.xworkz.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/web")
public class WebSeries extends HttpServlet {

	public WebSeries(){
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget ");
		
		String name =req.getParameter("fname");	
		String lang =req.getParameter("lang");	
		String episode =req.getParameter("episode");	
		String ott =req.getParameter("ott");	
		String budget =req.getParameter("budget");
		
		System.out.println("Name : "+name);
		System.out.println("Language : "+lang);
		System.out.println("Episodes : "+episode);
		System.out.println("Budget : "+budget);
		System.out.println("OTT Platform : "+ott);
		
		
		PrintWriter writer = resp.getWriter();
		writer.print("<span style='color:green'> <h1>"+name+" recived </h1></span>" );
		
		resp.setContentType("text/html");
	}
}
