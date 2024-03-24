import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FakeService {
  constructor(private http: HttpClient) {}

  getFakeData() {
    return this.http.get<any>('https://jsonplaceholder.typicode.com/photos');
  }
}