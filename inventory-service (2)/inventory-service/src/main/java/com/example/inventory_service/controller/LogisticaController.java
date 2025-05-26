package com.example.inventory_service.controller;

import com.example.inventory_service.model.Logistica;
import com.example.inventory_service.service.LogisticaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logistica")
public class LogisticaController {

    private final LogisticaService logisticaService;

    public LogisticaController(LogisticaService logisticaService) {
        this.logisticaService = logisticaService;
    }

    @GetMapping
    public List<Logistica> obtenerLogisticas() {
        return logisticaService.obtenerTodas();
    }

    @PostMapping
    public Logistica crearLogistica(@RequestBody Logistica logistica) {
        return logisticaService.guardar(logistica);
    }
}

