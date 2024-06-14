<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Tags and Objects</title>
</head>
<body>
<center>
<%--Scriptlet Tag --%>
<%-- 
<%
String name=request.getParameter("uname");
out.print(name);
%>
--%>

<%--Expression Tag --%> 
<%--
<%="Welcome "+request.getParameter("uname") %><br/>
Current Time:<%=java.util.Calendar.getInstance().getTime() %>
--%>
<%--Declaration Tag --%>
<%-- 
<%!
int area(int x){
	return x*x*x;
}
%>
<%="Area is"+area(12) %>
--%>

<%-- JSP Response implicit Obj --%>
<%-- 
<%
response.sendRedirect("https://portal.accenture.com/");
%>
--%>
<%--JSP config & application implicit Obj--%>
<%-- 
<% 
out.print("Welcome "+request.getParameter("uname"));
//String name=config.getInitParameter("Name");
//String company=config.getInitParameter("Company");
String project=application.getInitParameter("Project");
out.print("<br/>");
out.print("Project is:"+project);
//out.print("Name is:"+name);
//out.print("<br/>");
//out.print("Company is:"+company);
%>
--%>

<%--Session Implicit Object --%>
<% 
String name=request.getParameter("uname");
out.print("Welcome "+name);
session.setAttribute("user", name);
%>

<a href="Session.jsp">Go to Session Page</a>
</center>
</body>
</html>