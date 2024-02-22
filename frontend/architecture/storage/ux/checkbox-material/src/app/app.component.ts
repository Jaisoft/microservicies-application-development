import { Component, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { MatCheckboxChange, MatCheckboxModule } from '@angular/material/checkbox';
import { FormsModule } from '@angular/forms';

import { MatButtonModule } from '@angular/material/button';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, MatCheckboxModule, FormsModule, MatButtonModule ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'checkbox-material';
  isXyzChecked = false;
  isAbcChecked = true;
  
  toggleChk() {
    this.isXyzChecked = (this.isXyzChecked)? false : true;
  }  
  onChange(ob: MatCheckboxChange) {
    console.log("PQR checked: " + ob.checked);
  }
}











