package com.lashista.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lashista.backend.models.Servicio;
import com.lashista.backend.services.ServicioService;

@RestController // 1. Soy un Mesero Web.
@RequestMapping("/api/servicios") // 2. Atiendo en la dirección base "localhost:8081/api/servicios".
@CrossOrigin(origins = "http://localhost:3000")
public class ServicioController {

    private final ServicioService service;

    // Inyección de Dependencia: Traemos al Gerente.
    public ServicioController(ServicioService service) {
        this.service = service;
    }

    @GetMapping // 3. Cuando pidan la lista (GET)...
    public List<Servicio> listarServicios() {
        return service.obtenerTodos(); // ...le pido al Gerente la lista y la devuelvo en formato JSON.
    }
}