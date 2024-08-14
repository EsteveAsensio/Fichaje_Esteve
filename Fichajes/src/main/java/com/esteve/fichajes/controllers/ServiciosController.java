package com.esteve.fichajes.controllers;

import com.esteve.fichajes.models.Clientes;
import com.esteve.fichajes.models.Servicios;
import com.esteve.fichajes.services.ClientesService;
import com.esteve.fichajes.services.ServiciosService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ServiciosController {

    private ServiciosService serviciosService;

    @Autowired
    public ServiciosController(ServiciosService serviciosService) {
        this.serviciosService = serviciosService;
    }

    public List<Servicios> obtenerTodosLosServicios(){
        return serviciosService.obtenerTodosLosServicios();
    }

    public Servicios obtenerServicio(Integer id){

        Optional<Servicios> ser = serviciosService.obtenerServicio(id);
        if (ser.isPresent()) {
            return ser.get();
        } else {
            throw new EntityNotFoundException("Servicio no encontrado con ID: " + id);
        }
    }

    public void crear_actualizar_Servicio(Servicios servicio) {
        serviciosService.crear_actualizar_Servicio(servicio);
    }

}
