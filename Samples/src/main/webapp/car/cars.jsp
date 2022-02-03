<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>

<h1>List of cars</h1>
${car}

<h1>Actions</h1>

<form method="post" action="${pageContext.request.contextPath}/car/add">
    <h3>Add new car</h3>
    <input name="mark" type="text" placeholder="Mark ">
    <input name="model" type="text" placeholder="Model ">
    <input name="engineVolume" type="number" placeholder="Engine volume ">
    <input name="price" type="number" placeholder="Price ">
    <input name="maxSpeed" type="number" placeholder="Max speed ">
    <button>Add a new car</button>
</form>
<br>
<br>
<form method="get" action="${pageContext.request.contextPath}/car/findCarByMark">
    <h3>Find car by mark</h3>
    <input name="mark" type="text" placeholder="Mark ">
    <button>Find car</button>
</form>
<br>
<br>
<form method="get" action="${pageContext.request.contextPath}/car/findCarByMarkAndModelAndMaxSpeed">
    <h3>Find car by mark, model and max speed</h3>
    <input name="mark" type="text" placeholder="Mark ">
    <input name="model" type="text" placeholder="Model ">
    <input name="maxSpeed" type="number" placeholder="Max speed ">
    <button>Find car</button>
</form>
<br>
<br>
<form action="${pageContext.request.contextPath}/car/removeById">
    <h3>Delete car by id</h3>
    <input name="id" type="number" placeholder="Id car ">
    <button>Delete car</button>
</form>
<br>
<br>
<form action="${pageContext.request.contextPath}/car/removeAllByMark">
    <h3>Delete all cars by mark</h3>
    <input name="mark" type="text" placeholder="Mark ">
    <button>Delete cars</button>
</form>
</body>
</html>
