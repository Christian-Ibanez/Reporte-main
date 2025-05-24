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

    public Reporte generarReporteVentas() {
        return generarReporte(TipoReporte.VENTAS);
    }

    public Reporte generarReporteInventario() {
        return generarReporte(TipoReporte.INVENTARIO);
    }

    public Reporte generarReporteEntrega() {
        return generarReporte(TipoReporte.ENTREGA);
    }


    public List<Reporte> obtenerPorTipo(TipoReporte tipo) {
        return reporteRepository.findByTipoReporte(tipo);
    }

    private Reporte generarReporte(TipoReporte tipo) {
        Reporte reporte = new Reporte();
        reporte.setTipoReporte(tipo);
        reporte.setFechaReporte(LocalDateTime.now());
        return reporteRepository.save(reporte);
    }
    


}
    

