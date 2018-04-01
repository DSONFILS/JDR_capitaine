// Fonction de mise à jour
$(document).ready(function() {
	get_degat();
	get_combatSpec();
	get_equipage();
	get_experience();
	get_soute();
	get_alchimie();
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

// Evenement sur les radio bouton commerce
function maj_commerce(btnRadio){
	get_commerce(btnRadio);
	get_commerce_vr(btnRadio);
	get_commerce_mr(btnRadio);
}

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

/*
 * Gestion de la page de commerce
 */

function get_vivre(){
	var ajaxData = {
        vivre: $('#DD_vivre').val()
    };
	$.ajax({
        method: "POST",
        url: "includes/php/vivre.php",
        data: ajaxData,
        dataType: 'json'
    }).done(function( jsonResult ) {
        $('#vivre_obtenu').val(jsonResult.valeur_vivre);
    });
}

function get_materiau(){
	var ajaxData = {
        materiau: $('#DD_materiau').val()
    };
	$.ajax({
        method: "POST",
        url: "includes/php/materiau.php",
        data: ajaxData,
        dataType: 'json'
    }).done(function( jsonResult ) {
        $('#materiau_obtenu').val(jsonResult.valeur_materiau);
    });
}

function get_commerce(btnRadio){
	var ajaxData = {
		inlineRadioOptions: $(btnRadio).val()
	};
	$.ajax({
		method: 'POST',
		url: "includes/php/commerce.php",
		data: ajaxData,
		dataType: 'json'
	}).done(function(jsonResult){
		console.log($(btnRadio).val());
		var taille = jsonResult.commerce_normal.length;
		var id_html_v = Array('#viv1','#viv2','#viv3','#viv4','#viv5','#viv6');
		var id_html_vp = Array('#prix_v1','#prix_v2','#prix_v3','#prix_v4','#prix_v5','#prix_v6');
		var id_html_m = Array('#mat1','#mat2','#mat3','#mat4','#mat5','#mat6');
		var id_html_mp = Array('#prix_m1','#prix_m2','#prix_m3','#prix_m4','#prix_m5','#prix_m6');
		for (var i=0 ; i<taille+1 ; i++){
			//Affichage vivres
			$(id_html_v[i]).html(jsonResult.commerce_normal[i].vivre);
			// Affichage du prix des vivres 
			$(id_html_vp[i]).html(jsonResult.commerce_normal[i].vp);
			//Affichage du prix des materiaux
			$(id_html_mp[i]).html(jsonResult.commerce_normal[i].mp);
			//Affichage materiaux
			$(id_html_m[i]).html(jsonResult.commerce_normal[i].materiau);
		}
	});
}

function get_commerce_vr(btnRadio){
	var ajaxData = {
		inlineRadioOptions: $(btnRadio).val()
	};
	$.ajax({
		method: 'POST',
		url: "includes/php/commerce_recherche_vivre.php",
		data: ajaxData,
		dataType: 'json'
	}).done(function(jsonResult){
		var taille = jsonResult.commerce_rv.length;
		var id_html_vr = Array('#viv_r1','#viv_r2','#viv_r3','#viv_r4','#viv_r5'
    			,'#viv_r6');
		var id_html_vrp = Array('#prix_rv1','#prix_rv2','#prix_rv3','#prix_rv4','#prix_rv5'
				,'#prix_rv6');
		for (var i=0 ; i<taille+1 ; i++){
			if(taille < id_html_vr.length){
				console.log('Je suis entré dans la boucle');
				for(var j=taille ; j<id_html_vr.length ; j++){
					$(id_html_vr[j]).html('');
					$(id_html_vrp[j]).html('');
				}
			}
			//Affichage du vivre recherche
			$(id_html_vr[i]).html(jsonResult.commerce_rv[i].recherche);
			//Affichage du prix du vivre
			$(id_html_vrp[i]).html(jsonResult.commerce_rv[i].prix*2);
		}
	});
}

function get_commerce_mr(btnRadio){
	var ajaxData = {
		inlineRadioOptions: $(btnRadio).val()
	};
	$.ajax({
		method: 'POST',
		url: "includes/php/commerce_recherche_materiau.php",
		data: ajaxData,
		dataType: 'json'
	}).done(function(jsonResult){
		var taille = jsonResult.commerce_mv.length;
		var id_html_mr = Array('#mat_r1','#mat_r2','#mat_r3','#mat_r4','#mat_r5'
    			,'#mat_r6');
		var id_html_mrp = Array('#prix_rm1','#prix_rm2','#prix_rm3','#prix_rm4','#prix_rm5'
    			,'#prix_rm6');
		for (var i=0 ; i<taille+1 ; i++){
			if(taille < id_html_mr.length){
				for(var j=taille ; j<id_html_mr.length ; j++){
					$(id_html_mr[j]).html('');
					$(id_html_mrp[j]).html('');
				}
			}
			//Affichage du vivre recherche
			$(id_html_mr[i]).html(jsonResult.commerce_mv[i].recherche);
			//Affichage du prix du vivre
			$(id_html_mrp[i]).html(jsonResult.commerce_mv[i].prix*2);
		}
	});
}

/*
 * Alchimime 
*/
function get_alchimie(){
    $.ajax({
        method: "GET",
        url: "includes/php/alchimie.php",
        dataType: 'json'
    }).done(function( jsonResult ) {
		$('#id_ingredient').html(jsonResult.alchimie.id);
		$('#nom_ingredient').html(jsonResult.alchimie.nom);
		$('#prix_ingredient').hmtl(jsonResult.alchimie.prix);
    });
}