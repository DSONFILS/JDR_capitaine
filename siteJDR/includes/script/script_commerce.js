/*
 * Gestion de la page de commerce
 */

// Evenement sur les radio bouton commerce
function maj_commerce(btnRadio){
	get_commerce(btnRadio);
	get_commerce_vr(btnRadio);
	get_commerce_mr(btnRadio);
}

// Récupération des données dans la base de données
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