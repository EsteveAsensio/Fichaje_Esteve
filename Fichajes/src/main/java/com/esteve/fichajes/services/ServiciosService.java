package com.esteve.fichajes.services;

import com.esteve.fichajes.models.Clientes;
import com.esteve.fichajes.models.Servicios;
import com.esteve.fichajes.repositories.ClientesRepository;
import com.esteve.fichajes.repositories.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosService {

    @Autowired
    private ServiciosRepository serviciosRepository;

    public List<Servicios> obtenerTodosLosServicios() {
        return serviciosRepository.findAll();
    }

    public Optional<Servicios> obtenerServicio(Integer id) {
        return serviciosRepository.findById(id);
    }

    public Servicios crear_actualizar_Servicio(Servicios servicio) {
        return serviciosRepository.save(servicio); // Este método guarda o actualiza el cliente en la base de datos
    }

}
