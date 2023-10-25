package com.exercicios.aula3.parte1.exercicio4;
//Crie um programa Java que simule uma lista de compras. O programa deve permitir que o usuário adicione itens à lista,
//remova itens da lista e exiba a lista de compras atual. Use um ArrayList para armazenar os itens da lista de compras.
// Compra deve ser uma classe do seu código com os atributos: nome e data de validade e métodos que você julgue necessários.


import com.exercicios.aula3.parte1.exercicio3.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {

      ArrayList<Compra> compras = new ArrayList<>();
      Scanner s = new Scanner(System.in);
      String nomeItem, dataValidade;


        while (true){
            System.out.println("--Digite 0 para fechar o programa--");
            System.out.println("--Digite 1 para adicionar itens na lista de compras--");
            System.out.println("--Digite 2 para remover itens na lista de compras--");
            System.out.println("--Digite 3 para mostrar a lista de compras--");
            int opcao = s.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    s.close();
                case 1:
                    s.nextLine();
                    System.out.println("Digite o nome do item:");
                    nomeItem = s.nextLine();
                    System.out.println("Digite a data de validade do item:");
                    dataValidade = s.nextLine();

                    compras.add(new Compra(nomeItem, dataValidade));
                    System.out.println("Item salvo!");
                    break;
                case 2:
                    System.out.println("Digite o n° do item a ser removido:");
                    int excluir = s.nextInt();

                        if (excluir > 0 && excluir <= compras.size()) {
                            compras.remove(excluir - 1);
                            System.out.println("Item removido");
                        }else {
                            System.out.println("Item não removido!");
                        }

                    break;
                case 3:
                    if (compras.isEmpty()){
                        System.out.println("Lista vazia!!!");
                    }else{
                        System.out.println("--LISTA DE COMPRAS--:");
                        for (int i = 0; i < compras.size(); i++) {
                            Compra c = compras.get(i);
                            compras.get(i);
                            System.out.println((i + 1) + "- " + compras.get(i));
                        }
                    }
                    break;
                default:
                    System.out.println("Selecione uma das opções do menu!!!");
            }

        }









    }


}

