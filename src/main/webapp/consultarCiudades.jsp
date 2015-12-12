<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.tresct.hibernate.HibernateUtil" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Query" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="com.tresct.world.hibernate.entities.*" %>

<%@ page import="java.util.List" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>Ciudades del mundo</h1>
	
	
	    	<%
	    		SessionFactory  sessionFactory=HibernateUtil.getSessionfactory();
	    		
	    		Session sessionHibernate = sessionFactory.openSession();
	    		
	    		
	    		// HQL, debe referirse a las entidades
	    		// Hibernate Query Languaje
	    		String hql = "from City";
	    		
	    		
	    		
	    		// Ejecuto el Query
	    		Query query =  sessionHibernate.createQuery(hql);
	    		
	    		// Obtengo el conjunto de resultados
	    		List<City> lista =query.list();
	    		
	    		// Cuento cuántos objetos hay en la lista
	    		int contador=0;
	    		contador=lista.size();
	    		
	    		
	    		
	    		
	    		for (City city: lista){
	    			%>
	    			<%=city.getCountry().getName() %>
	    			<%=city.getName() %>
	    			<br/>
	    			<% 	
	    		}
	    		
	    		
	    		
			%>
			
			
			<h2>Total de ciudades <%=contador %></h2>

</body>
</html>