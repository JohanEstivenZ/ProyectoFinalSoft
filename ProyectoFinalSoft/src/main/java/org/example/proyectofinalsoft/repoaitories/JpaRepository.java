package org.example.proyectofinalsoft.repoaitories;

import org.example.proyectofinalsoft.entities.Rol;
import org.example.proyectofinalsoft.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface JpaRepository<T, T1> {
    boolean existsById(long id);

    void deleteById(long id);

    Usuario save(Usuario usuario);

    List<Rol> findAll();

    Optional<Rol> findById(long id);
}
