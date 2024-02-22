import { Component, OnInit } from "@angular/core";
import { Observable, of } from "rxjs";

interface Pizza {
  id: string;
  name: string;
  price: number;
}

const getPizzas$: Observable<Pizza[]> = of([
  { id: "j8P9sz", name: "Pepperoni", price: 899 },
  { id: "tMot06", name: "Supreme", price: 999 },
  { id: "x9sD3g", name: "Sizzler", price: 899 },
]);

@Component({
  selector: "my-app",
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  
})
export class AppComponent implements OnInit {
  pizzas$: Observable<Pizza[]> | undefined;

  constructor() {}

  ngOnInit() {
    this.pizzas$ = getPizzas$;
  }
}
