package com.exercicios.aula2.exercicio4;

public class Retangulo extends FormasGeometricas{

    private double comprimento;
    private double largura;
    private double area;
    private String nome = "Retângulo";
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        calcularArea();
        nomeForma();
    }
    @Override
    public double calcularArea() {
        this.area = this.comprimento * this.largura;
        return this.area;
    }

    @Override
    public String nomeForma() {
        return "Retângulo";
    }
}
