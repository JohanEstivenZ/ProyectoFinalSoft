package org.example.proyectofinalsoft.services;


import org.example.proyectofinalsoft.entities.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    Optional<Pedido> getById(long id);

    List<Pedido> getAll();

    Optional<Pedido> update(long id, Pedido pedido);

    boolean deleteById(long id);

    Pedido create(Pedido pedido);
}
