package com.exercicios.aula1;

import java.util.Scanner;

//Crie um programa que receba 2 números e imprima na tela.
public class Exercicio2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");

         int n1 = Integer.parseInt(s.nextLine());

        System.out.println("Digite o segundo número:");

        int n2 = Integer.parseInt(s.nextLine());

        System.out.println("O primeiro número digitado foi "+ n1 + " e o segundo número foi " + n2);

        s.close();
    }
}
