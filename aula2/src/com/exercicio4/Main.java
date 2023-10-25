package com.exercicios.aula2.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormasGeometricas> formas = new ArrayList<>();

        formas.add(new Circulo(8));
        formas.add(new Retangulo(8, 3));
        formas.add(new Quadrado(4));
        formas.add(new Triangulo(5, 3));
        formas.add(new Losango(4, 7));

        for (int i = 0;i < formas.size();i++ ){
            System.out.println("A base da forma geométrica " + formas.get(i).nomeForma() + ": " + formas.get(i).calcularArea());
        }


    }


}
