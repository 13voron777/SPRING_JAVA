<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars search result</title>
</head>
<body>
<h1>List of cars</h1>
<ul>
    <c:forEach items="${car}" var="value">
        <li>${value}</li>
    </c:forEach>
</ul>
<button onclick="window.location = '${pageContext.request.contextPath}/car/all'">Back</button>
</body>
</html>
