package com.example.jpa.entidades;
import com.example.jpa.enmedable.DireccionPostal;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "becario")
public class Becario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "email")
    private String email;

    @Column(name = "periodo_servicio")
    private String periodoServicio;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Empleado mentor;

    @Embedded
    private DireccionPostal direccion;

    @Embedded
    private DireccionPostal direccionCentro;

    public Becario() {
    }

    // Getters y Setters
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPeriodoServicio() {
        return periodoServicio;
    }

    public void setPeriodoServicio(String periodoServicio) {
        this.periodoServicio = periodoServicio;
    }

    public Empleado getMentor() {
        return mentor;
    }

    public void setMentor(Empleado mentor) {
        this.mentor = mentor;
    }

}
