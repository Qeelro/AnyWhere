<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>AnyWhere - Add Event</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">AnyWhere</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/addEvent/">Add Event</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/login">Login</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/register">Register</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="text" name="keyword" id="keyword" size="50" value="${keyword}"
                       placeholder="Search">
                <button class="btn btn-secondary" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<div class="container my-5">
    <div class="row">
        <div class="card" style="width:350px">
            <img class="card-img-top"
                 src='<c:url value="/resources/img/img_avatar1.png"/>'
                 alt="Card image">
            <div class="card-body">
                <form method="post" action='<c:url value="/addEvent"/>'>
                    <h4 class="card-title">
                        <label for="nameEvent"></label>
                        <input class="form-control" rows="1" id="nameEvent" name="nameEvent" minlength="10"
                               placeholder="Event Name"></input></h4>
                    <p class="card-text"><textarea class="form-control" rows="10" name="description" minlength="20"
                                                   placeholder="Opis eventu"></textarea></p>
                    <p class="card-text">
                        <label for="start">Start date:</label>
                        <input type="date" id="start"
                               name="dateStart"
                               value="2018-07-22"></p>
                    <p class="card-text">
                        <label for="end">End date:</label>
                        <input type="date" id="end" name="dateEnd"
                               value="2018-07-22">
                    </p>
<%--                    <p class="card-text">--%>
<%--                        <label for="tentacles">User Id</label>--%>
<%--                        <input type="number" id="tentacles" name="user"--%>
<%--                               min="1" max="10">--%>
<%--                    </p>--%>
                    <input class="btn btn-outline-primary" type="submit" value="Wyślij"></input>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
