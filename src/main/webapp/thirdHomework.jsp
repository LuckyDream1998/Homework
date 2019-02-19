<%--
  Created by IntelliJ IDEA.
  User: mrsha
  Date: 17.02.2019
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Third Homework</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
    <div class="container p-3 mb-2 bg-primary text-white">
        <h1 align="center">Third Homework</h1>
    </div>
    <div class="container" align="center">
        <form action="showUser" method="get">
            <input class="btn btn-success" type="button" value="Add" onclick="openAddUserPage()">
            <input class="btn btn-info" type="submit" value="Show All User">
        </form>
    </div>
    <div class="container" id="containerForTable">
        <table class="table table-bordered">
            <thead class="p-3 mb-2 bg-info text-white">
                <tr>
                    <th width="300">  Name    </th>
                    <th width="300">  Surname </th>
                    <th width="100">  Age     </th>
                    <th width="100">  Gender  </th>
                    <th width="200"> Type Of Number</th>
                    <th width="300"> Number   </th>
                    <th width="100">  Delete  </th>
                    <th width="100">  Update  </th>
                </tr>
            </thead>
    <c:forEach var="userList" items = "${requestScope.userList}">
        <tr>
            <th width="300"> <c:out value="${userList.name}"/></th>
            <th width="300"> <c:out value="${userList.surName}" /></th>
            <th width="100"> <c:out value="${userList.age}"/></th>
            <th width="100"> <c:out value="${userList.gender}"/></th>
            <th width="200"> <c:out value="${userList.typeOfNumber}"/></th>
            <th width="300"> <c:out value="${userList.number}"/></th>
            <th width="100">
                <form action="deleteUser" method="post">
                    <input type="text" hidden value="${userList.surName}" name="surName">
                    <input class="btn btn-danger" type="submit" value="Delete">
                </form>
            </th>
            <th width="100">
                    <input class="btn btn-warning" type="submit" value="Update" ONCLICK="openUpdateUserPage('${userList.surName}')">
            </th>
        </tr>
    </c:forEach>
        </table>
    </div>

    <script language="JavaScript">
        var x = screen.width/2 - 400/2;
        var y = screen.height/2 - 550/2;
        function openAddUserPage() {
            addUserPage  = window.open("addUserPage.jsp" , "addUserPage", 'height=550,width=400,left='+x+',top='+y);
        }

        function openUpdateUserPage(surName) {
            updateUserPage = window.open("updateUser?oldSurname=" + surName , "updateUserPage", 'height=550,width=400,left='+x+',top='+y);
        }
    </script>
</body>
</html>
