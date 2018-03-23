/*
 * Tuto suivant sur le site http://sdz.tdct.org/sdz/ajax-et-l-echange-de-donnees-en-javascript.html
 */

function experience(){
	var classe_choix = document.getElementById("classe_select");
	var index = classe_choix.selectedIndex;
	var resultat = classe_choix.options[index].value;
	if($('#classe_select').find(':selected').val()=="Sloop"){
		$("#exp").val('140');
	}
	else{
		$("#exp").val('500');
	}
}

//Instanciation du XMLHttpRequest
function getXMLHttpRequest() {
	var xhr = null;
	if (window.XMLHttpRequest || window.ActiveXObject) {
		if (window.ActiveXObject) {
			try {
				xhr = new ActiveXObject("Msxml2.XMLHTTP");
			} catch(e) {
				xhr = new ActiveXObject("Microsoft.XMLHTTP");
			}
		} else {
			xhr = new XMLHttpRequest(); 
		}
	} else {
		alert("Votre navigateur ne supporte pas l'objet XMLHTTPRequest...");
		return null;
	}
	return xhr;
}

function ajax(){
	var xhr = getXMLHttpRequest();
	xhr.open("GET", "bdd.php", true);
}

// Fonction d'envoie de la requete
function send(){
	
}

// Fonction de reception de la requete
function get(){
	
}