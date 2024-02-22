import { Entity, PrimaryGeneratedColumn } from "typeorm";


@Entity('example')
export class Example {


    @PrimaryGeneratedColumn()
    id: number;


}
