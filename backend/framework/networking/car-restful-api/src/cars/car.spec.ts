import { Car } from './car.entity';

describe('Car', () => {
  it('should be defined', () => {
    expect(new Car()).toBeDefined();
  });
});
