<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>${event.getNameEvent()} by ${event.getUser()}</title>
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
            <a href="/event/${event.getId()}"><img class="card-img-top"
                                                   src='<c:url value="/resources/img/img_avatar1.png"/>'
                                                   alt="Card image"></a>
            <div class="card-body">
                <h4 class="card-title">${event.nameEvent} by ${event.getUser()}</h4>
                <p class="card-text">${event.description}</p>
                <p class="card-text">${event.counter}</p>
                <p class="card-text">${event.dateStart} / ${event.dateEnd}</p>

                <a href="/editEvent/${event.getId()}" class="btn btn-outline-primary">Edit Event</a>
            </div>

            <label for="comment">Comments:</label>
            <textarea class="form-control" rows="5" id="comment" name="text"></textarea>
        </div>
    </div>
</div>
</body>
</html>
