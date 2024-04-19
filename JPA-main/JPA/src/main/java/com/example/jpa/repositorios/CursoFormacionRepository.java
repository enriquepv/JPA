package com.example.jpa.repositorios;

import com.example.jpa.entidades.CursoFormacion;
import com.example.jpa.entidades.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CursoFormacionRepository extends JpaRepository<CursoFormacion, UUID> {


}