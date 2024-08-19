import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  public username: string = "";
  public password: string = "";
  private tipo_user: "empleado" | "admin" = "empleado";

  constructor(private router: Router ) {
  }

  login(){
    if(this.tipo_user == "empleado"){
      this.router.navigateByUrl('tecno-logix/fichaje');
    }else if (this.tipo_user == "admin"){
      this.router.navigateByUrl('tecno-logix/principal')
    }else{
      console.log("No se ha podido iniciar sesión. Falta de permisos")
    }}

}
