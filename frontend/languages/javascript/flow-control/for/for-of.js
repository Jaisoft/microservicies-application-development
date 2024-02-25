
function forFunction(){
    const cars = ["BMW", "Volvo", "Mini"];
    let text = "";

        for (let x of cars) {
        text += x + "\n";
        }
    return text;
}

console.log(forFunction())