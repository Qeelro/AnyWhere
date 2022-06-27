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
    <c:forEach items="${event}" var="example">

        <table>
            <li>${example.nameEvent}</li>
            <li>${example.date}</li>
            <li>counter :${example.counter}</li>
            <li>${example.user}</li>
            <p></p>
        </table>

    </c:forEach>

</section>
</body>
</html>
