package org.example.proyectofinalsoft.controllers;


import org.example.proyectofinalsoft.entities.Pedido;
import org.example.proyectofinalsoft.services.PedidoService;

import java.util.List;

public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }



}
