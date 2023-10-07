package com.exercicios.aula1;

import java.util.Scanner;

//Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois,
// determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s
// e a quantidade de segundos que faltam para a meia-noite.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a hora:");
        int hora = s.nextInt();
        System.out.println("Informe o minuto:");
        int minuto = s.nextInt();
        System.out.println("Informe os segundos:");
        int segundo = s.nextInt();

        int segundosTotais = (hora * 3600) + (minuto * 60) + segundo;
        System.out.println("Segundos que passaram desde a 00:00:00 são: " + segundosTotais);

        int segundosFaltantes = 86400 - segundosTotais;
        System.out.println("Segundos que faltam até a 00:00:00 são: " + segundosFaltantes);

        s.close();
    }
}