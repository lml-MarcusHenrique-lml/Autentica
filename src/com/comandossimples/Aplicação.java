package com.comandossimples;

public class Aplicação {

    public static void main(String[] args) {
	// write your code here
        AutenticadorDeUsuario autenticadorDeUsuario = new AutenticadorDeUsuario();
        autenticadorDeUsuario.autentica(new Gerente());
        Gerente gerente = new Gerente();
        gerente.setMatricula(123456);

        autenticadorDeUsuario.autentica(gerente);





        Empresa empresa = new Empresa();
        empresa.setCnpj("14121322");

        autenticadorDeUsuario.autentica(empresa);
    }
}
