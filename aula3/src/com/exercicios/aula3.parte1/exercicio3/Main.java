package com.exercicios.aula3.parte1.exercicio3;
//Crie um programa Java que permita ao usuário criar uma lista de tarefas.
// O programa deve permitir adicionar tarefas à lista, remover tarefas e exibir todas as tarefas na lista.
// Use um ArrayList para armazenar as tarefas. Tarefa deve ser uma classe do seu código com os atributos:
// titulo, data e descrição e métodos que você julgue necessários.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tarefa, data, descricao;
        int opcao;
        boolean b = true;
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        while(b){
            System.out.println("Digite 1 para salvar uma tarefa | Digite 2 para exluir uma tarefa| Digite 3 para exibir todas sua tarefas | Digite 4 para sair |\n");
            System.out.print("--");
            opcao = s.nextInt();
            if (opcao > 0) {
                switch(opcao){
                    case 1:
                        s.nextLine();
                        System.out.println("Digite sua tarefa: ");
                        tarefa = s.nextLine();

                        System.out.println("Digite a data da sua tarefa: ");
                        data = s.nextLine();

                        System.out.println("Digite a descrição da sua tarefa: ");
                        descricao = s.nextLine();

                        Tarefa t = new Tarefa(tarefa, data, descricao);
                        listaTarefas.add(t);
                        System.out.println("Tarefa salva!!");
                        break;

                    case 2:
                        System.out.println("Digite o número da tarefa a ser excluída:");
                        int excluir = s.nextInt();

                        if(excluir > 0 && excluir <= listaTarefas.size()){
                            listaTarefas.remove(excluir - 1);
                            System.out.println("Tarefa excluida com sucesso!");
                        } else {
                            System.out.println("Tarefa não removida!");
                        }
                        break;
                    case 3:
                        System.out.println("Lista de tarefas:");
                        for (int i = 0; i < listaTarefas.size(); i++) {
                            Tarefa ts = listaTarefas.get(i);
                            listaTarefas.get(i);

                            System.out.println((i+1) + "- Tarefa: " + ts.getTarefa() + " Data: " + ts.getData() + " Descrição: " + ts.getDescricao());
                        }
                        break;
                    case 4:
                        System.out.println("Saindo do programa.");
                        b = false;
                        s.close();
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }else{
                System.out.println("Informe um número inteiro, dentro das opções do menu");
            }

        }

    }
}

