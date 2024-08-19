import { Routes } from '@angular/router';
import {LoginComponent} from "./pages/login/login.component";
import {FichajeComponent} from "./pages/empleados/fichaje/fichaje.component";
import {ImpEmpleadoComponent} from "./pages/empleados/imp-empleado/imp-empleado.component";
import {ProyEmpleadoComponent} from "./pages/empleados/proy-empleado/proy-empleado.component";
import {SugerenciasComponent} from "./pages/empleados/sugerencias/sugerencias.component";

export const routes: Routes = [

  { component: LoginComponent, path:"tecno-logix/login"},
  { component: FichajeComponent, path:"tecno-logix/fichaje"},
  { component: ImpEmpleadoComponent, path:"tecno-logix/imputaciones-emp"},
  { component: ProyEmpleadoComponent, path:"tecno-logix/proyectos-emp"},
  { component: SugerenciasComponent, path:"tecno-logix/sugerencias-emp"},


  { component: LoginComponent, path: '' },
  { component: LoginComponent, path: '**' }

];
