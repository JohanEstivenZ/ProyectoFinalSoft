package org.example.proyectofinalsoft.repoaitories;


import org.example.proyectofinalsoft.entities.Rol;
import org.example.proyectofinalsoft.entities.Usuario;

import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByCorreoAndContrasenia(String correo, String contrasenia);
    boolean existsByCorreo(String correo);

    Optional<Rol> findById(long id);
}
