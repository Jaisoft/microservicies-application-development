import { EntityRepository, Repository } from 'typeorm';
import { Hotel } from './hotel.model';

//@EntityRepository(Hotel)
export class HotelRepository extends Repository<Hotel> {

}