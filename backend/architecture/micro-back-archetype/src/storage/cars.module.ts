import { Module } from '@nestjs/common';

import { CarController } from '../network/car/car.controller';

import { TypeOrmModule } from '@nestjs/typeorm';

import { Car } from '../data/car/car.entity';

@Module({
  imports: [TypeOrmModule.forFeature([Car])],
  /*providers: [CarsService],*/
  controllers: [CarController]})
export class CarsModule {}
