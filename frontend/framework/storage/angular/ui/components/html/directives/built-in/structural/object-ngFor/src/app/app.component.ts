import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  people = {
    person: {
      name: 'Robert Smith',
      age: 32,
      gender: 'male',
      interests: ['music','skiing'],

    },
    person1: {
      name: 'Marie Chad',
      age: 23,
      gender: 'female',
      interests: ['sing','skiing'],

    },

    person2: {

      name: 'Jhon Smith',
      age: 19,
      gender: 'male',
      interests: ['reading'],

    }
  };

  data = Object.values(this.people);
  
}
