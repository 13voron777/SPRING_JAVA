<%--
  Created by IntelliJ IDEA.
  User: OLEG
  Date: 01.02.2022
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Car Information</h2>
<form:form method = "POST" action = "/004_Samples_war_exploded/addCar">
    <table>
        <tr>
            <td><form:label path = "id">Id</form:label></td>
            <td><form:input path = "id" /></td>
        </tr>
        <tr>
            <td><form:label path = "model">Model</form:label></td>
            <td><form:input path = "model" /></td>
        </tr>
        <tr>
            <td><form:label path = "color">Color</form:label></td>
            <td><form:input path = "color" /></td>
        </tr>
        <tr>
            <td>
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
