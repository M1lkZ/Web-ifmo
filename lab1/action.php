<?php
session_start();
$startTime = microtime(true);
$flag = false;

if (!isset($_SESSION['attempts'])) {
    $_SESSION['attempts'] = array();
}

if (!isset($_POST['X'])) {
    echo "X is required\r\n";
    $flag = true;
}
if (!isset($_POST['Y'])) {
    echo "Y is required\r\n";
    $flag = true;
}
if (!isset($_POST['R'])) {
    echo "R is required\r\n";
    $flag = true;
}

if($flag){
    http_response_code(400);
}

$x = floatval($_POST["X"]);
$y = floatval($_POST["Y"]);
$r = floatval($_POST["R"]);

if($x > 4 || $x < -4){
    echo "x is not in [-4;4] range";
    http_response_code(400);
}
if($y > 5 || $y < -5){
    echo "y is not in [-5;5] range";
    http_response_code(400);
}
if($r > 5 || $r < 1){
    echo "r is not in [1;5] range";
    http_response_code(400);
}

$success = false;

if($x >= 0 && $y >= 0){
    $success = $x*$x + $y*$y <= ($r*$r) / 4;
} elseif ($x <= 0 && $y <= 0){
    $success = $y >= - $x/2 - $r/2;
} elseif ($x >= 0 && $y <= 0){
    $success = $y >= -$r || $x <= $r/2;
}

$result = array($x, $y, $r, $success ? "<div>Success</div>" : "<div>Miss</div>", date("H:i:s d-m-Y"), number_format((microtime(true) - $startTime)/60, 8, '.', ''));

$_SESSION['attempts'][] = $result;

http_response_code(200);
header('Location: ' . $_SERVER['HTTP_REFERER']);