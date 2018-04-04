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
	<nav>
		<a href="index.html" title ="presentation">Présentation de l'univers</a>
		<a href="heros.html" title ="heros">Les héros</a>
		<a href="ile.html" title="heros">L'île</a>
		<a href="regles.html" title ="regles">Règles</a>
		<a href="dons.html" title ="dons">Dons et compétences</a>
		<a href="magie.html" title ="magie">Magie ancestrale</a>
		<a href="bateaux.php" title ="bateaux">Navires et pillage</a>
		<a href="commerce.php" title ="commerce">Commerce</a>
		<a href="quetes.html" title="quetes">Quêtes secondaires</a>
		<a href="alchimie.html" title="alchimie">Alchimie</a>
		<a href="calcul.html" title="calculateur">Calculateur</a>
	</nav>
	<section>
		<article>
            <header Class="hykosia">Fiche de personnage d'Azhsara</header>
            <h3 class="sous-partie">Description</h3>
            Race/talent : elfe <br>
            Spécialité : <br>
            Première classe : <input id="classe_1" class="separator_ligne size-input"
                type="text" value=""/> Niveau de classe : <input id="classe_1_lvl" class="separator_ligne size-input"
                type="number" value=""/> <br>
            Deuxième classe : <input id="classe_1" class="separator_ligne size-input"
                type="text" value=""/> Niveau de classe : <input id="classe_2_lvl" class="separator_ligne size-input"
                type="number" value=""/> <br>
            Troisième classe : <input id="classe_1" class="separator_ligne size-input"
                type="text" value=""/> Niveau de classe : <input id="classe_3_lvl" class="separator_ligne size-input"
                type="number" value=""/> <br>
            Niveau total : <input id="niveau_total" class="separator_ligne size-input" type="number" value=""/> <br>
            Expérience : <input id="experience" class="separator_ligne size-input" type="number" value=""/> <br>
            Expérience niveau suivant : <input id="niveau_total" class="separator_ligne size-input" type="number" value=""/> <br>
            Genre : <input id="genre" class="separator_ligne size-input" type="number" value=""/> <br>
            Age : <input id="age" class="separator_ligne size-input" type="number" value=""/> <br>
            Taille : <input id="taille" class="separator_ligne size-input" type="text" value=""/> <br>
            Poids : <input id="poids" class="separator_ligne size-input" type="number" value=""/> <br>
            Yeux : <input id="yeux" class="separator_ligne size-input" type="text" value=""/> <br>
            Cheveux : <input id="cheveux" class="separator_ligne size-input" type="text" value=""/> <br>

            <h3 class="sous-partie">Caractéristiques</h3>
            <table class="petit-tableau">
                <tr>
                    <td>Caractéristique</td>
                    <td>Valeur de base</td>
                    <td>Modificateur de base</td>
                    <td>Valeur temporaire</td>
                    <td>Modificateur temporaire</td>
                </tr>
                <tr>
                    <td>FOR</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>DEX</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>CON</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>INT</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>SAG</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>CHA</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>

            <h3 class="sous-partie">Compétences</h3>
            <h3 class="sous-partie">Caractérisques de combat</h3>
		</article>
		<article>
			<header Class="hykosia">Equipements</header>
			
		</article>
	</section>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="./stylesheet/dist/js/bootstrap.min.js"></script>
    <script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"
	type="text/javascript"></script>
<script src="./includes/script.js" type="text/javascript"></script>
<script src="./includes/script/script_calcul.js" type="text/javascript"></script>
</body>
</html>