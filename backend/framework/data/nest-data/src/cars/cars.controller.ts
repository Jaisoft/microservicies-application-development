import { Controller, Post, Body, Get, Put, Delete, Param} from '@nestjs/common';
import { CarsService } from './cars.service';
import { Car } from './car.entity';


@Controller('cars')
export class CarsController {

    constructor(private service: CarsService) { }

    @Post()
    create(@Body() car: Car) {
        return this.service.create(car);
    }

    @Get()
    gets() {
        return this.service.gets();
    }

    @Get(':id')
    get(@Param() params) {
        return this.service.get(params.id);
    }

    @Put()
    update(@Body() car: Car) {
        return this.service.update(car);
    }

    @Delete(':id')
    delete(@Param() params) {
        return this.service.delete(params.id);
    }

}







