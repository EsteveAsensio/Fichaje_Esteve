import { Proyectos } from "./proyectos";

export class Clientes{
  constructor(
    public id: number,
    public nombre: string,
    public direccion: string,
    public contacto: number,
    public correo: string,
    public ruta_imagen: string,
    public proyectos: Proyectos[]
  ) {
  }
}
