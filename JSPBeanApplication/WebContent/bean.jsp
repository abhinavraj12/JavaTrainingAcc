<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.acc.lkm.jspbean.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

Records of User:

<jsp:getProperty property="username" name="user"/><br/>
<jsp:getProperty property="password" name="user"/><br/>
<jsp:getProperty property="email" name="user"/><br/>
</body>
</html>