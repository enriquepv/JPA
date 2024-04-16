package com.example.jpa;


import jakarta.persistence.*;

import java.util.List;


import java.util.List;

@Entity
public class GrupoDesarollo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreGrupo;

    @ManyToMany(mappedBy = "gruposDesarrollo")
    private List<Empleado> empleados;

    // Constructor, getters y setters

    public GrupoDesarollo() {
        // Constructor vacío requerido por JPA
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
