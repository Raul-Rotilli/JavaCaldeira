package com.exercicios.aula1;

import java.util.Scanner;

//Criar para uma empresa de consórcio.
// No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário.
// A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = s.nextInt();

        System.out.println("Informe seu salário:");
        double salario = s.nextDouble();

        if (salario >= 2000 && idade >= 18){
            System.out.println("Você pode comprar o automóvel com a nossa empresa!");
        }else {
            System.out.println("Sinto muito, mas você não pode comprar um automóvel conosco!");
        }
        s.close();
    }
}
