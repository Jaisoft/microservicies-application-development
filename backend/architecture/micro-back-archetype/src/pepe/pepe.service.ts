import { Injectable } from '@nestjs/common';
import { CreatePepeDto } from '../network/pepe/create-pepe.dto';
import { UpdatePepeDto } from '../network/pepe/update-pepe.dto';

@Injectable()
export class PepeService {
  create(createPepeDto: CreatePepeDto) {
    return 'This action adds a new pepe';
  }

  findAll() {
    return `This action returns all pepe`;
  }

  findOne(id: number) {
    return `This action returns a #${id} pepe`;
  }

  update(id: number, updatePepeDto: UpdatePepeDto) {
    return `This action updates a #${id} pepe`;
  }

  remove(id: number) {
    return `This action removes a #${id} pepe`;
  }
}
