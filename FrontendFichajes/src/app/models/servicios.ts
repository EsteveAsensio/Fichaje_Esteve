import {Tareas} from "./tareas";

export class Servicios{
    constructor(
        public id: number,
        public nombre: string,
        public descripcion: Text,
        public precio_hora: number,
        public coste_hora: number,
        public tareas: Tareas[]
    ) {
    }
}
