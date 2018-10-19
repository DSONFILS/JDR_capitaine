function connexion() {
    $(document).ready(function(){
        $("#submit").click(function(){
            $.post(
                'connexion.php', // Un script PHP que l'on va créer juste après
                {
                    username : $("#login").val(),  // Nous récupérons la valeur de nos inputs que l'on fait passer à connexion.php
                    password : $("#password").val()
                },
                function(data){ // Cette fonction ne fait rien encore, nous la mettrons à jour plus tard
                },
                'text' // Nous souhaitons recevoir "Success" ou "Failed", donc on indique text !
             );
        });
    });
}

function inscription() {
    $(document).ready(function(){
        $("#submit").click(function(){
            $.post(
                'inscription.php',
                {
                    username : $("#inscription_login").val(),
                    password : $("#inscription_mdp").val(),
                    password_confirm : $("#inscription_mdp_confirm").val(),
                    courriel : $("#inscription_couriel").val()
                },
                function(data){
                    // TODO
                },
                'Inscription réussie !' 
            );
        });
    });
}