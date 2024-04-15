package com.example.jpa;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String codigo;
    private String localidad;
    private BigDecimal presupuestoAnual;

    // Relaciones
    @ManyToOne
    private Empleado jefe;

    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;

}
