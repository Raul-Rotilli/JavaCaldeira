package com.exercicios.aula1;

import java.util.Scanner;

//Criar um algoritmo para definir as filas prioritárias.
// Seu programa deve exibir um menu de opções, perguntando se a pessoa é
// Gestante, Idosa, PCD ou Nenhuma das alternativas. Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária.
// Se não, não tem direito.
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("|||||OPÇÕES DE FILA||||||");
        System.out.println("Digite o número que corresponde a sua escolha:");
        System.out.println("1- GESTANTE");
        System.out.println("2- Idoso(a)");
        System.out.println("3- PCD");
        System.out.println("4- Nenhuma das alternativas");

        int opcao = s.nextInt();

        switch (opcao){
            case 1: {
                System.out.println("Você optou por GESTANTE e tem direito a fila prioritária!");
                break;
            }
            case 2:{
                System.out.println("Você optou por IDOSO(A) e tem direito a fila prioritária!");
                break;
            }
            case 3:{
                System.out.println("Você optou por PCD e tem direito a fila prioritária!");
                break;
            }
            case 4:{
                System.out.println("Você não tem direito a fila prioritária!");
                break;
            }
            default:
                System.out.println("Opção inválida!");
                break;
        }
        s.close();

    }
}
