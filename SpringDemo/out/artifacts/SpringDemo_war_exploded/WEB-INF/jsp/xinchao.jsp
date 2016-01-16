<%--
  Created by IntelliJ IDEA.
  User: phuong
  Date: 1/16/2016
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>Xin chao</h1>

        <c:forEach var="d" items="${dealers}">
            Name: ${d.name} <br>

        </c:forEach>
        <hr>
        <c:forEach var="i" items="${invens}">
            Name Inventory: ${i.name} <br>
        </c:forEach>

        <hr>

        <c:forEach var="u" items="${units}">
            San Pham: ${u.type} <br>
        </c:forEach>

</body>
</html>
