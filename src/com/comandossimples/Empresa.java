package com.comandossimples;

public class Empresa extends Cliente implements Usuario {


    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) { this.cnpj = cnpj;}

    @Override
    public String getCodigo() {
        return getCnpj();
    }
}
