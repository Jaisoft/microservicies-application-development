import { Module } from '@nestjs/common';
import { CarsModule } from './cars/cars.module';
import { TypeOrmModule } from '@nestjs/typeorm';
import { Car } from './cars/car.entity';



@Module({
  imports: [
    CarsModule,
    TypeOrmModule.forRoot({
      type: 'mysql',
      host: 'localhost',
      port: 3306,
      username: 'myuser',
      password: 'Password123',
      database: 'usersdatabase',
      entities: [Car],
      synchronize: true,
    }),
  ],
})
export class AppModule {}
