package com.exercicios.aula2.exercicio5;

import java.time.LocalTime;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();

        cp.setNome("Raul Rotilli Aguirre");
        cp.setCpf("000.000.000-00");
        cp.setEndereco("Rua: Dos Bobos | N°: 0 | Bairro: Dos Loucos ");
        cp.setHorarioAtual(LocalTime.now());
        cp.deposita(10000);
        cp.verificarInformacoes();
        System.out.println("O total de tributos é: "+ cp.calculaTributos());

        ContaCorrente cc = new ContaCorrente();

        cc.setNome("Tonico Rotilli Aguirre");
        cc.setCpf("111.111.111-11");
        cc.setEndereco("Rua: Dos Loucos | N°: 777 | Bairro: Dos Bobos ");
        cc.setHorarioAtual(LocalTime.now());
        cc.deposita(25000);
        cc.verificarInformacoes();
        System.out.println("O total de tributos é: "+ cc.calculaTributos());

        ContaCorrente cc2 = new ContaCorrente();

        cc2.setNome("Fulano Rotilli Aguirre");
        cc2.setCpf("222.222.222-22");
        cc2.setEndereco("Rua: Dos Tolos | N°: 666 | Bairro: Dos Tontos ");
        cc2.setHorarioAtual(LocalTime.now());
        cc2.deposita(100);
        cc2.verificarInformacoes();
        System.out.println("O total de tributos é: "+ cc2.calculaTributos());

        GerenciadorImpostoRenda g = new GerenciadorImpostoRenda();

        g.adicionar(cc);
        g.adicionar(cc2);

        System.out.println("O total de tributos é: "+ g.getTotalTributos());
    }
}
