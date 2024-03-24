import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  standalone: true,
  template: `
    <hr />
    <p>Click the buttons!!!</p>
    <hr />
    <div>
      <p>Event bindings listen to button click events and call the respective methods each time a click occurs.</p>
      <button type="button" (click)="dec()" title="smaller">-</button>
      <button type="button" (click)="inc()" title="bigger">+</button>
      <p>Value: {{ clickCount }}</p>
    </div>
  `,
})
export class EventBindingComponent {
  clickCount: number = 0;

  dec() { this.clickCount-- }

  inc() { this.clickCount++ }
}
