var Forniture = /** @class */ (function () {
    function Forniture() {
        this.items = [];
    }
    Forniture.prototype.addItem = function (newItem) {
        this.items.push(newItem);
    };
    Forniture.prototype.log = function () {
        var id = this.items.map(function (item) { return item.id; });
        var color = this.items.map(function (item) { return item.color; });
        var type = this.items.map(function (item) { return item.type; });
        console.log(id, color, type);
    };
    return Forniture;
}());
var fornitureChair = new Forniture();
var chair1 = {
    id: 1,
    color: "red",
    type: "chair"
};
var chair2 = {
    id: 2,
    color: "white",
    type: "chair"
};
var chair3 = {
    id: 4,
    color: "black",
    type: "chair"
};
fornitureChair.addItem(chair1);
fornitureChair.addItem(chair2);
fornitureChair.addItem(chair3);
fornitureChair.log();
var fornitureTable = new Forniture();
