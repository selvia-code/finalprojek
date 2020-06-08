<?php



$con = mysqli_connect("localhost","souj3944_usmodel","Model123Pass123", "souj3944_dbmodel");

        if (mysqli_connect_errno()) { 
            echo 'Database connection error: ' . mysqli_connect_error(); 
            exit(); 
        } 
   
    $sql = "SELECT * FROM tblmoddel";

    $result = mysqli_query($con, $sql) or die("Error in Selecting " . mysqli_error($con));

    //create an array
    $emparray = array();
    while($row =mysqli_fetch_assoc($result))
    {
        $emparray[] = $row;
    }
   
    $akhir = array(
	
   	'DataModel' => $emparray
    );

 	echo json_encode($akhir);


    //close the db connection
    mysqli_close($con);
?>
