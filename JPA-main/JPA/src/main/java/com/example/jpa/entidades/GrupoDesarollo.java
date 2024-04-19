package com.example.jpa.entidades;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "grupo_desarollo")
public class GrupoDesarollo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String nombreGrupo;

    @ManyToMany(mappedBy = "gruposDesarrollo")
    private List<Empleado> empleados;


    public GrupoDesarollo() {

    }



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
