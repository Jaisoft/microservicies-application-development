import { BaseEntity, Entity, Column, PrimaryGeneratedColumn} from 'typeorm';
import { Exclude } from 'class-transformer';

@Entity()
export class Car  extends BaseEntity{
    @PrimaryGeneratedColumn()
    id: number;
    @Column()
    model: string;
    @Column() 
    color: string;
    @Column()
    @Exclude()
    price: number;
}