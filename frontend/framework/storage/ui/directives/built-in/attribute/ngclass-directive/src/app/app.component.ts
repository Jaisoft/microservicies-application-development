import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ngclass-directive';
  message: string = ''; 
    isClicked = false; 
    getMessage() { 
        this.isClicked = !this.isClicked; 
        if (this.isClicked) { 
            this.message = 'Welcome to GFG!!!'; 
        } else { 
            this.message = ''; 
        } 
    } 
}
