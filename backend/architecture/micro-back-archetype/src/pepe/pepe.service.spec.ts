import { Test, TestingModule } from '@nestjs/testing';
import { PepeService } from './pepe.service';

describe('PepeService', () => {
  let service: PepeService;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [PepeService],
    }).compile();

    service = module.get<PepeService>(PepeService);
  });

  it('should be defined', () => {
    expect(service).toBeDefined();
  });
});
