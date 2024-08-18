import {Empleados} from "./empleados";

export class Sugerencias{
  constructor(
    public id: number,
    public asunto: string,
    public descripcion: Text,
    public importante: boolean,
    public empleado_id: Empleados
  ) {
  }
}
