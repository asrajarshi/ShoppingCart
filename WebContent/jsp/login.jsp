<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String choice = request.getParameter("choice");
out.println(choice);
session.setAttribute("choice",choice);
%>
<s:form action = "login">
<s:textfield name = "name" label = "name"></s:textfield>
<s:password name = "pword" label = "pword"></s:password>
<s:submit value = "Log In" align = "center"/>
</s:form> 
<p>
<br>Continue as a <a href = "guest.jsp">guest</a> OR <a href = "../Singup.html">Sign UP</a>
</p>
</body>
</html>