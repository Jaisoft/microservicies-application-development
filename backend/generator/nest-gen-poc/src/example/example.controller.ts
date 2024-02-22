import { Controller, Request, Param, Body, Get, Post, Put, Delete, ParseUUIDPipe } from "@nestjs/common";
import { Repository } from "typeorm";
import { Example } from "./entities/example.entity";


@Controller('/example')
export class ExampleController {

    public constructor(private readonly repository:  Repository<Example>) {
    }

    @Get('/:id')
    public async getById(id: number): Promise<Example> {
        return await this.repository.findOne({
            where: { id },
          });
        
    }

    @Post()
    public create(@Request() req, @Body() body: any): Promise<Example> {
        let example: Example = new Example();
        Object.assign(example, body);
        return this.repository.save(example);
        
    }

    @Put('/:id')
    public async update(@Request() req, @Param('id', ParseUUIDPipe) id: number, @Body() body: any): Promise<Example> {
        let example: Example = await this.repository.findOne({
            where: { id },
          });
        if (!example) {
            throw "Object example does not exist";
        }

        Object.assign(example, body);
        return this.repository.save(example);
        
    }

    @Delete('/:id')
    public async remove(@Request() req, @Param('id', ParseUUIDPipe) id: number, @Body() body: any): Promise<Example> {
        let example: Example = await this.repository.findOne({
            where: { id },
          });
        if (!example) {
            throw "Object example does not exist";
        }
      await this.repository.delete(id);

      return example;
        
        
    }

    @Get()
    public async search(@Request() req): Promise<Array<Example>> {
        return await this.repository.find({});
        
    }

}