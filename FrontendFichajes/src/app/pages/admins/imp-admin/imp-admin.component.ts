import { Component } from '@angular/core';
import {SidebarAdmComponent} from "../../../components/admins/sidebar-adm/sidebar-adm.component";

@Component({
  selector: 'app-imp-admin',
  standalone: true,
    imports: [
        SidebarAdmComponent
    ],
  templateUrl: './imp-admin.component.html',
  styleUrl: './imp-admin.component.css'
})
export class ImpAdminComponent {

}
