package com.exercicios.aula2.exercicio5;

public class GerenciadorImpostoRenda {
    private double totalTributos;

    public void adicionar(ContaCorrente t) {
        this.totalTributos += t.calculaTributos();
    }

    public double getTotalTributos() {
        return this.totalTributos;
    }
}
