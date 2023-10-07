package com.exercicios.aula1;

import java.util.Scanner;

//Exercício Bonus: Escreva um programa que receba uma string do usuário e imprima ela ao contrário
// Manipulação de Strings
public class ExercicioBonus {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String palavra;
        System.out.println("Escreva uma palavra:");
        palavra = s.nextLine();

        String palavraAoContrario = imprimeAoContrario(palavra);
        System.out.println("Aqui está sua palavra ao contrário: "+ palavraAoContrario);
                s.close();
    }
    public static String imprimeAoContrario (String palavra){
        StringBuilder sb = new StringBuilder();
        for (int i = palavra.length() - 1;i >= 0; i--){
            sb.append(palavra.charAt(i));
        }
        return sb.toString();
    }
}
