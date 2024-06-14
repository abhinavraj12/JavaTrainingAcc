<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Core Tags of JSTL</title>
</head>
<body>
<c:set var="Marks" scope="session" value="${45}"></c:set>
<p>Before removing Value is: <c:out value="${Marks}"></c:out> </p>
<c:remove var="Marks"/>
<p>After removing value is <c:out value="${Marks}"></c:out></p>
</body>
</html>