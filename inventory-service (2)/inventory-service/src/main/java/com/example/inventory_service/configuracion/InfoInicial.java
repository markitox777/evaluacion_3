package com.example.inventory_service.configuracion;

import com.example.inventory_service.model.*;
import com.example.inventory_service.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class InfoInicial {

    @Bean
    CommandLineRunner initDatabase(
            ProductRepository productoRepo,
            ClienteRepository clienteRepo,
            VentaRepository ventaRepo,
            PedidoRepository pedidoRepo,
            LogisticaRepository logisticaRepo,
            NotificacionRepository notificacionRepo
    ) {
        return args -> {
            // Productos
            productoRepo.save(new Product("Shampoo Orgánico", "Shampoo sin sulfatos ni parabenos", 5990, 50));
            productoRepo.save(new Product("Cepillo de Bambú", "Cepillo ecológico biodegradable", 1990, 30));
            productoRepo.save(new Product("Jabón Natural", "Hecho a mano con ingredientes orgánicos", 2990, 100));

            
            Cliente cliente1 = clienteRepo.save(new Cliente("Carlos Pérez", "carlos.perez@gmail.com", "12.345.678-9"));
            Cliente cliente2 = clienteRepo.save(new Cliente("María Soto", "maria.soto@gmail.com", "98.765.432-1"));

            ventaRepo.save(new Venta(cliente1.getId(), LocalDate.now(), 5990));
            ventaRepo.save(new Venta(cliente2.getId(), LocalDate.now(), 7980));

            pedidoRepo.save(new Pedido(cliente1.getId(), "Shampoo Orgánico", 2, "En preparación"));
            pedidoRepo.save(new Pedido(cliente2.getId(), "Cepillo de Bambú", 1, "Despachado"));


            Pedido pedido1 = pedidoRepo.save(new Pedido(cliente1.getId(), "Shampoo Orgánico", 2, "En preparación"));
            Pedido pedido2 = pedidoRepo.save(new Pedido(cliente2.getId(), "Cepillo de Bambú", 1, "Despachado"));

            logisticaRepo.save(new Logistica(pedido1.getId(), "Pedido #1", "Santiago", "En tránsito"));
            logisticaRepo.save(new Logistica(pedido2.getId(), "Pedido #2", "Valparaíso", "Entregado"));

            notificacionRepo.save(new Notificacion("carlos.perez@gmail.com", "Su pedido ha sido enviado"));
            notificacionRepo.save(new Notificacion("maria.soto@gmail.com", "Su pedido ha sido entregado"));

        };
    }
}
