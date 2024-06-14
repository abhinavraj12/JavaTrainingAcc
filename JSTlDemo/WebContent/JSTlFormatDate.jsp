<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Format date</title>
</head>
<body>
<h2>Different Formats of date</h2>
<c:set var="Date" value="<%=new java.util.Date() %>"></c:set>
<p>
Formatted Time:
<fmt:formatDate type="time" value="${Date}"/>
</p>
<p>
Formatted Date:
<fmt:formatDate type="date" value="${Date}"/>
</p>
<p>
Formatted Date & Time:
<fmt:formatDate type="both" value="${Date}"/>
</p>
<p>
In Short Style
<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${Date}"/>
</p>
<p>
In Long Style
<fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${Date}"/>
</p>
</body>
</html>