import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { Post } from './post';




@Injectable({
  providedIn: 'root'
})
export class PostsService {


  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  }

  constructor(private httpClient: HttpClient) { }

  get(): Observable<Post[]> {
    return this.httpClient
      .get<Post[]>(`http://localhost:3000/posts`)
      .pipe(
        retry(2),
        catchError(this.handleError)        
      )
  }
  //#region [ Private ]
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
  }
}
