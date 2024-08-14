package com.esteve.fichajes.services;

import com.esteve.fichajes.models.Clientes;
import com.esteve.fichajes.repositories.ClientesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> obtenerTodosLosClientes() {
        return clientesRepository.findAll();
    }

    public Optional<Clientes> obtenerCliente(Integer id) {
        return clientesRepository.findById(id);
    }

    public Clientes crear_actualizar_Cliente(Clientes cliente) {
        return clientesRepository.save(cliente); // Este método guarda o actualiza el cliente en la base de datos
    }

}
