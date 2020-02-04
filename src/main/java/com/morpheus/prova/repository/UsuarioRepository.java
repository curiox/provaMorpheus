package com.morpheus.prova.repository;

import java.util.List;

import com.morpheus.prova.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * UsuarioRepository
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM usuario WHERE nome LIKE ?1",
        nativeQuery = true,
        countQuery = "SELECT COUNT(*) FROM usuario WHERE nome LIKE ?1")
    List<Usuario> findByUsuarioName(String nome);
    
}