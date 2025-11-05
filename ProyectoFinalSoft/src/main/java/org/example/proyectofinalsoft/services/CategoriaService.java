package org.example.proyectofinalsoft.services;



import org.example.proyectofinalsoft.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    Optional<Categoria> getById(long id);

    List<Categoria> getAll();

    Optional<Categoria> update(long id, Categoria categoria);

    boolean deleteById(long id);

    Categoria create(Categoria categoria);
}
