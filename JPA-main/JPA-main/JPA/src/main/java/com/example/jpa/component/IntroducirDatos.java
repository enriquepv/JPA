package com.example.jpa.component;

import com.example.jpa.enmedable.DireccionPostal;
import com.example.jpa.entidades.Departamento;
import com.example.jpa.entidades.Empleado;
import com.example.jpa.entidades.Proyecto;
import com.example.jpa.repositorios.DepartamentoRepository;
import com.example.jpa.repositorios.EmpleadoRepository;
import com.example.jpa.repositorios.ProyectoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

@Component
public class IntroducirDatos {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private ProyectoRepository proyectoRepository;

    @PostConstruct
    @Transactional
    public void insertarDatosDePrueba() {

        // Crear y guardar un departamento
        Departamento departamento = new Departamento();
        departamento.setNombre("Departamento de Desarrollo");
        departamento.setCodigo("DEV");
        departamento.setLocalidad("Madrid");
        departamento.setPresupuestoAnual(new BigDecimal("1000000.00"));

        departamentoRepository.save(departamento);

        // Crear y guardar un empleado
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        empleado.setApellidos("Pérez");
        empleado.setFechaNacimiento(new Date());
        empleado.setGenero("Masculino");

        empleadoRepository.save(empleado);

        // Asignar el empleado al departamento
        empleado.setDepartamento(departamento);
        empleadoRepository.save(empleado);

        // Crear y guardar un proyecto
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Sistema de Gestión de Empleados");
        proyecto.setPeriodoInicio(new Date());
        proyecto.setPeriodoFin(new Date());

        proyecto.setEmpleados(Arrays.asList(empleado)); // Asignar empleados al proyecto
        proyectoRepository.save(proyecto);
    }
}
