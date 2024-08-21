import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../../services/auth.service'

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
  errorMessage: string = '';

  constructor(private authService: AuthService, private router: Router ) {
  }

  login(): void {
    this.authService.login(this.username, this.password).subscribe({
      next: () => {
        const role = this.authService.getUserRole();
        if (role === 'ADMIN') {
          this.router.navigate(['/tecno-logix/admin/principal']);  //administrador
        } else if (role === 'EMPLOYEE') {
          this.router.navigate(['/tecno-logix/fichaje']);  //empleado
        } else {
          this.errorMessage = 'Rol no reconocido';
        }
      },
      error: () => this.errorMessage = 'Nombre de usuario o contraseña incorrectos'
    });
  }

}
