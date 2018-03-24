<?php
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'jdr' );

//Requete
if(isset($_POST['type'])){
	$query = 'SELECT type,degat
        FROM canon
        WHERE type ="' . $_POST['type'] . '";';
	$result = mysqli_query ( $bdd, $query );
	$query_result = array();
	while($row = mysqli_fetch_assoc ( $result )){
		$query_result[]['degat']= $row['degat'];
	}
	echo json_encode(array('valeur_degat' => $query_result[0]['degat']));
}
// fermeture bdd 
mysqli_close($bdd);
?>