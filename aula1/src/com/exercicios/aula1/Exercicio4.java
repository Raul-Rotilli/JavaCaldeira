package com.exercicios.aula1;
//Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
// assuma que o salário mínimo é R$1.320.

import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

        double salMinimo = 1320.00 ;

        System.out.println("Digite o seu sálario: ");
        double salUsuario = s.nextDouble();

        double quantidadeSalariosMinimos = salUsuario / salMinimo;

        if (salUsuario < salMinimo){
            System.out.println("Seu salário de " + df.format(salUsuario) + " está abaixo do salário mínimo de " + salMinimo + " do Brasil na data de 01/10/2023.");
        }else {
            System.out.println("Seu salário de " + df.format(salUsuario) + " equivale a " + df.format(Math.floor(quantidadeSalariosMinimos)) + " salários mínimos no Brasil em 01/10/2023.");
        }
        s.close();
    }


}

