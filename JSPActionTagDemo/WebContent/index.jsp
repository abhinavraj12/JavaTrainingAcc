<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Action Tags</title>
</head>
<body>
<h2>This is ACtion Tag</h2>
<jsp:forward page="forward.jsp">
<jsp:param value="John" name="Name"/>
</jsp:forward>
</body>
</html>