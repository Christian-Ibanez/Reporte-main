package com.EcoMarket.Reporte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EcoMarket.Reporte.model.Reporte;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Integer> {
    
    
}
