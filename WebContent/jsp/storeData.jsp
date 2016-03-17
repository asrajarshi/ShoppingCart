<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.logic.storeData" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "store" class = "com.model.User">
<jsp:setProperty property="*" name="store"/>
</jsp:useBean>
<%	storeData storedata = new storeData(store);
	String name  = request.getParameter("name");
	session.setAttribute("name",name);
	boolean result = storedata.store();
	if(result)
		response.sendRedirect("buy.jsp");
	else 
		response.sendRedirect("../Content.html");
%>
</body>
</html>