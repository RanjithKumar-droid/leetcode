<?php
    
    $con = mysqli_connect('localhost','root','','test');
    $Date = $_POST["Date"];
    $Name = $_POST["Name"];
    $Leetcode = $_POST["LeetCode"];
    $GitHub = $_POST["GitHub"];

    $sql = "insert into tabletest(Date,Name,LeetCode,GitHub) values('$Date','$Name','$Leetcode','$GitHub')";
    if(!$con->query($sql)){
        echo "Data Not saved";
    }
?>