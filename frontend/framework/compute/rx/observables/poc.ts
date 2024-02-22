import { of, Observable } from "rxjs"; 
const emitter : Observable<string> = of("Sam", "Ray", "Thomas");

emitter.subscribe((value: string) => {
    console.log(`Name: ${value}`)
  })