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

    @PostMapping("/crearEntrega")
    public ResponseEntity<Reporte> crearReporteEntrega(@RequestBody Reporte reporte){
        Reporte nuevoReporte = reporteService.crearReporteEntrega(reporte);
            return ResponseEntity.ok(nuevoReporte);
    }

    @PostMapping("/crearInventario")
    public ResponseEntity<Reporte> crearReporteInventario(@RequestBody Reporte reporte){
        Reporte nuevoReporte = reporteService.crearReporteInventario(reporte);
            return ResponseEntity.ok(nuevoReporte);
    }

    @PostMapping("/crearVenta")
    public ResponseEntity<Reporte> crearReporteVenta(@RequestBody Reporte reporte){
        Reporte nuevoReporte = reporteService.crearReporteVenta(reporte);
            return ResponseEntity.ok(nuevoReporte);
    }

    @GetMapping("/mostrar")
    public ResponseEntity<List<Reporte>> mostrarReporte() {
     List<Reporte> reportes = reporteService.pedirReportes();
          return ResponseEntity.ok(reportes);
    }

     @GetMapping("/mostrar/{id}")
     public ResponseEntity<Reporte> mostrarID(@PathVariable int id) {
          return reporteService.mostrarxID(id)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
     }       
     
     @GetMapping("/eliminar/{id}")
     public ResponseEntity<Void> eliminarReporte(@PathVariable int id) {
        reporteService.eliminarReporte(id);
        return ResponseEntity.noContent().build();
    }
}
