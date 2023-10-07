package com.exercicios.aula1;

import java.util.Scanner;

//Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o 1° número:");
        int n1 = Integer.parseInt(s.nextLine());

        System.out.println("Digite o 2° número:");
        int n2 = Integer.parseInt(s.nextLine());

        System.out.println("Digite o 3° número:");
        int n3 = Integer.parseInt(s.nextLine());
        
        if (n1 >= n2 && n1 >= n3){
            System.out.println("O maior número é: " + n1);
        }else if (n2 >= n1 && n2 >= n3){
            System.out.println("O maior número é: " + n2);
        }else{
            System.out.println("O maior número é: " + n3);
        }

        if (n1 <= n2 && n1 <= n3){
            System.out.println("O menor número é: " + n1);
        }else if (n2 <= n1 && n2 <= n3){
            System.out.println("O menor número é: " + n2);
        }else{
            System.out.println("O menor número é: " + n3);
        }

        double mediaAritmetica = (n1 + n2 + n3) /3;

        System.out.println("A média aritmética dos 3 números é: " + mediaAritmetica);

        s.close();
    }
}
