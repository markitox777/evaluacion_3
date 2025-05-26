package com.example.inventory_service.service;

import com.example.inventory_service.model.Logistica;
import com.example.inventory_service.repository.LogisticaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticaService {

    private final LogisticaRepository logisticaRepository;

    public LogisticaService(LogisticaRepository logisticaRepository) {
        this.logisticaRepository = logisticaRepository;
    }

    public List<Logistica> obtenerTodas() {
        return logisticaRepository.findAll();
    }

    public Logistica guardar(Logistica logistica) {
        return logisticaRepository.save(logistica);
    }
}
