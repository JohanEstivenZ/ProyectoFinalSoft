package org.example.proyectofinalsoft.services.implementaciones;


import org.example.proyectofinalsoft.entities.Pedido;
import org.example.proyectofinalsoft.repoaitories.PedidoRepository;
import org.example.proyectofinalsoft.services.PedidoService;

import java.util.List;
import java.util.Optional;

public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoServiceImpl (PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }
    @Override
    public Optional<Pedido> getById(long id) {
        return null;
    }

    @Override
    public List<Pedido> getAll() {
        return null;
    }

    @Override
    public Optional<Pedido> update(long id, Pedido pedidoActualizado) {
        return pedidoRepository.findById(id)
                .map(pedido -> {
                    return null;
                });
    }

    @Override
    public boolean deleteById(long id) {
        if(pedidoRepository.existsById(id)){
            pedidoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Pedido create(Pedido pedido) {
        return null;
    }
}
