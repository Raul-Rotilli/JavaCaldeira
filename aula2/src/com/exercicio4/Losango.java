package com.exercicios.aula2.exercicio4;

public class Losango extends FormasGeometricas {
    private double diagonalMaior;
    private double diagonalMenor;
    private double area;
    private String nome = "Losango";

    public Losango(double diagonalMaior, double diagonalMenor){
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        calcularArea();
        nomeForma();
    }
    @Override
    public double calcularArea() {
        this.area = (this.diagonalMaior * this.diagonalMenor) / 2;
        return area;
    }

    @Override
    public String nomeForma() {
        return "Losango";
    }
}
