package org.example.proyectofinalsoft.services;


import org.example.proyectofinalsoft.entities.Usuario;
import org.example.proyectofinalsoft.repoaitories.UsuarioRepository;

import java.util.Optional;

public interface UsuarioService {

    Optional<Usuario> getById(long id);

    Class<? extends UsuarioRepository> getAll();

    Optional<Usuario> update(long id, Usuario usuarioActualizado);

    boolean deleteById(long id);

    Usuario create(Usuario usuario);

    Optional<Usuario> login(String correo, String password);
}
