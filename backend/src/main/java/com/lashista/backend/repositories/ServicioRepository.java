package com.lashista.backend.repositories; // <--- ESTA LÍNEA ES LA CLAVE

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lashista.backend.models.Servicio;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}