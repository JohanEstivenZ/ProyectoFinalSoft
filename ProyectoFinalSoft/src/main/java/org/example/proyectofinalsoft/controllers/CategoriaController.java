package org.example.proyectofinalsoft.controllers;



import org.example.proyectofinalsoft.entities.Categoria;
import org.example.proyectofinalsoft.services.CategoriaService;

import java.util.List;
import java.util.Optional;

public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    public List<Categoria> getAll() {
        return categoriaService.getAll();
    }


}
