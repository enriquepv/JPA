package com.example.jpa;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CursoFormacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int horasDuracion;

    // Relaciones
    @ManyToMany
    private List<Empleado> empleadosCualificados;

    @OneToMany(mappedBy = "cursoFormacion")
    private List<EdicionCurso> ediciones;

    // Otros campos y relaciones
}
