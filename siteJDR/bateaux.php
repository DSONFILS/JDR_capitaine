<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8" />
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
		<a href="index.html" title="presentation">Présentation de l'univers</a>
		<a href="heros.html" title="heros">Les héros</a> 
		<a href="regles.html" title="regles">Règles</a>
		<a href="dons.html" title ="dons">Dons et compétences</a> 
		<a href="magie.html" title="magie">Magie ancestrale</a> 
		<a href="bateaux.php" title="bateaux">Navires et pillage</a> 
		<a href="commerce.php" title="commerce">Commerce</a>
		<a href="quetes.html" title="quetes">Quêtes secondaires</a>
		<a href="alchimie.html" title="alchimie">Alchimie</a>
		<a href="calcul.html" title="calculateur">Calculateur</a>
	</nav>
	<section>
		<article>
			<header class="statistique">Statistique des différentes classes de
				bateaux</header>
			<p class="text-justify">
				Les caractéristiques d'un bateau dépendent Ã  la fois de sont type
				et de sa classe. Ces caractéristiques sont basée sur le type Pirate.
				<br /> Les bateaux de type Marchand sont moins résistants et
				possèdent moins de marin. En contre partie ils ont un inventaire
				plus grand et sont donc susceptible de recéler un butin plus
				important. <br /> Les bateaux de type Militaires, quant Ã eux, sont
				conÃ§uts pour le combat. Ils sont plus résistants qu'un bateau de
				type Pirate et possèdent un équipage plus important. Par conséquent,
				l'inventaire est diminué, ne laissant la place que le stricte
				nécessaire. Les bateaux de type Militaire ne transporte que très
				rarement des marchandises de valeurs. En revanche, se sont les seuls
				bateaux possédant des boulets améliorés (boulet chaÃ®né par exemple)
				et des canons lourds.
			</p>
			<form action="" method="post" class="text-center">
				<fieldset class="scheduler-border text-center">
					<label class="radio-inline">Navire de type Pirate
					</label>
				</fieldset>
				<br /> Choix de la classe <select class="separator_ligne"
					name="classe" id="classe_select" size="1">
					<option checked="checked">Sloop</option>
					<option >Caravelle</option>
					<option >Galere</option>
					<option >Cuirasse</option>
					<option >Fregate</option>
					<option >Gallion</option>
				</select> 
				Expériences <input id="exp" class="separator_ligne size-input"
					type="text" value="" />
				Type de canon <select class="separator_ligne" name="type" id="type_canon"
					size="1">
					<option value="leger" checked="checked">Léger</option>
					<option value="naval">Naval</option>
					<option value="lourd">Lourd</option>
				</select> 
				Dégats : <input id="DD_degat" class="separator_ligne size-input"
					type="text" value="" />
			</form>
			<table id="combat_spec">
				<tr>
					<td>Résistance</td>
					<td>Vitesse</td>
					<td>Nombre de canon</td>
					<td>Bonus de défense</td>
					<td>Bonus de réflexe</td>
				</tr>
				<tr>
					<td id="res"></td>
					<td id="vit"></td>
					<td id="nb_canon"></td>
					<td id="bonus_def"></td>
					<td id="bonus_ref"></td>
				</tr>
			</table>
		</article>
		<article>
			<header class="equipage">Répartition de l'équipage du bateau</header>
			<table>
				<tr>
					<td>Capitaine</td>
					<td>Médecin</td>
					<td>Maître queux</td>
					<td>Navigateur</td>
					<td>Ingénieur</td>
					<td>Lance-grappin</td>
					<td>Cannonier</td>
					<td>Tireur</td>
					<td>Combattant</td>
					<td>Total</td>
				</tr>
				<tr>
					<td id='cap'></td>
					<td id='med'></td>
					<td id='cuisto'></td>
					<td id='nav'></td>
					<td id='inge'></td>
					<td id='grappin'></td>
					<td id='canon'></td>
					<td id='tireur'></td>
					<td id='combat'></td>
					<td id='total'></td>
				</tr>
			</table>
		</article>
		<article>
			<header class="soute">Répartition de la soute</header>
			<table>
				<tr>
					<td>Tonnage max</td>
					<td>Réparation</td>
					<td>Munition</td>
					<td>Nourriture</td>
					<td>Inventaire</td>
				</tr>
				<tr>
					<td id="ton_max"></td>
					<td id="reparation"></td>
					<td id="munition"></td>
					<td id="nourriture"></td>
					<td id="inventaire"></td>
				</tr>
			</table>
		</article>

		<article>
		<form action="" method="post" class="text-center">
				<fieldset class="scheduler-border text-center">
					<label class="radio-inline">Navire de type Marchand
					</label>
				</fieldset>
				<br>
				Expériences <input id="exp_mar" class="separator_ligne size-input"
					type="text" value="" />
			</form>
			<table id="combat_spec">
				<tr>
					<td>Résistance</td>
					<td>Vitesse</td>
					<td>Nombre de canon</td>
					<td>Bonus de défense</td>
					<td>Bonus de réflexe</td>
				</tr>
				<tr>
					<td id="res_mar"></td>
					<td id="vit_mar"></td>
					<td id="nb_canon_mar"></td>
					<td id="bonus_def_mar"></td>
					<td id="bonus_ref_mar"></td>
				</tr>
			</table>
		</article>
		<article>
			<header class="equipage">Répartition de l'équipage du bateau</header>
			<table>
				<tr>
					<td>Capitaine</td>
					<td>Médecin</td>
					<td>Maître queux</td>
					<td>Navigateur</td>
					<td>Ingénieur</td>
					<td>Lance-grappin</td>
					<td>Cannonier</td>
					<td>Tireur</td>
					<td>Combattant</td>
					<td>Total</td>
				</tr>
				<tr>
					<td id='cap_mar'></td>
					<td id='med_mar'></td>
					<td id='cuisto_mar'></td>
					<td id='nav_mar'></td>
					<td id='inge_mar'></td>
					<td id='grappin_mar'></td>
					<td id='canon_mar'></td>
					<td id='tireur_mar'></td>
					<td id='combat_mar'></td>
					<td id='total_mar'></td>
				</tr>
			</table>
		</article>
		<article>
			<header class="soute">Répartition de la soute</header>
			<table>
				<tr>
					<td>Tonnage max</td>
					<td>Réparation</td>
					<td>Munition</td>
					<td>Nourriture</td>
					<td>Inventaire</td>
				</tr>
				<tr>
					<td id="ton_max_mar"></td>
					<td id="reparation_mar"></td>
					<td id="munition_mar"></td>
					<td id="nourriture_mar"></td>
					<td id="inventaire_mar"></td>
				</tr>
			</table>
		</article>

		<article>
		<form action="" method="post" class="text-center">
				<fieldset class="scheduler-border text-center">
					<label class="radio-inline">Navire de type Militaire
					</label>
				</fieldset>
				<br>
				Expériences <input id="exp_mil" class="separator_ligne size-input"
					type="text" value="" />
			</form>
			<table id="combat_spec">
				<tr>
					<td>Résistance</td>
					<td>Vitesse</td>
					<td>Nombre de canon</td>
					<td>Bonus de défense</td>
					<td>Bonus de réflexe</td>
				</tr>
				<tr>
					<td id="res_mil"></td>
					<td id="vit_mil"></td>
					<td id="nb_canon_mil"></td>
					<td id="bonus_def_mil"></td>
					<td id="bonus_ref_mil"></td>
				</tr>
			</table>
		</article>
		<article>
			<header class="equipage">Répartition de l'équipage du bateau</header>
			<table>
				<tr>
					<td>Capitaine</td>
					<td>Médecin</td>
					<td>Maître queux</td>
					<td>Navigateur</td>
					<td>Ingénieur</td>
					<td>Lance-grappin</td>
					<td>Cannonier</td>
					<td>Tireur</td>
					<td>Combattant</td>
					<td>Total</td>
				</tr>
				<tr>
					<td id='cap_mil'></td>
					<td id='med_mil'></td>
					<td id='cuisto_mil'></td>
					<td id='nav_mil'></td>
					<td id='inge_mil'></td>
					<td id='grappin_mil'></td>
					<td id='canon_mil'></td>
					<td id='tireur_mil'></td>
					<td id='combat_mil'></td>
					<td id='total_mil'></td>
				</tr>
			</table>
		</article>
		<article>
			<header class="soute">Répartition de la soute</header>
			<table>
				<tr>
					<td>Tonnage max</td>
					<td>Réparation</td>
					<td>Munition</td>
					<td>Nourriture</td>
					<td>Inventaire</td>
				</tr>
				<tr>
					<td id="ton_max_mil"></td>
					<td id="reparation_mil"></td>
					<td id="munition_mil"></td>
					<td id="nourriture_mil"></td>
					<td id="inventaire_mil"></td>
				</tr>
			</table>
		</article>
		
		<article>
			<header class="soute">Pillage d'un navire ou d'un entrepôt</header>
			Pour le pillage, les joueurs doivent lancer un DD de pillage = 1d10+1d20 
			pour les vivres et les matériaux. La quantité obtenue est déterminée à 
			l'aide de 1d10*10kg.
			<form action="" method="post" class="text-center">
				<fieldset class="scheduler-border text-center">
					<legend class="scheduler-border">Détermination des vivres</legend>
					Résultat du DD : <input name="vivre" id="DD_vivre" class="separator_ligne size-input petit-champ"
					type="number" value="" />
					Vivre obtenu : <input id="vivre_obtenu" class="separator_ligne size-input grand-champ"
					type="text" value="" />
				</fieldset>
			</form>
			<br/>
			<form action="" method="post" class="text-center">
				<fieldset class="scheduler-border text-center">
					<legend class="scheduler-border">Détermination des matériaux</legend>
					Résultat du DD : <input name="materiau" id="DD_materiau" class="separator_ligne size-input petit-champ"
					type="number" value="" size="1"/>
					Materiau obtenu : <input id="materiau_obtenu" class="separator_ligne size-input grand-champ"
					type="text" value="" maxlength="10"/>
				</fieldset>
			</form>
			<table>
				<tr>
					<td>Classe de bateau</td>
					<td>Rapine</td>
					<td>Nombre de marchandises différentes</td>
					<td>Quantité (x100kg)</td>
				</tr>
				<tr>
					<td>Sloop</td>
					<td>1080</td>
					<td>1d10</td>
					<td>1d10</td>
				</tr>
				<tr>
					<td>Caravelle</td>
					<td>2220</td>
					<td>1d10</td>
					<td>1d20</td>
				</tr>
				<tr>
					<td>Galère</td>
					<td>4920</td>
					<td>1d20</td>
					<td>1d20 + 1d4</td>
				</tr>
				<tr>
					<td>Cuirassé</td>
					<td>7530</td>
					<td>1d20</td>
					<td>1d20 + 2d10 + 1d10 / 2</td>
				</tr>
				<tr>
					<td>Frégate</td>
					<td>9900</td>
					<td>1d20</td>
					<td>1d100 / 2</td>
				</tr>
				<tr>
					<td>Gallion</td>
					<td>15150</td>
					<td>1d20</td>
					<td>3d20 + 1d10 + 1d10 / 2</td>
				</tr>
			</table>
		</article>
	</section>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"
	type="text/javascript"></script>
<script src="./stylesheet/dist/js/bootstrap.min.js"
	type="text/javascript"></script>
<!-- <script src="./controllers/bateaux.controller.js" type="text/javascript"></script> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"
	type="text/javascript"></script>
<script src="./includes/script.js" type="text/javascript"></script>
</html>