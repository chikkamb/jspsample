<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scriptlet tag</title>
</head>
<body>
<form>
<%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
</form>  
</body>
</html>