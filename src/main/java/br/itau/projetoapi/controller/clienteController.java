package br.itau.projetoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class clienteController {
    
    @GetMapping
    public String hello() {
        return ("Olá, mundo!");
    }
}
