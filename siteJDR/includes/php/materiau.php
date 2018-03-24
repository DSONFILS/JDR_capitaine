<?php
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'pillage' );
//Requete
if(isset($_POST['materiau'])){
	$query = 'SELECT ressource
        FROM materiau
        WHERE id ="' . $_POST['materiau'] . '";';
	$result = mysqli_query ( $bdd, $query );
	$query_result = array();
	while($row = mysqli_fetch_assoc ( $result )){
		$query_result[]['ressource']= $row['ressource'];
	}
	echo json_encode(array('valeur_materiau' => $query_result[0]['ressource']));
}
// fermeture bdd 
mysqli_close($bdd);
?>