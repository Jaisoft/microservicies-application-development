import { Test, TestingModule } from '@nestjs/testing';
import { PepeController } from './pepe.controller';

describe('PepeController', () => {
  let controller: PepeController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [PepeController],
    }).compile();

    controller = module.get<PepeController>(PepeController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
