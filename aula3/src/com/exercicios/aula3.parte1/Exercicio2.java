package com.exercicios.aula3.parte1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Crie um programa Java que gere automaticamente um array de 10 números inteiros aleatórios entre 1 e 100.
// Em seguida, peça ao usuário para inserir um número e verifique se esse número está presente no array.
// Exiba uma mensagem indicando se o número foi encontrado ou não.
public class Exercicio2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    boolean verifica = false;

    int[] numerosAleatorios = new int[10];

    //randomizar os 10 números
    for (int i = 0; i < numerosAleatorios.length;i++){
        numerosAleatorios[i] = r.nextInt(100);
        System.out.println(numerosAleatorios[i]);
    }

    System.out.println("Digite o número para verificar se ele está no Array de números:");
    int numero = s.nextInt();

    //verificar o número informado pelo usuário
    for (int i = 0; i < numerosAleatorios.length;i++){
        if (numerosAleatorios[i] == numero){
            verifica = true;
        }
    }
    if (verifica == true) {
        System.out.println("O número " + numero + " está no Array de números!!!");
    }else {
        System.out.println("O número " + numero + " não está no Array de números!!!");
    }

    System.out.println("Array completo: " + Arrays.toString(numerosAleatorios));;
    s.close();
    }
}
