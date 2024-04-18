package com.example.jpa.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Nomina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int mes;
    private int ano;
    private BigDecimal liquido;


    @ManyToOne
    private Empleado empleado;

    @OneToMany(mappedBy = "nomina")
    private List<LineaNomina> lineasNomina;

}
