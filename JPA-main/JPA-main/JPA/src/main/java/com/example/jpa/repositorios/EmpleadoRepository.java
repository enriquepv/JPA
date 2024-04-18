package com.example.jpa.repositorios;

import com.example.jpa.entidades.Departamento;
import com.example.jpa.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByDepartamento(Departamento departamento);
}
