package com.esteve.fichajes.config;

import com.esteve.fichajes.models.Usuario;
import com.esteve.fichajes.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsuariosRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario registrarUsuario(Usuario usuario) {
        // Codifica la contraseña antes de guardarla
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }

    public Usuario autenticarUsuario(String username, String password) {
        // Buscar el usuario por su nombre de usuario
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // Verificar si la contraseña proporcionada coincide con la almacenada
        boolean contrasenaCoincide = passwordEncoder.matches(password, usuario.getPassword());
        if (!contrasenaCoincide) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        // Devolver el usuario autenticado
        return usuario;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Buscar el usuario por su nombre de usuario
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));

        // Convertir la entidad Usuario en un objeto UserDetails
        return User.builder()
                .username(usuario.getUsername())
                .password(usuario.getPassword())
                .roles(usuario.getRol().getTipo())
                .build();
    }
}
