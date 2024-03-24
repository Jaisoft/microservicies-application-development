import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  standalone: true,
  template: `
    <div>
      <hr />

      <p>Change the input and see the differences!!!</p>

      <hr />

      <div (keyup)="(0)">
        <div>
          <h2>DOM property Initializes to "{{ inputValue }}"</h2>
          <label for="html-attr">
            <input id="html-attr" type="text" [value]="inputValue" #bindingInput2 />
          </label>
          <p>HTML attribute value: {{ bindingInput2.getAttribute('value') }} (null)</p>
          <p>DOM property value: {{ bindingInput2.value }}</p>
        </div>
      </div>
    </div>
  `,
})
export class PropertyBindingComponent {
  inputValue = 'miguel';
}
