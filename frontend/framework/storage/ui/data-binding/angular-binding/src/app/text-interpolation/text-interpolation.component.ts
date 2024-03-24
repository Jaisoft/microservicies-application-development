import { Component } from '@angular/core';

@Component({
  selector: 'app-text-interpolation',
  standalone: true,
  template: `
    <div>
      <h3>{{ title }}</h3>
      <input type="text" value="{{ inputValue }}" />
    </div>
  `,
})
export class TextInterpolationComponent {
  title = 'This is the title section';
  inputValue = 'This is the content';
}
