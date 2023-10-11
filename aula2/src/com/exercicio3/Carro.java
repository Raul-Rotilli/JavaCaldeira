
package com.exercicios.aula2.exercicio3;


public class Carro extends Veiculo{
     
    @Override
    public double calcularCustoViagem(int distanciaKM) {
        return distanciaKM * 0.20;
    }
}
