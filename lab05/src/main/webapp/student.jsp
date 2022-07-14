

<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
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
   
            
        <form action='/lab05/student' method='post'>
        Dodaj studenta:
        <br>
        <label>imie <input type="text" name="firstName"/></label><br>
        <label>Nazwisko <input type="text" name="lastName"/></label><br>
        <label>mail <input type="text" name="emailAddress"/></label><br>
        
        <input type='submit'>
        
        
    </body>
</html>
