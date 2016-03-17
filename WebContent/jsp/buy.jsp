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
<% 
String product = (String)session.getAttribute("choice");
session.setAttribute("choice",product);
String name = request.getParameter("name");
System.out.println(name);
session.setAttribute("name",name);%>
Add <%=product %> to <%= name %>
<s:form action = "BuyAction" method = "post">
<s:submit value = "Cart"/>
<s:submit value = "Wish" action = "WishAction"></s:submit>

</s:form>
</body>
</html>