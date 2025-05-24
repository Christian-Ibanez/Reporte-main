package com.EcoMarket.Reporte.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.EcoMarket.Reporte.model.Reporte;
import com.EcoMarket.Reporte.model.TipoReporte;
import com.EcoMarket.Reporte.repository.ReporteRepository;

@Service
public class ReporteService {
    @Autowired
    private ReporteRepository reporteRepository;

    public Reporte guardarReporte(Reporte reporte) {
        if(reporte.getFechaReporte() == null) {
            reporte.setFechaReporte(LocalDateTime.now());
        }
        return reporteRepository.save(reporte);
    }

    public List<Reporte> obtenerTodosReportes() {
        return reporteRepository.findAll();
    }

    public void generarReporteVentas(int idRepVenta) {
        Reporte reporte = reporteRepository.findById(idRepVenta)
                .orElseThrow(() -> new IllegalArgumentException("Reporte : " + idRepVenta + " no ha sido encontrado"));
        reporte.generarReporteVentas();
    }
    public void generarReporteInventario(int idRepInventario) {
        Reporte reporte = reporteRepository.findById(idRepInventario)
                .orElseThrow(() -> new IllegalArgumentException("Reporte : " + idRepInventario + " no ha sido encontrado"));
        reporte.generarReporteInventario();
    }
    
    public void generarReporteEntrega(int idRepEntrega) {
        Reporte reporte = reporteRepository.findById(idRepEntrega)
                .orElseThrow(() -> new IllegalArgumentException("Reporte : " + idRepEntrega + " no ha sido encontrado"));
        reporte.generarReporteInventario();
    }


}
    

