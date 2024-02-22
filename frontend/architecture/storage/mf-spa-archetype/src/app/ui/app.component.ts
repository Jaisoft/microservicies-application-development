
import { Component, OnInit } from '@angular/core';
import { Car } from '../data/car';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { User } from '../data/user';
import { BugService } from '../ntwork/bug.services';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
    car = {} as Car;
    cars: Car[] = [];
   

    /*cars: Car[] = [
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      },
      {"id": 1,   
       "model": "x5",
        "color": "blue",
        "price": 50
      }
    ]*/
  
    constructor(public bugService: BugService) { }
  
    ngOnInit() {
      //this.getAll();
      //this.getRepos()
      //this.getUsers()
      //this.GetIssue()
      //this.loadEmployees()
      this.pepe()
      this.createCar()
     
    }

    createCar(){
      this.car.model = "hjk"
      this.car.color = "pink"
      this.car.price = 800
      this.bugService.createCar(this.car).subscribe((result)=>{
        console.log(result);
      });
    }

    pepe(){
      return this.bugService.readContacts().subscribe((result)=>{
        this.cars = result;
      })
    }

    loadEmployees() {
      return this.bugService.GetIssues().subscribe((cars: Car[]) => {
        this.cars = cars;
      })
    }


    


    /*getUsers(){
      return this.httpClient.get<User[]>('https://jsonplaceholder.typicode.com/users')
      .subscribe(res => {this.users = res;})
  
    }


   


    getRepos(){
      return this.httpClient.get<Car[]>('http://localhost:3000/cars')
      .subscribe(res => {this.cars = res;})
    }
  
    getAll() {
      this.get().subscribe((cars: Car[]) => {
        this.cars = cars;
  
        console.log(this.cars)
      });
    }  
  
    httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    }
    
    //#region [ Public ]
    get(): Observable<Car[]> {
      return this.httpClient
        .get<Car[]>("http://localhost:3000/cars")
        .pipe(
          retry(2),
          catchError(this.handleError)        
        )
    }

  
    
    private handleError(error: HttpErrorResponse){
      let errorMessage = '';
  
      if(error.error instanceof ErrorEvent){
        //error client
        errorMessage = error.error.message; 
      } else {
        //error server
        errorMessage = `Código do erro: ${error.status}, ` + `mensagem: ${error.message}`;
      }
  
      return throwError(errorMessage);
    }*/

    // Error handling
  errorHandl(error: { error: { message: string; }; status: any; message: any; }) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(() => {
      return errorMessage;
    });
  }
  
   
}



function GetIssues() {
  throw new Error('Function not implemented.');
}

