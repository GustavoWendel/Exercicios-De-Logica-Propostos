package br.com.exercicios.estruturarepeticao;

import java.util.Scanner;

public class Exercicio14 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int numero;
        int soma = 0;
        int soma1 = 0;
        int soma2 = 0;

        for (int contador = 0; contador <= 4; contador++) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();

            if (numero >= 0 && numero <= 100) {
                soma += numero;
            } else if (numero >= 101 && numero <= 200) {
                soma1 += numero;
            } else {
                soma2 += numero;
            }
        }

        System.out.println("Soma de números entre 0 e 100: " + soma);
        System.out.println("Soma de números entre 101 e 200: " + soma1);
        System.out.println("Soma de números acima de 200: " + soma2);

    }
}
