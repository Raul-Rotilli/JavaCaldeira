package com.exercicios.aula3.parte1.exercicio5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Crie um programa Java que simule um sistema de fila de impressão.
// O programa deve permitir que os usuários adicionem documentos à fila de impressão e, em seguida,
// imprimir documentos da fila. Use uma LinkedList para representar a fila de impressão.
// Impressão deve ser uma classe do seu código com os atributos: nome e numero de páginas e métodos que você julgue necessários.
public class Main {
    public static void main(String[] args) {
        LinkedList<Impressao> filaDeImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar documento à fila de impressão");
            System.out.println("2. Imprimir documento da fila");
            System.out.println("3. Exibir fila de impressão");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Nome do documento: ");
                    String nomeDocumento = scanner.nextLine();
                    System.out.print("Número de páginas: ");
                    int numeroPaginas = scanner.nextInt();
                    Impressao impressao = new Impressao(nomeDocumento, numeroPaginas);
                    //.offer adiciona um elemento à fila, mas, se a fila estiver cheia, ele retornará false
                    filaDeImpressao.offer(impressao);
                    System.out.println("Documento adicionado à fila de impressão.");
                    break;
                case 2:
                    if (filaDeImpressao.isEmpty()) {
                        System.out.println("A fila de impressão está vazia.");

                    } else {
                        Impressao imprimeDocumento = filaDeImpressao.poll();
                        System.out.println("Imprimindo o documento: " + imprimeDocumento);
                    }
                    break;
                case 3:
                    if (filaDeImpressao.isEmpty()){
                        System.out.println("Fila vazia!!!");

                    }else {
                        System.out.println("Fila de impressão:");
                        for (Impressao documento : filaDeImpressao) {
                            System.out.println(documento);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecione uma das opções do menu!!!");
                    break;
            }
        }
    }
}