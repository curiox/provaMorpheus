package com.morpheus.prova.controller;

import java.net.URISyntaxException;
import java.util.List;

import com.morpheus.prova.model.Usuario;
import com.morpheus.prova.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsuarioController
 */
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuario;

    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<List<Usuario>> list() {
        return ResponseEntity.ok(usuario.findAll());
    }

    @PostMapping(value = "", produces = "application/json")
    public ResponseEntity<Usuario> create(@RequestBody Usuario usr) throws URISyntaxException {
        Usuario newUsr = usuario.saveAndFlush(usr);
        return ResponseEntity.ok(newUsr);
    }

    @PostMapping(value = "/name", produces = "application/json")
    public ResponseEntity<List<Usuario>> getByName(@RequestBody String name) throws URISyntaxException {
      if (name.length() < 1) return list();
      else return ResponseEntity.ok(usuario.findByUsuarioName("%" + name + "%"));
    }
    
}