package com.example.jpa.repositorios;

import com.example.jpa.entidades.CursoFormacion;
import com.example.jpa.entidades.Departamento;
import com.example.jpa.entidades.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {


}