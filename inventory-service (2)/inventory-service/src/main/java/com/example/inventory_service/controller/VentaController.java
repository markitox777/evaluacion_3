package com.example.inventory_service.controller;

import com.example.inventory_service.model.Venta;
import com.example.inventory_service.service.VentaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public List<Venta> obtenerVentas() {
        return ventaService.obtenerTodas();
    }

    @PostMapping
    public Venta crearVenta(@RequestBody Venta venta) {
        return ventaService.guardar(venta);
    }
}

