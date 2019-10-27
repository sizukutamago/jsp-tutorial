<%--
  Created by IntelliJ IDEA.
  User: tanakas
  Date: 2019/10/27
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@page import="java.text.SimpleDateFormat" %>

<%
    String[] luckArray = { "超スッキリ", "スッキリ", "最悪" };

    int index = (int) (Math.random() * luckArray.length);
    String luck = luckArray[index];
%>

<p><%= luck %>です</p>
</body>
</html>
