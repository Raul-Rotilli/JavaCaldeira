package com.exercicios.aula3.parte1.exercicio5;

public class Impressao {
    private String nomeDocumento;
    private int numeroPaginas;

    public Impressao(String nomeDocumento, int numeroPaginas) {
        this.nomeDocumento = nomeDocumento;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNomeDocumento() {
        return nomeDocumento;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Documento: " + nomeDocumento + ", Páginas: " + numeroPaginas;
    }
}
