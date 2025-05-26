package com.EcoMarket.Reporte.service;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.EcoMarket.Reporte.model.Reporte;
import com.EcoMarket.Reporte.repository.ReporteRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
@SpringBootApplication
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    public Reporte create(Reporte newReporte) {
        return reporteRepository.create(newReporte);
    }

    public List<Reporte> readAllReportes() {
        return reporteRepository.readAllReportes();
    }
    @Override
    public Reporte generarReporteVenta(int id) {
        return reporteRepository.generarReporteVenta(id);
    }

    public Reporte generarReporteInventario(int id) {
        return reporteRepository.generarReporteInventario(id);
    }
    
}
