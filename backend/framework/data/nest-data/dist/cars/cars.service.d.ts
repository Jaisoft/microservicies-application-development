import { Repository } from 'typeorm';
import { Car } from './car.entity';
export declare class CarsService {
    private repo;
    constructor(repo: Repository<Car>);
    create(car: Car): Promise<void>;
    update(car: Car): Promise<void>;
    gets(): Promise<Car[]>;
    get(_id: number): Promise<Car[]>;
    delete(car: Car): Promise<void>;
}
