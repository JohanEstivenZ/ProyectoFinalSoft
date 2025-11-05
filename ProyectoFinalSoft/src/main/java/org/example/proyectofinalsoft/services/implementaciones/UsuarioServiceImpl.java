package org.example.proyectofinalsoft.services.implementaciones;



import org.example.proyectofinalsoft.entities.Usuario;
import org.example.proyectofinalsoft.repoaitories.UsuarioRepository;
import org.example.proyectofinalsoft.services.UsuarioService;

import java.util.Optional;


public class UsuarioServiceImpl implements UsuarioService {


    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> getById(long id) {
        return login("", "");
    }

    @Override
    public Class<? extends UsuarioRepository> getAll() {
        return usuarioRepository.getClass();
    }

    @Override
    public Optional<Usuario> update(long id, Usuario usuarioActualizado) {
        return usuarioRepository.findById(id)
                .map(usuario -> {

                    return null;
                });
    }

    @Override
    public boolean deleteById(long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Usuario create(Usuario usuario) {
        if (usuarioRepository.existsByCorreo(usuario.getCorreo())) {
            throw new RuntimeException("El correo ya esta registrado");
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> login(String correo, String contrasenia) {
        return usuarioRepository.findByCorreoAndContrasenia(correo, contrasenia);
    }

}

