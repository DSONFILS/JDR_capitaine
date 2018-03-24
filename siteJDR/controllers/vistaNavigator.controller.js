'use strict';

angular.module('siteJDR.vistaNavigator',[])
	.config(['$stateProvider','$urlRouterProvider', function($stateProvider, $stateRouterProvider){
		$stateProvider
			.state('bateaux',{
				url: '/bateaux',
				templateUrl: '../bateaux.html',
				controller: 'bateauxCtrl'
			})
			.state('commerce',{
				url: '/commerce',
				templateUrl: '../commerce.html',
				controller: 'commerceCtrl'
			})
		;
		urlRouterProvider.otherwise('/index');
	}]);