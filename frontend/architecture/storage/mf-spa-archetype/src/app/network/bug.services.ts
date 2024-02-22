import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { Car } from '../data/car';

@Injectable()
export class BugService {
  // Base url
  baseurl = 'http://localhost:3000';

  constructor(private http: HttpClient) {}

  // Http Headers
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };

  public readContacts(){
    return this.http.get<Car[]>('http://localhost:3000/cars');
  }


  // GET
  GetIssues(): Observable<Car[]> {
    return this.http
      .get<Car[]>(`http://localhost:3000/cars`)
      .pipe(retry(1), catchError(this.errorHandl));
  }


  public createCar(car: Car){
    return this.http.post<Car>('http://localhost:3000/cars', car);
  }

  



  // Error handling
  errorHandl(error: any) {
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