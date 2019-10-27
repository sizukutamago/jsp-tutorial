<%--
  Created by IntelliJ IDEA.
  User: tanakas
  Date: 2019/10/27
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/register" method="post">
        id: <input type="text" name="id">
        pass: <input type="password" name="password">
        name: <input type="text" name="name">
        <input type="submit" value="確認">
    </form>
</body>
</html>
