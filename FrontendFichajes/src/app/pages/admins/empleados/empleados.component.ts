import { Component } from '@angular/core';
import {SidebarAdmComponent} from "../../../components/admins/sidebar-adm/sidebar-adm.component";

@Component({
  selector: 'app-empleados',
  standalone: true,
  imports: [
    SidebarAdmComponent
  ],
  templateUrl: './empleados.component.html',
  styleUrl: './empleados.component.css'
})
export class EmpleadosComponent {

}
