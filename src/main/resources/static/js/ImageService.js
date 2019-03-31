'use strict'
angular.module('myapp.services', []).factory('ImageService', ["$http", function($http) {
    var service = {};
    service.getTest = function() {
        var url = '/test/;
        return $http.get(url);
    }
    
    return service;
}]);