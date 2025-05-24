package com.EcoMarket.Reporte.model;

public enum TipoReporte {
    VENTAS("Reporte de Ventas"),
    INVENTARIO("Reporte de Inventario"),
    ENTREGA("Reporte de Entrega");

    private String descripcion;

    TipoReporte(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }


}
