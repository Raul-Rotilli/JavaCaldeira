package com.exercicios.aula2.exercicio3;


public class Main {
    public static void main(String[] args) {
        Veiculo c = new Carro();
        
        System.out.println("O custo de viagem de Carro foi R$:" + c.calcularCustoViagem(100));
  
        Veiculo m = new Moto();
       
        System.out.println("O custo de viagem de Moto foi R$:" + m.calcularCustoViagem(100));

       
   }
 
}
