package com.example.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Genero genero;
    private String direccionPostal;
    private Date fechaContratacion;
    private Date fechaCese;
    private MotivoCese motivoCese;
    private double salario;
    private double comision;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "jefe_id")
    private Empleado jefeDirecto;

    @OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL)
    private Usuario usuario;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<Puesto> puestos;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<Nomina> nominas;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<TarjetaCredito> tarjetasCredito;

    @ManyToMany(mappedBy = "empleados")
    private List<Proyecto> proyectos;

    @ManyToMany
    @JoinTable(
            name = "empleado_grupo_desarrollo",
            joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "grupo_desarrollo_id")
    )
    private List<GrupoDesarollo> gruposDesarrollo;
    // Constructor, getters y setters

    public Empleado() {
        // Constructor vacío requerido por JPA
    }

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

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Date getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(Date fechaCese) {
        this.fechaCese = fechaCese;
    }

    public MotivoCese getMotivoCese() {
        return motivoCese;
    }

    public void setMotivoCese(MotivoCese motivoCese) {
        this.motivoCese = motivoCese;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getJefeDirecto() {
        return jefeDirecto;
    }

    public void setJefeDirecto(Empleado jefeDirecto) {
        this.jefeDirecto = jefeDirecto;
    }

// Otros getters y setters para los demás atributos y relaciones...

    // Enumeraciones para género y motivo de cese
    public enum Genero {
        MASCULINO,
        FEMENINO,
        OTRO
    }

    public enum MotivoCese {
        ABANDONO_EMPRESA,
        DESPIDO,
        JUBILACION,
        INCAPACIDAD_MEDICA
    }
}



