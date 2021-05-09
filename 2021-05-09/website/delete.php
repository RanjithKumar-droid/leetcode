<?php
    $con = mysqli_connect('localhost','root','','test');
    
    $sql = "delete from tabletest where id =".$_POST["id"];

    $con->query($sql);
?>