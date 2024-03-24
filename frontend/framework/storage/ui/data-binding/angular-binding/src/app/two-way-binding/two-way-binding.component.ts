import { Component } from '@angular/core';

import { SizerComponent } from '../sizer/sizer.component';

@Component({
  selector: 'app-two-way-binding',
  standalone: true,
  imports: [SizerComponent],
  template: `
    <div>
      <h5>ParentComponent</h5>
      <div [style.font-size.px]="fontSizePx">Resizable Text</div>
      <app-sizer [(size)]="fontSizePx"></app-sizer>
    </div>
  `
})
export class TwoWayBindingComponent {
  fontSizePx = 16;
}
