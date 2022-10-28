<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <script src="App.js" defer></script>
    <title>Web 1</title>
</head>
<body>
    <header>Данюков Николай Владимирович P32082 вариант 489</header>
<div id="wrap">
    <img src="img.png">
    <form action="action.php" method="post">
        <div id="checkbox-container">
            <div>X: </div>
            <label>
                -4
                <input type="checkbox" name="X" value="-4">
            </label>
            <label>
                -3
                <input type="checkbox" name="X" value="-3">
            </label>
            <label>
                -2
                <input type="checkbox" name="X" value="-2">
            </label>
            <label>
                -1
                <input type="checkbox" name="X" value="-1">
            </label>
            <label>
                0
                <input type="checkbox" name="X" value="0">
            </label>
            <label>
                1
                <input type="checkbox" name="X" value="1">
            </label>
            <label>
                2
                <input type="checkbox" name="X" value="2">
            </label>
            <label>
                3
                <input type="checkbox" name="X" value="3">
            </label>
            <label>
                4
                <input type="checkbox" name="X" value="4">
            </label>
        </div>
        <div id="text-container">
            <div>Y: </div>
            <input id="input-field" type="text" name="Y" required>
            <div id="warning"></div>
        </div>
        <div id="select-container">
            <div>R: </div>
            <select name="R">
                <option value="1">1</option> 
                <option value="2">2</option> 
                <option value="3">3</option> 
                <option value="4">4</option> 
                <option value="5">5</option> 
            </select>
        </div>
        <button type="submit" id="submit-button" disabled>Submit</button>
    </form>
    <?php include 'table.php'?>
    <button id="clear-table-button">Clear table</button>
</div>

</body>
</html>
