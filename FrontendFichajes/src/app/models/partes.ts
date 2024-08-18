import { Proyectos } from "./proyectos"
import {Imputaciones} from "./imputaciones";

export class Partes {
  constructor(
    public id: number,
    public nombre: string,
    public fecha: Date,
    public ventas: number,
    public costes: number,
    public beneficios: number,
    public nota: Text,
    public facturado: boolean,
    public proyecto_id: Proyectos,
    public imputaciones: Imputaciones[]
  ) {
  }
}
