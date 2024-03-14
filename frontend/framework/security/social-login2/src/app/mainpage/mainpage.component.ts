import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { DataService } from '../getdata.service';


@Component({
  selector: 'app-mainpage',
  standalone: true,
  templateUrl: './mainpage.component.html',
  styleUrls: ['./mainpage.component.css'],
  imports: []
})
export class MainpageComponent implements OnInit {
  users: User[] = [];


  constructor(private dataService: DataService) { }

  ngOnInit(): void {
    this.dataService.getUsers().subscribe((users) => {
      this.users = users;
    });
  }
}