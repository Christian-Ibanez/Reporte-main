package com.EcoMarket.Reporte.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Reporte")
@NoArgsConstructor
@AllArgsConstructor

public class Reporte {
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private TipoReporte tipo;
    private LocalDate fecha;
    private String formato;

    public void generarReporteVenta() {
        if (this.tipo == TipoReporte.VENTAS) {
            System.out.println("Generando reporte de venta en formato " + formato + " para la fecha " + fecha);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo VENTA");
        }
    }
    public void generarReporteInventario() {
        if (this.tipo == TipoReporte.INVENTARIO) {
            System.out.println("Generando reporte de inventario en formato " + formato + " para la fecha " + fecha);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo INVENTARIO");
        }
    }
    
}   
