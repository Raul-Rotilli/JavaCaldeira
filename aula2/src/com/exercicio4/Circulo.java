package com.exercicios.aula2.exercicio4;

public class Circulo extends FormasGeometricas{
    private double raio;
    private double area;




    public Circulo(double raio){
        this.raio = raio;
        calcularArea();
        nomeForma();

    }

    @Override
    public double calcularArea() {
        this.area = Math.PI * this.raio * this.raio;
        return this.area;
    }

    @Override
    public String nomeForma() {
        return "Círculo";
    }


}
