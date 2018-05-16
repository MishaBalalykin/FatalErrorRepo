<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<form action="/userAdded" method="get">
    Фамилия: <input type="text" name="surname" size="10"><br><br>
    Имя: <input type="text" name="name" size="10"><br><br>
    Возраст: <input type="text" name="age" size="2"><br><br>
    <input type="submit" value="Добавить пользователя">
</form>
</body>
</html>
