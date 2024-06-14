package com.acc.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		if(username.equals("bikash098")&& password.equals("Accenture")) {
			out.write("<h3>Welcome "+username+",Your Login is Successfull</h3>");
		}
		else {
			out.print("<h2>Login Failed</h2>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void init() {
		//method of Servlet interface returns the obj of ServletConfig
		ServletConfig config=getServletConfig();
		//getServletContext() of ServletConfig interface returns an obj of ServletContext
		ServletContext context=getServletContext();
		System.out.println("In Servlet-1");
		//We are getting initialization parameter from web.xml using <init-param> element  and printing the information
		System.out.println(config.getInitParameter("Eid"));
		System.out.println(config.getInitParameter("Name"));
		//If any information is shared to many servlet, it is better to provide it from the web.xml file using the <context-param> element.
		System.out.println(context.getInitParameter("ProjectName"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		if(username.equals("bikash098")&& password.equals("Accenture")) {
			out.write("<h3>Welcome "+username+",Your Login is Successfull</h3>");
		}
		else {
			out.print("<h2>Login Failed</h2>");
		}
		
	}

}
