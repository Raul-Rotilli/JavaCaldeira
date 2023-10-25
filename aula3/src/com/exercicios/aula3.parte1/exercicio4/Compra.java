package com.exercicios.aula3.parte1.exercicio4;


public class Compra {
    private String nomeItem, dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;

    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Compra(String nomeItem, String dataValidade){
        this.nomeItem = nomeItem;
        this.dataValidade = dataValidade;
    }


    public String toString() {
         return "Item:" + this.nomeItem + "\n Data de validade: " + this.dataValidade;
    }



}
