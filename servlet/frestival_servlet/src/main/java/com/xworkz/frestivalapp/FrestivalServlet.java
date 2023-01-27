package com.xworkz.frestivalapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/fest")
public class FrestivalServlet extends HttpServlet {

	public FrestivalServlet() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DOGET");

		String name =req.getParameter("fname");	
		String fdate =req.getParameter("fdate");	
		String strdate =req.getParameter("strdate");	
		String enddate =req.getParameter("edate");	
		String days =req.getParameter("days");	
		String purpose =req.getParameter("pur");	
		String f1 =req.getParameter("f1");	
		String f2 =req.getParameter("f2");	
		String f3 =req.getParameter("f3");	
		String f4 =req.getParameter("f4");	
		String f5 =req.getParameter("f5");	
		String f6 =req.getParameter("f6");	
		String f7 =req.getParameter("f7");	
		String f8 =req.getParameter("f8");	
		String f9 =req.getParameter("f9");	
		String f10 =req.getParameter("f10");	
		String ft =req.getParameter("ft");	
		String region =req.getParameter("region");	
		String state =req.getParameter("state");	
		String country =req.getParameter("country");

		System.out.println("Fest Name : "+name);
		System.out.println("Fest Date : "+fdate); 
		System.out.println("Start Date : "+strdate);
		System.out.println("End Date : "+enddate);
		System.out.println("Day : "+days);
		System.out.println("Purpose : "+purpose);
		System.out.println("Food 1 : "+f1);
		System.out.println("Food 2 : "+f2);
		System.out.println("Food 3 : "+f3);
		System.out.println("Food 4 : "+f4);
		System.out.println("Food 5 : "+f5);
		System.out.println("Food 6 : "+f6);
		System.out.println("Food 7 : "+f7);
		System.out.println("Food 8 : "+f8);
		System.out.println("Food 9 : "+f9);
		System.out.println("Food 10 : "+f10);
		System.out.println("Food Type : "+ft);
		System.out.println("Rgion : "+region);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);

		PrintWriter writer = resp.getWriter();
		writer.print("<span style='color:green'> <h1>"+name+" recived </h1></span>" );

		resp.setContentType("text/html");

	}
}
