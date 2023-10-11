package com.exercicios.aula2.exercicio1;

import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {
      
        Conta c = new Conta("Raul", "62261256043", "Rua: São Carlos | N°: 989 | Bairro: Cidade Baixa", LocalTime.now(), 333);

        c.deposita(100);
        c.deposita(120);
        c.deposita(1000);
        c.deposita(1030);
        c.alterarEndereco("Rua: São Carlos | N°: 989 | Bairro: Floresta");
        System.out.println(c.getEndereco());
        c.verificarHorario();
        c.verificarInformacoes();
        c.imprimeCpf();
        System.out.println("CPF VALIDADO: "+ c.validaCpf());
        c.historicoTransacoes();
        


}

    
}