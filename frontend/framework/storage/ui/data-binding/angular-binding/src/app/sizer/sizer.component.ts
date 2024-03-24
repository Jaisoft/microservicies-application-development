import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-sizer',
  standalone: true,
  template: `
    <div>
      <h5>ChildComponent</h5>
      <p>
        <button type="button" (click)="dec()" title="smaller">-</button>
        <button type="button" (click)="inc()" title="bigger">+</button>
      </p>
      <p [style.font-size.px]="size">FontSize: {{size}}px</p>
    </div>
  `,
})
export class SizerComponent {
  @Input() size: number | string = 12;
  @Output() sizeChange = new EventEmitter<number>();

  dec() { this.resize(-1) }

  inc() { this.resize(+1) }

  resize(delta: number) {
    this.size = Math.min(40, Math.max(8, +this.size + delta));
    this.sizeChange.emit(this.size);
  }
}
