<%@ page import="com.jet.web.ViewUsers" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<table>
    <tr>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Возраст</th>
    </tr>
    <c:forEach var="user" items="${ViewUsers.getUsers()}">
        <tr>
            <td><c:out value="${user.surname}"/></td>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.age}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
