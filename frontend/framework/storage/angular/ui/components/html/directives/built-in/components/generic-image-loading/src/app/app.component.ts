import { HttpClient } from '@angular/common/http';
import { Component, OnInit, VERSION } from '@angular/core';
import { take } from 'rxjs/operators';
import { FakeService } from './fake.service';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  name = 'Angular ' + VERSION.major;
  currentData: any[] = [];
  constructor(
    private fakeService: FakeService,
    private http: HttpClient
  ) {
    this.getData();
  }

  getData() {
    this.fakeService
      .getFakeData()
      .pipe(take(5))
      .subscribe(response => {
        response.forEach(e => {
          //added loading attribute for adding loading placeholder as data is in array form
          e['imageLoading'] = true;
          e['thumbnailUrl'] =
            'https://cdn.searchenginejournal.com/wp-content/uploads/2019/04/the-seo-guide-to-angular-760x400.png';
          return e;
        });
        this.currentData = [...response];
      });
  }

  ngOnInit(): void {}
}
