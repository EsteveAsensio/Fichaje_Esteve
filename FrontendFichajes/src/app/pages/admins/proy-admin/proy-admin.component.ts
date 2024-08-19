import { Component } from '@angular/core';
import {SidebarAdmComponent} from "../../../components/admins/sidebar-adm/sidebar-adm.component";

@Component({
  selector: 'app-proy-admin',
  standalone: true,
    imports: [
        SidebarAdmComponent
    ],
  templateUrl: './proy-admin.component.html',
  styleUrl: './proy-admin.component.css'
})
export class ProyAdminComponent {

}
