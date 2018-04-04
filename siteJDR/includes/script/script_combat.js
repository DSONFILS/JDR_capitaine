// Fonction de mise à jour
$(document).ready(function() {
	get_degat();
	get_combatSpec();
	get_equipage();
	get_experience();
	get_soute();
    $('#classe_select').on('change', function() {
        get_combatSpec();
		get_equipage();
		get_experience();
        get_soute();
    });
    $('#type_canon').on('change',function() {
		get_degat();
	});
    $('#DD_vivre').on('change',function() {
		get_vivre();
	});
    $('#DD_materiau').on('change',function() {
		get_materiau();
	});
	$('#valur_butin').on('change',function() {
		calcul_part();
	});
});

/*
* Expérience des membre d'équipage
*/
var exp_combattant = 40;

// Récupération des données dans la base de données

/*
 * Donnees relatives aux navires :
 * Experience, caractéristiques de combat, 
 * composition de l'équipage, répartition de 
 * la soute
 */
function get_experience(){
	var ajaxData = {
        classe: $('#classe_select').val()
	};
    $.ajax({
        method: "POST",
        url: "includes/php/experience.php",
        data: ajaxData,
        dataType: 'json'
    }).done(function( jsonResult ) {
		$('#exp').val(jsonResult.experience);
		
		// Marchand
		var nb_combattant = $('#combat').html();
		$('#exp_mar').val($('#exp').val() - (Math.round(nb_combattant*0.5))*exp_combattant);

		// Militaire
		temp = parseFloat($('#exp').val());
		$('#exp_mil').val(temp + (Math.round(nb_combattant*0.5))*exp_combattant);
    });
}

function get_combatSpec(){
	set_parametre_bateau('combatSpec.php','combat');
}

function get_equipage(){
	set_parametre_bateau('equipage.php','equipage');
}

function get_soute(){
	set_parametre_bateau('soute.php','soute');
}

// Petite fonction pour fixer les parametres
function set_parametre_bateau(source,zone_page){
	var ajaxData = {
		classe: $('#classe_select').val()
	}
	$.ajaxSetup({
		method: "POST",
        url: "includes/php/" + source,
        dataType: 'json'
	});
	$.ajax({
        data: ajaxData
	}).done(function( jsonResult ) {
		var id_html = new Array();
		if(zone_page == 'combat'){
			var data_php = jsonResult.combat_spec;
			var taille = data_php.length;
			id_html = Array('#res','#vit','#nb_canon','#bonus_def','#bonus_ref');
			for (var i=0 ; i<taille+1 ; i++){
				// Pirate
				$(id_html[i]).html(data_php[i]);
			}
			// Marchand
			var res_mar = Math.round(data_php[0] - data_php[0]*0.15);
			var temp = parseFloat(data_php[1]);
			var vit_mar = temp + temp*0.2;
			$('#res_mar').html(res_mar);
			$('#vit_mar').html(vit_mar.toFixed(1));
			$('#nb_canon_mar').html(data_php[2]);
			$('#bonus_def_mar').html(data_php[3]);
			$('#bonus_ref_mar').html(data_php[4]);

			// Militaire
			var temp = parseFloat(data_php[0]);
			var res_mil = Math.round( temp + temp*0.3);
			$('#res_mil').html(res_mil);
			var temp1 = parseFloat(data_php[1]);
			var vit_mil = temp1 - temp1*0.2;
			$('#vit_mil').html(vit_mil.toFixed(1));
			$('#nb_canon_mil').html(data_php[2]);
			var temp2 = parseFloat(data_php[3])
			$('#bonus_def_mil').html(temp2 + 1);
			var temp3 = parseFloat(data_php[4])
			$('#bonus_ref_mil').html(temp3 + 1);
		}else{
			if(zone_page == 'equipage'){
				var data_php = jsonResult.compo_equipage;
				var taille = data_php.length;
				id_html = Array('#cap','#med','#cuisto','#nav','#inge','#grappin','#canon',
						'#tireur','#combat', '#total');
				id_html_mar = Array('#cap_mar','#med_mar','#cuisto_mar','#nav_mar','#inge_mar',
						'#grappin_mar','#canon_mar','#tireur_mar','#combat_mar', '#total_mar');
				id_html_mil = Array('#cap_mil','#med_mil','#cuisto_mil','#nav_mil','#inge_mil',
						'#grappin_mil','#canon_mil','#tireur_mil','#combat_mil', '#total_mil');
			}
			if(zone_page == 'soute'){
				var data_php = jsonResult.detail_soute;
				var taille = data_php.length;
				id_html = Array('#ton_max','#reparation','#munition','#nourriture',
						'#inventaire');
				id_html_mar = Array('#ton_max_mar','#reparation_mar','#munition_mar',
						'#nourriture_mar','#inventaire_mar');
				id_html_mil = Array('#ton_max_mil','#reparation_mil','#munition_mil',
						'#nourriture_mil','#inventaire_mil');
			}
			for (var i=0 ; i<taille+1 ; i++){
				$(id_html[i]).html(data_php[i+2]);

				// Marchand
				if(id_html_mar[i] == '#combat_mar'){
					$(id_html_mar[i]).html($(id_html[i]).html()-Math.round($(id_html[i]).html()*0.5));
				}
				else if(id_html_mar[i] == '#total_mar'){
					$(id_html_mar[i]).html($(id_html[i]).html()-Math.round($(id_html[i]).html()*0.5));
				}
				else if(id_html_mar[i] == '#munition_mar'){
					$(id_html_mar[i]).html($(id_html[i]).html()-Math.round($(id_html[i]).html()*0.15));
				}
				else if(id_html_mar[i] == '#inventaire_mar'){
					var temp = parseFloat($(id_html[i]).html());
					var temp2 = parseFloat($(id_html[i-2]).html());
					var temp3 = parseFloat($(id_html_mar[i-2]).html());
					$(id_html_mar[i]).html(temp + (temp2-temp3));
				}
				else{
					$(id_html_mar[i]).html($(id_html[i]).html());
				}

				// Militaire
				var tempm_1 = parseFloat($(id_html[i]).html());
				if(id_html_mil[i] == '#combat_mil'){
					$(id_html_mil[i]).html(tempm_1+Math.round(tempm_1*0.5));
				}
				else if(id_html_mil[i] == '#total_mil'){
					$(id_html_mil[i]).html(tempm_1+Math.round(tempm_1*0.5));
				}
				else if(id_html_mil[i] == '#munition_mil'){
					$(id_html_mil[i]).html(tempm_1+Math.round(tempm_1*0.5));
				}
				else if(id_html_mil[i] == '#inventaire_mil'){
					var temp = parseFloat($(id_html[i]).html());
					var temp2 = parseFloat($(id_html[i-2]).html());
					var temp3 = parseFloat($(id_html_mil[i-2]).html());
					$(id_html_mil[i]).html(temp + (temp2-temp3));
				}
				else{
					$(id_html_mil[i]).html($(id_html[i]).html());
				}
	        }
		}
    });
}

/*
 * Degat en fonction du type de canon
 */

function get_degat(){
	var ajaxData = {
        type: $('#type_canon').val()
    };
	$.ajax({
        method: "POST",
        url: "includes/php/degat.php",
        data: ajaxData,
        dataType: 'json'
    }).done(function( jsonResult ) {
        $('#DD_degat').val(jsonResult.valeur_degat);
    });
}