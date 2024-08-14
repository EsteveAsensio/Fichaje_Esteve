package com.esteve.fichajes.repositories;

import com.esteve.fichajes.models.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer> {

    // No necesitas definir nada aquí, JpaRepository ya tiene varios métodos por defecto
}
