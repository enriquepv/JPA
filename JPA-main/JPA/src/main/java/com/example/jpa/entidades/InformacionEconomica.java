package com.example.jpa.entidades;

import com.example.jpa.enmedable.TarjetaCredito;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class InformacionEconomica {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id_InformacionEconomica;

    private double salario;
    private double comision;

    @Embedded
    private TarjetaCredito tarjeta;

    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public Long getId() {
        return id_InformacionEconomica;
    }

    public void setId(Long id) {
        this.id_InformacionEconomica = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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