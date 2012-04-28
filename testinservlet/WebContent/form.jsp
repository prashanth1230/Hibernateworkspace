<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.hibernate.Session" %>
<%@page import="org.hibernate.SessionFactory" %>
<%@page import="org.hibernate.cfg.Configuration" %>
<%@page import="org.hibernate.*" %>
<%@page import="com.fmr.pkg.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form to add users</title>
</head>
<body>
<%
   if(!(request.getParameter("submitButton")==null)){
	   try
		{			
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			 Session s =sf.openSession();
				
			 System.out.println("Inserting Record");
			Contact contact = new Contact();
			contact.setFirstName(request.getParameter("firstName"));
			System.out.println(request.getParameter("lastName"));
			contact.setLastName(request.getParameter("lastName"));
			contact.setEmail(request.getParameter("emailId"));
			
			s.save(contact);

			Transaction t = s.beginTransaction();
			t.commit();

			System.out.println("Done");
			Contact contactResult = (Contact) s.load(Contact.class,contact.getUserid());
			%>
			First Name: <%=contactResult.getFirstName() %><br/>
			Last Name: <%=contactResult.getLastName() %><br/>
			Email ID: <%=contactResult.getEmail() %><br/>
			User ID: <%=contactResult.getUserid() %><br/>
			<%
			s.close();
			s.flush();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
   }else{
%>
  <form name="addUsers" method="post" action="form.jsp">
     First Name: <input type="text" name="firstName"/><br/>
     Last Name: <input type="text" name="lastName" /> <br/>
     Email ID: <input type="text" name="emailId" /> <br/>
     <input type="submit" value="Submit" name="submitButton"/>
  </form>
  <% } %>
</body>
</html>