package com.micael.desafio_chain_responsability.chain;

import com.micael.desafio_chain_responsability.dto.UsuarioDto;
import org.springframework.stereotype.Component;

@Component
public class ValidadorSenhaForte extends ValidadorCadastro {
    @Override
    public void validar(UsuarioDto usuario) {
        if (usuario.getSenha().length() < 6) {
            throw new IllegalArgumentException("Erro: A senha deve ter pelo menos 6 caracteres.");
        }
        executarProximo(usuario);
    }
}