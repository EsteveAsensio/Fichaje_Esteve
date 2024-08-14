package com.esteve.fichajes.controllers;

import com.esteve.fichajes.models.Clientes;
import com.esteve.fichajes.services.ClientesService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientesController {

    private ClientesService clientesService;

    @Autowired
    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    public List<Clientes> obtenerTodosLosClientes(){
        return clientesService.obtenerTodosLosClientes();
    }

    public Clientes obtenerCliente(Integer id){

        Optional<Clientes> cli = clientesService.obtenerCliente(id);
        if (cli.isPresent()) {
            return cli.get();
        } else {
            throw new EntityNotFoundException("Cliente no encontrado con ID: " + id);
        }
    }

    public void crear_actualizar_Cliente(Clientes cliente) {
        clientesService.crear_actualizar_Cliente(cliente);
    }
}
