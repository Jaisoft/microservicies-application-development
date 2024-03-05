import { Test, TestingModule } from '@nestjs/testing';
import { PepeController } from './pepe.controller';
import { PepeService } from '../../pepe/pepe.service';

describe('PepeController', () => {
  let controller: PepeController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [PepeController],
      providers: [PepeService],
    }).compile();

    controller = module.get<PepeController>(PepeController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
