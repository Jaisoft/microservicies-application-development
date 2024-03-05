import { Module } from '@nestjs/common';
import { PepeService } from '../pepe/pepe.service';
import { PepeController } from '../network/pepe/pepe.controller';

@Module({
  controllers: [PepeController],
  providers: [PepeService]
})
export class PepeModule {}
