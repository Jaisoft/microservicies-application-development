import { TestBed } from '@angular/core/testing';

import { DataService } from './getdata.service';

describe('GetdataService', () => {
  let service: DataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
