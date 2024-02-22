"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var rxjs_1 = require("rxjs");
var emitter = (0, rxjs_1.of)("Sam", "Ray", "Thomas");
emitter.subscribe(function (value) {
    console.log("Name: ".concat(value));
});
