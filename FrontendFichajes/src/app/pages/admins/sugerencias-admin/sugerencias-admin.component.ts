import { Component } from '@angular/core';
import {SidebarAdmComponent} from "../../../components/admins/sidebar-adm/sidebar-adm.component";

@Component({
  selector: 'app-sugerencias-admin',
  standalone: true,
  imports: [
    SidebarAdmComponent
  ],
  templateUrl: './sugerencias-admin.component.html',
  styleUrl: './sugerencias-admin.component.css'
})
export class SugerenciasAdminComponent {

}
