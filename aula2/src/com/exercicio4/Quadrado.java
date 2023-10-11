package com.exercicios.aula2.exercicio4;

public class Quadrado extends FormasGeometricas{
    private double lado;
    private double area;
    private String nome = "Quadrado";

    public Quadrado(double lado) {
        this.lado = lado;
        calcularArea();
        nomeForma();
    }

    @Override
    public double calcularArea() {
        this.area = this.lado * this.lado;
        return this.area;
    }

    @Override
    public String nomeForma() {
        return "Quadrado";
    }
}
