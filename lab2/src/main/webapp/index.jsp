<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<%--    <style><%@include file="/styles.css"%></style>--%>
<%--    <script><%@include file="/canvas.js"%></script>--%>
    <link rel="stylesheet" href="styles.css">
<%--    <script src="canvas.js"></script>--%>
    <script src="canvas.js" defer></script>
    <script src="App.js" defer></script>
    <title>Web 1</title>
</head>
<body>
<header>Данюков Николай Владимирович P32082 вариант 9123</header>
<div id="wrap">
    <div id="canvas-container">
        <canvas id="canvas"></canvas>
    </div>
    <form id="form" action="${pageContext.request.contextPath}/controller" method="post">
        <div id="text-container">
            <div>X: </div>
            <input id="input-field" type="text" name="X" required>
            <div id="warning"></div>
        </div>
        <div id="radio-container">
            <div>Y: </div>
            <label>
                -4
                <input type="radio" name="Y" value="-4">
            </label>
            <label>
                -3
                <input type="radio" name="Y" value="-3">
            </label>
            <label>
                -2
                <input type="radio" name="Y" value="-2">
            </label>
            <label>
                -1
                <input type="radio" name="Y" value="-1">
            </label>
            <label>
                0
                <input type="radio" name="Y" value="0" checked>
            </label>
            <label>
                1
                <input type="radio" name="Y" value="1">
            </label>
            <label>
                2
                <input type="radio" name="Y" value="2">
            </label>
            <label>
                3
                <input type="radio" name="Y" value="3">
            </label>
            <label>
                4
                <input type="radio" name="Y" value="4">
            </label>
        </div>

        <div id="button-container">
            <div>R: </div>
            <input id="hidden" type="text" name="R" >
<%--            <input id="tst" type="button" class="R" value="1">--%>
            <button type="button" class="R" value="1">1</button>
            <button type="button" class="R" value="2">2</button>
            <button type="button" class="R" value="3">3</button>
            <button type="button" class="R" value="4">4</button>
            <button type="button" class="R" value="5">5</button>
        </div>
<%--        <div>--%>
<%--            <button type="submit" id="submit-button" form="form">Submit</button>--%>
<%--        </div>--%>
    </form>
    <button type="submit" id="submit-button" form="form">Submit</button>
    <button id="clear-table-button">Clear table</button>
</div>
</body>
</html>
