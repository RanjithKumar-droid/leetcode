<?php 
    $conn = mysqli_connect('localhost','root','','test');
?>

<h4 class="page-header"><i class="fa fa-users" aria-hidden="true"></i>Program Details</h4>
            <table class="table">
              <tr>
                <th>SI.No</th>
                <th>Date</th>
                <th>Program Name</th>
                <th>LeetCode url</th>
                <th>Git-Hub url</th>
                <th>Edit</th>
                <th>Delete</th>
              </tr>
              <?php
                    $sql = "select * from testtable";
                    $res = $conn->query($sql);
                    if($res->num_rows > 0){
                        $i = 0;
                        while($row = $res->fetch_assoc()){
                            $i++;
                            echo "<tr>";
                            echo "<td> {$row["sino"]} </td>";
                            echo "<td> {$row["date"]} </td>";
                            echo "<td> {$row["name"]} </td>";
                            echo "<td> {$row["leetcode"]} </td>";
                            echo "<td> {$row["github"]} </td>";
                            echo "<td> <button type = 'button' class = 'btn btn-sm btn-info'>Edit</button></td>";
                            echo "<td> <button type = 'button' class = 'btn btn-sm btn-info'>Delete</button></td>";
                            echo "</tr>";
                        }
                    }
              ?>
            </table>