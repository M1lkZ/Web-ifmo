<?php

if (!isset($_SESSION['attempts'])) {
    $_SESSION['attempts'] = array();
}

$array = $_SESSION['attempts'];

echo("<table>");
echo "
<tr>
    <th>X</th>
    <th>Y</th>
    <th>R</th>
    <th>Status</th>
    <th>Time</th>
    <th>Processing time</th>
</tr>";
foreach ($_SESSION['attempts'] as $item) {
    echo "<tr>";
    foreach ($item as $value) {
        echo "<th>";
        echo $value;
        echo "</th>";
    }
    echo "</tr>";
}

echo("</table>");
