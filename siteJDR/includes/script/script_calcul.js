/*
 * Calculateur
*/

// Fonction de calcul des dégâts des canons
function calcul_degats_canon() {
    var degats_canon = $('#degats_canon');
    var nb_canon = $('#nb_canon_calcul');
    // Calcul des dégats en valeur absolue
    var total_degat = Math.abs(degats_canon) * Math.abs(nb_canon);
    // Affichage
    $('#degats_total_canons').val(total_degat);
}

// Fonction de calcul du prix de vente.
function calcul_commerce(){
	// Recuperation des champs
	var prix_defaut = $('#prix_defaut').val();
    var quantite = $('#quantite').val();
    var prix_unitaire = Math.round((prix_defaut)/100);

	// Affichage des valeurs calculees
    $('#prix_unitaire').val(prix_unitaire);
    $('#prix_vente').val(Math.round(prix_unitaire*quantite));
}

// Fonctions de calcul des parts
function calcul_part(){
	// Recuperation des champs
	var butin = $('#valeur_butin').val();
	var nb_part = $('#nb_part').val();
	var part = butin/nb_part;
	var moral_limite_inf = 75;
	var moral_limite_sup = 1500;

	if(part <= moral_limite_inf){
		$('#moral').val(-1);
	}
	else if(part >= moral_limite_sup){
		if(part/moral_limite_sup <= 3){
			$('#moral').val(1);	
		}
		else if(part/moral_limite_sup>3 && part/moral_limite_sup<=6){
			$('#moral').val(2);
		}
		else {
			$('#moral').val(3);
		}
	}
	else {
		$('#moral').val(0);
	}
	// Affichage des valeurs calculees
	$('#part_normale').val(Math.round(part));
	$('#part_capitaine').val(Math.round(part*3))
    $('#part_quartierMaitre').val(Math.round(part*2))
    // la valeur de la part de l'équipage PNJ
	$('#part_equipage').val(Math.round(part*(nb_part-5)))
}
