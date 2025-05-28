package com.EcoMarket.Reporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EcoMarket.Reporte.model.Reporte;
import com.EcoMarket.Reporte.repository.ReporteRepository;

@Service
public class ReporteService {

    @Autowired
    ReporteRepository reporteRepository;

    // Crear un nuevo reporte Inventario
    public Reporte crearReporteInventario(Reporte newReport){
        newReport.setFormato(newReport.getFormato());
        newReport.setTipo(newReport.getTipo());
        newReport.setFecha(newReport.getFecha());

        return reporteRepository.save(newReport);
    }

    //Crear un nuevo reporte Entrega
    public Reporte crearReporteEntrega(Reporte newReport){
        newReport.setFormato(newReport.getFormato());
        newReport.setTipo(newReport.getTipo());
        newReport.setFecha(newReport.getFecha());

        return reporteRepository.save(newReport);
    }

    //Crear un nuevo reporte Venta
    public Reporte crearReporteVenta(Reporte newReport){
        newReport.setFormato(newReport.getFormato());
        newReport.setTipo(newReport.getTipo());
        newReport.setFecha(newReport.getFecha());

        return reporteRepository.save(newReport);
    }

    //Mostrar todos los reportes
    public List<Reporte> pedirReportes(){
        return reporteRepository.findAll();
    }

    //Mostrar un reporte por ID
    public Optional<Reporte> mostrarxID(int id) {
        return reporteRepository.findById(id);  
    }

    //Eliminar un reporte por ID
    public void eliminarReporte(int id) {
        reporteRepository.deleteById(id);
    }

}
    

