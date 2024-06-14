<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Catch</title>
</head>
<body>
<c:catch var="CatchException">
<%String str=null;
out.print(str.length());
%>

</c:catch>
<c:if test="${CatchException!=null}">
<p>The type of Exception is:${CatchException}<br/>
There is an Exception :${CatchException}</p>

</c:if>
</body>
</html>