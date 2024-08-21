import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { jwtDecode } from "jwt-decode";

interface JwtPayload {
  role: string; // El rol del usuario
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private baseUrl = 'http://localhost:8080/api/auth';

  constructor(private http: HttpClient) {}

  login(username: string, password: string): Observable<void> {
    return this.http.post<{ token: string }>(`${this.baseUrl}/auth/login`, { username, password })
      .pipe(
        map(response => {
          // Guarda el token en el localStorage
          localStorage.setItem('jwtToken', response.token);
        })
      );
  }

  logout(): void {
    localStorage.removeItem('jwtToken');
  }

  getToken(): string | null {
    return localStorage.getItem('jwtToken');
  }

  isAuthenticated(): boolean {
    return this.getToken() !== null;
  }

  getUserRole(): string | null {
    const token = this.getToken();
    if (token) {
      const decoded = jwtDecode<JwtPayload>(token);
      return decoded.role;
    }
    return null;
  }
}
