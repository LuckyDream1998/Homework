<%--
  Created by IntelliJ IDEA.
  User: mrsha
  Date: 13.02.2019
  Time: 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second Homework</title>
</head>
<body>
    <h1 align="center">Second Homework</h1>

    <form method="get" action="message">
        Message:
        <input type="text" name="message" />
        <input type="submit" value="Enter" />
    </form>

    <% String getMessage = (String)request.getAttribute("message");%>

    <p>You're message: <%= getMessage%></p>

</body>
</html>
