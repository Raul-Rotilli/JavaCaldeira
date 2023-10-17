package com.exercicios.aula2.exercicio5;

import java.time.LocalTime;

public class ContaPoupanca extends Conta implements Tributavel{


    @Override
    public double calculaTributos() {
        return 0;
    }
}
