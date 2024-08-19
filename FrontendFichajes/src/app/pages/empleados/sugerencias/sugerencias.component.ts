import { Component } from '@angular/core';
import {SidebarEmpComponent} from "../../../components/empleados/sidebar-emp/sidebar-emp.component";

@Component({
  selector: 'app-sugerencias',
  standalone: true,
    imports: [
        SidebarEmpComponent
    ],
  templateUrl: './sugerencias.component.html',
  styleUrl: './sugerencias.component.css'
})
export class SugerenciasComponent {

}
