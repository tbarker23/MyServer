'use strict'
var module = angular.module('myapp.controllers', []);
module.controller("ImageController", ["$scope", "ImageService",
    function($scope, ImageService) {
      
        $scope.getImage = function() {
            
            ImageService.getTest().then(function(data) {
                console.log("works");
                console.log(data);
            }, function(reason) {
                console.log("error occured");
            }, function(value) {
                console.log("no callback");
            });
        }
    }
]);
