<?php
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'pillage' );
//Requete
if(isset($_POST['vivre'])){
	$query = 'SELECT ressource
        FROM vivres
        WHERE id ="' . $_POST['vivre'] . '";';
	$result = mysqli_query ( $bdd, $query );
	$query_result = array();
	while($row = mysqli_fetch_assoc ( $result )){
		$query_result[]['ressource']= $row['ressource'];
	}
	echo json_encode(array('valeur_vivre' => $query_result[0]['ressource']));
}
// fermeture bdd 
mysqli_close($bdd);
?>