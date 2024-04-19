package com.example.jpa.repositorios;

import com.example.jpa.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioAplicacionRepository extends JpaRepository<Usuario, UUID> {
}
