<?php
header( 'content-type: text/html; charset=utf-8' );
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'commerce' );
//Requete
if(isset($_POST['inlineRadioOptions'])){
	$query = 'SELECT recherche,prix
		FROM '. $_POST['inlineRadioOptions'] .',materiau
		WHERE ressource = recherche
		ORDER BY ' . $_POST['inlineRadioOptions'] . '.id;';
	$result = mysqli_query($bdd,$query);
	while($row = mysqli_fetch_assoc($result)){
		$query_resultat[] = $row;
	}
	echo json_encode(array('commerce_mv' => $query_resultat));
}
// fermeture bdd 
mysqli_close($bdd);
?>