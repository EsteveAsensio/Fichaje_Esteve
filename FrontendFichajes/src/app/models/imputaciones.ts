import {Proyectos} from "./proyectos";
import {Tareas} from "./tareas";
import {Empleados} from "./empleados";
import {Partes} from "./partes";

export class Imputaciones{
    constructor(
        public id: number,
        public horas: number,
        public fecha_entrada: Date,
        public fecha_salida: Date,
        public nota: string,
        public ventas: number,
        public costes: number,
        public beneficios: number,
        public empleado_id: Empleados,
        public parte_id: Partes,
        public proyecto_id: Proyectos,
        public tarea_id: Tareas,
    ) {
    }
}
