<?php
function inscription(){
    header( 'content-type: text/html; charset=utf-8' );
    // init bdd
    $bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
    
    if(isset($_POST['inscription_mdp']) && isset($_POST['inscription_login']) $$ 
        isset($_POST['inscription_mdp_confirm']) && isset($_POST['inscription_couriel'])){
        
        // Hashage du password
        $password_hash = password_hash($_POST['inscription_mdp'], PASSWORD_DEFAULT);

        // requete
        $req = $bdd -> prepare('INSERT INTO gestion_joueur(nom, mdp, couriel) 
            VALUES(:nom, :mdp, :couriel)');

        $req -> execute(array(
            'nom' => $_POST['inscription_login'],
            'mdp' => $_POST['inscription_mdp'],
            'couriel' => $_POST['inscription_couriel']
        ));
    }
}
?>