package com.example.jpa.repositorios;

import com.example.jpa.entidades.Becario;
import com.example.jpa.entidades.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BecarioRepository extends JpaRepository<Becario, Long> {


}