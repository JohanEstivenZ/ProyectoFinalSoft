package org.example.proyectofinalsoft.services.implementaciones;


import org.example.proyectofinalsoft.entities.Rol;
import org.example.proyectofinalsoft.repoaitories.RolRepository;
import org.example.proyectofinalsoft.services.RolService;

import java.util.List;
import java.util.Optional;

public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public Optional<Rol> getById(long id) {
        return rolRepository.findById(id);
    }

    @Override
    public List<Rol> getAll() {
        return rolRepository.findAll();
    }


    @Override
    public Optional<Rol> update(long id, Rol rolActualizado) {
        return rolRepository.findById(id)
                .map(rol -> {
                    return null;
                });
    }

    @Override
    public boolean deleteById(long id) {
        if (rolRepository.existsById(id)) {
            rolRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Rol create(Rol rol) {
        return null;
    }
}
