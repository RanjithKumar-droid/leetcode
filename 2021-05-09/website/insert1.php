<?php
    $con = mysqli_connect('localhost','root','','test');
    if(isset($_POST['submit'])){
        if(!empty($_POST['sino']) && !empty($_POST['date']) && !empty($_POST['name']) && !empty($_POST['leetcode']) && !empty($_POST['github'])){
            $sino = $_POST['sino'];
            $date = $_POST['date'];
            $name = $_POST['name'];
            $leetcode = $_POST['leetcode'];
            $github = $_POST['github'];
            $query = "insert into website(sino,date,name,leetcode,github) values('$sino','$date','$name','$leetcode','$github')";
            $run = mysqli_query($con,$query) or die(mysqli_error());
            if(!$run){
                echo "form not submittd succesfully";
            }
        } else{
            echo "all fields are required";
        }
    }
?>