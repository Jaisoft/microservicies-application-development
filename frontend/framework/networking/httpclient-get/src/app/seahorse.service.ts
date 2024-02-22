import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpParams } from '@angular/common/http';
import { Observable, catchError, throwError } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class SeahorseService<T> {

  private readonly APIUrl = 'https://jsonplaceholder.typicode.com/users';
  users: any[] = [];

  constructor(protected httpClient: HttpClient ) {
  }


  getList(): Observable<T[]> {
       return this.httpClient.get<T[]>('https://jsonplaceholder.typicode.com/users')
      .pipe(
        catchError(this.handleError)
      );
    }

  private handleError(error: HttpErrorResponse) {
    // Handle the HTTP error here
    return throwError('Something wrong happened');
  }
}
