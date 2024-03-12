import { BaseEntity, Entity, Column, PrimaryGeneratedColumn} from 'typeorm';

@Entity()
export class Car  extends BaseEntity{
    @PrimaryGeneratedColumn()
    id: number;
    @Column()
    model: string;
    @Column() 
    color: string;
    @Column() 
    price: number;
}