<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTl Choose</title>
</head>
<body>
<c:set var="Marks" scope="session" value="${30}"></c:set>
<p>Your Total Marks is :<c:out value="${Marks}"></c:out>
<c:choose>
<c:when test="${Marks>=90}">
Excellent
</c:when>
<c:when test="${Marks>70 && Marks<90}">
Very Good
</c:when>
<c:when test="${Marks>60 && Marks<70}">
Average
</c:when>
<c:when test="${Marks>40 && Marks<60}">
Bad
</c:when>
<c:otherwise>
Poor
</c:otherwise>
</c:choose>
</body>
</html>