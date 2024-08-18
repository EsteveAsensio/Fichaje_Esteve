import {Imputaciones} from "./imputaciones";
import {Tareas} from "./tareas";
import {Clientes} from "./clientes";
import { Estado } from "./estado.enum";

export class Proyectos{
  constructor(
    public id: number,
    public nombre: string,
    public tiempo_estimado: number,
    public tiempo_restante: number,
    public tiempo_imputado: number,
    public fecha: Date,
    public estado: Estado,
    public descripcion: Text,
    public cliente_id: Clientes,
    public imputaciones: Imputaciones[],
    public tareas: Tareas[]
  ) {
  }
}
