<?php
header( 'content-type: text/html; charset=utf-8' );
// init bdd
$bdd = mysqli_connect ( 'localhost:3306', 'root', 'root' );
mysqli_select_db ( $bdd, 'gestion_joueur' );

$query = 'SELECT nom FROM joueur';
$username = mysqli_query ( $bdd, $query );
$query = 'SELECT mdp FROM joueur';
$password = mysqli_query ( $bdd, $query );
if( isset($_POST['login']) && isset($_POST['password']) ){
    if($_POST['login'] == $username && $_POST['password'] == $password){
        session_start();
        $_SESSION['user'] = $username;
        echo "Success";    
    }
    else {
        echo "Failed";
    }
}
?>