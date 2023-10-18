package com.exercicios.aula3.parte1;

import java.util.Scanner;

//Crie um programa Java que peça ao usuário para inserir 5 números inteiros e armazene-os em um array. Em seguida,
// calcule e exiba a soma e a média dos números inseridos.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[5];
        double soma = 0;
        double media;

        System.out.println("Digite 5 números inteiros:");
        numeros[0] = s.nextInt();
        numeros[1] = s.nextInt();
        numeros[2] = s.nextInt();
        numeros[3] = s.nextInt();
        numeros[4] = s.nextInt();

        for (int i=0; i < 5; i++){
            soma += numeros[i];
        }
        media = soma / numeros.length;
        System.out.println("A soma das notas é:" + soma);
        System.out.println("A média das notas é:" + media);
    }
}
