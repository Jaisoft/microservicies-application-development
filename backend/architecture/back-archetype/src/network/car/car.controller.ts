import { Controller, Post, Body, Get, Put, Delete, Param} from '@nestjs/common';
import { Car } from '../../data/car/car.entity';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';


@Controller('cars')
export class CarController {

    constructor(
        @InjectRepository(Car)
        private repo: Repository<Car>) { }

    @Post()
    create(@Body() car: Car) {
        return this.createR(car);
    }


    async createR(car: Car) {
        this.repo.save(car)
    }

    @Get()
    gets() {
        return this.gets();
    }


    async getsR(): Promise<Car[]> {
        return await this.repo.find();
    }

    @Get(':id')
    get(@Param() params) {
        return this.getR(params.id);
    }

    async getR(_id: number): Promise<Car[]> {
        return await this.repo.find({
            select: ["model", "color", "price"],
            where: [{ "id": _id }]
        });
    }

    @Put()
    update(@Body() car: Car) {
        return this.updateR(car);
    }

    async updateR(car: Car) {
        this.repo.save(car)
    }

    @Delete(':id')
    delete(@Param() params) {
        return this.deleteR(params.id);
    }

    async deleteR(car: Car) {
        this.repo.remove(car);
    }



   


  

   

}







