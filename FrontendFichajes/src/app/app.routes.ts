import { Routes } from '@angular/router';
import {LoginComponent} from "./pages/login/login.component";
import {FichajeComponent} from "./pages/empleados/fichaje/fichaje.component";
import {ImpEmpleadoComponent} from "./pages/empleados/imp-empleado/imp-empleado.component";
import {ProyEmpleadoComponent} from "./pages/empleados/proy-empleado/proy-empleado.component";
import {SugerenciasComponent} from "./pages/empleados/sugerencias/sugerencias.component";
import {SugerenciasAdminComponent} from "./pages/admins/sugerencias-admin/sugerencias-admin.component";
import {ProyAdminComponent} from "./pages/admins/proy-admin/proy-admin.component";
import {PartesComponent} from "./pages/admins/partes/partes.component";
import {ClientesComponent} from "./pages/admins/clientes/clientes.component";
import {EmpleadosComponent} from "./pages/admins/empleados/empleados.component";
import {ImpAdminComponent} from "./pages/admins/imp-admin/imp-admin.component";
import {PrincipalComponent} from "./pages/admins/principal/principal.component";
import {ServiciosComponent} from "./pages/admins/servicios/servicios.component";

export const routes: Routes = [

  { component: LoginComponent, path:"tecno-logix/login"},
  //Empleados
  { component: FichajeComponent, path:"tecno-logix/fichaje"},
  { component: ImpEmpleadoComponent, path:"tecno-logix/imputaciones-emp"},
  { component: ProyEmpleadoComponent, path:"tecno-logix/proyectos-emp"},
  { component: SugerenciasComponent, path:"tecno-logix/sugerencias-emp"},

  //Admins
  { component: SugerenciasAdminComponent, path:"tecno-logix/admin/sugerencias"},
  { component: ProyAdminComponent, path:"tecno-logix/admin/proyectos"},
  { component: ClientesComponent, path:"tecno-logix/admin/clientes"},
  { component: EmpleadosComponent, path:"tecno-logix/admin/empleados"},
  { component: ImpAdminComponent, path:"tecno-logix/admin/imputaciones"},
  { component: PrincipalComponent, path:"tecno-logix/admin/principal"},
  { component: ServiciosComponent, path:"tecno-logix/admin/servicios"},
  { component: PartesComponent, path:"tecno-logix/admin/partes"},



  { component: LoginComponent, path: '' },
  { component: LoginComponent, path: '**' }

];
