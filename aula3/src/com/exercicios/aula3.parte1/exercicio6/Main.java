package com.exercicios.aula3.parte1.exercicio6;


import com.exercicios.aula3.parte1.exercicio4.Compra;
import com.exercicios.aula3.parte1.exercicio5.Impressao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

//Crie um programa Java que represente um sistema de reservas de passagens de avião.
// O programa deve permitir que os usuários reservem passagens, cancelem reservas e exibam a lista de reservas.
// Use uma LinkedList para representar as reservas de passagens.
// Reserva deve ser uma classe do seu código com os atributos:
// nome, local, cpf de quem reservou, data de entrada e data de saída, e métodos que você julgue necessários.
public class Main {
    public static void main(String[] args) {
        LinkedList<Reserva> reservas = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Reservar passagem");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir lista de reservas");
            System.out.println("4. Sair");

            int opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    s.nextLine();

                    System.out.print("Nome: ");
                    String nome = s.nextLine();

                    System.out.print("Local da reserva: ");
                    String local = s.nextLine();

                    System.out.print("CPF: ");
                    String cpf = s.nextLine();

                    System.out.println("Digite a data de entrada (dd/MM/yyyy):");
                    String dataEnt = s.nextLine();

                    System.out.println("Digite a data de saída (dd/MM/yyyy):");
                    String dataSai = s.nextLine();

                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dataEntrada = LocalDate.parse(dataEnt, format);
                    LocalDate dataSaida = LocalDate.parse(dataSai, format);

                    Reserva r = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
                    //.offer adiciona um elemento à fila, mas, se a fila estiver cheia, ele retornará false
                    reservas.offer(r);
                    System.out.println("Reserva realizada com sucesso.");
                    break;
                case 2:
                    System.out.println("Informe o n° da reserva a ser removida:");
                    int excluir = s.nextInt();

                    if (excluir > 0 && excluir <= reservas.size()) {
                        reservas.remove(excluir - 1);
                        System.out.println("Reserva removida");
                    }else {
                        System.out.println("Reserva não removida!");
                    }

                    break;
                case 3:
                    if (reservas.isEmpty()){
                        System.out.println("Nenhuma reserva feita!!!");

                    }else {
                        System.out.println("Reservas:");
                        for (int i = 0; i < reservas.size(); i++) {
                            Reserva reserva = reservas.get(i);
                            reservas.get(i);
                            System.out.println((i + 1) + "- " + reservas.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    s.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecione uma das opções do menu!!!");
                    break;
            }
        }

    }
        
}

