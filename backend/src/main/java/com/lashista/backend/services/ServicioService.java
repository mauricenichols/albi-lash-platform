package com.lashista.backend.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.lashista.backend.models.Servicio;
import com.lashista.backend.repositories.ServicioRepository;

@Service // 1. Etiqueta de "Gerente". Spring sabe que aquí hay lógica de negocio.
public class ServicioService {

    private final ServicioRepository repository;

    // 2. Inyección de Dependencias (Contratación automática):
    // Spring nos da el Repositorio listo para usar.
    public ServicioService(ServicioRepository repository) {
        this.repository = repository;
    }

    // 3. Método para obtener todos los servicios
    // El Gerente le pide al Almacenero: "Dame la lista completa".
    public List<Servicio> obtenerTodos() {
        return repository.findAll();
    }
    
    // 4. Método para guardar un servicio nuevo
    public Servicio guardarServicio(Servicio servicio) {
        return repository.save(servicio);
    }
}