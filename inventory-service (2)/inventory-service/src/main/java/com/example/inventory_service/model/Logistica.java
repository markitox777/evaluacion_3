package com.example.inventory_service.model;

import jakarta.persistence.*;

@Entity
public class Logistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pedidoId;
    private String descripcion;
    private String ciudad;
    private String estadoEnvio;

    public Logistica() {}

    public Logistica(Long pedidoId, String descripcion, String ciudad, String estadoEnvio) {
        this.pedidoId = pedidoId;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
        this.estadoEnvio = estadoEnvio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }
}
