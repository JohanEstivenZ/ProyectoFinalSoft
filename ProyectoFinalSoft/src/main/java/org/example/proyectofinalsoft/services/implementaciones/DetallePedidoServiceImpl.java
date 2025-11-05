package org.example.proyectofinalsoft.services.implementaciones;


import org.example.proyectofinalsoft.entities.DetallePedido;
import org.example.proyectofinalsoft.repoaitories.DetallePedidoRepository;
import org.example.proyectofinalsoft.services.DetallePedidoService;

import java.util.List;
import java.util.Optional;

public class DetallePedidoServiceImpl implements DetallePedidoService {

    private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(DetallePedidoRepository detallePedidoRepository){
        this.detallePedidoRepository = detallePedidoRepository;
    }

    @Override
    public Optional<DetallePedido> getById(long id) {
        return null;
    }

    @Override
    public List<DetallePedido> getAll() {
        return null;
    }

    @Override
    public Optional<DetallePedido> update(long id, DetallePedido detallePedidoActualizado) {
        return detallePedidoRepository.findById(id)
                .map(detallePedido -> {
                    return null;
                });
    }

    @Override
    public boolean deleteById(long id) {
        if(detallePedidoRepository.existsById(id)){
            detallePedidoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public DetallePedido create(DetallePedido detallePedido) {
        return null;
    }
}
