<?php 
// Exporter en xml
header("Content-Type: text/javascript");
// Connection a la base de donnee
$bdd_host = "localhost:82";
$bdd_name = "jdr";
$bdd_user = "root";
$bdd_pswd = "root";

// $bdd_link = mysql_connect($bdd_host,$bdd_user,$bdd_pswd);
// mysql_select_db("jdr",$bdd_link);


// $classe = (isset($_POST["classe"])) ? htmlentities($_POST["classe"]) : NULL;

// // Requete SELECT bateau classe,exp
// $query = "SELECT classe, exp FROM bateau WHERE classe=". mysql_real_escape_string($classe);
// $result = mysql_query($query, $bdd_link) or die(mysql_error($bdd_link));
// $row = mysql_fecth_array($result, MYSQL_NUM);


$mainClass = new Main($host, $db, $user, $pwd);
print ($mainClass->handleRequest());

class main{
    private $host;
    private $db;
    private $user;
    private $pwd;
    private $conn;
    
    // GETTER & SETTER
    public function getHost(){
    	return $this->host;
    }
    
    public function setHost(){
    	$this->host = $host;
    	return $this;
    }
    
    public function getDb(){
    	return $this->db;
    }
    
    public function setDb(){
    	$this->db = $db;
    	return $this;
    }
    
    public function getUser(){
    	return $this->user;
    }
    
    public function setUser(){
    	$this->user = $user;
    	return $this;
    }
    
    public function getPwd(){
    	return $this->pwd;
    }
    
    public function setPwd(){
    	$this->pwd = $pwd;
    	return $this;
    }
    
    // CONSTRUCTEUR
    public function __construct($host,$db,$user,$pwd){
    	$this->setHost($host)->setDb($db)->setUser($user)->getPwd($pwd);
    	try{
    		$this->conn = new PDO("mysql:host=$host;nomDb=$db;charset=utf8",$user,$pwd);
    	} catch(Exception $e){
    		die('Erreur : ' . $e->getMessage());
    	}
    }
    
    // SWITCH SUR LES EVENEMENTS
    public function handleRequest(){
    	switch ($_REQUEST['functionName']){
    		default:
    			$result = "Mauvais URL";
    			break;
    		case 'expBateau':
    			$result = $this->expBateau();
    			break;
    	}
    }
    
    // LISTE DES FONCTIONS ASSOCIEES AUX EVENEMENTS
    
    private function expBateau(){
    	$exp = $_REQUEST['classe'];
    	$exp = $_REQUEST['exp'];
    	$q = $this ->conn->prepare("SELECT exp, classe FROM bateau WHERE exp =: exp");
    	$q->execute(array(
    			':exp' => $exp
    	));
    }
}
?>

