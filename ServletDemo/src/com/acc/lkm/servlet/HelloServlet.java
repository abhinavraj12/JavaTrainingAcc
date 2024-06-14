package com.acc.lkm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("Servlet Invoked");
		PrintWriter out=response.getWriter();
		out.print("<h1>Hello from Servlet </h1>");
		out.print("<p>WebApplication composed of web components </p>");
		out.print("<h2>Servlet Generated </h2>");
		out.print("<table border='1'  ");
		out.print("<tr><td>Name</td><td>City</td></tr>");
		out.print("<tr><td>John</td><td>San Francisko</td></tr>");
		out.print("<tr><td>Peter</td><td>New York</td></tr>");
		out.print("</table>");
		
	}

}
