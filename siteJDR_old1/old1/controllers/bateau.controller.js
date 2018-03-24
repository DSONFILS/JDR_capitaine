'use strict';

angular.module('siteJDR.bateaux',[])
	.controller('bateauxCtrl', function($scope, $http, $state){
		function getExp(){
			var cl = $('#classe_select').find(':selected').val();
			$http.get('includes/bdd.php?functionName=expBateau' + $scope.cl).then()
		}
	})
;