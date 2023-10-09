package com.exercicios.aula2.exercicio2;

import java.text.DecimalFormat;

public class Circulo {
    DecimalFormat df =  new DecimalFormat("#.##");
    //VARIÁVEIS
    private double raio;
    private double x;
    private double y;
    //GETTERS E SETTERS
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    //CONSTRUTORES
    public Circulo(Double raio) {
        definirRaio(raio);
    }
    public Circulo(Double raio, int x, int y) {
        definirRaio(raio);
        definirCoordenadas(x, y);
    }
    //MÉTODOS
    public double calcularArea(){
        return Math.PI * (this.raio * this.raio);
    }
    public double calcularCircunferencia(){
        return  2 * Math.PI * raio;
    }

    public double calcularDiametro(){
        return 2 * this.raio;
    }
    public double calcularAreaSombreada(double outroRaio) {
        if (this.raio >= outroRaio) {
            double diferencaRaios = this.raio - outroRaio;
            return Math.PI * diferencaRaios * diferencaRaios;
        } else {
            throw new IllegalArgumentException("O raio do segundo círculo deve ser menor ou igual ao raio do primeiro círculo.");
        }
    }
    public void definirRaio(double novoRaio){
        if (novoRaio >= 0) {
            this.raio = novoRaio;
        }else
            System.out.println("Valor inválido!");
    }
    public void definirCoordenadas(double novoX, double novoY){
        if (novoX <= 0 && novoY <=0) {
            System.out.println("Valor inválido das coordenadas!");
        }else{
            this.x = novoX;
            this.y = novoY;
        }

    }
    public double criarCirculoCartesiano() {
        //teorema de Pitágoras para calcular o raio a partir das coordenadas
        double raioCalculado = Math.sqrt(x * x + y * y);
        return raioCalculado + raio;
    }

    public void comparaCirculo(double outroRaio){

        if (raio == outroRaio) {
            System.out.println("Os dois círculos são iguais!");
        }else {
            System.out.println("Os dois círculos não são iguais!");
        }
    }
    @Override
    public String toString() {
        return ("Raio= " + df.format(this.raio) + ", Circunferência= " + df.format(calcularCircunferencia()) + ", Área=" + df.format(calcularArea()));
    }
}
