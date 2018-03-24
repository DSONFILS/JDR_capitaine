<?php
header( 'content-type: text/html; charset=utf-8' );
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'alchimie' );
//Requete
$query = 'SELECT * FROM ingredient';
$result = mysqli_query ( $bdd, $query );
while($row = mysqli_fetch_assoc($result)){
	$query_resultat[] = $row;
}
echo json_encode(array('alchimie' => $query_resultat));
// fermeture bdd 
mysqli_close($bdd);
?>