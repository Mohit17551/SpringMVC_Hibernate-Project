<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%> 
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
	.error{
		color: red;
	}
</style>

</head>
<body>
<form:form action="save" modelAttribute="newStudent"> 
	<table>
            <tr>
               <td><form:label path = "fname">First Name</form:label></td>
               <td><form:input path = "fname" /></td>
               <td>	<form:errors path = "fname" cssClass = "error" /></td>
               
            </tr>
            <tr>
               <td><form:label path = "lname">Last Name</form:label></td>
               <td><form:input path = "lname" /></td>
               <td>		<form:errors path = "lname" cssClass = "error" /></td>
            </tr>
            
            <tr>
               <td><form:label path = "email">Email id</form:label></td>
               <td><form:input path = "email" type="email"/></td>   
               <td>	<form:errors path = "email" cssClass = "error" />     </td>       
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
	</form:form>
	
	<a href="${pageContext.request.contextPath}">Click to go back</a>
	
</body>
</html>