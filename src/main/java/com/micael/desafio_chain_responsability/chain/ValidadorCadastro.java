package com.micael.desafio_chain_responsability.chain;

import com.micael.desafio_chain_responsability.dto.UsuarioDto;

public abstract class ValidadorCadastro {
    protected ValidadorCadastro proximo;

    public ValidadorCadastro proximo(ValidadorCadastro proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void validar(UsuarioDto usuario);

    protected void executarProximo(UsuarioDto usuario) {
        if (this.proximo != null) {
            this.proximo.validar(usuario);
        }
    }
}