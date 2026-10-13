package com.micael.desafio_chain_responsability.service;

import com.micael.desafio_chain_responsability.chain.ValidadorCadastro;
import com.micael.desafio_chain_responsability.dto.UsuarioDto;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private List<ValidadorCadastro> validadores;

    @PostConstruct
    public void montarCorrente() {
        if (validadores != null && !validadores.isEmpty()) {
            for (int i = 0; i < validadores.size() - 1; i++) {
                validadores.get(i).proximo(validadores.get(i + 1));
            }
        }
    }

    public void cadastrarUsuario(UsuarioDto usuario) {
        if (validadores != null && !validadores.isEmpty()) {
            validadores.get(0).validar(usuario);
        }
        System.out.println("Usuário cadastrado com sucesso no banco de dados!");
    }
}