import { Controller, Get, Post, Body, Patch, Param, Delete } from '@nestjs/common';
import { PepeService } from '../../pepe/pepe.service';
import { CreatePepeDto } from './create-pepe.dto';
import { UpdatePepeDto } from './update-pepe.dto';

@Controller('pepe')
export class PepeController {
  constructor(private readonly pepeService: PepeService) {}

  @Post()
  create(@Body() createPepeDto: CreatePepeDto) {
    return this.pepeService.create(createPepeDto);
  }

  @Get()
  findAll() {
    return this.pepeService.findAll();
  }

  @Get(':id')
  findOne(@Param('id') id: string) {
    return this.pepeService.findOne(+id);
  }

  @Patch(':id')
  update(@Param('id') id: string, @Body() updatePepeDto: UpdatePepeDto) {
    return this.pepeService.update(+id, updatePepeDto);
  }

  @Delete(':id')
  remove(@Param('id') id: string) {
    return this.pepeService.remove(+id);
  }
}
