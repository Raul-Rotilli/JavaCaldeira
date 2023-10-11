package com.exercicios.aula2.exercicio4;

public class Triangulo extends FormasGeometricas{

    private double base;
    private double altura;
    private double area;
    private String nome = "Triângulo";


    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        nomeForma();
    }
    @Override
    public double calcularArea() {
        this.area = 0.5 * this.base * this.altura;
        return this.area;
    }

    @Override
    public String nomeForma() {
        return "Triângulo";
    }
}
