package com.example.jpa;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class LineaNomina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String concepto;
    private BigDecimal cantidad;

    // Relaciones
    @ManyToOne
    private Nomina nomina;

    // Otros campos y relaciones
}
