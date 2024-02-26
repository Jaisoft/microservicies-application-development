import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { SeahorseService } from './seahorse.service';

@Component({
  selector: 'app-root',
  template: `
  <h1>{{users.length}}</h1>
  <li *ngFor="let user of users">{{user.name}}</li>
  
  `
})
export class AppComponent implements OnInit{

  users: User[] = [];
  
  constructor(private seahorseService : SeahorseService<User>){}

  ngOnInit() {
      this.seahorseService.getList('https://jsonplaceholder.typicode.com/users')
      .subscribe(res => {this.users = res;});
    
   
  }
  
}
