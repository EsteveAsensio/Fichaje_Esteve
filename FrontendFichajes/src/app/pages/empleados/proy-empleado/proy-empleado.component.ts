import { Component } from '@angular/core';
import {SidebarEmpComponent} from "../../../components/empleados/sidebar-emp/sidebar-emp.component";

@Component({
  selector: 'app-proy-empleado',
  standalone: true,
    imports: [
        SidebarEmpComponent
    ],
  templateUrl: './proy-empleado.component.html',
  styleUrl: './proy-empleado.component.css'
})
export class ProyEmpleadoComponent {

}
