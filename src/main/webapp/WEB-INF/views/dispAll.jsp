<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%> 
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="1">
  <tr>
   <td>ID</td>
   <td>Firstname</td>
   <td>Lastname</td>
   <td>Email</td>
  </tr>  
  <c:forEach items="${list}" var="student" >
   <tr>
    <td>${student.id }</td>
    <td>${student.fname }</td>
    <td>${student.lname }</td>
    <td>${student.email }</td>
   </tr>
  </c:forEach>
 </table>
 <a href="${pageContext.request.contextPath}">Click to go back</a>
</body>
</html>