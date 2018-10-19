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
			<header Class="hykosia"> Fonctionnement du commerce sur Hykosia</header>
			<p>
				Le fonctionnement du commerce sur Hykosia est relativement simple. Chaque faction
				vend 6 ressources de type vivre et de type matériau et recherche 6 ressources. 
				les ressources recherchées sont achetées 2 fois le prix de base. Cette table de 
				commerce est donnée ou non aux joueurs, c'est au choix du maître de jeu. Pour 
				modifier le prix d'achat et de vente, les joueurs peuvent réaliser des DD de 
				négociation. La difficulté de ce DD est au choix du maître de jeu. Pour finir, ces
				DD sont ponctuelles. En aucun cas, les joueurs peuvent modifier de façon permanente 
				les valeurs d'achats et de ventes définies par défaut. Les prix données dans les 
				tableaux sont pour 100kg de marchandises.
			</p>
		</article>
		<article>
			<header Class="hykosia_com"> Tableaux commerciaux pour chaque continent</header>
			<form action="" method="post" class="text-center" name="choix_continent">
				<fieldset class="scheduler-border text-center">
					<legend class="scheduler-border">Choix du continent</legend>
					<label class="radio-inline"> <input type="radio"
						name="inlineRadioOptions" id="inlineRadio" value="atrodia"
						onclick="maj_commerce(this)"> 
						Atrodia </label>
					<label class="radio-inline"> <input type="radio"
						name="inlineRadioOptions" id="inlineRadio" value="corlantae"
						onclick="maj_commerce(this)">
						Corlantae </label>
					<label class="radio-inline"> <input type="radio"
						name="inlineRadioOptions" id="inlineRadio" value="hepothysus"
						onclick="maj_commerce(this)">
						Hepothysus </label>
					<label class="radio-inline"> <input type="radio"
						name="inlineRadioOptions" id="inlineRadio" value="olegea" 
						onclick="maj_commerce(this)">
						Olegea
					</label>
					<label class="radio-inline"> <input type="radio"
						name="inlineRadioOptions" id="inlineRadio" value="revus" 
						onclick="maj_commerce(this)">
						Revus
					</label>
					<label class="radio-inline"> <input type="radio"
						name="inlineRadioOptions" id="inlineRadio" value="tertio" 
						onclick="maj_commerce(this)">
						Tertio
					</label>
					<label class="radio-inline"> <input type="radio"
						name="inlineRadioOptions" id="inlineRadio" value="verkonos" 
						onclick="maj_commerce(this)">
						Verkonos
					</label>
				</fieldset>
			</form>
			<table>
				<tr>
					<th class="vendu" colspan="4">Vendu</th>
				</tr>
				<tr>
					<th class="viv_mat" colspan="2">Vivre</th>
					<th class="viv_mat" colspan="2">Matériau</th>

				</tr>
				<tr>
					<td>Nom</td>
					<td>Prix (PA)</td>
					<td>Nom</td>
					<td>Prix (PA)</td>
				</tr>
				<tr>
					<td id="viv1"></td>
					<td id="prix_v1"></td>
					<td id="mat1"></td>
					<td id="prix_m1"></td>
				</tr>
				<tr>
					<td id="viv2"></td>
					<td id="prix_v2"></td>
					<td id="mat2"></td>
					<td id="prix_m2"></td>
				</tr>
				<tr>
					<td id="viv3"></td>
					<td id="prix_v3"></td>
					<td id="mat3"></td>
					<td id="prix_m3"></td>
				</tr>
				<tr>
					<td id="viv4"></td>
					<td id="prix_v4"></td>
					<td id="mat4"></td>
					<td id="prix_m4"></td>
				</tr>
				<tr>
					<td id="viv5"></td>
					<td id="prix_v5"></td>
					<td id="mat5"></td>
					<td id="prix_m5"></td>
				</tr>
				<tr>
					<td id="viv6"></td>
					<td id="prix_v6"></td>
					<td id="mat6"></td>
					<td id="prix_m6"></td>
				</tr>
			</table>
			<table>
				<tr>
					<th class="recherche" colspan="4">Recherché</th>
				</tr>
				<tr>
					<th class="viv_mat" colspan="2">Vivre</th>
					<th class="viv_mat" colspan="2">Matériau</th>
				</tr>
				<tr>
					<td>Nom</td>
					<td>Prix (PA)</td>
					<td>Nom</td>
					<td>Prix (PA)</td>
				</tr>
				<tr>
					<td id="viv_r1"></td>
					<td id="prix_rv1"></td>
					<td id="mat_r1"></td>
					<td id="prix_rm1"></td>
				</tr>
				<tr>
					<td id="viv_r2"></td>
					<td id="prix_rv2"></td>
					<td id="mat_r2"></td>
					<td id="prix_rm2"></td>
				</tr>
				<tr>
					<td id="viv_r3"></td>
					<td id="prix_rv3"></td>
					<td id="mat_r3"></td>
					<td id="prix_rm3"></td>
				</tr>
				<tr>
					<td id="viv_r4"></td>
					<td id="prix_rv4"></td>
					<td id="mat_r4"></td>
					<td id="prix_rm4"></td>
				</tr>
				<tr>
					<td id="viv_r5"></td>
					<td id="prix_rv5"></td>
					<td id="mat_r5"></td>
					<td id="prix_rm5"></td>
				</tr>
				<tr>
					<td id="viv_r6"></td>
					<td id="prix_rv6"></td>
					<td id="mat_r6"></td>
					<td id="prix_rm6"></td>
				</tr>
			</table>
		</article>

		<article>
            <header class="hykosia">Calculateur commerce</header>
            Prix pour 100kg : <input type="number" id="prix_defaut" class="separator_ligne size-input"/>
			Quantité vendue : <input type="number" id="quantite" class="separator_ligne size-input"/>
            <button onclick="calcul_commerce()">Calcul</button>
            <br>
			Prix unitaire : <input type="text" id="prix_unitaire" class="separator_ligne size-input"/>
			Prix Total : <input type="text" id="prix_vente" class="separator_ligne size-input"/>
        </article>

		<article>
			<header>Commerce alchimique</header>
			Les ingrédients ayant une valeur inférieure ou égal à 5000 sont toujours en vente chez un druide 
			ou un alchimiste :
			<ul style="list-style-type:lower-alpha;">
				<li>Elfidée</li>
				<li>Vitriol</li>
				<li>Pourdre d'os</li>
				<li>Fade ortie</li>
				<li>Rebis</li>
			</ul>
			<table class="petit-tableau">
				<tr>
					<td>Id</td>
					<td>Ingrédient</td>
					<td>Prix (PA)</td>
				</tr>
				<tr>
					<td>1</td>
					<td>Vitriol</td>
					<td>2000</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Vermillion</td>
					<td>5000</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Rebis</td>
					<td>5000</td>
				</tr>
				<tr>
					<td>4</td>
					<td>Ether</td>
					<td>17000</td>
				</tr>
				<tr>
					<td>5</td>
					<td>Querbith</td>
					<td>8000</td>
				</tr>
				<tr>
					<td>6</td>
					<td>Lotus noir</td>
					<td>6000</td>
				</tr>
				<tr>
					<td>7</td>
					<td>Grâce cristalline</td>
					<td>6000</td>
				</tr>
				<tr>
					<td>8</td>
					<td>Fade ortie</td>
					<td>4000</td>
				</tr>
				<tr>
					<td>9</td>
					<td>Fade ortie brulante</td>
					<td>20000</td>
				</tr>
				<tr>
					<td>10</td>
					<td>Coeur d'orage</td>
					<td>20000</td>
				</tr>
				<tr>
					<td>11</td>
					<td>Sang de dragon</td>
					<td>35000</td>
				</tr>
				<tr>
					<td>12</td>
					<td>Felandaris</td>
					<td>15000</td>
				</tr>
				<tr>
					<td>13</td>
					<td>Elfidée</td>
					<td>2000</td>
				</tr>
				<tr>
					<td>14</td>
					<td>Arin vandale</td>
					<td>8000</td>
				</tr>
				<tr>
					<td>15</td>
					<td>Poudre d'os</td>
					<td>2000</td>
				</tr>
				<tr>
					<td>16</td>
					<td>Ninnroot</td>
					<td>10000</td>
				</tr>
				<tr>
					<td>17</td>
					<td>Obscurcine</td>
					<td>12000</td>
				</tr>
			</table>
		</article>
	</section>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="./stylesheet/dist/js/bootstrap.min.js"></script>
    <script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"
	type="text/javascript"></script>
<script src="./includes/script/script_commerce.js" type="text/javascript"></script>
<script src="./includes/script/script_calcul.js" type="text/javascript"></script>
</body>
</html>