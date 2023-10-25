package com.exercicios.aula3.parte1.exercicio6;

import java.time.LocalDate;
import java.util.Calendar;

public class Reserva {
    String nome, local, cpf;
    LocalDate dataEntrada, dataSaida;

    public Reserva(String nome, String local, String cpf, LocalDate dataEntrada, LocalDate dataSaida){
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;

    }

    @Override
    public String toString() {
        return "Nome " + this.nome + ", Local da reserva: " + this.local + ", CPF: " + this.cpf + ", Data de entrada:" + this.dataEntrada + ", Data de saída:" + this.dataSaida;
    }
}
