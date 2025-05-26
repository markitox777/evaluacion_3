package com.example.inventory_service.model;

import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String rut;

    // Constructor vacío (obligatorio para JPA)
    public Cliente() {
    }

    // Constructor sin ID (el ID lo genera JPA)
    public Cliente(String nombre, String correo, String rut) {
        this.nombre = nombre;
        this.correo = correo;
        this.rut = rut;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }
}
