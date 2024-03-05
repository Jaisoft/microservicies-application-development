import { Photo } from './../Photo';
import { Component } from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
//import { Observable } from 'rxjs/internal/Observable';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})

export class DashboardComponent {
  /** Based on the screen size, switch from standard to one column per row */
  photos: Photo[] = [
    new Photo("/Users/jaisoft/Downloads/seahorse/cloud.png"),
    new Photo("/Users/jaisoft/Downloads/seahorse/ai.jpg"),
    new Photo("/Users/jaisoft/Downloads/seahorse/iot.webp"),
    new Photo("/Users/jaisoft/Downloads/seahorse/robotic.jpg")
  ];
  
  cards = this.breakpointObserver.observe(Breakpoints.Handset).pipe(
    map(({ matches }) => {
      if (matches) {
        return [
          { title: 'Cloud', cols: 1, rows: 1 },
          { title: 'AI', cols: 1, rows: 1 },
          { title: 'IoT', cols: 1, rows: 1 },
          { title: 'Robotic', cols: 1, rows: 1 }
        ];
        
      }

      return [
        { title: 'Cloud', cols: 2, rows: 1 },
        { title: 'AI', cols: 1, rows: 1 },
        { title: 'IoT', cols: 1, rows: 2 },
        { title: 'Robotic', cols: 1, rows: 1 }
      ];

      
    })
  );

  constructor(private breakpointObserver: BreakpointObserver) {}

 /*return [
    { imgUrl: "/Users/jaisoft/Downloads/seahorse/cloud.png", cols: 2, rows: 1 },
    { imgUrl: "/Users/jaisoft/Downloads/seahorse/ai.jpg", cols: 1, rows: 1 },
    { imgUrl: "/Users/jaisoft/Downloads/seahorse/iot.webp", cols: 1, rows: 2 },
    { imgUrl: "/Users/jaisoft/Downloads/seahorse/robotic.jpg", cols: 1, rows: 1 }
  ];*/
}
