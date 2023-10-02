package com.exercicios.aula1;

import java.util.Scanner;

//Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
//i. Se for menor de 16 anos, avisar que não pode votar;
//ii. Se tiver 16 ou 17, avisar que o voto é facultativo;
//iii. Se tiver mais de 65, avisar que também é facultativo o voto;
//iv. De 18 até 65, é obrigatório votar.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = s.nextInt();

        if (idade <0){
            System.out.println("Idade inválida!");
        } else if (idade < 16) {
            System.out.println("Você não pode votar ainda!");
        } else if (idade <= 17) {
            System.out.println("Seu voto é facultativo!");
        } else if (idade <= 65) {
            System.out.println("Seu voto é obrigatório!");
        } else if (idade < 122) {
            System.out.println("Seu voto é facultativo!");
        }else {
            System.out.println("Idade inválida");
        }
    }
        
}

