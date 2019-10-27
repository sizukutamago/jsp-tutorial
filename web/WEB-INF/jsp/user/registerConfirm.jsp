<%--
  Created by IntelliJ IDEA.
  User: tanakas
  Date: 2019/10/27
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.Model.User" %>
<%
    User user = (User) session.getAttribute("registerUser");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>id: <%=user.getId()%></p>
<p>name: <%=user.getName()%></p>

<a href="/user/register">戻る</a>
<a href="/user/register?action=done">登録</a>
</body>
</html>
