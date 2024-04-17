package com.example.jpa;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class TarjetaCredito {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String cvv;
    private String fechaCaducidad;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    // Constructor, getters y setters

    public TarjetaCredito() {
        // Constructor vacío requerido por JPA
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        // Validación de fecha de caducidad
        LocalDate fechaCaducidadParsed = LocalDate.parse(fechaCaducidad);
        if (fechaCaducidadParsed.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de caducidad no puede estar en el pasado");
        }
        this.fechaCaducidad = fechaCaducidad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
    public boolean validarNumeroTarjeta() {
        String cardNumber = this.numero.replaceAll("\\s+", ""); // Eliminar espacios en blanco
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int num = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                num *= 2;
                if (num > 9) {
                    num = (num % 10) + 1;
                }
            }
            sum += num;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
