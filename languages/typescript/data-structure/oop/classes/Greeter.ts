class Greeter {
    
    greeting: string;
   
    constructor(greeting: string) {
      this.greeting = greeting;
    }
   
    greet() {
      console.log("Hello, " + this.greeting)
    }


    pepe(){
      this.greet()
    }
  }
   
  let greeter = new Greeter("world");

  greeter.greet()

  greeter.pepe()