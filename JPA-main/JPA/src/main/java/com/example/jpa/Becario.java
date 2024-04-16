package com.example.jpa;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Becario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Genero genero;

    private String direccionPersonal;
    private String nombreCentroEstudios;
    private String direccionCentroEstudios;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Empleado mentor;

    // Constructor, getters y setters

    public Becario() {
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public String getDireccionPersonal() {
        return direccionPersonal;
    }

    public void setDireccionPersonal(String direccionPersonal) {
        this.direccionPersonal = direccionPersonal;
    }

    public String getNombreCentroEstudios() {
        return nombreCentroEstudios;
    }

    public void setNombreCentroEstudios(String nombreCentroEstudios) {
        this.nombreCentroEstudios = nombreCentroEstudios;
    }

    public String getDireccionCentroEstudios() {
        return direccionCentroEstudios;
    }

    public void setDireccionCentroEstudios(String direccionCentroEstudios) {
        this.direccionCentroEstudios = direccionCentroEstudios;
    }

    public Empleado getMentor() {
        return mentor;
    }

    public void setMentor(Empleado mentor) {
        this.mentor = mentor;
    }

    // Enumeración para género
    public enum Genero {
        MASCULINO,
        FEMENINO,
        OTRO
    }
}
