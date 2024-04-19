package com.example.jpa.enmedable;

import jakarta.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class TarjetaCredito {
    private String numero;
    private LocalDate caducidad;
    private int cvv;
}
