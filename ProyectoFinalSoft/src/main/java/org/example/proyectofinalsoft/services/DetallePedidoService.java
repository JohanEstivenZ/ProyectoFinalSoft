package org.example.proyectofinalsoft.services;



import org.example.proyectofinalsoft.entities.DetallePedido;

import java.util.List;
import java.util.Optional;

public interface DetallePedidoService {

    Optional<DetallePedido> getById(long id);

    List<DetallePedido> getAll();

    Optional<DetallePedido> update(long id, DetallePedido detallePedido);

    boolean deleteById(long id);

    DetallePedido create(DetallePedido detallePedido);
}
