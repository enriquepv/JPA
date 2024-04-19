package com.example.jpa.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class EdicionCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "curso_formacion_id")
    private CursoFormacion cursoFormacion;

    private Date fechaInicio;
    private Date fechaFin;

    @ManyToOne
    @JoinColumn(name = "ponente_id")
    private Empleado ponente;

    @ManyToMany
    @JoinTable(
            name = "asistencia_edicion",
            joinColumns = @JoinColumn(name = "edicion_curso_id"),
            inverseJoinColumns = @JoinColumn(name = "empleado_id")
    )
    private List<Empleado> asistentes;



    public EdicionCurso() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CursoFormacion getCursoFormacion() {
        return cursoFormacion;
    }

    public void setCursoFormacion(CursoFormacion cursoFormacion) {
        this.cursoFormacion = cursoFormacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Empleado getPonente() {
        return ponente;
    }

    public void setPonente(Empleado ponente) {
        this.ponente = ponente;
    }

    public List<Empleado> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Empleado> asistentes) {
        this.asistentes = asistentes;
    }
}
