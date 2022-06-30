<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>${event.getNameEvent()} by ${event.getUser()}</title>
</head>
<body>
    <li>${event.getNameEvent()}</li>
    <li>${event.getDescription()}</li>
    <li>Start wydarzenia : ${event.getDateStart()}</li>
    <li>Koniec wydarzenia : ${event.getDateEnd()}</li>
    <li>liczba osób zapisana do wydarzenia : ${event.getCounter()}</li>
    <li><a href="/user/${event.getUser().getId()}">${event.getUser()}</a></li>
</body>
</html>
