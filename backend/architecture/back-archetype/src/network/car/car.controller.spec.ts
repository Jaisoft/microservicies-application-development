import { Test, TestingModule } from '@nestjs/testing';
import { CarController } from './car.controller';
//import { AppService } from './app.service';

describe('CarsController', () => {
  let carsController: CarController;

  beforeEach(async () => {
    const app: TestingModule = await Test.createTestingModule({
      controllers: [CarController]/*,
      providers: [AppService],*/
    }).compile();

    carsController = app.get<CarController>(CarController);
  });

  describe('root', () => {
    it('should return a CarGotDTO!"', () => {
      expect(carsController.get(1)).toBe('Hello World!');
    });
  });
});