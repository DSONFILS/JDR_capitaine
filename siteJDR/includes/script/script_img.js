/*
 * Affichage des images en taille réelle
*/
var links = document.getElementsById('img_taille_reelle'),
    linksLen = links.length;

for (var i = 0; i < linksLen; i++) {

    links[i].addEventListener('click', function(e) {
        e.preventDefault();
        displayImg(e.currentTarget);
    });

}

function displayImg(link) {

    var img = new Image(),
        overlay = document.getElementById('overlay');

    img.addEventListener('load', function() {
        overlay.innerHTML = '';
        overlay.appendChild(img);
    });

    img.src = link.href;
    overlay.style.display = 'block';
    overlay.innerHTML = '<span>Chargement en cours...</span>';

}

document.getElementById('overlay').addEventListener('click', function(e) {
    e.currentTarget.style.display = 'none';
});