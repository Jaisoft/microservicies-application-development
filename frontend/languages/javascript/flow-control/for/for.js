function forFunction(){

  const cars = ["BMW", "Volvo", "Saab", "Ford", "Fiat", "Audi"];
  let text = "";

    for (let i = 0; i < cars.length; i++) {
        text += cars[i] + "\n";
    }

return text;
}


console.log(forFunction())
