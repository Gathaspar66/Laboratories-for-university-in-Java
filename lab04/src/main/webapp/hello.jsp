<%-- 
    Document   : hello.jsp
    Created on : 17 mar 2020, 10:39:48
    Author     : Gathaspar96
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <h1>Cześć, <c:out value="${m1.firstName}"/>!</h1> <%-- tutaj tekst interpretowany jest jako tekst a nie jak fragment kodu (html)--%>
        <h1>Witaj, ${m1.firstName} ${m1.lastName}, <a href="mailto:${m1.emailAddress}">${m1.emailAddress}</a></h1> <%-- wypisuje to co jest w znaczniku po przeanalizowaniu kodu czyli jezeli w kodzie uwzglednimy kolor napisu to bedzie on kolorowy oraz jesli bedzie tam skrypt to tez sie wykona--%>
        
        
        <c:forEach items="${dniTygodnia}" var="dzien">
        <p>
            ${dzien}
        </p>
        </c:forEach>
        
   
    </body>
</html>