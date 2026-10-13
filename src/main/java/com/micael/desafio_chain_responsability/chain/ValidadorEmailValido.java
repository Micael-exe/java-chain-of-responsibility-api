package com.micael.desafio_chain_responsability.chain;

import com.micael.desafio_chain_responsability.dto.UsuarioDto;
import org.springframework.stereotype.Component;

@Component
public class ValidadorEmailValido extends ValidadorCadastro {
    @Override
    public void validar(UsuarioDto usuario) {
        if (!usuario.getEmail().contains("@") || !usuario.getEmail().contains(".")) {
            throw new IllegalArgumentException("Erro: O formato do e-mail é inválido.");
        }
        executarProximo(usuario);
    }
}