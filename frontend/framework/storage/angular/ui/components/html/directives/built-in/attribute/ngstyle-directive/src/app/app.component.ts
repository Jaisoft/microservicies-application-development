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
  title = 'ngstyle-directive';
  tamano=30;
  presentacion={
    "background-color":"black",
    "color":"white",
    "width.px":"1000",
    "height.px":"200",
    "font-size.px":this.tamano,
    "display": "flex",
    "justify-content":"center",
    "align-items": "center"
  }

  agrandar() {
    this.tamano++;
    this.presentacion["font-size.px"]=this.tamano;  
  }

  reducir() {
    this.tamano--;
    this.presentacion["font-size.px"]=this.tamano;      
  }
}
