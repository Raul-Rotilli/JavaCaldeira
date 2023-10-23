package com.exercicios.aula3.parte1.exercicio3;

public class Tarefa {

    private String tarefa, data, descricao;

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String tarefa, String data, String descricao) {
        this.tarefa = tarefa;
        this.data = data;
        this.descricao = descricao;

    }

    public Tarefa() {
    }


}
