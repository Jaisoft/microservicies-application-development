import { Component } from '@angular/core';

import { SizerComponent } from '../sizer/sizer.component';

@Component({
  selector: 'app-output-binding',
  standalone: true,
  imports: [SizerComponent],
  template: `
    <div>
      <h5>ParentComponent</h5>
      <div [style.font-size.px]="fontSizePx">Only the generated event is listened to. Resizable text.</div>
      <app-sizer (sizeChange)="changeSize($event)"></app-sizer>
    </div>
  `
})
export class OutputBindingComponent {
  fontSizePx = 12;

  changeSize(newSize: number) {
    this.fontSizePx = newSize;
  }
}
