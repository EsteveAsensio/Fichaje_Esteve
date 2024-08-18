import {Imputaciones} from "./imputaciones";
import {Sugerencias} from "./sugerencias";

export class Empleados{
  constructor(
    public id: number,
    public nombre: string,
    public apellidos: string,
    public direccion: string,
    public contacto: number,
    public correo: string,
    public ruta_imagen: string,
    public imputaciones: Imputaciones[],
    public sugerencias: Sugerencias[]
) {
  }
}
