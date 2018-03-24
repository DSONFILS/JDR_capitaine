/*
 * Alchimime 
*/

// Fonction de mise à jour
$(document).ready(function() {
	get_alchimie();
});

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