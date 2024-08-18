import {Imputaciones} from "./imputaciones";
import {Proyectos} from "./proyectos";
import {Servicios} from "./servicios";

export class Tareas{
    constructor(
        public id: number,
        public precio_hora: number,
        public coste_hora: number,
        public nombre: string,
        public beneficio_hora: number,
        public total_ventas: number,
        public total_costes: number,
        public total_beneficios: number,
        public proyecto_id: Proyectos,
        public servicio_id: Servicios,
        public imputaciones: Imputaciones[],
    ) {
    }
}
