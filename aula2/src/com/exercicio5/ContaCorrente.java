package com.exercicios.aula2.exercicio5;

public class ContaCorrente extends Conta implements Tributavel{
    private double seguroVida = 42.0;//valor fixo do seguro de vida
    private double taxa = 0.01;//1%
    @Override
    public double calculaTributos() {

        return (getSaldo() * this.taxa) + this.seguroVida ;
    }
}
