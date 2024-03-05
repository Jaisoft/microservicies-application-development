import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';

@Component({
  selector: 'app-root',
  template: `
  <h1>{{users.length}}</h1>

  <li *ngFor="let user of users">{{user.name}}</li>


  `
})
export class AppComponent implements OnInit{

  users: User[] = [];



  constructor(private http: HttpClient){}

  ngOnInit() {
    //this.getAll();
    this.getUsers()
   
  }

  getUsers(){
    return this.http.get<User[]>('https://jsonplaceholder.typicode.com/users')
    .subscribe(res => {this.users = res;})

  }

  
}
