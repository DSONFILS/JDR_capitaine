<?php
header( 'content-type: text/html; charset=utf-8' );
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'jdr' );

//Requete
if(isset($_POST['classe'])){
	$query = 'SELECT idequipage,equipage.* 
        FROM bateau,equipage
        WHERE classe ="' . $_POST['classe'] . '"
		AND equipage.id=idequipage;';
	$result = mysqli_query ( $bdd, $query );
	$query_resultat = mysqli_fetch_array($result,MYSQLI_NUM);
	echo json_encode(array('compo_equipage' => $query_resultat));
}
// fermeture bdd 
mysqli_close($bdd);
?>