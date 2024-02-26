import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpParams } from '@angular/common/http';
import { Observable, catchError, throwError } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class SeahorseService<T> {

  constructor(protected httpClient: HttpClient ) {
  }


  getList(apiURL: string ): Observable<T[]> {
       return this.httpClient.get<T[]>(apiURL)
      .pipe(
        catchError(this.handleError)
      );
    }

  private handleError(error: HttpErrorResponse) {
    
    return throwError('Something wrong happened');
  }

}

  // //#region [ Private ]
  // private handleError(error: HttpErrorResponse){
  //   let errorMessage = '';

  //   if(error.error instanceof ErrorEvent){
  //     //error client
  //     errorMessage = error.error.message; 
  //   } else {
  //     //error server
  //     errorMessage = `Código do erro: ${error.status}, ` + `mensagem: ${error.message}`;
  //   }

  //   return throwError(errorMessage);
  // }

