import { BaseEntity } from 'typeorm';
export declare class Car extends BaseEntity {
    id: number;
    model: string;
    color: string;
    price: number;
}
