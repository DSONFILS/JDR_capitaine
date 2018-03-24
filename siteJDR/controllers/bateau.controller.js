'use strict';

angular.module('siteJDR.bateaux',[])
	.controller('bateauxCtrl', function($scope, $http, $state){
		function getExp(){
			var cl = $('#classe_select').find(':selected').val();
			$http.get('includes/bdd.php?functionName=expBateau&classe=' + cl).then(
			function successCallback(response){
                    var user = JSON.stringify(response.data);
                    //localStorage.setItem('user', exp);
                    $state.go('bateaux');
                }, function errorCallback(err){
                    console.log('erreur: ' + err);
                }
			)
		}
	})
;