
import { Component, OnInit } from '@angular/core';
import { Car } from './car';
import { CarService } from './car.services';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
    car = {} as Car;
    cars: Car[] = [];
   

constructor(public carService: CarService) { }
  
ngOnInit() {
     this.getCars()
      this.createCar()
     
    }

createCar(){
      this.car.model = "hjk"
      this.car.color = "pink"
      this.car.price = 800
      this.carService.createCar(this.car).subscribe((result)=>{
        console.log(result);
      });
    }


  getCars() {
      return this.carService.GetCars().subscribe((cars: Car[]) => {
        this.cars = cars;
      })
    }
}





