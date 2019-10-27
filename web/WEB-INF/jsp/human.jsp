<%--
  Created by IntelliJ IDEA.
  User: tanakas
  Date: 2019/10/27
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.Model.Human" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% Human h = (Human) request.getAttribute("human"); %>

<%=h.getName()%>
<%=h.getAge()%>
</body>
</html>
