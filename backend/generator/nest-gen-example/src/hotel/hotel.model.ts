import { Entity, Column, PrimaryGeneratedColumn } from 'typeorm';

@Entity('hotel')
export class Hotel {

    @PrimaryGeneratedColumn()
    id: number;

}