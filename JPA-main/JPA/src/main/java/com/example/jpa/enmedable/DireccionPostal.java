package com.example.jpa.enmedable;

import jakarta.persistence.Embeddable;

@Embeddable
public class DireccionPostal {
    private String Calle;
    private int numero;
    private String piso;
    private String puerta;
    private String localidad;
    private int codigoPostal;
    private String region;
    private String pais;
}
