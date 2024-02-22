import { TestBed } from '@angular/core/testing';

import { SeahorseService } from './seahorse.service';

describe('SeahorseService', () => {
  let service: SeahorseService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SeahorseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
