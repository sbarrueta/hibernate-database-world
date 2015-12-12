<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.tresct.hibernate.dao.CityDAO" %>   
<%@ page import="com.tresct.hibernate.dao.impl.CityDAOImpl" %> 
<%@ page import="com.tresct.world.hibernate.entities.*" %>   
  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		<h1>La ciudad 1000 es:</h1>
		
		
		<%
		
			CityDAO cityDAO = new CityDAOImpl();
			City city = cityDAO.getCity(1000);
		
			
		
		%>
		
		
		<%=city.getName() %>

</body>
</html>