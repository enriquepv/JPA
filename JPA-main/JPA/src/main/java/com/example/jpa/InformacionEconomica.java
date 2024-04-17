package com.example.jpa;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class InformacionEconomica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double salario;
    private double comision;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<TarjetaCredito> tarjetasCredito;

    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<TarjetaCredito> getTarjetasCredito() {
        return tarjetasCredito;
    }

    public void setTarjetasCredito(List<TarjetaCredito> tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}