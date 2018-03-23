<?php
header( 'content-type: text/html; charset=utf-8' );
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'jdr' );

//Requete
if(isset($_POST['classe'])){
	$query = 'SELECT idsoute,soute.* 
        FROM bateau,soute
        WHERE classe ="' . $_POST['classe'] . '"
		AND soute.id=idsoute;';
	$result = mysqli_query ( $bdd, $query );
	$query_resultat = mysqli_fetch_array($result,MYSQLI_NUM);
	echo json_encode(array('detail_soute' => $query_resultat));
}
// fermeture bdd 
mysqli_close($bdd);
?>