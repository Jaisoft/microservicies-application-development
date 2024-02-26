import { TestBed } from '@angular/core/testing';

import { SeahorseService } from './seahorse.service';
import { User } from './user';

describe('SeahorseService', () => {
  let service: SeahorseService<User>;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SeahorseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
