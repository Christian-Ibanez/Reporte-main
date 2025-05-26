package com.EcoMarket.Reporte.service;

import java.util.List;

import com.EcoMarket.Reporte.model.Reporte;


public interface ReporteService {
    List<Reporte> readAllReportes();
    Reporte create(Reporte newReporte);
    Reporte generarReporteVenta(int id);
    Reporte generarReporteInventario(int id);
}
    

