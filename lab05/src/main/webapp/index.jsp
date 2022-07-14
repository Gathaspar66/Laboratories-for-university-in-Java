

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
        <h1>Witaj!</h1>
        <p><a href="/lab05/student">dodaj studentow</a></p>
        
        <br>
        <h1>Liczba wyświetleń strony: ${sessionScope.wyswietlenia} </h1>
        
    </body>
</html>