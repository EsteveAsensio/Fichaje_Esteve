package com.esteve.fichajes.repositories;

import com.esteve.fichajes.models.Rol;
import com.esteve.fichajes.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByUsername(String username);


}
