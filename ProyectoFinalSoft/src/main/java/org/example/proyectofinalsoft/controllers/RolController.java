package org.example.proyectofinalsoft.controllers;


import org.example.proyectofinalsoft.entities.Rol;
import org.example.proyectofinalsoft.services.RolService;

import java.util.List;
import java.util.Optional;

public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService){
        this.rolService = rolService;
    }

    public List<Rol> getAll() {
        return rolService.getAll();
    }


}
