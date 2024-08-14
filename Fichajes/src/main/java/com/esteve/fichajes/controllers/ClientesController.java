package com.esteve.fichajes.controllers;

import com.esteve.fichajes.models.Clientes;
import com.esteve.fichajes.services.ClientesService;

import java.util.ArrayList;
import java.util.List;

public class ClientesController {

    private ClientesService clientesService;

    public List<Clientes> obtenerClientes(){

        List<Clientes> clientes = new ArrayList<>();
        clientes = clientesService.obtenerTodosLosClientes();
        return clientes;
    }
}
