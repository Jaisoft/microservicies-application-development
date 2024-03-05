import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Car } from './car.entity';
@Injectable()
export class CarsService {

    constructor(
    @InjectRepository(Car) 
    private repo: Repository<Car>
    ) { }

    async create(car: Car) {
        this.repo.save(car)
    }

    async update(car: Car) {
        this.repo.save(car)
    }

    async gets(): Promise<Car[]> {
        return await this.repo.find();
    }

    async get(_id: number): Promise<Car[]> {
        return await this.repo.find({
            select: ["model", "color", "price"],
            where: [{ "id": _id }]
        });
    }

   async delete(car: Car) {
        this.repo.remove(car);
    }
}