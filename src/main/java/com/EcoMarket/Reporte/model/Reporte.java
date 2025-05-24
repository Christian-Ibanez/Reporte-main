package com.EcoMarket.Reporte.model;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    private int idReporte;
    
    @Enumerated(EnumType.STRING)
    private TipoReporte tipoReporte; // VENTAS, INVENTARIO, ENTREGA

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "America/Santiago")
    private LocalDateTime fechaReporte;


    public void generarReporteVentas() {
        if (this.tipoReporte == TipoReporte.VENTAS) {
            System.out.println("Reporte de " + tipoReporte + " creado el " + fechaReporte);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo VENTA");
        }
    }

    public void generarReporteInventario() {
        if (this.tipoReporte == TipoReporte.INVENTARIO) {
            System.out.println("Reporte de " + tipoReporte + " creado el " + fechaReporte);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo INVENTARIO");
        }
    }

    public void generarReporteEntrega() {
        if (this.tipoReporte == TipoReporte.ENTREGA) {
            System.out.println("Reporte de " + tipoReporte + " creado el " + fechaReporte);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo ENTREGA");
        }
    }
    
}   
