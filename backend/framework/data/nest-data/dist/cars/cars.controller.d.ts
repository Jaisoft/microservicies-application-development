import { CarsService } from './cars.service';
import { Car } from './car.entity';
export declare class CarsController {
    private service;
    constructor(service: CarsService);
    create(car: Car): Promise<void>;
    gets(): Promise<Car[]>;
    get(params: any): Promise<Car[]>;
    update(car: Car): Promise<void>;
    delete(params: any): Promise<void>;
}
