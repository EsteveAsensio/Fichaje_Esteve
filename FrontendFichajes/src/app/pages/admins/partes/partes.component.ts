import { Component } from '@angular/core';
import {SidebarAdmComponent} from "../../../components/admins/sidebar-adm/sidebar-adm.component";

@Component({
  selector: 'app-partes',
  standalone: true,
    imports: [
        SidebarAdmComponent
    ],
  templateUrl: './partes.component.html',
  styleUrl: './partes.component.css'
})
export class PartesComponent {

}
