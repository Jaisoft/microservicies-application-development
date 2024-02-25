function forFunction(){
const person = {fname:"John", lname:"Doe", age:25};

let text = "";
  for (let x in person) {
    text += person[x] + "\n";
  }

return text;
}

console.log(forFunction())
