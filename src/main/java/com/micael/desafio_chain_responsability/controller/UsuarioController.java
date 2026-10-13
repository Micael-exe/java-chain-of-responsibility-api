package com.micael.desafio_chain_responsability.controller;

import com.micael.desafio_chain_responsability.dto.UsuarioDto;
import com.micael.desafio_chain_responsability.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> criarUsuario(@RequestBody UsuarioDto usuarioDto) {
        try {
            usuarioService.cadastrarUsuario(usuarioDto);
            return ResponseEntity.ok("Usuário criado com sucesso!");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}