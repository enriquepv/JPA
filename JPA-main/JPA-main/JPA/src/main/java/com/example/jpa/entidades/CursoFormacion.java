package com.example.jpa.entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "curso_formacion")
public class CursoFormacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "duracion_horas")
    private int duracionHoras;

    @OneToMany(mappedBy = "cursoFormacion", cascade = CascadeType.ALL)
    private List<EdicionCurso> ediciones;

    @ManyToMany
    @JoinTable(
            name = "curso_aprobado_por_empleado",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "empleado_id")
    )
    private Set<Empleado> empleadosQueAprobaron;
}
