package org.example.proyectofinalsoft.controllers;


import org.example.proyectofinalsoft.entities.Usuario;
import org.example.proyectofinalsoft.services.UsuarioService;

import java.util.List;
import java.util.Optional;

public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public List<Usuario> getAll() {
        return null;
    }

    public Usuario registrar(Usuario usuario) {
        return usuarioService.create(usuario);
    }


}