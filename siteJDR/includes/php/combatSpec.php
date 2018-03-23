<?php
header( 'content-type: text/html; charset=utf-8' );
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'jdr' );

//Requete
if(isset($_POST['classe'])){
	$query = 'SELECT resistance,vitesse,nb_canon,bonus_def,bonus_ref
        FROM bateau
        WHERE classe ="' . $_POST['classe'] . '";';
	$result = mysqli_query ( $bdd, $query );
	$query_resultat = mysqli_fetch_array($result,MYSQLI_NUM);
	echo json_encode(array('combat_spec' => $query_resultat));
}
// fermeture bdd 
mysqli_close($bdd);
?>