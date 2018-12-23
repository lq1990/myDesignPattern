/**
* Generated On: 2018-12-23
* Class: Bird
*/

var Animal = require('Animal');

function Bird(){
    //Constructor

    this.wing = null;

}

Bird.prototype = new Animal();


module.exports = {Bird:Bird};