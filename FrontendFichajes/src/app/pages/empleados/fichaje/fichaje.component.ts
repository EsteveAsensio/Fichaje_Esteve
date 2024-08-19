import { Component } from '@angular/core';
import {SidebarEmpComponent} from "../../../components/empleados/sidebar-emp/sidebar-emp.component";

@Component({
  selector: 'app-fichaje',
  standalone: true,
  imports: [
    SidebarEmpComponent
  ],
  templateUrl: './fichaje.component.html',
  styleUrl: './fichaje.component.css'
})
export class FichajeComponent {

}
