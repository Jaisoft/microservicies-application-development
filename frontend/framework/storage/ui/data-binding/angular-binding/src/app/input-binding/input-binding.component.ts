import { Component } from '@angular/core';

import { SizerComponent } from '../sizer/sizer.component';

@Component({
  selector: 'app-input-binding',
  standalone: true,
  imports: [SizerComponent],
  template: `
    <div>
      <h5>ParentComponent</h5>
      <div [style.font-size.px]="fontSizePx">Only the initial font size value is placed. No resizable text.</div>
      <app-sizer [size]="fontSizePx"></app-sizer>
    </div>
  `
})
export class InputBindingComponent {
  fontSizePx = 16;
}
