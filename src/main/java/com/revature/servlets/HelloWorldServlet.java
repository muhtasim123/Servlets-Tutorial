package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	//override the doGet method
	//when this servlet receives a get request, it will execute our doGet method
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("This is a doGet method on the path: " + req.getContextPath());
		
		//writer object on the response object is used to write to the body of the response
		resp.getWriter().write(
				"<h1>Hello World! </h1>"
				);
	}
}
