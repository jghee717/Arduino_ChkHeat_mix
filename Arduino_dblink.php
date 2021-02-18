<?php

$con=mysqli_connect("","","","simdb");

if(mysqli_connect_error())
{
    echo "Failed to MySQL:".mysqli_connect_error();
    exit;
}
else{
    echo "DB접속성공";

    $bodyheat=$_GET["TempR"];
    $number=$_GET["rfid"];

    $sql="update simdb.member set bodyheat =$bodyheat where number=$number;";
    $result=mysqli_query($con, $sql);
    mysqli_close($con);
}
?>

