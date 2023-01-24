package com.xworks.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4,urlPatterns = "/bachan")
public class AmitabachanServlet extends HttpServlet {

	public AmitabachanServlet() {

		System.out.println("Created..."+getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Running doGet in AmitabachanServlet");
	}
}
