var Greeter = /** @class */ (function () {
    function Greeter(message) {
        this.greeting = message;
    }
    Greeter.prototype.greet = function () {
        console.log("Hello, " + this.greeting);
    };
    return Greeter;
}());
var greeter = new Greeter("world");
greeter.greet();
