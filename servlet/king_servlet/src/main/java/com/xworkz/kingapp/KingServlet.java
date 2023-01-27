package com.xworkz.kingapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/king")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DOGET");

		String name =req.getParameter("kname");	
		String region =req.getParameter("region");	
		String noOfq =req.getParameter("nofqueen");	
		String dob =req.getParameter("dob");	
		String dod =req.getParameter("dod");

		System.out.println("Name : "+name);
		System.out.println("Region : "+region);
		System.out.println("NoOfQueens : "+noOfq);
		System.out.println("Date Of Birth : "+dob);
		System.out.println("Date Of Death : "+dod);

		PrintWriter wr = resp.getWriter();
		wr.print("<span style='color:green'> <h1>"+name+" recived </h1></span>" );

		resp.setContentType("text/html");
	}
}
