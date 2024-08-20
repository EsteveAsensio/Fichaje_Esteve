package com.esteve.fichajes.controllers;

import com.esteve.fichajes.services.RolService;
import com.esteve.fichajes.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UsuariosController {

    private UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }
}
