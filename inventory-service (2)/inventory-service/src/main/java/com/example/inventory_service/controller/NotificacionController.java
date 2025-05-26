package com.example.inventory_service.controller;

import com.example.inventory_service.model.Notificacion;
import com.example.inventory_service.service.NotificacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {

    private final NotificacionService notificacionService;

    public NotificacionController(NotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }

    @GetMapping
    public List<Notificacion> obtenerNotificaciones() {
        return notificacionService.obtenerTodas();
    }

    @PostMapping
    public Notificacion crearNotificacion(@RequestBody Notificacion notificacion) {
        return notificacionService.guardar(notificacion);
    }
}

