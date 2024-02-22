interface Chair {
    id: number;
    color: string;
    type: string;
}

interface Table {
    id: number;
    color: string;
    type: string;
}


class Forniture<T extends {id:number, color: string, type: string}> {
    private items: T[] = [];
    addItem(newItem: T): void{
        this.items.push(newItem);
    }
    log(){
        const id = this.items.map((item) => item.id);
        const color = this.items.map((item) => item.color);
        const type = this.items.map((item) => item.type);
        console.log(id , color, type)
    }
 }

    
const fornitureChair = new Forniture<Chair>();

const chair1 = {
    id: 1,
    color: "red",
    type: "chair"

}

const chair2 = {
    id: 2,
    color: "white",
    type: "chair"

}

const chair3 = {
    id: 4,
    color: "black",
    type: "chair"

}



fornitureChair.addItem(chair1);
fornitureChair.addItem(chair2);
fornitureChair.addItem(chair3);
fornitureChair.log()




const fornitureTable = new Forniture<Table>();

const table1 = {
    id: 1,
    color: "red",
    type: "chair"

}

const table2 = {
    id: 2,
    color: "white",
    type: "chair"

}

const table3 = {
    id: 4,
    color: "black",
    type: "chair"

}

fornitureTable.addItem(table1);
fornitureTable.addItem(table2);
fornitureTable.addItem(table3);

fornitureTable.log()

