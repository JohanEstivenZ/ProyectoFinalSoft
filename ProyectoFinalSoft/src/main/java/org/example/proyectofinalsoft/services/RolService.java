package org.example.proyectofinalsoft.services;


import org.example.proyectofinalsoft.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {

    Optional<Rol> getById(long id);

    List<Rol> getAll();

    Optional<Rol> update(long id, Rol rol);

    boolean deleteById(long id);

    Rol create(Rol rol);
}
