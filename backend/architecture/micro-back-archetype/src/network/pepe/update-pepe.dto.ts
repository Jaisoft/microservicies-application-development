import { PartialType } from '@nestjs/swagger';
import { CreatePepeDto } from './create-pepe.dto';

export class UpdatePepeDto extends PartialType(CreatePepeDto) {}
