package com.esteve.fichajes.repositories;

import com.esteve.fichajes.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

    // No necesitas definir nada aquí, JpaRepository ya tiene el método findAll() para obtener todos los clientes

}
