package com.EcoMarket.Reporte.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

 
    @GetMapping("/ventas")
    public ResponseEntity<Reporte> generarReporteVentas() {
        return ResponseEntity.ok(reporteService.generarReporteVentas());
    }

    @GetMapping("/inventario")
    public ResponseEntity<Reporte> generarReporteInventario() {
        return ResponseEntity.ok(reporteService.generarReporteInventario());
    }

    @GetMapping("/entrega")
    public ResponseEntity<Reporte> generarReporteEntrega() {
        return ResponseEntity.ok(reporteService.generarReporteEntrega());
    }
    
    
}
