import { Module } from '@nestjs/common';
import { CarsModule } from './cars/cars.module';
import { TypeOrmModule } from '@nestjs/typeorm';

@Module({
  imports: [CarsModule, TypeOrmModule.forRoot({
    type: "postgres",
    host: "localhost",
    port: 5432,
    username: "user",
    password: "admin",
    database: "postgres",
    entities: ["dist/**/*.entity.js"],
    synchronize: true
  })]
})
export class AppModule {}
