package com.comandossimples;

public class AutenticadorDeUsuario {
    public boolean autentica(Usuario usuario){
        System.out.println("Autenticando usuario com o codigo; "+usuario.getCodigo());
        return false;
    }
}
