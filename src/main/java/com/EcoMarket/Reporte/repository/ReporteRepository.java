package com.EcoMarket.Reporte.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.EcoMarket.Reporte.model.Reporte;
import com.EcoMarket.Reporte.model.TipoReporte;

@Repository
public class ReporteRepository {
   List<Reporte> Reporte = new ArrayList<>();    

    public Reporte create(Reporte newReporte) {
          Reporte.add(newReporte);
          return newReporte;
    }
    
    public List<Reporte> readAllReportes() {
          return Reporte;
    }
    
    public Reporte generarReporteVenta(int id) {
        for (Reporte reporte : Reporte) {
            if (reporte.getId() == id && reporte.getTipo() == TipoReporte.VENTAS) {
                System.out.println("Generando reporte de venta en formato " + reporte.getFormato() + " con fecha " + reporte.getFecha());
                return reporte;
            }
        }
        throw new IllegalStateException("No se encontró un reporte de venta con el ID proporcionado");
    }
    
    public Reporte generarReporteInventario(int id) {
        for (Reporte reporte : Reporte) {
            if (reporte.getId() == id && reporte.getTipo() == TipoReporte.INVENTARIO) {
                System.out.println("Generando reporte de inventario en formato " + reporte.getFormato() + " con fecha " + reporte.getFecha());
                return reporte;
            }
        }
        throw new IllegalStateException("No se encontró un reporte de inventario con el ID proporcionado");
    }

    public Reporte generarReporteEntrega(int id) {
        for (Reporte reporte : Reporte) {
            if (reporte.getId() == id && reporte.getTipo() == TipoReporte.ENTREGA) {
                System.out.println("Generando reporte de entrega en formato " + reporte.getFormato() + " con fecha " + reporte.getFecha());
                return reporte;
            }
        }
        throw new IllegalStateException("No se encontró un reporte de entrega con el ID proporcionado");
     }
}
