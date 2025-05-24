package com.EcoMarket.Reporte.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EcoMarket.Reporte.model.Reporte;
import com.EcoMarket.Reporte.service.ReporteService;


@RestController
@RequestMapping("/api/reportes")

public class ReporteController {
    
    @Autowired
    private ReporteService reporteService;

    @PostMapping
    public ResponseEntity<Reporte> crearReporte(@RequestBody Reporte reporte) {
        return ResponseEntity.ok(reporteService.guardarReporte(reporte));
    }

    @GetMapping
    public ResponseEntity<List<Reporte>> obtenerTodosReportes() {
        return ResponseEntity.ok(reporteService.obtenerTodosReportes());
    }

 
     @PostMapping("/ventas")
    public ResponseEntity<String> generarReporteVenta(@PathVariable int idRepVenta) {
        reporteService.generarReporteVentas(idRepVenta);
        return ResponseEntity.ok("Se ha generado el reporte de ventas con id: " + idRepVenta);
    }

    @PostMapping("/inventario")
    public ResponseEntity<String> generarReporteInventario(@PathVariable int idRepInventario) {
        reporteService.generarReporteInventario(idRepInventario);
        return ResponseEntity.ok("Se ha generado el reporte de inventario con id: " + idRepInventario);
    }

    @PostMapping("/entrega")
    public ResponseEntity<String> generarReporteEntrega(@PathVariable int idRepEntrega) {
        reporteService.generarReporteEntrega(idRepEntrega);
        return ResponseEntity.ok("Se ha generado el reporte de entrega con id: " + idRepEntrega);
    }
    
    
}
