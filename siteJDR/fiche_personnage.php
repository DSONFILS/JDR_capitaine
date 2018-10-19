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
		<a href="classe.html" title="classe">Classes</a>
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
			<header class="titre_article">Connexion</header>
            Nom du personnage: <input type="number" id="nb_canon_calcul" class="separator_ligne size-input"/>
            <button onclick="connexion()">Connexion</button>
            <button onclick="modification()">Modification</button>
        </article>
		<article>
			<header class="titre_article">Description</header>
            Race : <input type="text" id="race" class="separator_ligne size-input"/></td>
            Talent : <input type="text" id="talent" class="separator_ligne size-input"/></td> <br>
            Spécialité : <input type="text" id="specialite" class="separator_ligne size-input"/></td> <br>
            Première classe : <input type="texte" id="classe_une" class="separator_ligne size-input"/></td>
            Niveau : <input type="number" id="niveau_classe_une" class="separator_ligne size-input"/></td> <br>
            Deuxième classe : <input type="texte" id="classe_deux" class="separator_ligne size-input"/></td>
            Niveau : <input type="number" id="classe_deux" class="separator_ligne size-input"/></td> <br>
            Troisième classe : <input type="texte" id="classe_trois" class="separator_ligne size-input"/></td> 
            Niveau : <input type="number" id="niveau_classe_trois" class="separator_ligne size-input"/></td> <br>
            Point d'experience : <input type="number" id="px" class="separator_ligne size-input"/></td> <br>
            Prochain niveau : <input type="number" id="px_suivant" class="separator_ligne size-input"/></td> <br>
            Genre : <select class="separator_ligne" name="genre" id="genre_select" size="1">
                        <option checked="checked">Femme</option>
                        <option >Homme</option>
                    </select> <br>
            Age : <input type="number" id="age" class="separator_ligne size-input"/></td> <br>
            Taille : <input type="text" id="taille" class="separator_ligne size-input"/></td> <br>
            Poids : <input type="text" id="poid" class="separator_ligne size-input"/></td> <br>
            Yeux : <input type="text" id="yeux" class="separator_ligne size-input"/></td> <br>
            Cheveux : <input type="text" id="cheveux" class="separator_ligne size-input"/></td> <br>
        </article>
        <article>
			<header class="titre_article">Statistiques</header>
            <table>
                <tr>
                    <td></td>
                    <td>Valeur</td>
                    <td>Modificateur</td>
                    <td>Valeur temporaire</td>
                    <td>Modificateur temporaire</td>
                </tr>
                <tr>
                    <td>FOR</td>
                    <td><input type="number" id="force" class="separator_ligne size-input"/></td>
                    <td></td>
                    <td><input type="number" id="force_temp" class="separator_ligne size-input"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>DEX</td>
                    <td><input type="number" id="dexterite" class="separator_ligne size-input"/></td>
                    <td></td>
                    <td><input type="number" id="dexterite_temp" class="separator_ligne size-input"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>CON</td>
                    <td><input type="number" id="constitution" class="separator_ligne size-input"/></td>
                    <td></td>
                    <td><input type="number" id="constitution_temp" class="separator_ligne size-input"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>INT</td>
                    <td><input type="number" id="intelligence" class="separator_ligne size-input"/></td>
                    <td></td>
                    <td><input type="number" id="intelligence_temp" class="separator_ligne size-input"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>SAG</td>
                    <td><input type="number" id="sagesse" class="separator_ligne size-input"/></td>
                    <td></td>
                    <td><input type="number" id="sagesse_temp" class="separator_ligne size-input"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>CHA</td>
                    <td><input type="number" id="charisme" class="separator_ligne size-input"/></td>
                    <td></td>
                    <td><input type="number" id="charisme_temp" class="separator_ligne size-input"/></td>
                    <td></td>
                </tr>
            </table>
        </article>
        <article>
			<header class="titre_article">Compétences</header>
            <table>
                <tr>
                    <td><input type="checkbox" id="acrobatie_check" class="separator_ligne size-input"/> Acrobaties : <input type="text" id="acrobatie_bonus" class="separator_ligne size-input"/></td>
                </tr>
                <tr>
                    <td></td>
                </tr>
            </table>
        </article>
        <article>
			<header class="titre_article">Combats</header>
            <h3 class="sous-sous-partie">Dés d'action :</h3>
            Type de dès d'action : <select class="type_de_action" name="genre" id="genre_select" size="1">
                                        <option checked="checked">d4</option>
                                        <option >d6</option>
                                        <option>d8</option>
                                        <option>d10</option>
                                        <option>d12</option>
                                        <option>d20</option>
                                    </select> <br>
            Nombre de dés d'action : <input type="number" id="nb_de_action" class="separator_ligne size-input"/>
            
            <h3 class="sous-sous-partie">Défense :</h3>
            Défense : <input type="number" id="defense" class="separator_ligne size-input"/>
            Vitalité : <input type="number" id="vitalite" class="separator_ligne size-input"/>
            Blessures : <input type="number" id="blessure" class="separator_ligne size-input"/>
            Initiative : <input type="number" id="initiative" class="separator_ligne size-input"/>

            <h3 class="sous-sous-partie">Attaque et sauvegarde :</h3>
            Mains nues : <input type="number" id="mains_nues" class="separator_ligne size-input"/> <br>
            Corps à corps : <input type="number" id="cac" class="separator_ligne size-input"/> <br>
            Distance : <input type="number" id="distance" class="separator_ligne size-input"/> <br>
            Réflexes : <input type="number" id="reflexe" class="separator_ligne size-input"/> <br>
            Vigueur : <input type="number" id="vigueur" class="separator_ligne size-input"/> <br>
            Volonté : <input type="number" id="volonte" class="separator_ligne size-input"/> <br>
        </article>
        <article>
			<header class="titre_article">Magie</header>
            Niveau de lanceur : <input type="number" id="niveau_lanceur" class="separator_ligne size-input"/> <br>
            Point de magie : <input type="number" id="point_magie" class="separator_ligne size-input"/>
            Bonus d'incantation : <input type="number" id="bonus_incantation" class="separator_ligne size-input"/> <br>
            Nombre de sorts connus : <input type="number" id="nb_sorts_connus" class="separator_ligne size-input"/> <br>
            DD de sauvegarde : <input type="number" id="dd_sauvegarde" class="separator_ligne size-input"/> <br>
        </article>
        <article>
			<header class="titre_article">Dons</header>
        
		</article>
	</section>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="./stylesheet/dist/js/bootstrap.min.js"></script>
</body>
</html>