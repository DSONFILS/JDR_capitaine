<?php
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'jdr' );

//Requete
if(isset($_POST['classe'])) {
    $query = 'SELECT exp,classe 
        FROM bateau 
        WHERE classe ="' . $_POST['classe'] . '";';
    $result = mysqli_query ( $bdd, $query );
    $query_result = array();
    while($row = mysqli_fetch_assoc ( $result )){
    	$query_result[]['exp']= $row['exp'];
    }
    echo json_encode(array('experience' => $query_result[0]['exp']));
}

// fermeture bdd 
mysqli_close($bdd);
?>
