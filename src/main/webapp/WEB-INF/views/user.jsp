<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title> ${user.getNickName()} </title>
</head>
<body>
   <li> ${user.getNickName()}</li>
   <li> ${user.getEmail()}</li>


   Lista Eventów :

   <c:forEach items="${user.getEvents()}" var="event">

       <table>
           <li><a href="/event/${event.getId()}">${event.nameEvent}</a></li>
           <li>Data wydarzenia : ${event.dateStart} / ${event.dateEnd}</li>
           <p></p>
       </table>

   </c:forEach>

</body>
</html>
