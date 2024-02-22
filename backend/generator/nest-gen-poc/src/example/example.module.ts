import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { ExampleController } from './example.controller';
import { Example } from './entities/example.entity';


@Module({
imports: [TypeOrmModule.forFeature([Example])],
    controllers: [ExampleController],
    providers: [
        
    ],
    exports: []
})
export class ExampleModule {}