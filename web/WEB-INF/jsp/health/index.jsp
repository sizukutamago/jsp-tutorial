<%--
  Created by IntelliJ IDEA.
  User: tanakas
  Date: 2019/10/27
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>health</title>
</head>
<body>
    <h1>BMI</h1>

    <form action="/health" method="post">
        身長: <input type="number" name="height">
        体重: <input type="number" name="weight">
        <input type="submit" value="送信">
    </form>
</body>
</html>
