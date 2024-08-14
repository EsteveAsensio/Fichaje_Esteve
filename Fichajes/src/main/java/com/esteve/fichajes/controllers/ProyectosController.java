package com.esteve.fichajes.controllers;

import com.esteve.fichajes.models.Clientes;
import com.esteve.fichajes.models.Proyectos;
import com.esteve.fichajes.services.ClientesService;
import com.esteve.fichajes.services.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProyectosController {

    private ProyectosService proyectosService;

    @Autowired
    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    public void crear_actualizar_Proyecto(Proyectos proyecto) {
        proyectosService.crear_actualizar_Proyecto(proyecto);
    }

    public List<Proyectos> obtenerTodosLosProyectos(){
        return proyectosService.obtenerProyectos();
    }
}
