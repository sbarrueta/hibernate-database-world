<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
<%@ page import="com.tresct.hibernate.HibernateUtil" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="com.tresct.world.hibernate.entities.*" %>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
    	<%
    		String ciudad=null;
    		SessionFactory  sessionFactory=HibernateUtil.getSessionfactory();
    		
    		Session sessionHibernate = sessionFactory.openSession();
    		
    		City city = (City)sessionHibernate.get(City.class, 1);
    		
    		if (city!=null){
    			ciudad= city.getName();
    			System.out.println("Lectura ok");
    		}else{
    			System.out.println("No se realizó la lectura");
    		}
    	
    	%>
    
    
        <h1> <%=city.getName() %></h1>
        
        <ul>
        	<li>ID: <%=city.getId() %></li>
        	<li>CODE: <%=city.getCountryCode() %></li>
        	<li>DISTRICT: <%=city.getDistrict() %></li>
        	<li>POPULATION: <%=city.getPopulation() %></li>
      
        </ul>
        
    </body>
</html>
