package com.esteve.fichajes.services;

import com.esteve.fichajes.models.Proyectos;
import com.esteve.fichajes.repositories.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectosService {

    @Autowired
    private ProyectosRepository proyectosRepository;

    public List<Proyectos> obtenerProyectos(){
        return proyectosRepository.findAll();
    }

    public boolean crear_actualizar_Cliente(Proyectos proyecto){
        proyectosRepository.save(proyecto);
        return true;
    }

}
