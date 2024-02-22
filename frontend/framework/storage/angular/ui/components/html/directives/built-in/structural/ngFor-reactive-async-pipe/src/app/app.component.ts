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
  template: `
    <div>
      <p>🍕 Pizza Store</p>
      <ul>
        <li *ngFor="let pizza of pizzas$ | async; index as i">
          {{ i + 1 }}. {{ pizza.name }}
        </li>
      </ul>
    </div>
  `,
})
export class AppComponent implements OnInit {
  pizzas$: Observable<Pizza[]> | undefined;

  constructor() {}

  ngOnInit() {
    this.pizzas$ = getPizzas$;
  }
}
