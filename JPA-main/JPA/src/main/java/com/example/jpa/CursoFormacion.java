package com.example.jpa;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class CursoFormacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int horasDuracion;

    @ManyToMany
    @JoinTable(
            name = "cursoformacion_empleado",
            joinColumns = @JoinColumn(name = "cursoformacion_id"),
            inverseJoinColumns = @JoinColumn(name = "empleado_id")
    )
    private List<Empleado> instructores;

    @OneToMany(mappedBy = "cursoFormacion", cascade = CascadeType.ALL)
    private List<EdicionCurso> ediciones;

    // Constructor, getters y setters

    public CursoFormacion() {
        // Constructor vacío requerido por JPA
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(int horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    public List<Empleado> getInstructores() {
        return instructores;
    }

    public void setInstructores(List<Empleado> instructores) {
        this.instructores = instructores;
    }

    public List<EdicionCurso> getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(List<EdicionCurso> ediciones) {
        this.ediciones = ediciones;
    }
}

