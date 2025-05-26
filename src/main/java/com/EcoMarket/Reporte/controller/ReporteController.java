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

    @PostMapping("/crear")
    public ResponseEntity<Reporte> createReporte(@RequestBody Reporte reporte){
        Reporte savedReporte = reporteService.create(reporte);
        return ResponseEntity.ok(savedReporte);
    }

    @GetMapping("/mostrar")
    public ResponseEntity<List<Reporte>> getAllReportes() {
        return ResponseEntity.ok(reporteService.readAllReportes());
    }

    @PostMapping("/reporteVenta/{id}")	
    public Reporte generarReporteVenta(@PathVariable int id) {
         return reporteService.generarReporteVenta(id);
        
    }

    @PostMapping("/reporteInventario/{id}")
    public Reporte generarReporteInventario(@PathVariable int id) {
         return reporteService.generarReporteInventario(id);
        
    }
    
    
}
