package org.example.proyectofinalsoft.controllers;


import org.example.proyectofinalsoft.entities.DetallePedido;
import org.example.proyectofinalsoft.services.DetallePedidoService;

import java.util.Optional;

public class DetallePedidoController {
    private final DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService){
        this.detallePedidoService = detallePedidoService;
    }

    public Optional<DetallePedido> obtenerCarrito(int idUsuario) {
        return detallePedidoService.getById(idUsuario);
    }

}
