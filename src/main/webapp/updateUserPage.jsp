<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mrsha
  Date: 18.02.2019
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update User</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>

<body>
<div class="container p-3 mb-2 bg-success text-white">
    <h1 align="center">Update User</h1>
</div>
<div class="container">
    <form action="updateUser" method="post">
        <div class="p-3 mb-2 bg-info text-white">
            <% if (!(request.getAttribute("message") == null)) out.print(request.getAttribute("message"));%>
        </div>
        <div class="input-group mb-3 input-group-sm" >
            <input type="text"  hidden name="oldSurname" value="${oldSurname}">
            <div class="input-group-prepend">
                <span class="input-group-text" style="width: 80px">Имя: </span>
            </div>
            <input type="text" name="name" class="form-control input-small">
        </div>
        <div class="input-group mb-3 input-group-sm">
            <div class="input-group-prepend">
                <span class="input-group-text" style="width: 80px "  >Фамилия: </span>
            </div>
            <input type="text" name="surName" class="form-control input-small">
        </div>
        <div class="input-group mb-3 input-group-sm">
            <div class="input-group-prepend">
                <span class="input-group-text" style="width: 80px">Возраст: </span>
            </div>
            <input type="text" name="age" class="form-control input-small">
        </div>
        <div class="input-group mb-3 input-group-sm">
            <div class="input-group-prepend">
                <span class="input-group-text" style="width: 80px">Пол: </span>
            </div>
            <div class="radio-inline">
                <label class="radio-inline" style="margin-left: 10px; margin-top: 10px">
                    <input type="radio" name="gender" value="Male">Муж.
                </label>
                <label class="radio-inline" style="margin-left: 10px; margin-top: 10px">
                    <input type="radio" name="gender" value="Female">Жен.
                </label>
            </div>
        </div>
        <div class="input-group mb-3 input-group-sm">
            <div class="input-group-prepend">
                <span class="input-group-text" style="width: 80px">Телефон: </span>
                <select name="typeOfNumber" class="form-control form-control-sm">
                    <option value="Mobile">Mobile</option>
                    <option value="Fax">Fax</option>
                    <option value="Land">Land</option>
                </select>
            </div>
            <input type="text" class="form-control input-small" name="number">
        </div>
        <div align="center">
            <input type="submit" class="btn btn-success" value="Update">
        </div>
    </form>
</div>
</body>
</html>
