<%-- 
    Document   : PersonList
    Created on : 19 mar 2020, 21:12:48
    Author     : Gathaspar96
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <table border="1" style="margin: auto;">
            
          <th colspan="3">Lista Osób</th>
            
        <c:forEach items="${osoby}" var="osoby">
        
            <tr>  
            
            <td> ${osoby.firstName}</td>
            <td> ${osoby.lastName}</td>
            <td> ${osoby.emailAddress}</td>
            
            </tr>
        
        </c:forEach>
        
        </table>
    </body>
</html>
