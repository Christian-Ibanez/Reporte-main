package com.EcoMarket.Reporte.model;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Reporte")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Cambiado a Integer para permitir null

    @Enumerated(EnumType.STRING)
    private TipoReporte tipo;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private TipoFormato formato;

    public void generarReporteVenta() {
        if (this.tipo == TipoReporte.VENTAS) {
            System.out.println("Generando reporte de venta en formato " + formato + " con fecha " + fecha);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo VENTA");
        }
    }
    public void generarReporteInventario() {
        if (this.tipo == TipoReporte.INVENTARIO) {
            System.out.println("Generando reporte de inventario en formato " + formato + " con fecha " + fecha);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo INVENTARIO");
        }
    }
    
    public void generarReporteEntrega() {
        if (this.tipo == TipoReporte.ENTREGA) {
            System.out.println("Generando reporte de entrega en formato " + formato + " con fecha " + fecha);
        } else {
            throw new IllegalStateException("Este reporte no es de tipo ENTREGA");
        }
    }
}   
