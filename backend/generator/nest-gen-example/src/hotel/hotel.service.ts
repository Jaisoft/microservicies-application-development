import { Injectable, UnauthorizedException, Request } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { HotelRepository } from './hotel.repository';
import { Hotel } from './hotel.model';

@Injectable()
export class HotelService {

    public constructor(@InjectRepository(HotelRepository) private hotelRepository: HotelRepository) {
    }

    public async getById(id: number): Promise<Hotel> {
        return await this.hotelRepository.findOne({ id });
    }

    public create(@Request() req, hotel: Hotel): Promise<Hotel> {
        hotel = this.hotelRepository.create(hotel);
        return this.hotelRepository.save(hotel);
    }

    public async update(@Request() req, hotel: Hotel): Promise<Hotel> {
        return this.hotelRepository.save(hotel);
    }

    public async remove(@Request() req, id: number) {
        let hotel = await this.hotelRepository.findOne({ id });
        await this.hotelRepository.delete(id);
        return hotel;
    }

    public async search(@Request() req): Promise<Array<Hotel>> {
        return await this.hotelRepository.find({});
    }

}