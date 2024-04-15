package com.example.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String genero;
    private String email;
    private String telefonoMovil;
    private String direccionPostal;

    // Relaciones
    @ManyToOne
    private Empleado jefeDirecto;

    @ManyToOne
    private Departamento departamento;

    @ManyToOne
    private CuentaCorporativa cuentaCorporativa;

    @OneToOne(mappedBy = "empleado")
    private UsuarioAplicacion usuarioAplicacion;


}

