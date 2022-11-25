<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="Results" scope="session" class="beans.Results"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <script src="canvas.js" defer></script>
    <script src="App.js" defer></script>
    <title>Web 1</title>
</head>
<body>
<header>Nickolay Danukov P32082 var 9123</header>
<div id="wrap">
    <div id="canvas-container">
        <canvas id="canvas" width="300px" height="300px"></canvas>
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
            <input id="hidden" type="text" name="R" value="1">
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
    <div class="table-container">
        <table class="result-table">
            <tr class="result-table__header">
                <th class="result-table__coords-column">X</th>
                <th class="result-table__coords-column">Y</th>
                <th class="result-table__coords-column">R</th>
                <th class="result-table__time-column">Result</th>
                <th class="result-table__time-column">Processing Time</th>
                <th class="result-table__hitres-column">Request Time</th>
            </tr>
            <div>${table}</div>
        </table>
    </div>
    <button id="clear-table-button">Clear table</button>
</div>
</body>
</html>
