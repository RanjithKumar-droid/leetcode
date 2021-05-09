<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="website.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Document</title>
</head>
<body>
    <nav class="navbar navbar-light bg-light justify-content-between">
        <span id="contact" class="navbar-text">
           contact : 8124696331
          </span>
          <span id="email" class="navbar-text">
            Email : sriniranjith27@gmai.com
          </span>
    </nav>
    <nav  class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#" style="font-family: Verdana, Geneva, Tahoma, sans-serif;">RANJITH KUMAR S</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="about.html">ABOUT</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="dailytask.html">DAILY TASK</a>
            </li>
          </ul>
        </div>
      </nav>

      <div class="container-fluid">
        <div class="jumbotron">
          <h1>Daily Tasks</h1>
          <p>Solution for Leetcode problems with Github link</p>
        </div>
        <div class="row">
          <div class="col-md-9 offset-md-4" >
            <h4 class="page-header">Add problems</h4>
            <form id="frm">
            <div class="col-md-4">
              
              <div class="form-group">
                <label>Date</label>
                <input type="date" name="Date" id="date" placeholder="Date" class="form-control">
              </div>

              <div class="form-group">
                <label>Program Name</label>
                <input type="text" name="Name" id="name" placeholder="Program Name" class="form-control">
              </div>

              <div class="form-group">
                <label>Leetcode Link</label>
                <input type="text" name="LeetCode" id="leetcode" placeholder="Leetcode Link" class="form-control">
              </div>

              <div class="form-group">
                <label>Github Link</label>
                <input type="text" name="GitHub" id="github" placeholder="Github Link" class="form-control">
              </div>
              
              <div class="form-group">
                <button type="button" name = "submit" class = "btn btn-primary" id = "save">Submit</button>
              </div>
              
            </form>
          </div>
          </div>
          <div style = "padding-top = 30px" class="col-md-12" id = "output">
            
          </div>
        </div>
      </div>
</body>
<script>
  $(document).ready(function(){
    $("#output").load("view1.php");
    $("#save").click(function(){
        $.ajax({
            url : "insert.php",
            method : "post",
            data : $("#frm").serialize(),
            success : function(d){
                 alert(d);
                $("#frm")[0].reset();
            }
        });
    });
  });
</script>
</html>