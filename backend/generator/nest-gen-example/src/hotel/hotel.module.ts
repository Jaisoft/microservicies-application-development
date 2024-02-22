import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { HotelController } from './hotel.controller';
import { HotelService } from './hotel.service';
import { HotelRepository } from './hotel.repository';
import { Hotel } from './hotel.model';

@Module({
imports: [TypeOrmModule.forFeature([Hotel])],
    controllers: [HotelController],
    providers: [
        HotelService,
    ],
    exports: []
})
export class HotelModule {}