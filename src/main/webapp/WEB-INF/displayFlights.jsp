<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Display Flights</title>
</head>
<body>
<table>
    <tr>
        <th>Airlines</th>
        <th>From</th>
        <th>To</th>

    </tr>
    <c:forEach items="${flights}" var="flight">
        <tr>
            <td>${flight.operatingAirlines}</td>
            <td>${flight.departureCity}</td>
            <td>${flight.arrivalCity}</td>
            <td> <a href="showCompleteReservation?flightId=${flight.id}">Select</a> </td>

           <%-- <td><a href="deleteLocation?id=${location.id}">Delete</a> </td>
            <td><a href="updateLocation?id=${location.id}">Edit</a> </td>--%>
        </tr>
    </c:forEach>
</table>

</body>