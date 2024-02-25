import { Controller, Get } from '@nestjs/common';
import { User } from './User';

@Controller('user')
export class UserController {
    @Get()
    getHello() : User {
      return new User("Jaime", 40);
    }
}
