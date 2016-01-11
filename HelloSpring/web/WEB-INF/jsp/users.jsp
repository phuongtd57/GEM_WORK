<%-- 
    Document   : users
    Created on : Jan 9, 2016, 10:40:40 PM
    Author     : phuong
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
        <h1>Hello World!</h1>
        <c:forEach var="u" items="${users}">
            Username: ${u.username} <br>
        </c:forEach>
    </body>
</html>
