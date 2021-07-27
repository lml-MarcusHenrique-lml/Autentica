package com.comandossimples;

public class Funcionario extends Empresa implements Usuario {


    private int Matricula;

    public Funcionario(int matricula) {
        Matricula =
                matricula;
    }

    public Funcionario() {

    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula =
                matricula;
    }
    @Override
    public String getCodigo() {
        return null;
    }
}
