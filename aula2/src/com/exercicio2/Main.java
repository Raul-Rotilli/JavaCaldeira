package com.exercicios.aula2.exercicio2;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(6.0);
        DecimalFormat df = new DecimalFormat("#.##");

        c.comparaCirculo(8.0);
        System.out.println(c.toString());
        System.out.println("O diâmetro calculado é: "+ df.format(c.calcularDiametro()));
        System.out.println("A area sombreada calculada é: "+ df.format(c.calcularAreaSombreada(4.4)));

        Circulo c2= new Circulo(20.0, 3, 3);
        System.out.println("Círculo cartesiano criado tem o raio de: " + df.format(c2.criarCirculoCartesiano()));
        System.out.println();

    }
}
