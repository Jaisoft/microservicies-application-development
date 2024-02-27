import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { DepenService } from './depen/depen.service';

@Module({
  imports: [],
  controllers: [AppController],
  providers: [AppService, DepenService],
})
export class AppModule {}
