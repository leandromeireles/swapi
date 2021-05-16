package com.swapi.service;

import com.swapi.repository.SwapiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SwapiService {

    @Autowired
    SwapiRepository swapiRepository;

    public List<PedidoDto> converter() {

        List<Pedido> pedidos = pedidoRepository.findAll();

        return new ResponseEntity<>();
    }

}
