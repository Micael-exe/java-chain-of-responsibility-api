package com.micael.desafio_chain_responsability.chain;

import com.micael.desafio_chain_responsability.dto.UsuarioDto;
import org.springframework.stereotype.Component;

@Component
public class ValidadorCamposObrigatorios extends ValidadorCadastro {
    @Override
    public void validar(UsuarioDto usuario) {
        if (usuario.getNome() == null || usuario.getNome().isBlank() ||
            usuario.getEmail() == null || usuario.getEmail().isBlank() ||
            usuario.getSenha() == null || usuario.getSenha().isBlank()) {
            throw new IllegalArgumentException("Erro: Todos os campos são obrigatórios.");
        }
        executarProximo(usuario);
    }
}