import { Component } from '@angular/core';
import { CatService } from './cat.service';

@Component({
  selector: 'app-cat',
  templateUrl: './cat.component.html',
  styleUrls: ['./cat.component.css']
})
export class CatComponent {

  constructor(private catservice: CatService) {
  }


}
