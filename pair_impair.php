<?php
$nombre = readline("Veillez saisie un nombre: ");
$reste = $nombre%2;
if ($reste == 0) {
    echo "Ce nombre est pair";
}else {
    echo "Ce nombre est impair";
}
?>