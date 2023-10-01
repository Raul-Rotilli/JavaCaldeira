package com.exercicios.aula1;

import java.util.Scanner;

//Crie um programa que leia seu nome e imprima na tela.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o seu nome?");

        String nome = s.nextLine();

        System.out.println("Você registrou seu nome como " + nome);


    }
}
