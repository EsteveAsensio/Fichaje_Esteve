package com.esteve.fichajes.controllers;

import com.esteve.fichajes.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RolController {

    private RolService rolService;

    @Autowired
    public RolController(RolService rolService) {
        this.rolService = rolService;
    }
}
