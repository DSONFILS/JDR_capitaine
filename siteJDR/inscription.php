<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="UTF-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Mon JDR</title>
	<link rel="stylesheet" href="./stylesheet/dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="./stylesheet/feuille/feuille_style.css">
</head>
<body>
	<header class="entete">
		<h2 id="hykosia">Le monde d'Hykosia</h2>
	</header>
	<section>
		<header class="connexion">Inscription</header>
		<form id="formulaire_incription" class=connexion-form>
			<label>Nom du personnage</label>
			</br>
			<input id="inscription_login" type="text" value=""/>
			</br>
			<label>Mot de passe</label>
			</br>
			<input id="inscription_mdp" type="password" value=""/>
			<br>
			<label>Confirmer le mot de passe</label>
			</br>
			<input id="inscription_mdp_confirm" type="password" value=""/>
			</br>
			<label>Couriel</label>
			</br>
			<input id="inscription_couriel" type="text" value=""/>
			</br>
			<button onclick="inscription()">S'enregistrer</button>
			<button onclick="retour()" id="retour">Retour</button>
		</form>
	</section>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="./stylesheet/dist/js/bootstrap.min.js"></script>
	<script src="./includes/script/script_connexion.js" type="text/javascript"></script>
</body>
</html>