package com.lashista.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 1. Esto convierte la clase en una Tabla de Base de Datos
public class Servicio {

    @Id // 2. Esto dice que el "id" es la clave única (como el DNI)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Se autogenera (1, 2, 3...)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double precio;
    private String imagenUrl; // Para la foto de "revista"

    // --- CONSTRUCTORES (Necesarios para JPA) ---
    public Servicio() {
    }

    public Servicio(String nombre, String descripcion, Double precio, String imagenUrl) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagenUrl = imagenUrl;
    }

    // --- GETTERS Y SETTERS (Para acceder a los datos privados) ---
    // (Puedes generarlos automáticamente en Eclipse: 
    // Click derecho > Source > Generate Getters and Setters > Select All > Generate)

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
}