package com.comandossimples;

public class Gerente extends Funcionario implements Usuario{


    private int tempoGerencia;

    public Gerente(int matricula) {
        super(matricula);
    }

    public Gerente() {
        super();
    }


    public int getTempoGerencia() {
        return tempoGerencia;
    }
    public void setTempoGerencia( int tempoGerencia){
        this.tempoGerencia = tempoGerencia;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(getMatricula());
    }

}
