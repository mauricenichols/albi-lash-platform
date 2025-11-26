package com.lashista.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.lashista.backend.models.Servicio;
import com.lashista.backend.repositories.ServicioRepository; // <--- AHORA SÍ LO ENCONTRARÁ

@Component
public class DataLoader implements CommandLineRunner {

    private final ServicioRepository repository;

    public DataLoader(ServicioRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            repository.save(new Servicio("Lifting de Pestañas", "Curvatura natural", 5000.0, "url1"));
            repository.save(new Servicio("Extensiones Clásicas", "Efecto rímel", 7500.0, "url2"));
            
            System.out.println("--- DATOS CARGADOS ---");
        }
    }
}