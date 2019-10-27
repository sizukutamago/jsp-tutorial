<%--
  Created by IntelliJ IDEA.
  User: tanakas
  Date: 2019/10/27
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.Model.Health" %>
<%
    Health health = (Health) request.getAttribute("health");
%>
<html>
<head>
    <title>result</title>
</head>
<body>
<p>身長: <%=health.getHeight()%>cm</p>
<p>体重: <%=health.getWeight()%>kg</p>
<p>BMI: <%=health.getBmi()%></p>
<p>体型: <%=health.getBodyType()%></p>
</body>
</html>
