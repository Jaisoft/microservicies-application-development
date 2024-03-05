import { Controller, Request, Param, Body, Get, Post, Put, Delete, ParseUUIDPipe } from "@nestjs/common";
import { HotelService } from './hotel.service';
import { Hotel } from './hotel.model';


@Controller('/hotel')
export class HotelController {

    public constructor(private readonly hotelService: HotelService) {
    }

    @Get('/:id')
    public async getById(id: number): Promise<Hotel> {
        return await this.hotelService.getById(id);
        
    }

    @Post()
    public create(@Request() req, @Body() body: any): Promise<Hotel> {
        let hotel: Hotel = new Hotel();
        Object.assign(hotel, body);
        return this.hotelService.create(req, hotel);
        
    }

    @Put('/:id')
    public async update(@Request() req, @Param('id', ParseUUIDPipe) id: number, @Body() body: any): Promise<Hotel> {
        let hotel: Hotel = await this.hotelService.getById(id);
        if (!hotel) {
            throw "Object hotel does not exist";
        }

        Object.assign(hotel, body);
        return this.hotelService.update(req, hotel);
        
    }

    @Delete('/:id')
    public async remove(@Request() req, @Param('id', ParseUUIDPipe) id: number, @Body() body: any): Promise<Hotel> {
        return this.hotelService.remove(req, id);
        
    }

    @Get()
    public async search(@Request() req): Promise<Array<Hotel>> {
        return await this.hotelService.search(req);
        
    }

}