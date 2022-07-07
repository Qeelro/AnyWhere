<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>AnyWhere</title>
</head>
<section>
    <c:forEach items="${event}" var="event">

        <table>
            <li><a href="/event/${event.getId()}">${event.nameEvent}</a></li>
            <li>Data wydarzenia : ${event.dateStart} / ${event.dateEnd}</li>
            <li>Data wydarzenia : ${event.description}</li>
            <li>Liczba osób zapisana do wydarzenia : ${event.counter}</li>
            <li><a href="/user/${event.getUser().getId()}">${event.user}</a></li>
            <p></p>
        </table>

    </c:forEach>

    <a href="/">Home</a>

    <a href="/addEvent/">Add Event</a>
</section>
</body>
</html>
