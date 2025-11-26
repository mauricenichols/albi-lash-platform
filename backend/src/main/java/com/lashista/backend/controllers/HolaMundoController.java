package com.lashista.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/prueba")
    public String saludar() {
        return "Hola Mau! Tu backend WWW.ALBILASH.COM esta funcionando correctamente.";
    }
}


