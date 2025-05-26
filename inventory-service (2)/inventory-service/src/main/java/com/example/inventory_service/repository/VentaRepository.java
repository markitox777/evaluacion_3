package com.example.inventory_service.repository;

import com.example.inventory_service.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    // opcionalmente métodos personalizados
}


