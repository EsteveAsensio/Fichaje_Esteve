package com.esteve.fichajes.repositories;

import com.esteve.fichajes.models.Clientes;
import com.esteve.fichajes.models.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {
}
