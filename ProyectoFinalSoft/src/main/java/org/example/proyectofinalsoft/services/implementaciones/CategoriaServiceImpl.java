package org.example.proyectofinalsoft.services.implementaciones;

import org.example.proyectofinalsoft.entities.Categoria;
import org.example.proyectofinalsoft.repoaitories.CategoriaRepository;
import org.example.proyectofinalsoft.services.CategoriaService;

import java.util.List;
import java.util.Optional;

public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl (CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }


    @Override
    public Optional<Categoria> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Categoria> getAll() {
        return List.of();
    }

    @Override
    public Optional<Categoria> update(long id, Categoria categoriaActualizada) {
        return categoriaRepository.findById(id)
                .map(categoria -> {

                    return null;
                });
    }

    @Override
    public boolean deleteById(long id) {
        if(categoriaRepository.existsById(id)){
            categoriaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Categoria create(Categoria categoria) {
        return null;
    }
}
