import { Test, TestingModule } from '@nestjs/testing';
import { DepenService } from './depen.service';

describe('DepenService', () => {
  let service: DepenService;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [DepenService],
    }).compile();

    service = module.get<DepenService>(DepenService);
  });

  it('should be defined', () => {
    expect(service).toBeDefined();
  });
});
